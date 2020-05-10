package typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InlineObjectPropertiesSuggestionState extends js.Object {
  var embeddedObjectSuggestionState: js.UndefOr[EmbeddedObjectSuggestionState] = js.native
}

object InlineObjectPropertiesSuggestionState {
  @scala.inline
  def apply(): InlineObjectPropertiesSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InlineObjectPropertiesSuggestionState]
  }
  @scala.inline
  implicit class InlineObjectPropertiesSuggestionStateOps[Self <: InlineObjectPropertiesSuggestionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEmbeddedObjectSuggestionState(value: EmbeddedObjectSuggestionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embeddedObjectSuggestionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmbeddedObjectSuggestionState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("embeddedObjectSuggestionState")(js.undefined)
        ret
    }
  }
  
}

