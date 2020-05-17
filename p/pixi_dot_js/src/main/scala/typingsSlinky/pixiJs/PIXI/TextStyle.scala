package typingsSlinky.pixiJs.PIXI

import org.scalajs.dom.raw.CanvasGradient
import org.scalajs.dom.raw.CanvasPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A TextStyle Object contains information to decorate a Text objects.
  *
  * An instance can be shared between multiple Text objects; then changing the style will update all text objects using it.
  *
  * A tool can be used to generate a text style [here](https://pixijs.io/pixi-text-style).
  *
  * @class
  * @memberof PIXI
  */
@js.native
trait TextStyle extends js.Object {
  /**
    * Alignment for multiline text ('left', 'center' or 'right'), does not affect single line text
    *
    * @member {string}
    */
  var align: String = js.native
  /**
    * Indicates if lines can be wrapped within words, it needs wordWrap to be set to true
    *
    * @member {boolean}
    */
  var breakWords: Boolean = js.native
  /**
    * Set a drop shadow for the text
    *
    * @member {boolean}
    */
  var dropShadow: Boolean = js.native
  /**
    * Set alpha for the drop shadow
    *
    * @member {number}
    */
  var dropShadowAlpha: Double = js.native
  /**
    * Set a angle of the drop shadow
    *
    * @member {number}
    */
  var dropShadowAngle: Double = js.native
  /**
    * Set a shadow blur radius
    *
    * @member {number}
    */
  var dropShadowBlur: Double = js.native
  /**
    * A fill style to be used on the dropshadow e.g 'red', '#00FF00'
    *
    * @member {string|number}
    */
  var dropShadowColor: String | Double = js.native
  /**
    * Set a distance of the drop shadow
    *
    * @member {number}
    */
  var dropShadowDistance: Double = js.native
  /**
    * A canvas fillstyle that will be used on the text e.g 'red', '#00FF00'.
    * Can be an array to create a gradient eg ['#000000','#FFFFFF']
    * {@link https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D/fillStyle|MDN}
    *
    * @member {string|string[]|number|number[]|CanvasGradient|CanvasPattern}
    */
  var fill: String | (js.Array[Double | String]) | Double | CanvasGradient | CanvasPattern = js.native
  /**
    * If fill is an array of colours to create a gradient, this array can set the stop points
    * (numbers between 0 and 1) for the color, overriding the default behaviour of evenly spacing them.
    *
    * @member {number[]}
    */
  var fillGradientStops: js.Array[Double] = js.native
  /**
    * If fill is an array of colours to create a gradient, this can change the type/direction of the gradient.
    * See {@link PIXI.TEXT_GRADIENT}
    *
    * @member {number}
    */
  var fillGradientType: Double = js.native
  /**
    * The font family
    *
    * @member {string|string[]}
    */
  var fontFamily: String | js.Array[String] = js.native
  /**
    * The font size
    * (as a number it converts to px, but as a string, equivalents are '26px','20pt','160%' or '1.6em')
    *
    * @member {number|string}
    */
  var fontSize: Double | String = js.native
  /**
    * The font style
    * ('normal', 'italic' or 'oblique')
    *
    * @member {string}
    */
  var fontStyle: String = js.native
  /**
    * The font variant
    * ('normal' or 'small-caps')
    *
    * @member {string}
    */
  var fontVariant: String = js.native
  /**
    * The font weight
    * ('normal', 'bold', 'bolder', 'lighter' and '100', '200', '300', '400', '500', '600', '700', 800' or '900')
    *
    * @member {string}
    */
  var fontWeight: String = js.native
  /**
    * The space between lines
    *
    * @member {number}
    */
  var leading: Double = js.native
  /**
    * The amount of spacing between letters, default is 0
    *
    * @member {number}
    */
  var letterSpacing: Double = js.native
  /**
    * The line height, a number that represents the vertical space that a letter uses
    *
    * @member {number}
    */
  var lineHeight: Double = js.native
  /**
    * The lineJoin property sets the type of corner created, it can resolve spiked text issues.
    * Default is 'miter' (creates a sharp corner).
    *
    * @member {string}
    */
  var lineJoin: String = js.native
  /**
    * The miter limit to use when using the 'miter' lineJoin mode
    * This can reduce or increase the spikiness of rendered text.
    *
    * @member {number}
    */
  var miterLimit: Double = js.native
  /**
    * Occasionally some fonts are cropped. Adding some padding will prevent this from happening
    * by adding padding to all sides of the text.
    *
    * @member {number}
    */
  var padding: Double = js.native
  /**
    * A canvas fillstyle that will be used on the text stroke
    * e.g 'blue', '#FCFF00'
    *
    * @member {string|number}
    */
  var stroke: String | Double = js.native
  /**
    * A number that represents the thickness of the stroke.
    * Default is 0 (no stroke)
    *
    * @member {number}
    */
  var strokeThickness: Double = js.native
  /**
    * The baseline of the text that is rendered.
    *
    * @member {string}
    */
  var textBaseline: String = js.native
  /**
    * Trim transparent borders
    *
    * @member {boolean}
    */
  var trim: Boolean = js.native
  /**
    * How newlines and spaces should be handled.
    * Default is 'pre' (preserve, preserve).
    *
    *  value       | New lines     |   Spaces
    *  ---         | ---           |   ---
    * 'normal'     | Collapse      |   Collapse
    * 'pre'        | Preserve      |   Preserve
    * 'pre-line'   | Preserve      |   Collapse
    *
    * @member {string}
    */
  var whiteSpace: String = js.native
  /**
    * Indicates if word wrap should be used
    *
    * @member {boolean}
    */
  var wordWrap: Boolean = js.native
  /**
    * The width at which text will wrap, it needs wordWrap to be set to true
    *
    * @member {number}
    */
  var wordWrapWidth: Double = js.native
  /**
    * Resets all properties to the defaults specified in TextStyle.prototype._default
    */
  def reset(): Unit = js.native
  /**
    * Generates a font style string to use for `TextMetrics.measureFont()`.
    *
    * @return {string} Font style string, for passing to `TextMetrics.measureFont()`
    */
  def toFontString(): String = js.native
}

object TextStyle {
  @scala.inline
  def apply(
    align: String,
    breakWords: Boolean,
    dropShadow: Boolean,
    dropShadowAlpha: Double,
    dropShadowAngle: Double,
    dropShadowBlur: Double,
    dropShadowColor: String | Double,
    dropShadowDistance: Double,
    fill: String | (js.Array[Double | String]) | Double | CanvasGradient | CanvasPattern,
    fillGradientStops: js.Array[Double],
    fillGradientType: Double,
    fontFamily: String | js.Array[String],
    fontSize: Double | String,
    fontStyle: String,
    fontVariant: String,
    fontWeight: String,
    leading: Double,
    letterSpacing: Double,
    lineHeight: Double,
    lineJoin: String,
    miterLimit: Double,
    padding: Double,
    reset: () => Unit,
    stroke: String | Double,
    strokeThickness: Double,
    textBaseline: String,
    toFontString: () => String,
    trim: Boolean,
    whiteSpace: String,
    wordWrap: Boolean,
    wordWrapWidth: Double
  ): TextStyle = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], breakWords = breakWords.asInstanceOf[js.Any], dropShadow = dropShadow.asInstanceOf[js.Any], dropShadowAlpha = dropShadowAlpha.asInstanceOf[js.Any], dropShadowAngle = dropShadowAngle.asInstanceOf[js.Any], dropShadowBlur = dropShadowBlur.asInstanceOf[js.Any], dropShadowColor = dropShadowColor.asInstanceOf[js.Any], dropShadowDistance = dropShadowDistance.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], fillGradientStops = fillGradientStops.asInstanceOf[js.Any], fillGradientType = fillGradientType.asInstanceOf[js.Any], fontFamily = fontFamily.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], fontStyle = fontStyle.asInstanceOf[js.Any], fontVariant = fontVariant.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], leading = leading.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], lineJoin = lineJoin.asInstanceOf[js.Any], miterLimit = miterLimit.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), stroke = stroke.asInstanceOf[js.Any], strokeThickness = strokeThickness.asInstanceOf[js.Any], textBaseline = textBaseline.asInstanceOf[js.Any], toFontString = js.Any.fromFunction0(toFontString), trim = trim.asInstanceOf[js.Any], whiteSpace = whiteSpace.asInstanceOf[js.Any], wordWrap = wordWrap.asInstanceOf[js.Any], wordWrapWidth = wordWrapWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStyle]
  }
  @scala.inline
  implicit class TextStyleOps[Self <: TextStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBreakWords(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breakWords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDropShadow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropShadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDropShadowAlpha(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropShadowAlpha")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDropShadowAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropShadowAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDropShadowBlur(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropShadowBlur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDropShadowColor(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropShadowColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDropShadowDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropShadowDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillCanvasPattern(value: CanvasPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillCanvasGradient(value: CanvasGradient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFill(value: String | (js.Array[Double | String]) | Double | CanvasGradient | CanvasPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillGradientStops(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillGradientStops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFillGradientType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillGradientType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontFamily(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontSize(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontVariant(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontVariant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFontWeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeading(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLetterSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("letterSpacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLineJoin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineJoin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMiterLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("miterLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStroke(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrokeThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTextBaseline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textBaseline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToFontString(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toFontString")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTrim(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWhiteSpace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whiteSpace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordWrap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWordWrapWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrapWidth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

