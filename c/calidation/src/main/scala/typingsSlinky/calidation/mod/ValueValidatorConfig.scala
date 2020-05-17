package typingsSlinky.calidation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValueValidatorConfig[T]
  extends SimpleValidatorConfig
     with ValueValidator[T] {
  var value: T = js.native
}

object ValueValidatorConfig {
  @scala.inline
  def apply[T](message: String, value: T): ValueValidatorConfig[T] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueValidatorConfig[T]]
  }
  @scala.inline
  implicit class ValueValidatorConfigOps[Self[t] <: ValueValidatorConfig[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withValue(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

