package typingsSlinky.pdfkit.PDFKit.Mixins

import typingsSlinky.pdfkit.pdfkitStrings.`svg-central`
import typingsSlinky.pdfkit.pdfkitStrings.`svg-middle`
import typingsSlinky.pdfkit.pdfkitStrings.alphabetic
import typingsSlinky.pdfkit.pdfkitStrings.bottom
import typingsSlinky.pdfkit.pdfkitStrings.center
import typingsSlinky.pdfkit.pdfkitStrings.hanging
import typingsSlinky.pdfkit.pdfkitStrings.ideographic
import typingsSlinky.pdfkit.pdfkitStrings.justify
import typingsSlinky.pdfkit.pdfkitStrings.left
import typingsSlinky.pdfkit.pdfkitStrings.mathematical
import typingsSlinky.pdfkit.pdfkitStrings.middle
import typingsSlinky.pdfkit.pdfkitStrings.right
import typingsSlinky.pdfkit.pdfkitStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextOptions extends js.Object {
  /** the alignment of the text (center, justify, left, right) */
  //TODO check this
  var align: js.UndefOr[center | justify | left | right | String] = js.native
  /** the vertical alignment of the text with respect to its insertion point */
  var baseline: js.UndefOr[
    Double | `svg-middle` | middle | `svg-central` | bottom | ideographic | alphabetic | mathematical | hanging | top
  ] = js.native
  /** the amount of space between each character in the text */
  var characterSpacing: js.UndefOr[Double] = js.native
  /** the amount of space between each column (1/4 inch by default) */
  var columnGap: js.UndefOr[Double] = js.native
  /**  the number of columns to flow the text into */
  var columns: js.UndefOr[Double] = js.native
  /** whether the text segment will be followed immediately by another segment. Useful for changing styling in the middle of a paragraph. */
  var continued: js.UndefOr[Boolean] = js.native
  /** The character to display at the end of the text when it is too long. Set to true to use the default character. */
  var ellipsis: js.UndefOr[Boolean | String] = js.native
  /** an array of OpenType feature tags to apply. If not provided, a set of defaults is used. */
  var features: js.UndefOr[js.Array[OpenTypeFeatures]] = js.native
  /** whether to fill the text (true by default) */
  var fill: js.UndefOr[Boolean] = js.native
  /**  The maximum height that text should be clipped to */
  var height: js.UndefOr[Double] = js.native
  /** The amount in PDF points (72 per inch) to indent each paragraph of text */
  var indent: js.UndefOr[Double] = js.native
  /**  Set to false to disable line wrapping all together */
  var lineBreak: js.UndefOr[Boolean] = js.native
  /** the amount of space between each line of text */
  var lineGap: js.UndefOr[Double] = js.native
  /** A URL to link this text to (shortcut to create an annotation) */
  var link: js.UndefOr[String] = js.native
  /** whether to slant the text (angle in degrees or true) */
  var oblique: js.UndefOr[Boolean | Double] = js.native
  /** the amount of space between each paragraph of text */
  var paragraphGap: js.UndefOr[Double] = js.native
  /** whether to strike out the text */
  var strike: js.UndefOr[Boolean] = js.native
  /**  whether to stroke the text */
  var stroke: js.UndefOr[Boolean] = js.native
  /** whether to underline the text */
  var underline: js.UndefOr[Boolean] = js.native
  /** The width that text should be wrapped to (by default, the page width minus the left and right margin) */
  var width: js.UndefOr[Double] = js.native
  /** the amount of space between each word in the text */
  var wordSpacing: js.UndefOr[Double] = js.native
}

object TextOptions {
  @scala.inline
  def apply(): TextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextOptions]
  }
  @scala.inline
  implicit class TextOptionsOps[Self <: TextOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: center | justify | left | right | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withBaseline(
      value: Double | `svg-middle` | middle | `svg-central` | bottom | ideographic | alphabetic | mathematical | hanging | top
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseline")(js.undefined)
        ret
    }
    @scala.inline
    def withCharacterSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characterSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharacterSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characterSpacing")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnGap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnGap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnGap")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withContinued(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continued")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContinued: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("continued")(js.undefined)
        ret
    }
    @scala.inline
    def withEllipsis(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEllipsis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsis")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatures(value: js.Array[OpenTypeFeatures]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withIndent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indent")(js.undefined)
        ret
    }
    @scala.inline
    def withLineBreak(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineBreak")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineBreak: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineBreak")(js.undefined)
        ret
    }
    @scala.inline
    def withLineGap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineGap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineGap")(js.undefined)
        ret
    }
    @scala.inline
    def withLink(value: String): Self = {
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
    def withOblique(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oblique")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOblique: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oblique")(js.undefined)
        ret
    }
    @scala.inline
    def withParagraphGap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraphGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParagraphGap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraphGap")(js.undefined)
        ret
    }
    @scala.inline
    def withStrike(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strike")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrike: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strike")(js.undefined)
        ret
    }
    @scala.inline
    def withStroke(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(js.undefined)
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
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withWordSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWordSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordSpacing")(js.undefined)
        ret
    }
  }
  
}

