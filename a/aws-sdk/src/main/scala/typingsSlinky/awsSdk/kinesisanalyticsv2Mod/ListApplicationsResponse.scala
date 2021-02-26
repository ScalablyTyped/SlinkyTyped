package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListApplicationsResponse extends StObject {
  
  /**
    * A list of ApplicationSummary objects.
    */
  var ApplicationSummaries: typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ApplicationSummaries = js.native
  
  /**
    * The pagination token for the next set of results, or null if there are no additional results. Pass this token into a subsequent command to retrieve the next set of items For more information about pagination, see Using the AWS Command Line Interface's Pagination Options.
    */
  var NextToken: js.UndefOr[ApplicationName] = js.native
}
object ListApplicationsResponse {
  
  @scala.inline
  def apply(ApplicationSummaries: ApplicationSummaries): ListApplicationsResponse = {
    val __obj = js.Dynamic.literal(ApplicationSummaries = ApplicationSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListApplicationsResponse]
  }
  
  @scala.inline
  implicit class ListApplicationsResponseMutableBuilder[Self <: ListApplicationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationSummaries(value: ApplicationSummaries): Self = StObject.set(x, "ApplicationSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationSummariesVarargs(value: ApplicationSummary*): Self = StObject.set(x, "ApplicationSummaries", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: ApplicationName): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
