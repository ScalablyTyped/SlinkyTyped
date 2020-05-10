package typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuggestedParagraphStyle extends js.Object {
  var paragraphStyle: js.UndefOr[ParagraphStyle] = js.native
  var paragraphStyleSuggestionState: js.UndefOr[ParagraphStyleSuggestionState] = js.native
}

object SuggestedParagraphStyle {
  @scala.inline
  def apply(): SuggestedParagraphStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestedParagraphStyle]
  }
  @scala.inline
  implicit class SuggestedParagraphStyleOps[Self <: SuggestedParagraphStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParagraphStyle(value: ParagraphStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraphStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParagraphStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraphStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withParagraphStyleSuggestionState(value: ParagraphStyleSuggestionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraphStyleSuggestionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParagraphStyleSuggestionState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraphStyleSuggestionState")(js.undefined)
        ret
    }
  }
  
}

