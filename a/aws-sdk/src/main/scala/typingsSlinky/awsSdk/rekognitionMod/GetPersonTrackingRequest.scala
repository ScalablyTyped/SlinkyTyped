package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPersonTrackingRequest extends js.Object {
  
  /**
    * The identifier for a job that tracks persons in a video. You get the JobId from a call to StartPersonTracking. 
    */
  var JobId: typingsSlinky.awsSdk.rekognitionMod.JobId = js.native
  
  /**
    * Maximum number of results to return per paginated call. The largest value you can specify is 1000. If you specify a value greater than 1000, a maximum of 1000 results is returned. The default value is 1000.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.MaxResults] = js.native
  
  /**
    * If the previous response was incomplete (because there are more persons to retrieve), Amazon Rekognition Video returns a pagination token in the response. You can use this pagination token to retrieve the next set of persons. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * Sort to use for elements in the Persons array. Use TIMESTAMP to sort array elements by the time persons are detected. Use INDEX to sort by the tracked persons. If you sort by INDEX, the array elements for each person are sorted by detection confidence. The default sort is by TIMESTAMP.
    */
  var SortBy: js.UndefOr[PersonTrackingSortBy] = js.native
}
object GetPersonTrackingRequest {
  
  @scala.inline
  def apply(JobId: JobId): GetPersonTrackingRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPersonTrackingRequest]
  }
  
  @scala.inline
  implicit class GetPersonTrackingRequestOps[Self <: GetPersonTrackingRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setJobId(value: JobId): Self = this.set("JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setSortBy(value: PersonTrackingSortBy): Self = this.set("SortBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSortBy: Self = this.set("SortBy", js.undefined)
  }
}
