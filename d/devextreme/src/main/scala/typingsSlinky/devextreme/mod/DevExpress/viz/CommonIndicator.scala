package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.anon.Indent
import typingsSlinky.devextreme.devextremeStrings.Bright
import typingsSlinky.devextreme.devextremeStrings.Carmine
import typingsSlinky.devextreme.devextremeStrings.Default
import typingsSlinky.devextreme.devextremeStrings.Material
import typingsSlinky.devextreme.devextremeStrings.Ocean
import typingsSlinky.devextreme.devextremeStrings.Office
import typingsSlinky.devextreme.devextremeStrings.Pastel
import typingsSlinky.devextreme.devextremeStrings.Soft
import typingsSlinky.devextreme.devextremeStrings.Vintage
import typingsSlinky.devextreme.devextremeStrings.Violet
import typingsSlinky.devextreme.devextremeStrings.`Dark Moon`
import typingsSlinky.devextreme.devextremeStrings.`Dark Violet`
import typingsSlinky.devextreme.devextremeStrings.`Green Mist`
import typingsSlinky.devextreme.devextremeStrings.`Harmony Light`
import typingsSlinky.devextreme.devextremeStrings.`Soft Blue`
import typingsSlinky.devextreme.devextremeStrings.`Soft Pastel`
import typingsSlinky.devextreme.devextremeStrings.bottom
import typingsSlinky.devextreme.devextremeStrings.left
import typingsSlinky.devextreme.devextremeStrings.right
import typingsSlinky.devextreme.devextremeStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonIndicator extends js.Object {
  /** Specifies the length of an arrow for the indicator of the textCloud type in pixels. */
  var arrowLength: js.UndefOr[Double] = js.native
  /** Specifies the background color for the indicator of the rangeBar type. */
  var backgroundColor: js.UndefOr[String] = js.native
  /** Specifies the base value for the indicator of the rangeBar type. */
  var baseValue: js.UndefOr[Double] = js.native
  /** Specifies a radius small enough for the indicator to begin adapting. */
  var beginAdaptingAtRadius: js.UndefOr[Double] = js.native
  /** Specifies a color of the indicator. */
  var color: js.UndefOr[String] = js.native
  /** Specifies the orientation of the rangeBar indicator. Applies only if the geometry.orientation option is "vertical". */
  var horizontalOrientation: js.UndefOr[left | right] = js.native
  /** Specifies the distance between the needle and the center of a gauge for the indicator of a needle-like type. */
  var indentFromCenter: js.UndefOr[Double] = js.native
  /** Specifies the indicator length. */
  var length: js.UndefOr[Double] = js.native
  /** Specifies the distance between the indicator and the invisible scale line. */
  var offset: js.UndefOr[Double] = js.native
  /** Sets the palette to be used to colorize indicators differently. */
  var palette: js.UndefOr[
    js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
  ] = js.native
  /** Specifies the second color for the indicator of the twoColorNeedle type. */
  var secondColor: js.UndefOr[String] = js.native
  /** Specifies the length of a twoNeedleColor type indicator tip as a percentage. */
  var secondFraction: js.UndefOr[Double] = js.native
  /** Specifies the range bar size for an indicator of the rangeBar type. */
  var size: js.UndefOr[Double] = js.native
  /** Specifies the inner diameter in pixels, so that the spindle has the shape of a ring. */
  var spindleGapSize: js.UndefOr[Double] = js.native
  /** Specifies the spindle's diameter in pixels for the indicator of a needle-like type. */
  var spindleSize: js.UndefOr[Double] = js.native
  /** Specifies the appearance of the text displayed in an indicator of the rangeBar type. */
  var text: js.UndefOr[Indent] = js.native
  /** Specifies the orientation of the rangeBar indicator. Applies only if the geometry.orientation option is "horizontal". */
  var verticalOrientation: js.UndefOr[bottom | top] = js.native
  /** Specifies the width of an indicator in pixels. */
  var width: js.UndefOr[Double] = js.native
}

object CommonIndicator {
  @scala.inline
  def apply(): CommonIndicator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonIndicator]
  }
  @scala.inline
  implicit class CommonIndicatorOps[Self <: CommonIndicator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrowLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowLength")(js.undefined)
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
    def withBaseValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseValue")(js.undefined)
        ret
    }
    @scala.inline
    def withBeginAdaptingAtRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginAdaptingAtRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBeginAdaptingAtRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beginAdaptingAtRadius")(js.undefined)
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
    def withHorizontalOrientation(value: left | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalOrientation")(js.undefined)
        ret
    }
    @scala.inline
    def withIndentFromCenter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentFromCenter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndentFromCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indentFromCenter")(js.undefined)
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withPalette(
      value: js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("palette")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPalette: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("palette")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondFraction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondFraction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondFraction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondFraction")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withSpindleGapSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spindleGapSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpindleGapSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spindleGapSize")(js.undefined)
        ret
    }
    @scala.inline
    def withSpindleSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spindleSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpindleSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spindleSize")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: Indent): Self = {
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
    def withVerticalOrientation(value: bottom | top): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalOrientation")(js.undefined)
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
  }
  
}

