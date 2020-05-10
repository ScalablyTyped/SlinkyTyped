package typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NestingLevelSuggestionState extends js.Object {
  var bulletAlignmentSuggested: js.UndefOr[Boolean] = js.native
  var glyphFormatSuggested: js.UndefOr[Boolean] = js.native
  var glyphSymbolSuggested: js.UndefOr[Boolean] = js.native
  var glyphTypeSuggested: js.UndefOr[Boolean] = js.native
  var indentFirstLineSuggested: js.UndefOr[Boolean] = js.native
  var indentStartSuggested: js.UndefOr[Boolean] = js.native
  var startNumberSuggested: js.UndefOr[Boolean] = js.native
  var textStyleSuggestionState: js.UndefOr[TextStyleSuggestionState] = js.native
}

object NestingLevelSuggestionState {
  @scala.inline
  def apply(): NestingLevelSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NestingLevelSuggestionState]
  }
  @scala.inline
  implicit class NestingLevelSuggestionStateOps[Self <: NestingLevelSuggestionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBulletAlignmentSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bulletAlignmentSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBulletAlignmentSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bulletAlignmentSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withGlyphFormatSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphFormatSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlyphFormatSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphFormatSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withGlyphSymbolSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphSymbolSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlyphSymbolSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphSymbolSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withGlyphTypeSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphTypeSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlyphTypeSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glyphTypeSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentFirstLineSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentFirstLineSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentFirstLineSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentFirstLineSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentStartSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentStartSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentStartSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentStartSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withStartNumberSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startNumberSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartNumberSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startNumberSuggested")(js.undefined)
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

