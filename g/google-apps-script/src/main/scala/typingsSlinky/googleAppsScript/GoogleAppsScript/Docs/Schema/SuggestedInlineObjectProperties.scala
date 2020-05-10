package typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuggestedInlineObjectProperties extends js.Object {
  var inlineObjectProperties: js.UndefOr[InlineObjectProperties] = js.native
  var inlineObjectPropertiesSuggestionState: js.UndefOr[InlineObjectPropertiesSuggestionState] = js.native
}

object SuggestedInlineObjectProperties {
  @scala.inline
  def apply(): SuggestedInlineObjectProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestedInlineObjectProperties]
  }
  @scala.inline
  implicit class SuggestedInlineObjectPropertiesOps[Self <: SuggestedInlineObjectProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInlineObjectProperties(value: InlineObjectProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineObjectProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlineObjectProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineObjectProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withInlineObjectPropertiesSuggestionState(value: InlineObjectPropertiesSuggestionState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineObjectPropertiesSuggestionState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlineObjectPropertiesSuggestionState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineObjectPropertiesSuggestionState")(js.undefined)
        ret
    }
  }
  
}

