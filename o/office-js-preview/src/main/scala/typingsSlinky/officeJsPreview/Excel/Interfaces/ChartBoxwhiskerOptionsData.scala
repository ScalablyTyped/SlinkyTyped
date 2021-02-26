package typingsSlinky.officeJsPreview.Excel.Interfaces

import typingsSlinky.officeJsPreview.Excel.ChartBoxQuartileCalculation
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Exclusive
import typingsSlinky.officeJsPreview.officeJsPreviewStrings.Inclusive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `chartBoxwhiskerOptions.toJSON()`. */
@js.native
trait ChartBoxwhiskerOptionsData extends StObject {
  
  /**
    *
    * Specifies if the quartile calculation type of a box and whisker chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var quartileCalculation: js.UndefOr[ChartBoxQuartileCalculation | Inclusive | Exclusive] = js.native
  
  /**
    *
    * Specifies if inner points are shown in a box and whisker chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showInnerPoints: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies if the mean line is shown in a box and whisker chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showMeanLine: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies if the mean marker is shown in a box and whisker chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showMeanMarker: js.UndefOr[Boolean] = js.native
  
  /**
    *
    * Specifies if outlier points are shown in a box and whisker chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var showOutlierPoints: js.UndefOr[Boolean] = js.native
}
object ChartBoxwhiskerOptionsData {
  
  @scala.inline
  def apply(): ChartBoxwhiskerOptionsData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartBoxwhiskerOptionsData]
  }
  
  @scala.inline
  implicit class ChartBoxwhiskerOptionsDataMutableBuilder[Self <: ChartBoxwhiskerOptionsData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQuartileCalculation(value: ChartBoxQuartileCalculation | Inclusive | Exclusive): Self = StObject.set(x, "quartileCalculation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuartileCalculationUndefined: Self = StObject.set(x, "quartileCalculation", js.undefined)
    
    @scala.inline
    def setShowInnerPoints(value: Boolean): Self = StObject.set(x, "showInnerPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowInnerPointsUndefined: Self = StObject.set(x, "showInnerPoints", js.undefined)
    
    @scala.inline
    def setShowMeanLine(value: Boolean): Self = StObject.set(x, "showMeanLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMeanLineUndefined: Self = StObject.set(x, "showMeanLine", js.undefined)
    
    @scala.inline
    def setShowMeanMarker(value: Boolean): Self = StObject.set(x, "showMeanMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMeanMarkerUndefined: Self = StObject.set(x, "showMeanMarker", js.undefined)
    
    @scala.inline
    def setShowOutlierPoints(value: Boolean): Self = StObject.set(x, "showOutlierPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowOutlierPointsUndefined: Self = StObject.set(x, "showOutlierPoints", js.undefined)
  }
}
