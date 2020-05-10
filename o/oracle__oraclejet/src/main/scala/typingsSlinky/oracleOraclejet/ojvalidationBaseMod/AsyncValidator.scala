package typingsSlinky.oracleOraclejet.ojvalidationBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncValidator[V] extends js.Object {
  var hint: js.Promise[String | Null] = js.native
  def validate(value: V): js.Promise[Boolean] = js.native
}

object AsyncValidator {
  @scala.inline
  def apply[V](hint: js.Promise[String | Null], validate: V => js.Promise[Boolean]): AsyncValidator[V] = {
    val __obj = js.Dynamic.literal(hint = hint.asInstanceOf[js.Any], validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[AsyncValidator[V]]
  }
  @scala.inline
  implicit class AsyncValidatorOps[Self[v] <: AsyncValidator[v], V] (val x: Self[V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[V] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[V] with Other]
    @scala.inline
    def withHint(value: js.Promise[String | Null]): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidate(value: V => js.Promise[Boolean]): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

