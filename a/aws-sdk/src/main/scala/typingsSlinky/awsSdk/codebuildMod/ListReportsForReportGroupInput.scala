package typingsSlinky.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListReportsForReportGroupInput extends StObject {
  
  /**
    *  A ReportFilter object used to filter the returned reports. 
    */
  var filter: js.UndefOr[ReportFilter] = js.native
  
  /**
    *  The maximum number of paginated reports in this report group returned per response. Use nextToken to iterate pages in the list of returned Report objects. The default value is 100. 
    */
  var maxResults: js.UndefOr[PageSize] = js.native
  
  /**
    *  During a previous call, the maximum number of items that can be returned is the value specified in maxResults. If there more items in the list, then a unique string called a nextToken is returned. To get the next batch of items in the list, call this operation again, adding the next token to the call. To get all of the items in the list, keep calling this operation with each subsequent next token that is returned, until no more next tokens are returned. 
    */
  var nextToken: js.UndefOr[String] = js.native
  
  /**
    *  The ARN of the report group for which you want to return report ARNs. 
    */
  var reportGroupArn: String = js.native
  
  /**
    *  Use to specify whether the results are returned in ascending or descending order. 
    */
  var sortOrder: js.UndefOr[SortOrderType] = js.native
}
object ListReportsForReportGroupInput {
  
  @scala.inline
  def apply(reportGroupArn: String): ListReportsForReportGroupInput = {
    val __obj = js.Dynamic.literal(reportGroupArn = reportGroupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReportsForReportGroupInput]
  }
  
  @scala.inline
  implicit class ListReportsForReportGroupInputMutableBuilder[Self <: ListReportsForReportGroupInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilter(value: ReportFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setMaxResults(value: PageSize): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setReportGroupArn(value: String): Self = StObject.set(x, "reportGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrder(value: SortOrderType): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
  }
}
