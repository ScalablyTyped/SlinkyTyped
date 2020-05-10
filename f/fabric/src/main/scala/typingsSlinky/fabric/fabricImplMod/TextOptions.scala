package typingsSlinky.fabric.fabricImplMod

import typingsSlinky.fabric.AnonBaseline
import typingsSlinky.fabric.fabricStrings._empty
import typingsSlinky.fabric.fabricStrings.italic
import typingsSlinky.fabric.fabricStrings.normal
import typingsSlinky.fabric.fabricStrings.oblique
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextOptions extends IObjectOptions {
  /**
  	 * additional space between characters
  	 * expressed in thousands of em unit
  	 * @type Number
  	 */
  var charSpacing: js.UndefOr[Double] = js.native
  /**
  	 * Baseline shift, stlyes only, keep at 0 for the main text object
  	 * @type {Number}
  	 */
  var deltaY: js.UndefOr[Double] = js.native
  /**
  	 * Font family
  	 * @type String
  	 */
  var fontFamily: js.UndefOr[String] = js.native
  /**
  	 * Font size (in pixels)
  	 * @type Number
  	 */
  var fontSize: js.UndefOr[Double] = js.native
  /**
  	 * Font style . Possible values: "", "normal", "italic" or "oblique".
  	 * @type String
  	 */
  var fontStyle: js.UndefOr[_empty | normal | italic | oblique] = js.native
  /**
  	 * Font weight (e.g. bold, normal, 400, 600, 800)
  	 * @type {(Number|String)}
  	 */
  var fontWeight: js.UndefOr[String | Double] = js.native
  /**
  	 * Line height
  	 * @type Number
  	 */
  var lineHeight: js.UndefOr[Double] = js.native
  /**
  	 * Text decoration linethrough.
  	 * @type Boolean
  	 */
  var linethrough: js.UndefOr[Boolean] = js.native
  /**
  	 * Text decoration overline.
  	 * @type Boolean
  	 */
  var overline: js.UndefOr[Boolean] = js.native
  /**
  	 * Object containing character styles - top-level properties -> line numbers,
  	 * 2nd-level properties - charater numbers
  	 * @type Object
  	 */
  var styles: js.UndefOr[js.Any] = js.native
  /**
  	 * Subscript schema object (minimum overlap)
  	 * @type {Object}
  	 */
  var subscript: js.UndefOr[AnonBaseline] = js.native
  /**
  	 * Superscript schema object (minimum overlap)
  	 * @type {Object}
  	 */
  var superscript: js.UndefOr[AnonBaseline] = js.native
  var text: js.UndefOr[String] = js.native
  /**
  	 * Text alignment. Possible values: "left", "center", "right", "justify",
  	 * "justify-left", "justify-center" or "justify-right".
  	 * @type String
  	 */
  var textAlign: js.UndefOr[String] = js.native
  /**
  	 * Background color of text lines
  	 * @type String
  	 */
  var textBackgroundColor: js.UndefOr[String] = js.native
  /**
  	 * Text decoration underline.
  	 * @type Boolean
  	 */
  var underline: js.UndefOr[Boolean] = js.native
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
    def withCharSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charSpacing")(js.undefined)
        ret
    }
    @scala.inline
    def withDeltaY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeltaY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaY")(js.undefined)
        ret
    }
    @scala.inline
    def withFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withFontSize(value: Double): Self = {
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
    def withFontStyle(value: _empty | normal | italic | oblique): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withFontWeight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withLineHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withLinethrough(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linethrough")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinethrough: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linethrough")(js.undefined)
        ret
    }
    @scala.inline
    def withOverline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overline")(js.undefined)
        ret
    }
    @scala.inline
    def withStyles(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscript(value: AnonBaseline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscript")(js.undefined)
        ret
    }
    @scala.inline
    def withSuperscript(value: AnonBaseline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("superscript")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuperscript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("superscript")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTextAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withTextBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textBackgroundColor")(js.undefined)
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
  }
  
}

