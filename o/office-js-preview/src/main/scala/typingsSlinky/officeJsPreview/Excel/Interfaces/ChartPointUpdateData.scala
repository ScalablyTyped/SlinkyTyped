package typingsSlinky.officeJsPreview.Excel.Interfaces

import typingsSlinky.officeJsPreview.Excel.ChartMarkerStyle
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Automatic
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Circle
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Dash
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Diamond
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Dot
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Invalid
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.None
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Picture
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Plus
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Square
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Star
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Triangle
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ChartPoint object, for use in `chartPoint.set({ ... })`. */
@js.native
trait ChartPointUpdateData extends StObject {
  
  /**
    *
    * Returns the data label of a chart point.
    *
    * [Api set: ExcelApi 1.7]
    */
  var dataLabel: js.UndefOr[ChartDataLabelUpdateData] = js.native
  
  /**
    *
    * Encapsulates the format properties chart point.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartPointFormatUpdateData] = js.native
  
  /**
    *
    * Represents whether a data point has a data label. Not applicable for surface charts.
    *
    * [Api set: ExcelApi 1.7]
    */
  var hasDataLabel: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * HTML color code representation of the marker background color of data point (e.g., #FF0000 represents Red).
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerBackgroundColor: js.UndefOr[String] = js.native
  
  /**
    *
    * HTML color code representation of the marker foreground color of data point (e.g., #FF0000 represents Red).
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerForegroundColor: js.UndefOr[String] = js.native
  
  /**
    *
    * Represents marker size of data point.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerSize: js.UndefOr[Double] = js.native
  
  /**
    *
    * Represents marker style of a chart data point. See Excel.ChartMarkerStyle for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var markerStyle: js.UndefOr[
    ChartMarkerStyle | Invalid | Automatic | None | Square | Diamond | Triangle | X | Star | Dot | Dash | Circle | Plus | Picture
  ] = js.native
}
object ChartPointUpdateData {
  
  @scala.inline
  def apply(): ChartPointUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartPointUpdateData]
  }
  
  @scala.inline
  implicit class ChartPointUpdateDataMutableBuilder[Self <: ChartPointUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataLabel(value: ChartDataLabelUpdateData): Self = StObject.set(x, "dataLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataLabelUndefined: Self = StObject.set(x, "dataLabel", js.undefined)
    
    @scala.inline
    def setFormat(value: ChartPointFormatUpdateData): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setHasDataLabel(value: Boolean): Self = StObject.set(x, "hasDataLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasDataLabelUndefined: Self = StObject.set(x, "hasDataLabel", js.undefined)
    
    @scala.inline
    def setMarkerBackgroundColor(value: String): Self = StObject.set(x, "markerBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerBackgroundColorUndefined: Self = StObject.set(x, "markerBackgroundColor", js.undefined)
    
    @scala.inline
    def setMarkerForegroundColor(value: String): Self = StObject.set(x, "markerForegroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerForegroundColorUndefined: Self = StObject.set(x, "markerForegroundColor", js.undefined)
    
    @scala.inline
    def setMarkerSize(value: Double): Self = StObject.set(x, "markerSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerSizeUndefined: Self = StObject.set(x, "markerSize", js.undefined)
    
    @scala.inline
    def setMarkerStyle(
      value: ChartMarkerStyle | Invalid | Automatic | None | Square | Diamond | Triangle | X | Star | Dot | Dash | Circle | Plus | Picture
    ): Self = StObject.set(x, "markerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerStyleUndefined: Self = StObject.set(x, "markerStyle", js.undefined)
  }
}
