package typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuggestedDocumentStyle extends js.Object {
  var documentStyle: js.UndefOr[DocumentStyle] = js.native
  var documentStyleSuggestionState: js.UndefOr[DocumentStyleSuggestionState] = js.native
}

object SuggestedDocumentStyle {
  @scala.inline
  def apply(): SuggestedDocumentStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestedDocumentStyle]
  }
  @scala.inline
  implicit class SuggestedDocumentStyleOps[Self <: SuggestedDocumentStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocumentStyle(value: DocumentStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentStyleSuggestionState(value: DocumentStyleSuggestionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentStyleSuggestionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentStyleSuggestionState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentStyleSuggestionState")(js.undefined)
        ret
    }
  }
  
}

