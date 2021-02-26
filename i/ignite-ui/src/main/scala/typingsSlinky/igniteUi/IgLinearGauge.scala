package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class IgLinearGaugeMutableBuilder[Self <: IgLinearGauge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignLabel(value: (/* event */ Event, /* ui */ AlignLabelEventUIParam) => Unit): Self = StObject.set(x, "alignLabel", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAlignLabelUndefined: Self = StObject.set(x, "alignLabel", js.undefined)
    
    @scala.inline
    def setBackingBrush(value: String): Self = StObject.set(x, "backingBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackingBrushUndefined: Self = StObject.set(x, "backingBrush", js.undefined)
    
    @scala.inline
    def setBackingInnerExtent(value: Double): Self = StObject.set(x, "backingInnerExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackingInnerExtentUndefined: Self = StObject.set(x, "backingInnerExtent", js.undefined)
    
    @scala.inline
    def setBackingOuterExtent(value: Double): Self = StObject.set(x, "backingOuterExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackingOuterExtentUndefined: Self = StObject.set(x, "backingOuterExtent", js.undefined)
    
    @scala.inline
    def setBackingOutline(value: String): Self = StObject.set(x, "backingOutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackingOutlineUndefined: Self = StObject.set(x, "backingOutline", js.undefined)
    
    @scala.inline
    def setBackingStrokeThickness(value: Double): Self = StObject.set(x, "backingStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackingStrokeThicknessUndefined: Self = StObject.set(x, "backingStrokeThickness", js.undefined)
    
    @scala.inline
    def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontBrush(value: String): Self = StObject.set(x, "fontBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontBrushUndefined: Self = StObject.set(x, "fontBrush", js.undefined)
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setFormatLabel(value: (/* event */ Event, /* ui */ FormatLabelEventUIParam) => Unit): Self = StObject.set(x, "formatLabel", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFormatLabelUndefined: Self = StObject.set(x, "formatLabel", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setIsNeedleDraggingEnabled(value: Boolean): Self = StObject.set(x, "isNeedleDraggingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNeedleDraggingEnabledUndefined: Self = StObject.set(x, "isNeedleDraggingEnabled", js.undefined)
    
    @scala.inline
    def setIsScaleInverted(value: Boolean): Self = StObject.set(x, "isScaleInverted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsScaleInvertedUndefined: Self = StObject.set(x, "isScaleInverted", js.undefined)
    
    @scala.inline
    def setLabelExtent(value: Double): Self = StObject.set(x, "labelExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelExtentUndefined: Self = StObject.set(x, "labelExtent", js.undefined)
    
    @scala.inline
    def setLabelInterval(value: Double): Self = StObject.set(x, "labelInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelIntervalUndefined: Self = StObject.set(x, "labelInterval", js.undefined)
    
    @scala.inline
    def setLabelsPostInitial(value: Double): Self = StObject.set(x, "labelsPostInitial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsPostInitialUndefined: Self = StObject.set(x, "labelsPostInitial", js.undefined)
    
    @scala.inline
    def setLabelsPreTerminal(value: Double): Self = StObject.set(x, "labelsPreTerminal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsPreTerminalUndefined: Self = StObject.set(x, "labelsPreTerminal", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setMaximumValue(value: Double): Self = StObject.set(x, "maximumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumValueUndefined: Self = StObject.set(x, "maximumValue", js.undefined)
    
    @scala.inline
    def setMinimumValue(value: Double): Self = StObject.set(x, "minimumValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumValueUndefined: Self = StObject.set(x, "minimumValue", js.undefined)
    
    @scala.inline
    def setMinorTickBrush(value: String): Self = StObject.set(x, "minorTickBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorTickBrushUndefined: Self = StObject.set(x, "minorTickBrush", js.undefined)
    
    @scala.inline
    def setMinorTickCount(value: Double): Self = StObject.set(x, "minorTickCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorTickCountUndefined: Self = StObject.set(x, "minorTickCount", js.undefined)
    
    @scala.inline
    def setMinorTickEndExtent(value: Double): Self = StObject.set(x, "minorTickEndExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorTickEndExtentUndefined: Self = StObject.set(x, "minorTickEndExtent", js.undefined)
    
    @scala.inline
    def setMinorTickStartExtent(value: Double): Self = StObject.set(x, "minorTickStartExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorTickStartExtentUndefined: Self = StObject.set(x, "minorTickStartExtent", js.undefined)
    
    @scala.inline
    def setMinorTickStrokeThickness(value: Double): Self = StObject.set(x, "minorTickStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinorTickStrokeThicknessUndefined: Self = StObject.set(x, "minorTickStrokeThickness", js.undefined)
    
    @scala.inline
    def setNeedleBreadth(value: Double): Self = StObject.set(x, "needleBreadth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedleBreadthUndefined: Self = StObject.set(x, "needleBreadth", js.undefined)
    
    @scala.inline
    def setNeedleBrush(value: String): Self = StObject.set(x, "needleBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedleBrushUndefined: Self = StObject.set(x, "needleBrush", js.undefined)
    
    @scala.inline
    def setNeedleInnerBaseWidth(value: Double): Self = StObject.set(x, "needleInnerBaseWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedleInnerBaseWidthUndefined: Self = StObject.set(x, "needleInnerBaseWidth", js.undefined)
    
    @scala.inline
    def setNeedleInnerExtent(value: Double): Self = StObject.set(x, "needleInnerExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedleInnerExtentUndefined: Self = StObject.set(x, "needleInnerExtent", js.undefined)
    
    @scala.inline
    def setNeedleInnerPointExtent(value: Double): Self = StObject.set(x, "needleInnerPointExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedleInnerPointExtentUndefined: Self = StObject.set(x, "needleInnerPointExtent", js.undefined)
    
    @scala.inline
    def setNeedleInnerPointWidth(value: Double): Self = StObject.set(x, "needleInnerPointWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedleInnerPointWidthUndefined: Self = StObject.set(x, "needleInnerPointWidth", js.undefined)
    
    @scala.inline
    def setNeedleName(value: String): Self = StObject.set(x, "needleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedleNameUndefined: Self = StObject.set(x, "needleName", js.undefined)
    
    @scala.inline
    def setNeedleOuterBaseWidth(value: Double): Self = StObject.set(x, "needleOuterBaseWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedleOuterBaseWidthUndefined: Self = StObject.set(x, "needleOuterBaseWidth", js.undefined)
    
    @scala.inline
    def setNeedleOuterExtent(value: Double): Self = StObject.set(x, "needleOuterExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedleOuterExtentUndefined: Self = StObject.set(x, "needleOuterExtent", js.undefined)
    
    @scala.inline
    def setNeedleOuterPointExtent(value: Double): Self = StObject.set(x, "needleOuterPointExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedleOuterPointExtentUndefined: Self = StObject.set(x, "needleOuterPointExtent", js.undefined)
    
    @scala.inline
    def setNeedleOuterPointWidth(value: Double): Self = StObject.set(x, "needleOuterPointWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedleOuterPointWidthUndefined: Self = StObject.set(x, "needleOuterPointWidth", js.undefined)
    
    @scala.inline
    def setNeedleOutline(value: String): Self = StObject.set(x, "needleOutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedleOutlineUndefined: Self = StObject.set(x, "needleOutline", js.undefined)
    
    @scala.inline
    def setNeedleShape(value: String): Self = StObject.set(x, "needleShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedleShapeUndefined: Self = StObject.set(x, "needleShape", js.undefined)
    
    @scala.inline
    def setNeedleStrokeThickness(value: Double): Self = StObject.set(x, "needleStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedleStrokeThicknessUndefined: Self = StObject.set(x, "needleStrokeThickness", js.undefined)
    
    @scala.inline
    def setNeedleToolTipTemplate(value: String): Self = StObject.set(x, "needleToolTipTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedleToolTipTemplateUndefined: Self = StObject.set(x, "needleToolTipTemplate", js.undefined)
    
    @scala.inline
    def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setPixelScalingRatio(value: Double): Self = StObject.set(x, "pixelScalingRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelScalingRatioUndefined: Self = StObject.set(x, "pixelScalingRatio", js.undefined)
    
    @scala.inline
    def setRangeBrushes(value: js.Any): Self = StObject.set(x, "rangeBrushes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeBrushesUndefined: Self = StObject.set(x, "rangeBrushes", js.undefined)
    
    @scala.inline
    def setRangeInnerExtent(value: Double): Self = StObject.set(x, "rangeInnerExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeInnerExtentUndefined: Self = StObject.set(x, "rangeInnerExtent", js.undefined)
    
    @scala.inline
    def setRangeOuterExtent(value: Double): Self = StObject.set(x, "rangeOuterExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeOuterExtentUndefined: Self = StObject.set(x, "rangeOuterExtent", js.undefined)
    
    @scala.inline
    def setRangeOutlines(value: js.Any): Self = StObject.set(x, "rangeOutlines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeOutlinesUndefined: Self = StObject.set(x, "rangeOutlines", js.undefined)
    
    @scala.inline
    def setRangeToolTipTemplate(value: String): Self = StObject.set(x, "rangeToolTipTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeToolTipTemplateUndefined: Self = StObject.set(x, "rangeToolTipTemplate", js.undefined)
    
    @scala.inline
    def setRanges(value: js.Array[IgLinearGaugeRange]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
    
    @scala.inline
    def setRangesVarargs(value: IgLinearGaugeRange*): Self = StObject.set(x, "ranges", js.Array(value :_*))
    
    @scala.inline
    def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    @scala.inline
    def setScaleBrush(value: String): Self = StObject.set(x, "scaleBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleBrushUndefined: Self = StObject.set(x, "scaleBrush", js.undefined)
    
    @scala.inline
    def setScaleEndExtent(value: Double): Self = StObject.set(x, "scaleEndExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleEndExtentUndefined: Self = StObject.set(x, "scaleEndExtent", js.undefined)
    
    @scala.inline
    def setScaleInnerExtent(value: Double): Self = StObject.set(x, "scaleInnerExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleInnerExtentUndefined: Self = StObject.set(x, "scaleInnerExtent", js.undefined)
    
    @scala.inline
    def setScaleOuterExtent(value: Double): Self = StObject.set(x, "scaleOuterExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleOuterExtentUndefined: Self = StObject.set(x, "scaleOuterExtent", js.undefined)
    
    @scala.inline
    def setScaleOutline(value: String): Self = StObject.set(x, "scaleOutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleOutlineUndefined: Self = StObject.set(x, "scaleOutline", js.undefined)
    
    @scala.inline
    def setScaleStartExtent(value: Double): Self = StObject.set(x, "scaleStartExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleStartExtentUndefined: Self = StObject.set(x, "scaleStartExtent", js.undefined)
    
    @scala.inline
    def setScaleStrokeThickness(value: Double): Self = StObject.set(x, "scaleStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleStrokeThicknessUndefined: Self = StObject.set(x, "scaleStrokeThickness", js.undefined)
    
    @scala.inline
    def setShowToolTip(value: Boolean): Self = StObject.set(x, "showToolTip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowToolTipTimeout(value: Double): Self = StObject.set(x, "showToolTipTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowToolTipTimeoutUndefined: Self = StObject.set(x, "showToolTipTimeout", js.undefined)
    
    @scala.inline
    def setShowToolTipUndefined: Self = StObject.set(x, "showToolTip", js.undefined)
    
    @scala.inline
    def setTickBrush(value: String): Self = StObject.set(x, "tickBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickBrushUndefined: Self = StObject.set(x, "tickBrush", js.undefined)
    
    @scala.inline
    def setTickEndExtent(value: Double): Self = StObject.set(x, "tickEndExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickEndExtentUndefined: Self = StObject.set(x, "tickEndExtent", js.undefined)
    
    @scala.inline
    def setTickStartExtent(value: Double): Self = StObject.set(x, "tickStartExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickStartExtentUndefined: Self = StObject.set(x, "tickStartExtent", js.undefined)
    
    @scala.inline
    def setTickStrokeThickness(value: Double): Self = StObject.set(x, "tickStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickStrokeThicknessUndefined: Self = StObject.set(x, "tickStrokeThickness", js.undefined)
    
    @scala.inline
    def setTicksPostInitial(value: Double): Self = StObject.set(x, "ticksPostInitial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicksPostInitialUndefined: Self = StObject.set(x, "ticksPostInitial", js.undefined)
    
    @scala.inline
    def setTicksPreTerminal(value: Double): Self = StObject.set(x, "ticksPreTerminal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicksPreTerminalUndefined: Self = StObject.set(x, "ticksPreTerminal", js.undefined)
    
    @scala.inline
    def setTransitionDuration(value: Double): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueChanged(value: (/* event */ Event, /* ui */ ValueChangedEventUIParam) => Unit): Self = StObject.set(x, "valueChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def setValueChangedUndefined: Self = StObject.set(x, "valueChanged", js.undefined)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
