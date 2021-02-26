package typingsSlinky.highcharts.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorAxisCurrentDateIndicatorLabelOptions extends StObject {
  
  /**
    * (Gantt) Horizontal alignment of the label. Can be one of "left", "center"
    * or "right".
    */
  var align: js.UndefOr[AlignValue] = js.native
  
  /**
    * (Gantt) Format of the label. This options is passed as the fist argument
    * to dateFormat function.
    */
  var format: js.UndefOr[String] = js.native
  
  /**
    * (Gantt) Callback JavaScript function to format the label. Useful
    * properties like the value of plot line or the range of plot band (`from`
    * & `to` properties) can be found in `this.options` object.
    */
  var formatter: js.UndefOr[FormatterCallbackFunction[PlotLineOrBand]] = js.native
  
  /**
    * (Gantt) Rotation of the text label in degrees. Defaults to 0 for
    * horizontal plot lines and 90 for vertical lines.
    */
  var rotation: js.UndefOr[Double] = js.native
  
  /**
    * (Gantt) CSS styles for the text label.
    *
    * In styled mode, the labels are styled by the
    * `.highcharts-plot-line-label` class.
    */
  var style: js.UndefOr[CSSObject] = js.native
  
  /**
    * (Gantt) The text itself. A subset of HTML is supported.
    */
  var text: js.UndefOr[String] = js.native
  
  /**
    * (Gantt) The text alignment for the label. While `align` determines where
    * the texts anchor point is placed within the plot band, `textAlign`
    * determines how the text is aligned against its anchor point. Possible
    * values are "left", "center" and "right". Defaults to the same as the
    * `align` option.
    */
  var textAlign: js.UndefOr[AlignValue] = js.native
  
  /**
    * (Gantt) Whether to use HTML to render the labels.
    */
  var useHTML: js.UndefOr[Boolean] = js.native
  
  /**
    * (Gantt) Vertical alignment of the label relative to the plot line. Can be
    * one of "top", "middle" or "bottom".
    */
  var verticalAlign: js.UndefOr[VerticalAlignValue] = js.native
  
  /**
    * (Gantt) Horizontal position relative the alignment. Default varies by
    * orientation.
    */
  var x: js.UndefOr[Double] = js.native
  
  /**
    * (Gantt) Vertical position of the text baseline relative to the alignment.
    * Default varies by orientation.
    */
  var y: js.UndefOr[Double] = js.native
}
object ColorAxisCurrentDateIndicatorLabelOptions {
  
  @scala.inline
  def apply(): ColorAxisCurrentDateIndicatorLabelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorAxisCurrentDateIndicatorLabelOptions]
  }
  
  @scala.inline
  implicit class ColorAxisCurrentDateIndicatorLabelOptionsMutableBuilder[Self <: ColorAxisCurrentDateIndicatorLabelOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: AlignValue): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setFormatter(value: FormatterCallbackFunction[PlotLineOrBand]): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSObject): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlign(value: AlignValue): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setUseHTML(value: Boolean): Self = StObject.set(x, "useHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseHTMLUndefined: Self = StObject.set(x, "useHTML", js.undefined)
    
    @scala.inline
    def setVerticalAlign(value: VerticalAlignValue): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
