package typingsSlinky.materialUiLab.useAutocompleteUseAutocompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterOptionsState[T] extends js.Object {
  var inputValue: String = js.native
  def getOptionLabel(option: T): String = js.native
}

object FilterOptionsState {
  @scala.inline
  def apply[T](getOptionLabel: T => String, inputValue: String): FilterOptionsState[T] = {
    val __obj = js.Dynamic.literal(getOptionLabel = js.Any.fromFunction1(getOptionLabel), inputValue = inputValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterOptionsState[T]]
  }
  @scala.inline
  implicit class FilterOptionsStateOps[Self[t] <: FilterOptionsState[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withGetOptionLabel(value: T => String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getOptionLabel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInputValue(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

