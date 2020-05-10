package typingsSlinky.phaser.Phaser.Types.GameObjects.Text

import typingsSlinky.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Text Style configuration object as used by the Text Game Object.
  */
@js.native
trait TextStyle extends js.Object {
  /**
    * The alignment of the Text. This only impacts multi-line text. Either `left`, `right`, `center` or `justify`.
    */
  var align: js.UndefOr[String] = js.native
  /**
    * A solid fill color that is rendered behind the Text object. Given as a CSS string color such as `#ff0`.
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /**
    * The amount of horizontal padding added to the width of the text when calculating the font metrics.
    */
  var baselineX: js.UndefOr[Double] = js.native
  /**
    * The amount of vertical padding added to the height of the text when calculating the font metrics.
    */
  var baselineY: js.UndefOr[Double] = js.native
  /**
    * The color the Text is drawn in. Given as a CSS string color such as `#fff` or `rgb()`.
    */
  var color: js.UndefOr[String] = js.native
  /**
    * Force the Text object to have the exact height specified in this property. Leave as zero for it to change accordingly to content.
    */
  var fixedHeight: js.UndefOr[Double] = js.native
  /**
    * Force the Text object to have the exact width specified in this property. Leave as zero for it to change accordingly to content.
    */
  var fixedWidth: js.UndefOr[Double] = js.native
  /**
    * The font the Text object will render with. This is a Canvas style font string.
    */
  var fontFamily: js.UndefOr[String] = js.native
  /**
    * The font size, as a CSS size string.
    */
  var fontSize: js.UndefOr[String] = js.native
  /**
    * Any addition font styles, such as 'strong'.
    */
  var fontStyle: js.UndefOr[String] = js.native
  /**
    * The maximum number of lines to display within the Text object.
    */
  var maxLines: js.UndefOr[integer] = js.native
  /**
    * A Text Metrics object. Use this to avoid expensive font size calculations in text heavy games.
    */
  var metrics: js.UndefOr[TextMetrics] = js.native
  /**
    * A Text Padding object.
    */
  var padding: js.UndefOr[TextPadding] = js.native
  /**
    * Sets the resolution (DPI setting) of the Text object. Leave at zero for it to use the game resolution.
    */
  var resolution: js.UndefOr[Double] = js.native
  /**
    * Set to `true` if this Text object should render from right-to-left.
    */
  var rtl: js.UndefOr[Boolean] = js.native
  /**
    * The Text shadow configuration object.
    */
  var shadow: js.UndefOr[TextShadow] = js.native
  /**
    * The color used to stroke the Text if the `strokeThickness` property is greater than zero.
    */
  var stroke: js.UndefOr[String] = js.native
  /**
    * The thickness of the stroke around the Text. Set to zero for no stroke.
    */
  var strokeThickness: js.UndefOr[Double] = js.native
  /**
    * This is the string used to aid Canvas in calculating the height of the font.
    */
  var testString: js.UndefOr[String] = js.native
  /**
    * The Text Word wrap configuration object.
    */
  var wordWrap: js.UndefOr[TextWordWrap] = js.native
}

object TextStyle {
  @scala.inline
  def apply(): TextStyle = {
    val __obj = js.Dynamic.literal()
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
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: String): Self = {
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
    def withBaselineX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baselineX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaselineX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baselineX")(js.undefined)
        ret
    }
    @scala.inline
    def withBaselineY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baselineY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaselineY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baselineY")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedWidth")(js.undefined)
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
    def withFontSize(value: String): Self = {
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
    def withFontStyle(value: String): Self = {
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
    def withMaxLines(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLines")(js.undefined)
        ret
    }
    @scala.inline
    def withMetrics(value: TextMetrics): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metrics")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: TextPadding): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withResolution(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolution")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolution: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolution")(js.undefined)
        ret
    }
    @scala.inline
    def withRtl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRtl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtl")(js.undefined)
        ret
    }
    @scala.inline
    def withShadow(value: TextShadow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShadow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shadow")(js.undefined)
        ret
    }
    @scala.inline
    def withStroke(value: String): Self = {
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
    def withStrokeThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withTestString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTestString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("testString")(js.undefined)
        ret
    }
    @scala.inline
    def withWordWrap(value: TextWordWrap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWordWrap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wordWrap")(js.undefined)
        ret
    }
  }
  
}

