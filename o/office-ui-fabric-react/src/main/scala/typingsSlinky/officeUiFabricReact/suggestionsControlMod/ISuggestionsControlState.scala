package typingsSlinky.officeUiFabricReact.suggestionsControlMod

import typingsSlinky.officeUiFabricReact.suggestionsTypesMod.ISuggestionModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISuggestionsControlState[T] extends js.Object {
  var selectedFooterIndex: Double = js.native
  var selectedHeaderIndex: Double = js.native
  var suggestions: js.Array[ISuggestionModel[T]] = js.native
}

object ISuggestionsControlState {
  @scala.inline
  def apply[T](
    selectedFooterIndex: Double,
    selectedHeaderIndex: Double,
    suggestions: js.Array[ISuggestionModel[T]]
  ): ISuggestionsControlState[T] = {
    val __obj = js.Dynamic.literal(selectedFooterIndex = selectedFooterIndex.asInstanceOf[js.Any], selectedHeaderIndex = selectedHeaderIndex.asInstanceOf[js.Any], suggestions = suggestions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISuggestionsControlState[T]]
  }
  @scala.inline
  implicit class ISuggestionsControlStateOps[Self[t] <: ISuggestionsControlState[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withSelectedFooterIndex(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedFooterIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedHeaderIndex(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedHeaderIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuggestions(value: js.Array[ISuggestionModel[T]]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

