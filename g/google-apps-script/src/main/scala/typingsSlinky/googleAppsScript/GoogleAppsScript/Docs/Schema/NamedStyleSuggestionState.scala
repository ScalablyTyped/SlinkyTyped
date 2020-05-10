package typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamedStyleSuggestionState extends js.Object {
  var namedStyleType: js.UndefOr[String] = js.native
  var paragraphStyleSuggestionState: js.UndefOr[ParagraphStyleSuggestionState] = js.native
  var textStyleSuggestionState: js.UndefOr[TextStyleSuggestionState] = js.native
}

object NamedStyleSuggestionState {
  @scala.inline
  def apply(): NamedStyleSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedStyleSuggestionState]
  }
  @scala.inline
  implicit class NamedStyleSuggestionStateOps[Self <: NamedStyleSuggestionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNamedStyleType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedStyleType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamedStyleType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namedStyleType")(js.undefined)
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
    @scala.inline
    def withTextStyleSuggestionState(value: TextStyleSuggestionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyleSuggestionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextStyleSuggestionState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyleSuggestionState")(js.undefined)
        ret
    }
  }
  
}

