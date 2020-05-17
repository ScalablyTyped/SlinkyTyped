package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgLinearGauge
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Event which is raised when a label of the linear gauge is aligned along the scale.
  	 * Function takes first argument evt and second argument ui.
  	 * Use ui.owner to obtain reference to the gauge widget.
  	 * Use ui.actualMinimumValue to obtain the minimum value of the gauge scale.
  	 * Use ui.actualMaximumValue to obtain the maximum value of the gauge scale.
  	 * Use ui.value to obtain the value on the gauge scale associated with the label.
  	 * Use ui.label to obtain the string value of the label.
  	 * Use ui.width to obtain the width of the label.
  	 * Use ui.height to obtain the height of the label.
  	 * Use ui.offsetX to obtain the X offset of the label on the gauge scale.
  	 * Use ui.offsetY to obtain the Y offset of the label on the gauge scale.
  	 */
  var alignLabel: js.UndefOr[AlignLabelEvent] = js.native
  /**
  	 * Gets or sets the brush to use to fill the backing of the linear gauge.
  	 */
  var backingBrush: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the inner extent of the linear gauge backing.
  	 */
  var backingInnerExtent: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the outer extent of the linear gauge backing.
  	 */
  var backingOuterExtent: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the brush to use for the outline of the backing.
  	 */
  var backingOutline: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the stroke thickness of the backing outline.
  	 */
  var backingStrokeThickness: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the font.
  	 */
  var font: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the brush to use for the label font.
  	 */
  var fontBrush: js.UndefOr[String] = js.native
  /**
  	 * Event which is raised when a label of the the gauge is formatted.
  	 * Function takes first argument evt and second argument ui.
  	 * Use ui.owner to obtain reference to the gauge widget.
  	 * Use ui.actualMinimumValue to obtain the minimum value of the gauge scale.
  	 * Use ui.actualMaximumValue to obtain the maximum value of the gauge scale.
  	 * Use ui.value to obtain the value on the the gauge scale associated with the label.
  	 * Use ui.label to obtain the string value of the label.
  	 */
  var formatLabel: js.UndefOr[FormatLabelEvent] = js.native
  /**
  	 * The height of the gauge. It can be set as a number in pixels, string (px) or percentage (%).
  	 */
  var height: js.UndefOr[String | Double] = js.native
  /**
  	 * Gets or sets the interval to use for the scale.
  	 */
  var interval: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets whether needle dragging is enabled or not.
  	 */
  var isNeedleDraggingEnabled: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets a value indicating whether the scale is inverted.
  	 * When the scale is inverted the direction in which the scale values increase is right to left.
  	 */
  var isScaleInverted: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets the position at which to put the labels as a value from 0 to 1, measured from the bottom of the scale.
  	 * Values further from zero than 1 can be used to hide the labels of the linear gauge.
  	 */
  var labelExtent: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the interval to use for rendering labels. This defaults to be the same interval as the tickmarks on the scale.
  	 */
  var labelInterval: js.UndefOr[Double] = js.native
  /**
  	 * A value to start adding labels, added to the scale's MinimumValue.
  	 */
  var labelsPostInitial: js.UndefOr[Double] = js.native
  /**
  	 * A value to stop adding labels, subtracted from the scale's MaximumValue.
  	 */
  var labelsPreTerminal: js.UndefOr[Double] = js.native
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.native
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the maximum value of the scale.
  	 */
  var maximumValue: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the minimum value of the scale.
  	 */
  var minimumValue: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the brush to use for the minor tickmarks.
  	 */
  var minorTickBrush: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the number of minor tickmarks to place between major tickmarks.
  	 */
  var minorTickCount: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the position at which to stop rendering the minor tickmarks as a value from 0 to 1, measured from the front/bottom of the linear gauge.
  	 * Values further from zero than 1 can be used to make this extend further than the normal size of the linear gauge.
  	 */
  var minorTickEndExtent: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the position at which to start rendering the minor tickmarks as a value from 0 to 1, measured from the front/bottom of the linear gauge.
  	 * Values further from zero than 1 can be used to make this extend further than the normal size of the linear gauge.
  	 */
  var minorTickStartExtent: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the stroke thickness to use when rendering minor ticks.
  	 */
  var minorTickStrokeThickness: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the needle breadth.
  	 */
  var needleBreadth: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the brush to use for needle element.
  	 */
  var needleBrush: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the width of the needle's inner base.
  	 */
  var needleInnerBaseWidth: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the position at which to start rendering the needle geometry, measured from the front/bottom of the linear gauge as a value from 0 to 1.
  	 * Values further from zero than 1 can be used to make this extend further than the normal size of the linear gauge.
  	 */
  var needleInnerExtent: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the extent of the needle's inner point.
  	 */
  var needleInnerPointExtent: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the width of the needle's inner point.
  	 */
  var needleInnerPointWidth: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the name used for needle.
  	 */
  var needleName: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the width of the needle's outer base.
  	 */
  var needleOuterBaseWidth: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the position at which to stop rendering the needle geometry as a value from 0 to 1 measured from the front/bottom of the linear gauge.
  	 * Values further from zero than 1 can be used to make this extend further than the normal size of the linear gauge.
  	 */
  var needleOuterExtent: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the extent of the needle's outer point.
  	 */
  var needleOuterPointExtent: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the width of the needle's outer point.
  	 */
  var needleOuterPointWidth: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the brush to use for the outline of needle element.
  	 */
  var needleOutline: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the shape to use when rendering the needle from a number of options.
  	 *
  	 * Valid values:
  	 * "custom" A custom user defined needle shape.
  	 * "rectangle" A needle shaped like a rectangle.
  	 * "triangle" A needle shaped like a triangle.
  	 * "needle" A needle shaped like a needle.
  	 * "trapezoid" A needle shaped like a trapezoid.
  	 */
  var needleShape: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the stroke thickness to use when rendering single actual value element.
  	 */
  var needleStrokeThickness: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the needle's tooltip template.
  	 */
  var needleToolTipTemplate: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the orientation of the scale.
  	 *
  	 * Valid values:
  	 * "horizontal" The scale has a horizontal orientation.
  	 * "vertical" The scale has a vertical orientation.
  	 */
  var orientation: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the scaling value used to affect the pixel density of the control.
  	 * A higher scaling ratio will produce crisper visuals at the expense of memory.  Lower values will cause the control
  	 * to appear blurry.
  	 */
  var pixelScalingRatio: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets a collection of brushes to be used as the palette for linear gauge ranges.
  	 * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
  	 */
  var rangeBrushes: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the position at which to start rendering the ranges, measured from the front/bottom of the control as a value from 0 to 1.
  	 * Values further from zero than 1 can be used to make this extend further than the normal size of the linear gauge.
  	 */
  var rangeInnerExtent: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the position at which to stop rendering the range as a value from 0 to 1 measured from the front/bottom of the linear gauge.
  	 * Values further from zero than 1 can be used to make this extend further than the normal size of the linear gauge.
  	 */
  var rangeOuterExtent: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets a collection of brushes to be used as the palette for linear gauge outlines.
  	 * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
  	 */
  var rangeOutlines: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the ranges' tooltip template.
  	 */
  var rangeToolTipTemplate: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the scale ranges to render on the linear gauge.
  	 */
  var ranges: js.UndefOr[js.Array[IgLinearGaugeRange]] = js.native
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.native
  /**
  	 * Gets or sets the brush to use to fill the scale of the linear gauge.
  	 */
  var scaleBrush: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the position at which to stop rendering the scale as a value from 0 to 1, measured from the front/bottom of the linear gauge.
  	 * Values further from zero than 1 can be used to make this extend further than the normal size of the linear gauge.
  	 */
  var scaleEndExtent: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the position at which to start rendering the scale, measured from the bottom/front (when orientation is horizontal/vertical) of the control as a value from 0 to 1.
  	 * Values further from zero than 1 can be used to make this extend further than the normal size of the linear gauge.
  	 */
  var scaleInnerExtent: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the position at which to stop rendering the scale as a value from 0 to 1 measured from the bottom/front (when orientation is horizontal/vertical) of the linear gauge.
  	 * Values further from zero than 1 can be used to make this extend further than the normal size of the linear gauge.
  	 */
  var scaleOuterExtent: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the brush to use for the outline of the scale.
  	 */
  var scaleOutline: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the position at which to start rendering the scale, measured from the front/bottom of the linear gauge as a value from 0 to 1.
  	 * Values further from zero than 1 can be used to make this extend further than the normal size of the linear gauge.
  	 */
  var scaleStartExtent: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the stroke thickness of the scale outline.
  	 */
  var scaleStrokeThickness: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets a value indicating whether tooltips are enabled.
  	 */
  var showToolTip: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets the time in milliseconds that tooltip appearance is delayed with.
  	 */
  var showToolTipTimeout: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the brush to use for the major tickmarks.
  	 */
  var tickBrush: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the position at which to stop rendering the major tickmarks as a value from 0 to 1, measured from the front/bottom of the linear gauge.
  	 * Values further from zero than 1 can be used to make this extend further than the normal size of the linear gauge.
  	 */
  var tickEndExtent: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the position at which to start rendering the major tickmarks as a value from 0 to 1, measured from the front/bottom of the linear gauge.
  	 * Values further from zero than 1 can be used to make this extend further than the normal size of the linear gauge.
  	 */
  var tickStartExtent: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the stroke thickness to use when rendering ticks.
  	 */
  var tickStrokeThickness: js.UndefOr[Double] = js.native
  /**
  	 * A value to start adding tickmarks, added to the scale's MinimumValue.
  	 */
  var ticksPostInitial: js.UndefOr[Double] = js.native
  /**
  	 * A value to stop adding tickmarks, subtracted from the scale's MaximumValue.
  	 */
  var ticksPreTerminal: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the number of milliseconds over which changes to the linear gauge should be animated.
  	 */
  var transitionDuration: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the value at which the needle is positioned.
  	 */
  var value: js.UndefOr[Double] = js.native
  /**
  	 * Occurs when the Value property changes.
  	 */
  var valueChanged: js.UndefOr[ValueChangedEvent] = js.native
  /**
  	 * The width of the gauge. It can be set as a number in pixels, string (px) or percentage (%).
  	 */
  var width: js.UndefOr[String | Double] = js.native
}

