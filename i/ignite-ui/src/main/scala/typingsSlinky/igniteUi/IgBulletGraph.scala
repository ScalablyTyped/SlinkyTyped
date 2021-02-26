package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgBulletGraph
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Event which is raised when a label of the bullet graph is aligned along the scale.
    * Function takes first argument evt and second argument ui.
    * Use ui.owner to obtain reference to gauge widget.
    * Use ui.actualMinimumValue to obtain the minimum value of the bullet graph scale.
    * Use ui.actualMaximumValue to obtain the maximum value of the bullet graph scale.
    * Use ui.value to obtain the value on the the bullet graph scale associated with the label.
    * Use ui.label to obtain the string value of the label.
    * Use ui.width to obtain the width of the label.
    * Use ui.height to obtain the height of the label.
    * Use ui.offsetX to obtain the X offset of the label on the bullet graph scale.
    * Use ui.offsetY to obtain the Y offset of the label on the bullet graph scale.
    */
  var alignLabel: js.UndefOr[AlignLabelEvent] = js.native
  
  /**
    * Gets or sets the brush to use to fill the backing of the bullet graph.
    */
  var backingBrush: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the inner extent of the bullet graph backing.
    */
  var backingInnerExtent: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the outer extent of the bullet graph backing.
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
    * Event which is raised when a label of the bullet graph is formatted.
    * Function takes first argument evt and second argument ui.
    * Use ui.owner to obtain reference to the bullet graph widget.
    * Use ui.actualMinimumValue to obtain the minimum value of the bullet graph scale.
    * Use ui.actualMaximumValue to obtain the maximum value of the bullet graph scale.
    * Use ui.value to obtain the value on the the bullet graph scale associated with the label.
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
    * Gets or sets a value indicating whether the scale is inverted.
    * When the scale is inverted the direction in which the scale values increase is right to left.
    */
  var isScaleInverted: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets the position at which to put the labels as a value from 0 to 1, measured from the bottom of the scale.
    * Values further from zero than 1 can be used to hide the labels of the bullet graph.
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
    * Gets or sets the position at which to stop rendering the minor tickmarks as a value from 0 to 1, measured from the front/bottom of the bullet graph.
    * Values further from zero than 1 can be used to make this extend further than the normal size of the bullet graph.
    */
  var minorTickEndExtent: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the position at which to start rendering the minor tickmarks as a value from 0 to 1, measured from the front/bottom of the bullet graph.
    * Values further from zero than 1 can be used to make this extend further than the normal size of the bullet graph.
    */
  var minorTickStartExtent: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the stroke thickness to use when rendering minor ticks.
    */
  var minorTickStrokeThickness: js.UndefOr[Double] = js.native
  
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
    * Gets or sets a collection of brushes to be used as the palette for bullet graph ranges.
    * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
    */
  var rangeBrushes: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets the position at which to start rendering the ranges, measured from the front/bottom of the control as a value from 0 to 1.
    * Values further from zero than 1 can be used to make this extend further than the normal size of the bullet graph.
    */
  var rangeInnerExtent: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the position at which to stop rendering the range as a value from 0 to 1 measured from the front/bottom of the bullet graph.
    * Values further from zero than 1 can be used to make this extend further than the normal size of the bullet graph.
    */
  var rangeOuterExtent: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets a collection of brushes to be used as the palette for bullet graph outlines.
    * The value provided should be an array of css color strings or JavaScript objects defining gradients. Optionally the first element can be a string reading "RGB" or "HSV" to specify the interpolation mode of the collection.
    */
  var rangeOutlines: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets or sets the ranges' tooltip template.
    */
  var rangeToolTipTemplate: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the scale ranges to render on the bullet graph.
    */
  var ranges: js.UndefOr[js.Array[IgBulletGraphRange]] = js.native
  
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.native
  
  /**
    * Gets or sets the background brush for the scale.
    */
  var scaleBackgroundBrush: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the background outline for the scale.
    */
  var scaleBackgroundOutline: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the background outline thickness for the scale.
    */
  var scaleBackgroundThickness: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the position at which to stop rendering the scale as a value from 0 to 1, measured from the front/bottom of the bullet graph.
    * Values further from zero than 1 can be used to make this extend further than the normal size of the bullet graph.
    */
  var scaleEndExtent: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the position at which to start rendering the scale, measured from the front/bottom of the bullet graph as a value from 0 to 1.
    * Values further from zero than 1 can be used to make this extend further than the normal size of the bullet graph.
    */
  var scaleStartExtent: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets a value indicating whether tooltips are enabled.
    */
  var showToolTip: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets or sets the time in milliseconds that tooltip appearance is delayed with.
    */
  var showToolTipTimeout: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the value indicated by the target value bar.
    */
  var targetValue: js.UndefOr[Double] = js.native
  
  /**
    * Get or sets the breadth of the target value element.
    */
  var targetValueBreadth: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the brush to use when rendering the fill of the comparative marker.
    */
  var targetValueBrush: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the position at which to start rendering the target value, measured from the front/bottom of the control as a value from 0 to 1.
    * Values further from zero than 1 can be used to make this extend further than the normal size of the bullet graph.
    */
  var targetValueInnerExtent: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the name used for the target value. The name is displayed in the default target value tooltip.
    */
  var targetValueName: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the position at which to start rendering the target value, measured from the front/bottom of the control as a value from 0 to 1.
    * Values further from zero than 1 can be used to make this extend further than the normal size of the bullet graph.
    */
  var targetValueOuterExtent: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the brush to use when rendering the outline of the target value.
    */
  var targetValueOutline: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the stroke thickness of the outline of the target value bar.
    */
  var targetValueStrokeThickness: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the target value's tooltip template.
    */
  var targetValueToolTipTemplate: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the brush to use for the major tickmarks.
    */
  var tickBrush: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the position at which to stop rendering the major tickmarks as a value from 0 to 1, measured from the front/bottom of the bullet graph.
    * Values further from zero than 1 can be used to make this extend further than the normal size of the bullet graph.
    */
  var tickEndExtent: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the position at which to start rendering the major tickmarks as a value from 0 to 1, measured from the front/bottom of the bullet graph.
    * Values further from zero than 1 can be used to make this extend further than the normal size of the bullet graph.
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
    * Gets or sets the number of milliseconds over which changes to the bullet graph should be animated.
    */
  var transitionDuration: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the value at which the bar ends.
    */
  var value: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the brush to use for the actual value element.
    */
  var valueBrush: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the position at which to start rendering the actual value geometries, measured from the front/bottom of the bullet graph as a value from 0 to 1.
    * Values further from zero than 1 can be used to make this extend further than the normal size of the bullet graph.
    */
  var valueInnerExtent: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the name used for actual value.
    */
  var valueName: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the position at which to stop rendering the actual value geometries as a value from 0 to 1 measured from the front/bottom of the bullet graph.
    * Values further from zero than 1 can be used to make this extend further than the normal size of the bullet graph.
    */
  var valueOuterExtent: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the brush to use for the outline of actual value element.
    */
  var valueOutline: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the stroke thickness to use when rendering single actual value element.
    */
  var valueStrokeThickness: js.UndefOr[Double] = js.native
  
  /**
    * Gets or sets the value's tooltip template.
    */
  var valueToolTipTemplate: js.UndefOr[String] = js.native
  
  /**
    * The width of the gauge. It can be set as a number in pixels, string (px) or percentage (%).
    */
  var width: js.UndefOr[String | Double] = js.native
}
object IgBulletGraph {
  
