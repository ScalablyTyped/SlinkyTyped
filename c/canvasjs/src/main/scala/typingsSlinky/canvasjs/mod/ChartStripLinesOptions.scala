package typingsSlinky.canvasjs.mod

import typingsSlinky.canvasjs.anon.Axis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartStripLinesOptions extends StObject {
  
  /**
    * Sets the color of the stripLine.
    * Default: "orange"
    * Example: "green", "#23EA23"
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    * Sets the point where the stripLine’s shaded region ends on the x-axis.
    * Default: null
    * Example: 50,60,200,300
    */
  var endValue: js.UndefOr[Double] = js.native
  
  /**
    * Sets the label of the stripLine. These are shown on top of axis labels.
    * Default: "" (empty string)
    * Example: "Threshold", "Deaths in 1920"
    */
  var label: js.UndefOr[String] = js.native
  
  /**
    * labelAlign allows you to place the stripline’s Label far, center or near the axis.
    * Default: “far”
    * Options: “far”, “center”, “near”
    */
  var labelAlign: js.UndefOr[String] = js.native
  
  /**
    * Sets the background color of stripLine’s label.
    * Default: "#eeeeee"
    * Example: "red","#fabd76"
    */
  var labelBackgroundColor: js.UndefOr[String] = js.native
  
  /**
    * Sets the font color of label.
    * Default: "orange"
    * Example: "blue","#4135e9"
    */
  var labelFontColor: js.UndefOr[String] = js.native
  
  /**
    * Sets the font-family of stripLine’s label. If the first font is not found in the system from the specified font-family list, it tries to use the next font in the list.
    * Default: "arial"
    * Example: "Arial, Trebuchet MS, Tahoma, sans-serif"
    */
  var labelFontFamily: js.UndefOr[String] = js.native
  
  /**
    * Sets the font size of the label in pixels.
    * Default: 12
    * Example: 18,19,20,22
    */
  var labelFontSize: js.UndefOr[Double] = js.native
  
  /**
    * Sets the font style of stripLine’s label.
    * Default: "normal"
    * Example: "normal","italic","oblique"
    */
  var labelFontStyle: js.UndefOr[String] = js.native
  
  /**
    * Sets the font weight of stripLine’s label.
    * Default: "normal"
    * Example: "lighter","normal","bold","bolder"
    */
  var labelFontWeight: js.UndefOr[String] = js.native
  
  /**
    * A custom formatter function that returns stripLine’s label.
    */
  var labelFormatter: js.UndefOr[js.Function1[/* e */ js.UndefOr[Axis], String]] = js.native
  
  /**
    * labelMaxWidth defines the maximum width of labels after which they get wrapped or clipped depending on labelWrap’s value.
    * It overrides the labelMaxWidth value set at axis level.
    * Default: Automatically calculated based on the length of label.
    * Example: 4, 20, 100 etc.
    */
  var labelMaxWidth: Double = js.native
  
  /**
    * labelPlacement allows you to place stripline’s Label either inside or outside of plotArea.
    * Default: “inside”
    * Options: “inside”, “outside”
    */
  var labelPlacement: js.UndefOr[String] = js.native
  
  /**
    * Setting labelWrap to true wraps the labels at labelMaxWidth. Clips the same when set to false. It overrides the labelWrap set at axis level.
    * Default: true
    * Example: true, false.
    */
  var labelWrap: Boolean = js.native
  
  /**
    * Sets the Dash Type for stripLine.
    * Default: solid
    */
  var lineDashType: js.UndefOr[DashType] = js.native
  
  /**
    * Sets opacity of stripLine.
    * Default: null
    * Example: .1, .5, 1 etc.
    */
  var opacity: js.UndefOr[Double] = js.native
  
  /**
    * stripLine is displayed on top of dataPoints when showOnTop is set to true.
    * Default: false
    * Example: true, false
    */
  var showOnTop: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets the point where the stripLine’s shaded region begins on the x-axis.
    * Default: null
    * Example: 20,30,100,50
    */
  var startValue: js.UndefOr[Double] = js.native
  
  /**
    * Sets the thickness of the stripLine in pixels.
    * Default: 2
    * Example: 2,4,5,6
    */
  var thickness: js.UndefOr[Double] = js.native
  
  /**
    * Sets the point where the stripLine has to be plotted or drawn along the axis X.
    * Default: null
    * Example: 20,30,100,50
    */
  var value: js.UndefOr[Double] = js.native
}
object ChartStripLinesOptions {
  
  @scala.inline
  def apply(labelMaxWidth: Double, labelWrap: Boolean): ChartStripLinesOptions = {
    val __obj = js.Dynamic.literal(labelMaxWidth = labelMaxWidth.asInstanceOf[js.Any], labelWrap = labelWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartStripLinesOptions]
  }
  
  @scala.inline
  implicit class ChartStripLinesOptionsMutableBuilder[Self <: ChartStripLinesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setEndValue(value: Double): Self = StObject.set(x, "endValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndValueUndefined: Self = StObject.set(x, "endValue", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelAlign(value: String): Self = StObject.set(x, "labelAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelAlignUndefined: Self = StObject.set(x, "labelAlign", js.undefined)
    
    @scala.inline
    def setLabelBackgroundColor(value: String): Self = StObject.set(x, "labelBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelBackgroundColorUndefined: Self = StObject.set(x, "labelBackgroundColor", js.undefined)
    
    @scala.inline
    def setLabelFontColor(value: String): Self = StObject.set(x, "labelFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelFontColorUndefined: Self = StObject.set(x, "labelFontColor", js.undefined)
    
    @scala.inline
    def setLabelFontFamily(value: String): Self = StObject.set(x, "labelFontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelFontFamilyUndefined: Self = StObject.set(x, "labelFontFamily", js.undefined)
    
    @scala.inline
    def setLabelFontSize(value: Double): Self = StObject.set(x, "labelFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelFontSizeUndefined: Self = StObject.set(x, "labelFontSize", js.undefined)
    
    @scala.inline
    def setLabelFontStyle(value: String): Self = StObject.set(x, "labelFontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelFontStyleUndefined: Self = StObject.set(x, "labelFontStyle", js.undefined)
    
    @scala.inline
    def setLabelFontWeight(value: String): Self = StObject.set(x, "labelFontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelFontWeightUndefined: Self = StObject.set(x, "labelFontWeight", js.undefined)
    
    @scala.inline
    def setLabelFormatter(value: /* e */ js.UndefOr[Axis] => String): Self = StObject.set(x, "labelFormatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLabelFormatterUndefined: Self = StObject.set(x, "labelFormatter", js.undefined)
    
    @scala.inline
    def setLabelMaxWidth(value: Double): Self = StObject.set(x, "labelMaxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelPlacement(value: String): Self = StObject.set(x, "labelPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelPlacementUndefined: Self = StObject.set(x, "labelPlacement", js.undefined)
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setLabelWrap(value: Boolean): Self = StObject.set(x, "labelWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineDashType(value: DashType): Self = StObject.set(x, "lineDashType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineDashTypeUndefined: Self = StObject.set(x, "lineDashType", js.undefined)
    
    @scala.inline
    def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setShowOnTop(value: Boolean): Self = StObject.set(x, "showOnTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowOnTopUndefined: Self = StObject.set(x, "showOnTop", js.undefined)
    
    @scala.inline
    def setStartValue(value: Double): Self = StObject.set(x, "startValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartValueUndefined: Self = StObject.set(x, "startValue", js.undefined)
    
    @scala.inline
    def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
