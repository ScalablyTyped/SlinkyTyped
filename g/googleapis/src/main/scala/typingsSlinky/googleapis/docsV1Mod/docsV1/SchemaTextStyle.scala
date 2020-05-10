package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the styling that can be applied to text.  Inherited text styles
  * are represented as unset fields in this message. A text style&#39;s parent
  * depends on where the text style is defined:    * The TextStyle of text in a
  * Paragraph     inherits from the paragraph&#39;s corresponding named style
  * type.   * The TextStyle on a named style     inherits from the normal text
  * named style.   * The TextStyle of the normal text named style inherits from
  * the default text style in the Docs editor.   * The TextStyle on a Paragraph
  * element     that is contained in a table may inherit its text style from
  * the table     style.  If the text style does not inherit from a parent,
  * unsetting fields will revert the style to a value matching the defaults in
  * the Docs editor.
  */
@js.native
trait SchemaTextStyle extends js.Object {
  /**
    * The background color of the text. If set, the color is either an RGB
    * color or transparent, depending on the `color` field.
    */
  var backgroundColor: js.UndefOr[SchemaOptionalColor] = js.native
  /**
    * The text&#39;s vertical offset from its normal position.  Text with
    * `SUPERSCRIPT` or `SUBSCRIPT` baseline offsets is automatically rendered
    * in a smaller font size, computed based on the `font_size` field. The
    * `font_size` itself is not affected by changes in this field.
    */
  var baselineOffset: js.UndefOr[String] = js.native
  /**
    * Whether or not the text is rendered as bold.
    */
  var bold: js.UndefOr[Boolean] = js.native
  /**
    * The size of the text&#39;s font.
    */
  var fontSize: js.UndefOr[SchemaDimension] = js.native
  /**
    * The foreground color of the text. If set, the color is either an RGB
    * color or transparent, depending on the `color` field.
    */
  var foregroundColor: js.UndefOr[SchemaOptionalColor] = js.native
  /**
    * Whether or not the text is italicized.
    */
  var italic: js.UndefOr[Boolean] = js.native
  /**
    * The hyperlink destination of the text. If unset, there is no link. Links
    * are not inherited from parent text.  Changing the link in an update
    * request causes some other changes to the text style of the range:  * When
    * setting a link, the text foreground color will be updated to the default
    * link color and the text will be underlined. If these fields are modified
    * in the same request, those values will be used instead of the   link
    * defaults. * Setting a link on a text range that overlaps with an existing
    * link will   also update the existing link to point to the new URL. *
    * Links are not settable on newline characters. As a result, setting a link
    * on a text range that crosses a paragraph boundary, such as
    * `&quot;ABCx/123&quot;`,   will separate the newline character(s) into
    * their own text runs. The   link will be applied separately to the runs
    * before and after the newline. * Removing a link will update the text
    * style of the range to match the   style of the preceding text (or the
    * default text styles if the preceding   text is another link) unless
    * different styles are being set in the same   request.
    */
  var link: js.UndefOr[SchemaLink] = js.native
  /**
    * Whether or not the text is in small capital letters.
    */
  var smallCaps: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not the text is struck through.
    */
  var strikethrough: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not the text is underlined.
    */
  var underline: js.UndefOr[Boolean] = js.native
  /**
    * The font family and rendered weight of the text.  If an update request
    * specifies values for both `weighted_font_family` and `bold`, the
    * `weighted_font_family` is applied first, then `bold`.  If
    * `weighted_font_family#weight` is not set, it defaults to `400`.  If
    * `weighted_font_family` is set, then `weighted_font_family#font_family`
    * must also be set with a non-empty value. Otherwise, a 400 bad request
    * error is returned.
    */
  var weightedFontFamily: js.UndefOr[SchemaWeightedFontFamily] = js.native
}

object SchemaTextStyle {
  @scala.inline
  def apply(): SchemaTextStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextStyle]
  }
  @scala.inline
  implicit class SchemaTextStyleOps[Self <: SchemaTextStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: SchemaOptionalColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBaselineOffset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baselineOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaselineOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baselineOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withBold(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bold")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSize(value: SchemaDimension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withForegroundColor(value: SchemaOptionalColor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foregroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForegroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foregroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withItalic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("italic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItalic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("italic")(js.undefined)
        ret
    }
    @scala.inline
    def withLink(value: SchemaLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.undefined)
        ret
    }
    @scala.inline
    def withSmallCaps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallCaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmallCaps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallCaps")(js.undefined)
        ret
    }
    @scala.inline
    def withStrikethrough(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strikethrough")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrikethrough: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strikethrough")(js.undefined)
        ret
    }
    @scala.inline
    def withUnderline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnderline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("underline")(js.undefined)
        ret
    }
    @scala.inline
    def withWeightedFontFamily(value: SchemaWeightedFontFamily): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weightedFontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeightedFontFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weightedFontFamily")(js.undefined)
        ret
    }
  }
  
}

