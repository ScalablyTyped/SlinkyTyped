package typingsSlinky.reactAutosuggest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BlurEvent[TSuggestion] extends js.Object {
  var highlightedSuggestion: TSuggestion = js.native
}

object BlurEvent {
  @scala.inline
  def apply[TSuggestion](highlightedSuggestion: TSuggestion): BlurEvent[TSuggestion] = {
    val __obj = js.Dynamic.literal(highlightedSuggestion = highlightedSuggestion.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlurEvent[TSuggestion]]
  }
  @scala.inline
  implicit class BlurEventOps[Self[tsuggestion] <: BlurEvent[tsuggestion], TSuggestion] (val x: Self[TSuggestion]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TSuggestion] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TSuggestion]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TSuggestion] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TSuggestion] with Other]
    @scala.inline
    def withHighlightedSuggestion(value: TSuggestion): Self[TSuggestion] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlightedSuggestion")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

