package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgRadialGauge
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Event which is raised when a label of the gauge is aligned along the scale.
  	 * Function takes first argument null and second argument ui.
  	 * Use ui.owner to obtain reference to gauge widget.
  	 * Use ui.actualMinimumValue to obtain the minimum value of gauge scale.
  	 * Use ui.actualMaximumValue to obtain the maximum value of gauge scale.
  	 * Use ui.startAngle to obtain the starting angle of gauge scale.
  	 * Use ui.endAngle to obtain the ending angle of gauge scale.
  	 * Use ui.angle to obtain the angle on the gauge scale at which the label will be located.
  	 * Use ui.value to obtain the value on the gauge scale associated with the label.
  	 * Use ui.label to obtain the string value of the label.
  	 * Use ui.width to obtain the width of the label.
  	 * Use ui.height to obtain the height of the label.
  	 * Use ui.offsetX to obtain the X offset of the label on the gauge scale.
  	 * Use ui.offsetY to obtain the Y offset of the label on the gauge scale.
  	 */
  var alignLabel: js.UndefOr[AlignLabelEvent] = js.native
  /**
  	 * Gets or sets the brush to use to fill the backing of the gauge.
  	 */
  var backingBrush: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the corner rounding radius to use for the fitted scale backings.
  	 */
  var backingCornerRadius: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the inner extent of the gauge backing.
  	 */
  var backingInnerExtent: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the outer extent of the gauge backing.
  	 */
  var backingOuterExtent: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the brush to use for the outline of the backing.
  	 */
  var backingOutline: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the over sweep angle to apply to the backing if it is displaying fitted (in degrees). Must be greater or equal to 0.
  	 */
  var backingOversweep: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the type of shape to use for the backing of the gauge.
  	 *
  	 * Valid values:
  	 * "circular" A circular backing shape.
  	 * "fitted" A fitted backing shape.
  	 */
  var backingShape: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the stroke thickness of the backing outline.
  	 */
  var backingStrokeThickness: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the x position of the center of the gauge with the value ranging from 0 to 1.
  	 */
  var centerX: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the y position of the center of the gauge with the value ranging from 0 to 1.
  	 */
  var centerY: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the strategy to use for omitting labels if the first and last label have the same value.
  	 *
  	 * Valid values:
  	 * "omitLast" Omit the last label.
  	 * "omitFirst" Omit the first label.
  	 * "omitNeither" Omit no labels.
  	 * "omitBoth" Omit both labels.
  	 */
  var duplicateLabelOmissionStrategy: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the font.
  	 */
  var font: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the brush to use for the label font.
  	 */
  var fontBrush: js.UndefOr[String] = js.native
  /**
  	 * Event which is raised when a label of the gauge is formatted.
  	 * Function takes first argument null and second argument ui.
  	 * Use ui.owner to obtain reference to gauge widget.
  	 * Use ui.actualMinimumValue to obtain the minimum value of gauge scale.
  	 * Use ui.actualMaximumValue to obtain the maximum value of gauge scale.
  	 * Use ui.startAngle to obtain the starting angle of gauge scale.
  	 * Use ui.endAngle to obtain the ending angle of gauge scale.
  	 * Use ui.angle to obtain the angle on the gauge scale at which the label will be located.
  	 * Use ui.value to obtain the value on the gauge scale associated with the label.
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
  	 * Gets or sets whether the needle is constrained within the minimum and maximum value range during dragging.
  	 */
  var isNeedleDraggingConstrained: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets whether needle dragging is enabled or not.
  	 */
  var isNeedleDraggingEnabled: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets or sets the position at which to put the labels as a value from 0 to 1, measured form the center of the gauge.
  	 * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
  	 */
  var labelExtent: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the interval to use for rendering labels. This defaults to be the same interval as the tickmarks on the scale.
  	 */
  var labelInterval: js.UndefOr[Double] = js.native
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
  	 * Gets or sets the position at which to stop rendering the minor tickmarks as a value from 0 to 1, measured from the center of the gauge.
  	 * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
  	 */
  var minorTickEndExtent: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the position at which to start rendering the minor tickmarks as a value from 0 to 1, measured from the center of the gauge.
  	 * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
  	 */
  var minorTickStartExtent: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the stroke thickness to use when rendering minor ticks.
  	 */
  var minorTickStrokeThickness: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the extent of the feature which is closest to the base (e.g. a bulb) with a value from -1 to 1. Note: Only some needle shapes respect this property, namely: NeedleWithBulb, RectangleWithBulb, TrapezoidWithBulb, and TriangleWithBulb.
  	 * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
  	 */
  var needleBaseFeatureExtent: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the width of the needle at its feature which is closest to the base (e.g. a bulb) with a value from 0 to 1. Note: Only some needle shapes respect this property, namely: NeedleWithBulb, RectangleWithBulb, TrapezoidWithBulb, and TriangleWithBulb.
  	 * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
  	 */
  var needleBaseFeatureWidthRatio: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the brush to use when rendering the fill of the needle.
  	 */
  var needleBrush: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the extent (from -1 to 1) at which to end rendering the needle, measured from the center of the gauge.
  	 * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
  	 */
  var needleEndExtent: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the width of the needle at its point using a value from (0 to 1). Note: Only some needle shapes respect this property.
  	 * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
  	 */
  var needleEndWidthRatio: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the brush to use when rendering the outline of the needle.
  	 */
  var needleOutline: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the brush to use for filling the needle cap. Note: this only applies to certain cap shapes.
  	 */
  var needlePivotBrush: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the width of the inner cutout section of the needle cap with a value from 0 to 1. Note: Will only take effect if you have a cap set on the needle that has a cutout section.
  	 */
  var needlePivotInnerWidthRatio: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the brush to use for the outlines of the needle cap.
  	 */
  var needlePivotOutline: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the shape to use for the needle cap.
  	 *
  	 * Valid values:
  	 * "none" No pivot shape.
  	 * "circle" A circle shaped pivot.
  	 * "circleWithHole" A circle pivot with a hole in it.
  	 * "circleOverlay" A circle pivot overlayed on top of the needle.
  	 * "circleOverlayWithHole" A circle pivot with a hole in it overlayed on top of the needle.
  	 * "circleUnderlay" A circle pivot rendered underneath the needle.
  	 * "circleUnderlayWithHole" A circle pivot with a hold in it rendered underneath the needle.
  	 */
  var needlePivotShape: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the stroke thickness to use for the outline of the needle cap.
  	 */
  var needlePivotStrokeThickness: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the width of the cap of the needle with a value from 0 to 1. Note: Will only take effect if you have a cap set on the needle.
  	 * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
  	 */
  var needlePivotWidthRatio: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the extent of the feature which is closest to the point (e.g. the tapering point of a needle) with a value from -1 to 1. Note: Only some needle shapes respect this property.
  	 * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
  	 */
  var needlePointFeatureExtent: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the width of the needle at its feature which is closest to the point (e.g. the tapering point of a needle) with a value from 0 to 1. Note: Only some needle shapes respect this property.
  	 * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
  	 */
  var needlePointFeatureWidthRatio: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the shape to use when rendering the needle from a number of options.
  	 *
  	 * Valid values:
  	 * "none" No shape.
  	 * "rectangle" A rectangle shape.
  	 * "triangle" A triangle shape.
  	 * "needle" A needle shape.
  	 * "trapezoid" A trapezoid shape.
  	 * "rectangleWithBulb" A rectangle shape with a bulb at the end.
  	 * "triangleWithBulb" A triangle shape with a bulb at the end.
  	 * "needleWithBulb" A needle shape with a bulb at the end.
  	 * "trapezoidWithBulb" A trapezoid shape with a bulb at the end.
  	 */
  var needleShape: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the extent (from -1 to 1) at which to start rendering the needle, measured from the center of the gauge.
  	 * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
  	 */
  var needleStartExtent: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the width of the needle at its point using a value from (0 to 1). Note: Only some needle shapes respect this property.
  	 * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
  	 */
  var needleStartWidthRatio: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the stroke thickness of the needle outline.
  	 */
  var needleStrokeThickness: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the scaling value used to affect the pixel density of the control.
  	 * A higher scaling ratio will produce crisper visuals at the expense of memory.  Lower values will cause the control
  	 * to appear blurry.
  	 */
  var pixelScalingRatio: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the multiplying factor to apply to the normal radius of the gauge.
  	 * The radius of the gauge is defined by the minimum of the width and height of the control divided by 2.0.
  	 * This introduces a multiplicative factor to that value.
  	 */
  var radiusMultiplier: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets a collection of brushes to be used as the palette for gauge ranges.
  	 * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
  	 */
  var rangeBrushes: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets a collection of brushes to be used as the palette for gauge outlines.
  	 * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
  	 */
  var rangeOutlines: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets or sets the scale ranges to render on the linear gauge.
  	 */
  var ranges: js.UndefOr[js.Array[IgRadialGaugeRange]] = js.native
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.native
  /**
  	 * Gets or sets the brush to use to fill the background of the scale.
  	 */
  var scaleBrush: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the end angle for the scale in degrees.
  	 */
  var scaleEndAngle: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the position at which to stop rendering the scale as a value from 0 to 1 measured from the center of the gauge.
  	 * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
  	 */
  var scaleEndExtent: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the extra degrees of sweep to apply to the scale background. Must be greater or equal to 0.
  	 */
  var scaleOversweep: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the oversweep shape to use for the excess fill area for the scale.
  	 *
  	 * Valid values:
  	 * "auto" A default oversweep shape.
  	 * "circular" A circular oversweep shape.
  	 * "fitted" A fitted oversweep shape.
  	 */
  var scaleOversweepShape: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the start angle for the scale in degrees.
  	 */
  var scaleStartAngle: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the position at which to start rendering the scale, measured from the center of the gauge as a value from 0 to 1.
  	 * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
  	 */
  var scaleStartExtent: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the direction in which the scale sweeps around the center from the start angle to end angle.
  	 *
  	 * Valid values:
  	 * "counterclockwise" In a direction opposite the typical forward movement of the hands of a clock.
  	 * "clockwise" In a direction corresponding to the typical forward movement of the hands of a clock.
  	 */
  var scaleSweepDirection: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the brush to use for the major tickmarks.
  	 */
  var tickBrush: js.UndefOr[String] = js.native
  /**
  	 * Gets or sets the position at which to stop rendering the major tickmarks as a value from 0 to 1, measured from the center of the gauge.
  	 * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
  	 */
  var tickEndExtent: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the position at which to start rendering the major tickmarks as a value from 0 to 1, measured from the center of the gauge.
  	 * Values further from zero than 1 can be used to make this extend further than the normal radius of the gauge.
  	 */
  var tickStartExtent: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the stroke thickness to use when rendering ticks.
  	 */
  var tickStrokeThickness: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the number of milliseconds over which changes to the gauge should be animated.
  	 */
  var transitionDuration: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the easing function used to morph the current series.
  	 */
  var transitionEasingFunction: js.UndefOr[js.Any] = js.native
  /**
  	 * Gets the transition progress of the animation when the control is animating.
  	 */
  var transitionProgress: js.UndefOr[Double] = js.native
  /**
  	 * Gets or sets the value at which to point the needle of the gauge.
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

object IgRadialGauge {
  @scala.inline
  def apply(): IgRadialGauge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgRadialGauge]
  }
  @scala.inline
  implicit class IgRadialGaugeOps[Self <: IgRadialGauge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignLabel(value: (/* event */ Event_, /* ui */ AlignLabelEventUIParam) => Unit): Self = {
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
    def withBackingCornerRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backingCornerRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackingCornerRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backingCornerRadius")(js.undefined)
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
    def withBackingOversweep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backingOversweep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackingOversweep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backingOversweep")(js.undefined)
        ret
    }
    @scala.inline
    def withBackingShape(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backingShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackingShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backingShape")(js.undefined)
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
    def withCenterX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenterX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerX")(js.undefined)
        ret
    }
    @scala.inline
    def withCenterY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenterY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerY")(js.undefined)
        ret
    }
    @scala.inline
    def withDuplicateLabelOmissionStrategy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplicateLabelOmissionStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuplicateLabelOmissionStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duplicateLabelOmissionStrategy")(js.undefined)
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
    def withFormatLabel(value: (/* event */ Event_, /* ui */ FormatLabelEventUIParam) => Unit): Self = {
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
    def withIsNeedleDraggingConstrained(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNeedleDraggingConstrained")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsNeedleDraggingConstrained: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNeedleDraggingConstrained")(js.undefined)
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
    def withNeedleBaseFeatureExtent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleBaseFeatureExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedleBaseFeatureExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleBaseFeatureExtent")(js.undefined)
        ret
    }
    @scala.inline
    def withNeedleBaseFeatureWidthRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleBaseFeatureWidthRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedleBaseFeatureWidthRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleBaseFeatureWidthRatio")(js.undefined)
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
    def withNeedleEndExtent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleEndExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedleEndExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleEndExtent")(js.undefined)
        ret
    }
    @scala.inline
    def withNeedleEndWidthRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleEndWidthRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedleEndWidthRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleEndWidthRatio")(js.undefined)
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
    def withNeedlePivotBrush(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needlePivotBrush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedlePivotBrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needlePivotBrush")(js.undefined)
        ret
    }
    @scala.inline
    def withNeedlePivotInnerWidthRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needlePivotInnerWidthRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedlePivotInnerWidthRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needlePivotInnerWidthRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withNeedlePivotOutline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needlePivotOutline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedlePivotOutline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needlePivotOutline")(js.undefined)
        ret
    }
    @scala.inline
    def withNeedlePivotShape(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needlePivotShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedlePivotShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needlePivotShape")(js.undefined)
        ret
    }
    @scala.inline
    def withNeedlePivotStrokeThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needlePivotStrokeThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedlePivotStrokeThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needlePivotStrokeThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withNeedlePivotWidthRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needlePivotWidthRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedlePivotWidthRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needlePivotWidthRatio")(js.undefined)
        ret
    }
    @scala.inline
    def withNeedlePointFeatureExtent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needlePointFeatureExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedlePointFeatureExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needlePointFeatureExtent")(js.undefined)
        ret
    }
    @scala.inline
    def withNeedlePointFeatureWidthRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needlePointFeatureWidthRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedlePointFeatureWidthRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needlePointFeatureWidthRatio")(js.undefined)
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
    def withNeedleStartExtent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleStartExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedleStartExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleStartExtent")(js.undefined)
        ret
    }
    @scala.inline
    def withNeedleStartWidthRatio(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleStartWidthRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNeedleStartWidthRatio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needleStartWidthRatio")(js.undefined)
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
    def withRadiusMultiplier(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusMultiplier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRadiusMultiplier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radiusMultiplier")(js.undefined)
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
    def withRanges(value: js.Array[IgRadialGaugeRange]): Self = {
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
    def withScaleEndAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleEndAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleEndAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleEndAngle")(js.undefined)
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
    def withScaleOversweep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleOversweep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleOversweep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleOversweep")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleOversweepShape(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleOversweepShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleOversweepShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleOversweepShape")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleStartAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleStartAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleStartAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleStartAngle")(js.undefined)
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
    def withScaleSweepDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleSweepDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleSweepDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleSweepDirection")(js.undefined)
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
    def withTransitionEasingFunction(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionEasingFunction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionEasingFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionEasingFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withTransitionProgress(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransitionProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitionProgress")(js.undefined)
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
    def withValueChanged(value: (/* event */ Event_, /* ui */ ValueChangedEventUIParam) => Unit): Self = {
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

