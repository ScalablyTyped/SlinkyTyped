package typingsSlinky.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDatasetImportJobsResponse extends StObject {
  
  /**
    * An array of objects that summarize each dataset import job's properties.
    */
  var DatasetImportJobs: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.DatasetImportJobs] = js.native
  
  /**
    * If the response is truncated, Amazon Forecast returns this token. To retrieve the next set of results, use the token in the next request.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.forecastserviceMod.NextToken] = js.native
}
object ListDatasetImportJobsResponse {
  
  @scala.inline
  def apply(): ListDatasetImportJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDatasetImportJobsResponse]
  }
  
  @scala.inline
  implicit class ListDatasetImportJobsResponseMutableBuilder[Self <: ListDatasetImportJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDatasetImportJobs(value: DatasetImportJobs): Self = StObject.set(x, "DatasetImportJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetImportJobsUndefined: Self = StObject.set(x, "DatasetImportJobs", js.undefined)
    
    @scala.inline
    def setDatasetImportJobsVarargs(value: DatasetImportJobSummary*): Self = StObject.set(x, "DatasetImportJobs", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
