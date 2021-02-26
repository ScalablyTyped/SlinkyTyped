package typingsSlinky.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTranscriptionJobsRequest extends StObject {
  
  /**
    * When specified, the jobs returned in the list are limited to jobs whose name contains the specified string.
    */
  var JobNameContains: js.UndefOr[TranscriptionJobName] = js.native
  
  /**
    * The maximum number of jobs to return in the response. If there are fewer results in the list, this response contains only the actual results.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.MaxResults] = js.native
  
  /**
    * If the result of the previous request to ListTranscriptionJobs was truncated, include the NextToken to fetch the next set of jobs.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.NextToken] = js.native
  
  /**
    * When specified, returns only transcription jobs with the specified status. Jobs are ordered by creation date, with the newest jobs returned first. If you don’t specify a status, Amazon Transcribe returns all transcription jobs ordered by creation date. 
    */
  var Status: js.UndefOr[TranscriptionJobStatus] = js.native
}
object ListTranscriptionJobsRequest {
  
  @scala.inline
  def apply(): ListTranscriptionJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTranscriptionJobsRequest]
  }
  
  @scala.inline
  implicit class ListTranscriptionJobsRequestMutableBuilder[Self <: ListTranscriptionJobsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobNameContains(value: TranscriptionJobName): Self = StObject.set(x, "JobNameContains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobNameContainsUndefined: Self = StObject.set(x, "JobNameContains", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setStatus(value: TranscriptionJobStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
