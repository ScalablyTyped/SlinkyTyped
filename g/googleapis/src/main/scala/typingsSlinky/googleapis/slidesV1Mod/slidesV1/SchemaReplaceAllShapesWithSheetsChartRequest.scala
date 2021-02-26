package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Replaces all shapes that match the given criteria with the provided Google
  * Sheets chart. The chart will be scaled and centered to fit within the
  * bounds of the original shape.  NOTE: Replacing shapes with a chart requires
  * at least one of the spreadsheets.readonly, spreadsheets, drive.readonly, or
  * drive OAuth scopes.
  */
@js.native
trait SchemaReplaceAllShapesWithSheetsChartRequest extends StObject {
  
  /**
    * The ID of the specific chart in the Google Sheets spreadsheet.
    */
  var chartId: js.UndefOr[Double] = js.native
  
  /**
    * The criteria that the shapes must match in order to be replaced. The
    * request will replace all of the shapes that contain the given text.
    */
  var containsText: js.UndefOr[SchemaSubstringMatchCriteria] = js.native
  
  /**
    * The mode with which the chart is linked to the source spreadsheet. When
    * not specified, the chart will be an image that is not linked.
    */
  var linkingMode: js.UndefOr[String] = js.native
  
  /**
    * If non-empty, limits the matches to page elements only on the given
    * pages.  Returns a 400 bad request error if given the page object ID of a
    * notes page or a notes master, or if a page with that object ID
    * doesn&#39;t exist in the presentation.
    */
  var pageObjectIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The ID of the Google Sheets spreadsheet that contains the chart.
    */
  var spreadsheetId: js.UndefOr[String] = js.native
}
object SchemaReplaceAllShapesWithSheetsChartRequest {
  
  @scala.inline
  def apply(): SchemaReplaceAllShapesWithSheetsChartRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReplaceAllShapesWithSheetsChartRequest]
  }
  
  @scala.inline
  implicit class SchemaReplaceAllShapesWithSheetsChartRequestMutableBuilder[Self <: SchemaReplaceAllShapesWithSheetsChartRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChartId(value: Double): Self = StObject.set(x, "chartId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartIdUndefined: Self = StObject.set(x, "chartId", js.undefined)
    
    @scala.inline
    def setContainsText(value: SchemaSubstringMatchCriteria): Self = StObject.set(x, "containsText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainsTextUndefined: Self = StObject.set(x, "containsText", js.undefined)
    
    @scala.inline
    def setLinkingMode(value: String): Self = StObject.set(x, "linkingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkingModeUndefined: Self = StObject.set(x, "linkingMode", js.undefined)
    
    @scala.inline
    def setPageObjectIds(value: js.Array[String]): Self = StObject.set(x, "pageObjectIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageObjectIdsUndefined: Self = StObject.set(x, "pageObjectIds", js.undefined)
    
    @scala.inline
    def setPageObjectIdsVarargs(value: String*): Self = StObject.set(x, "pageObjectIds", js.Array(value :_*))
    
    @scala.inline
    def setSpreadsheetId(value: String): Self = StObject.set(x, "spreadsheetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpreadsheetIdUndefined: Self = StObject.set(x, "spreadsheetId", js.undefined)
  }
}