  @scala.inline
  def apply(): IgBulletGraph = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgBulletGraph]
  }
  
  @scala.inline
  implicit class IgBulletGraphMutableBuilder[Self <: IgBulletGraph] (val x: Self) extends AnyVal {
    
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
    def setRanges(value: js.Array[IgBulletGraphRange]): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangesUndefined: Self = StObject.set(x, "ranges", js.undefined)
    
    @scala.inline
    def setRangesVarargs(value: IgBulletGraphRange*): Self = StObject.set(x, "ranges", js.Array(value :_*))
    
    @scala.inline
    def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    @scala.inline
    def setScaleBackgroundBrush(value: String): Self = StObject.set(x, "scaleBackgroundBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleBackgroundBrushUndefined: Self = StObject.set(x, "scaleBackgroundBrush", js.undefined)
    
    @scala.inline
    def setScaleBackgroundOutline(value: String): Self = StObject.set(x, "scaleBackgroundOutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleBackgroundOutlineUndefined: Self = StObject.set(x, "scaleBackgroundOutline", js.undefined)
    
    @scala.inline
    def setScaleBackgroundThickness(value: Double): Self = StObject.set(x, "scaleBackgroundThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleBackgroundThicknessUndefined: Self = StObject.set(x, "scaleBackgroundThickness", js.undefined)
    
    @scala.inline
    def setScaleEndExtent(value: Double): Self = StObject.set(x, "scaleEndExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleEndExtentUndefined: Self = StObject.set(x, "scaleEndExtent", js.undefined)
    
    @scala.inline
    def setScaleStartExtent(value: Double): Self = StObject.set(x, "scaleStartExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleStartExtentUndefined: Self = StObject.set(x, "scaleStartExtent", js.undefined)
    
    @scala.inline
    def setShowToolTip(value: Boolean): Self = StObject.set(x, "showToolTip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowToolTipTimeout(value: Double): Self = StObject.set(x, "showToolTipTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowToolTipTimeoutUndefined: Self = StObject.set(x, "showToolTipTimeout", js.undefined)
    
    @scala.inline
    def setShowToolTipUndefined: Self = StObject.set(x, "showToolTip", js.undefined)
    
    @scala.inline
    def setTargetValue(value: Double): Self = StObject.set(x, "targetValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetValueBreadth(value: Double): Self = StObject.set(x, "targetValueBreadth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetValueBreadthUndefined: Self = StObject.set(x, "targetValueBreadth", js.undefined)
    
    @scala.inline
    def setTargetValueBrush(value: String): Self = StObject.set(x, "targetValueBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetValueBrushUndefined: Self = StObject.set(x, "targetValueBrush", js.undefined)
    
    @scala.inline
    def setTargetValueInnerExtent(value: Double): Self = StObject.set(x, "targetValueInnerExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetValueInnerExtentUndefined: Self = StObject.set(x, "targetValueInnerExtent", js.undefined)
    
    @scala.inline
    def setTargetValueName(value: String): Self = StObject.set(x, "targetValueName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetValueNameUndefined: Self = StObject.set(x, "targetValueName", js.undefined)
    
    @scala.inline
    def setTargetValueOuterExtent(value: Double): Self = StObject.set(x, "targetValueOuterExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetValueOuterExtentUndefined: Self = StObject.set(x, "targetValueOuterExtent", js.undefined)
    
    @scala.inline
    def setTargetValueOutline(value: String): Self = StObject.set(x, "targetValueOutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetValueOutlineUndefined: Self = StObject.set(x, "targetValueOutline", js.undefined)
    
    @scala.inline
    def setTargetValueStrokeThickness(value: Double): Self = StObject.set(x, "targetValueStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetValueStrokeThicknessUndefined: Self = StObject.set(x, "targetValueStrokeThickness", js.undefined)
    
    @scala.inline
    def setTargetValueToolTipTemplate(value: String): Self = StObject.set(x, "targetValueToolTipTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetValueToolTipTemplateUndefined: Self = StObject.set(x, "targetValueToolTipTemplate", js.undefined)
    
    @scala.inline
    def setTargetValueUndefined: Self = StObject.set(x, "targetValue", js.undefined)
    
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
    def setValueBrush(value: String): Self = StObject.set(x, "valueBrush", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueBrushUndefined: Self = StObject.set(x, "valueBrush", js.undefined)
    
    @scala.inline
    def setValueInnerExtent(value: Double): Self = StObject.set(x, "valueInnerExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueInnerExtentUndefined: Self = StObject.set(x, "valueInnerExtent", js.undefined)
    
    @scala.inline
    def setValueName(value: String): Self = StObject.set(x, "valueName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNameUndefined: Self = StObject.set(x, "valueName", js.undefined)
    
    @scala.inline
    def setValueOuterExtent(value: Double): Self = StObject.set(x, "valueOuterExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueOuterExtentUndefined: Self = StObject.set(x, "valueOuterExtent", js.undefined)
    
    @scala.inline
    def setValueOutline(value: String): Self = StObject.set(x, "valueOutline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueOutlineUndefined: Self = StObject.set(x, "valueOutline", js.undefined)
    
    @scala.inline
    def setValueStrokeThickness(value: Double): Self = StObject.set(x, "valueStrokeThickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueStrokeThicknessUndefined: Self = StObject.set(x, "valueStrokeThickness", js.undefined)
    
    @scala.inline
    def setValueToolTipTemplate(value: String): Self = StObject.set(x, "valueToolTipTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueToolTipTemplateUndefined: Self = StObject.set(x, "valueToolTipTemplate", js.undefined)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
