package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A mask that indicates which of the fields on the base TextStyle have been
  * changed in this suggestion. For any field set to true, there is a new
  * suggested value.
  */
@js.native
trait SchemaTextStyleSuggestionState extends js.Object {
  /**
    * Indicates if there was a suggested change to background_color.
    */
  var backgroundColorSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to baseline_offset.
    */
  var baselineOffsetSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to bold.
    */
  var boldSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to font_size.
    */
  var fontSizeSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to foreground_color.
    */
  var foregroundColorSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to italic.
    */
  var italicSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to link.
    */
  var linkSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to small_caps.
    */
  var smallCapsSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to strikethrough.
    */
  var strikethroughSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to underline.
    */
  var underlineSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to weighted_font_family.
    */
  var weightedFontFamilySuggested: js.UndefOr[Boolean] = js.native
}

object SchemaTextStyleSuggestionState {
  @scala.inline
  def apply(): SchemaTextStyleSuggestionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextStyleSuggestionState]
  }
  @scala.inline
  implicit class SchemaTextStyleSuggestionStateOps[Self <: SchemaTextStyleSuggestionState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColorSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColorSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColorSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColorSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withBaselineOffsetSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baselineOffsetSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaselineOffsetSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baselineOffsetSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withBoldSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boldSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoldSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boldSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSizeSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSizeSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSizeSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSizeSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withForegroundColorSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foregroundColorSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForegroundColorSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foregroundColorSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withItalicSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("italicSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItalicSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("italicSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withSmallCapsSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallCapsSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmallCapsSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallCapsSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withStrikethroughSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strikethroughSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrikethroughSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strikethroughSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withUnderlineSuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlineSuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderlineSuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underlineSuggested")(js.undefined)
        ret
    }
    @scala.inline
    def withWeightedFontFamilySuggested(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weightedFontFamilySuggested")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeightedFontFamilySuggested: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weightedFontFamilySuggested")(js.undefined)
        ret
    }
  }
  
}

