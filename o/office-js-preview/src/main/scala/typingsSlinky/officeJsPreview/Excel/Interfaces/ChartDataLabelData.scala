package typingsSlinky.officeJsPreview.Excel.Interfaces

import typingsSlinky.officeJsPreview.Excel.ChartDataLabelPosition
import typingsSlinky.officeJsPreview.Excel.ChartTextHorizontalAlignment
import typingsSlinky.officeJsPreview.Excel.ChartTextVerticalAlignment
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.BestFit
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Bottom
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Callout
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Center
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Distributed
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.InsideBase
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.InsideEnd
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Invalid
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Justify
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Left
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.None
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.OutsideEnd
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Right
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `chartDataLabel.toJSON()`. */
@js.native
trait ChartDataLabelData extends js.Object {
  
  /**
    *
    * Specifies if the data label automatically generates appropriate text based on context.
    *
    * [Api set: ExcelApi 1.8]
    */
  var autoText: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Represents the format of chart data label.
    *
    * [Api set: ExcelApi 1.8]
    */
  var format: js.UndefOr[ChartDataLabelFormatData] = js.native
  
  /**
    *
    * String value that represents the formula of chart data label using A1-style notation.
    *
    * [Api set: ExcelApi 1.8]
    */
  var formula: js.UndefOr[String] = js.native
  
  /**
    *
    * Returns the height, in points, of the chart data label. Null if chart data label is not visible.
    *
    * [Api set: ExcelApi 1.8]
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    *
    * Represents the horizontal alignment for chart data label. See Excel.ChartTextHorizontalAlignment for details.
    This property is valid only when TextOrientation of data label is -90, 90, or 180.
    *
    * [Api set: ExcelApi 1.8]
    */
  var horizontalAlignment: js.UndefOr[ChartTextHorizontalAlignment | Center | Left | Right | Justify | Distributed] = js.native
  
  /**
    *
    * Represents the distance, in points, from the left edge of chart data label to the left edge of chart area. Null if chart data label is not visible.
    *
    * [Api set: ExcelApi 1.8]
    */
  var left: js.UndefOr[Double] = js.native
  
  /**
    *
    * Specifies if the number format is linked to the cells (so that the number format changes in the labels when it changes in the cells).
    *
    * [Api set: ExcelApi 1.9]
    */
  var linkNumberFormat: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * String value that represents the format code for data label.
    *
    * [Api set: ExcelApi 1.8]
    */
  var numberFormat: js.UndefOr[String] = js.native
  
  /**
    *
    * DataLabelPosition value that represents the position of the data label. See Excel.ChartDataLabelPosition for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var position: js.UndefOr[
    ChartDataLabelPosition | Invalid | None | Center | InsideEnd | InsideBase | OutsideEnd | Left | Right | Top | Bottom | BestFit | Callout
  ] = js.native
  
  /**
    *
    * String representing the separator used for the data label on a chart.
    *
    * [Api set: ExcelApi 1.7]
    */
  var separator: js.UndefOr[String] = js.native
  
  /**
    *
    * Specifies if the data label bubble size is visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showBubbleSize: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies if the data label category name is visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showCategoryName: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies if the data label legend key is visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showLegendKey: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies if the data label percentage is visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showPercentage: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies if the data label series name is visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showSeriesName: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies if the data label value is visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showValue: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * String representing the text of the data label on a chart.
    *
    * [Api set: ExcelApi 1.8]
    */
  var text: js.UndefOr[String] = js.native
  
  /**
    *
    * Represents the angle to which the text is oriented for the chart data label. The value should either be an integer from -90 to 90 or the integer 180 for vertically-oriented text.
    *
    * [Api set: ExcelApi 1.8]
    */
  var textOrientation: js.UndefOr[Double] = js.native
  
  /**
    *
    * Represents the distance, in points, from the top edge of chart data label to the top of chart area. Null if chart data label is not visible.
    *
    * [Api set: ExcelApi 1.8]
    */
  var top: js.UndefOr[Double] = js.native
  
  /**
    *
    * Represents the vertical alignment of chart data label. See Excel.ChartTextVerticalAlignment for details.
    This property is valid only when TextOrientation of data label is 0.
    *
    * [Api set: ExcelApi 1.8]
    */
  var verticalAlignment: js.UndefOr[ChartTextVerticalAlignment | Center | Bottom | Top | Justify | Distributed] = js.native
  
  /**
    *
    * Returns the width, in points, of the chart data label. Null if chart data label is not visible.
    *
    * [Api set: ExcelApi 1.8]
    */
  var width: js.UndefOr[Double] = js.native
}
object ChartDataLabelData {
  
  @scala.inline
  def apply(): ChartDataLabelData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartDataLabelData]
  }
  
  @scala.inline
  implicit class ChartDataLabelDataOps[Self <: ChartDataLabelData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoText(value: Boolean): Self = this.set("autoText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoText: Self = this.set("autoText", js.undefined)
    
    @scala.inline
    def setFormat(value: ChartDataLabelFormatData): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setFormula(value: String): Self = this.set("formula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormula: Self = this.set("formula", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHorizontalAlignment(value: ChartTextHorizontalAlignment | Center | Left | Right | Justify | Distributed): Self = this.set("horizontalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalAlignment: Self = this.set("horizontalAlignment", js.undefined)
    
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    
    @scala.inline
    def setLinkNumberFormat(value: Boolean): Self = this.set("linkNumberFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkNumberFormat: Self = this.set("linkNumberFormat", js.undefined)
    
    @scala.inline
    def setNumberFormat(value: String): Self = this.set("numberFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberFormat: Self = this.set("numberFormat", js.undefined)
    
    @scala.inline
    def setPosition(
      value: ChartDataLabelPosition | Invalid | None | Center | InsideEnd | InsideBase | OutsideEnd | Left | Right | Top | Bottom | BestFit | Callout
    ): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    
    @scala.inline
    def setShowBubbleSize(value: Boolean): Self = this.set("showBubbleSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowBubbleSize: Self = this.set("showBubbleSize", js.undefined)
    
    @scala.inline
    def setShowCategoryName(value: Boolean): Self = this.set("showCategoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCategoryName: Self = this.set("showCategoryName", js.undefined)
    
    @scala.inline
    def setShowLegendKey(value: Boolean): Self = this.set("showLegendKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowLegendKey: Self = this.set("showLegendKey", js.undefined)
    
    @scala.inline
    def setShowPercentage(value: Boolean): Self = this.set("showPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowPercentage: Self = this.set("showPercentage", js.undefined)
    
    @scala.inline
    def setShowSeriesName(value: Boolean): Self = this.set("showSeriesName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowSeriesName: Self = this.set("showSeriesName", js.undefined)
    
    @scala.inline
    def setShowValue(value: Boolean): Self = this.set("showValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowValue: Self = this.set("showValue", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTextOrientation(value: Double): Self = this.set("textOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextOrientation: Self = this.set("textOrientation", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    
    @scala.inline
    def setVerticalAlignment(value: ChartTextVerticalAlignment | Center | Bottom | Top | Justify | Distributed): Self = this.set("verticalAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalAlignment: Self = this.set("verticalAlignment", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
