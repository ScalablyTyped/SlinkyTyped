package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A mask that indicates which of the fields on the base NestingLevel have
  * been changed in this suggestion. For any field set to true, there is a new
  * suggested value.
  */
@js.native
trait SchemaNestingLevelSuggestionState extends js.Object {
  /**
    * Indicates if there was a suggested change to bullet_alignment.
    */
  var bulletAlignmentSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to glyph_format.
    */
  var glyphFormatSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to glyph_symbol.
    */
  var glyphSymbolSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to glyph_type.
    */
  var glyphTypeSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to indent_first_line.
    */
  var indentFirstLineSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to indent_start.
    */
  var indentStartSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to start_number.
    */
  var startNumberSuggested: js.UndefOr[Boolean] = js.native
  /**
    * A mask that indicates which of the fields in text style have been changed
    * in this suggestion.
    */
  var textStyleSuggestionState: js.UndefOr[SchemaTextStyleSuggestionState] = js.native
}

object SchemaNestingLevelSuggestionState {
  @scala.inline
  def apply(): SchemaNestingLevelSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNestingLevelSuggestionState]
  }
  @scala.inline
  implicit class SchemaNestingLevelSuggestionStateOps[Self <: SchemaNestingLevelSuggestionState] (val x: Self) extends AnyVal {
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
    def withTextStyleSuggestionState(value: SchemaTextStyleSuggestionState): Self = {
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

