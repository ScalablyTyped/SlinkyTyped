package typingsSlinky.formstate.anon

import typingsSlinky.formstate.formStateLazyMod.ValidatableArray
import typingsSlinky.formstate.formstateBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueTValue[TValue /* <: ValidatableArray */] extends js.Object {
  var hasError: `false`
  var value: TValue
}

object ValueTValue {
  @scala.inline
  def apply[TValue](hasError: `false`, value: TValue): ValueTValue[TValue] = {
    val __obj = js.Dynamic.literal(hasError = hasError.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueTValue[TValue]]
  }
}

