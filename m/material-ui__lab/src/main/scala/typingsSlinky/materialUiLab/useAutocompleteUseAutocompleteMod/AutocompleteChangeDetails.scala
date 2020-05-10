package typingsSlinky.materialUiLab.useAutocompleteUseAutocompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutocompleteChangeDetails[T] extends js.Object {
  var option: T = js.native
}

object AutocompleteChangeDetails {
  @scala.inline
  def apply[T](option: T): AutocompleteChangeDetails[T] = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutocompleteChangeDetails[T]]
  }
  @scala.inline
  implicit class AutocompleteChangeDetailsOps[Self[t] <: AutocompleteChangeDetails[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withOption(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("option")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

