package typingsSlinky.formstate.anon

import typingsSlinky.formstate.formStateLazyMod.ValidatableArray
import typingsSlinky.formstate.formstateBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValueTValue[TValue /* <: ValidatableArray */] extends js.Object {
  var hasError: `false` = js.native
  var value: TValue = js.native
}

object ValueTValue {
  @scala.inline
  def apply[TValue](hasError: `false`, value: TValue): ValueTValue[TValue] = {
    val __obj = js.Dynamic.literal(hasError = hasError.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueTValue[TValue]]
  }
  @scala.inline
  implicit class ValueTValueOps[Self[tvalue] <: ValueTValue[tvalue], TValue] (val x: Self[TValue]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TValue] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TValue]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TValue] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TValue] with Other]
    @scala.inline
    def withHasError(value: `false`): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: TValue): Self[TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

