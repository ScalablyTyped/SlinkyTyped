package typingsSlinky.oracleOraclejet.ojvalidationBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Validator[V] extends js.Object {
  var getHint: js.UndefOr[js.Function0[String | Null]] = js.native
  def validate(value: V): Unit = js.native
}

object Validator {
  @scala.inline
  def apply[V](validate: V => Unit): Validator[V] = {
    val __obj = js.Dynamic.literal(validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[Validator[V]]
  }
  @scala.inline
  implicit class ValidatorOps[Self[v] <: Validator[v], V] (val x: Self[V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[V] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[V] with Other]
    @scala.inline
    def withValidate(value: V => Unit): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetHint(value: () => String | Null): Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHint")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetHint: Self[V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHint")(js.undefined)
        ret
    }
  }
  
}

