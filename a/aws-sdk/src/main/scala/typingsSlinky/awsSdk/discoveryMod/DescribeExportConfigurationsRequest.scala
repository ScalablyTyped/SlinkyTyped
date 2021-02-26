package typingsSlinky.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeExportConfigurationsRequest extends StObject {
  
  /**
    * A list of continuous export IDs to search for.
    */
  var exportIds: js.UndefOr[ExportIds] = js.native
  
  /**
    * A number between 1 and 100 specifying the maximum number of continuous export descriptions returned.
    */
  var maxResults: js.UndefOr[Integer] = js.native
  
  /**
    * The token from the previous call to describe-export-tasks.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}
object DescribeExportConfigurationsRequest {
  
  @scala.inline
  def apply(): DescribeExportConfigurationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeExportConfigurationsRequest]
  }
  
  @scala.inline
  implicit class DescribeExportConfigurationsRequestMutableBuilder[Self <: DescribeExportConfigurationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportIds(value: ExportIds): Self = StObject.set(x, "exportIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportIdsUndefined: Self = StObject.set(x, "exportIds", js.undefined)
    
    @scala.inline
    def setExportIdsVarargs(value: ConfigurationsExportId*): Self = StObject.set(x, "exportIds", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: Integer): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