object IgLinearGauge {
  @scala.inline
  def apply(): IgLinearGauge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgLinearGauge]
  }
  @scala.inline
  implicit class IgLinearGaugeOps[Self <: IgLinearGauge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignLabel(value: (/* event */ Event, /* ui */ AlignLabelEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignLabel")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAlignLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withBackingBrush(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backingBrush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackingBrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backingBrush")(js.undefined)
        ret
    }
    @scala.inline
    def withBackingInnerExtent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backingInnerExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackingInnerExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backingInnerExtent")(js.undefined)
        ret
    }
    @scala.inline
    def withBackingOuterExtent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backingOuterExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackingOuterExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backingOuterExtent")(js.undefined)
        ret
    }
    @scala.inline
    def withBackingOutline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backingOutline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackingOutline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backingOutline")(js.undefined)
        ret
    }
    @scala.inline
    def withBackingStrokeThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backingStrokeThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackingStrokeThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backingStrokeThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def withFontBrush(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontBrush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFontBrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fontBrush")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatLabel(value: (/* event */ Event, /* ui */ FormatLabelEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatLabel")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFormatLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String | Double): Self = {
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
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.undefined)
        ret
    }
    @scala.inline
    def withIsNeedleDraggingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNeedleDraggingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsNeedleDraggingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNeedleDraggingEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIsScaleInverted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isScaleInverted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsScaleInverted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isScaleInverted")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelExtent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelExtent")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelsPostInitial(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelsPostInitial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelsPostInitial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelsPostInitial")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelsPreTerminal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelsPreTerminal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelsPreTerminal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelsPreTerminal")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorTickBrush(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTickBrush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorTickBrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTickBrush")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorTickCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTickCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorTickCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTickCount")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorTickEndExtent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTickEndExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorTickEndExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTickEndExtent")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorTickStartExtent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTickStartExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorTickStartExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTickStartExtent")(js.undefined)
        ret
    }
    @scala.inline
    def withMinorTickStrokeThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTickStrokeThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinorTickStrokeThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorTickStrokeThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withNeedleBreadth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleBreadth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedleBreadth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleBreadth")(js.undefined)
        ret
    }
    @scala.inline
    def withNeedleBrush(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleBrush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedleBrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleBrush")(js.undefined)
        ret
    }
    @scala.inline
    def withNeedleInnerBaseWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleInnerBaseWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedleInnerBaseWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleInnerBaseWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withNeedleInnerExtent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleInnerExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedleInnerExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleInnerExtent")(js.undefined)
        ret
    }
    @scala.inline
    def withNeedleInnerPointExtent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleInnerPointExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedleInnerPointExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleInnerPointExtent")(js.undefined)
        ret
    }
    @scala.inline
    def withNeedleInnerPointWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleInnerPointWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedleInnerPointWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleInnerPointWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withNeedleName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedleName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleName")(js.undefined)
        ret
    }
    @scala.inline
    def withNeedleOuterBaseWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleOuterBaseWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedleOuterBaseWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleOuterBaseWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withNeedleOuterExtent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleOuterExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedleOuterExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleOuterExtent")(js.undefined)
        ret
    }
    @scala.inline
    def withNeedleOuterPointExtent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleOuterPointExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedleOuterPointExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleOuterPointExtent")(js.undefined)
        ret
    }
    @scala.inline
    def withNeedleOuterPointWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleOuterPointWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedleOuterPointWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleOuterPointWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withNeedleOutline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleOutline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedleOutline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleOutline")(js.undefined)
        ret
    }
    @scala.inline
    def withNeedleShape(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedleShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleShape")(js.undefined)
        ret
    }
    @scala.inline
    def withNeedleStrokeThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleStrokeThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedleStrokeThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleStrokeThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withNeedleToolTipTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleToolTipTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedleToolTipTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleToolTipTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withPixelScalingRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelScalingRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPixelScalingRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelScalingRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeBrushes(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeBrushes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeBrushes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeBrushes")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeInnerExtent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeInnerExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeInnerExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeInnerExtent")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeOuterExtent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeOuterExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeOuterExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeOuterExtent")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeOutlines(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeOutlines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeOutlines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeOutlines")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeToolTipTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeToolTipTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeToolTipTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeToolTipTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withRanges(value: js.Array[IgLinearGaugeRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranges")(js.undefined)
        ret
    }
    @scala.inline
    def withRegional(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleBrush(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleBrush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleBrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleBrush")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleEndExtent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleEndExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleEndExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleEndExtent")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleInnerExtent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleInnerExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleInnerExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleInnerExtent")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleOuterExtent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleOuterExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleOuterExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleOuterExtent")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleOutline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleOutline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleOutline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleOutline")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleStartExtent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleStartExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleStartExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleStartExtent")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleStrokeThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleStrokeThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleStrokeThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleStrokeThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withShowToolTip(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showToolTip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowToolTip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showToolTip")(js.undefined)
        ret
    }
    @scala.inline
    def withShowToolTipTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showToolTipTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowToolTipTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showToolTipTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTickBrush(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickBrush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickBrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickBrush")(js.undefined)
        ret
    }
    @scala.inline
    def withTickEndExtent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickEndExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickEndExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickEndExtent")(js.undefined)
        ret
    }
    @scala.inline
    def withTickStartExtent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickStartExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickStartExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickStartExtent")(js.undefined)
        ret
    }
    @scala.inline
    def withTickStrokeThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickStrokeThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTickStrokeThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tickStrokeThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withTicksPostInitial(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticksPostInitial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTicksPostInitial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticksPostInitial")(js.undefined)
        ret
    }
    @scala.inline
    def withTicksPreTerminal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticksPreTerminal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTicksPreTerminal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticksPreTerminal")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withValueChanged(value: (/* event */ Event, /* ui */ ValueChangedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueChanged")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutValueChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String | Double): Self = {
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

