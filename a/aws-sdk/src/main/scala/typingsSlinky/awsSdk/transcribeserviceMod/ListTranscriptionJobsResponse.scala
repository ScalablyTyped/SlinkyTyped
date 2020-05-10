package typingsSlinky.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTranscriptionJobsResponse extends js.Object {
  /**
    * The ListTranscriptionJobs operation returns a page of jobs at a time. The maximum size of the page is set by the MaxResults parameter. If there are more jobs in the list than the page size, Amazon Transcribe returns the NextPage token. Include the token in the next request to the ListTranscriptionJobs operation to return in the next page of jobs.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.NextToken] = js.native
  /**
    * The requested status of the jobs returned.
    */
  var Status: js.UndefOr[TranscriptionJobStatus] = js.native
  /**
    * A list of objects containing summary information for a transcription job.
    */
  var TranscriptionJobSummaries: js.UndefOr[typingsSlinky.awsSdk.transcribeserviceMod.TranscriptionJobSummaries] = js.native
}

object ListTranscriptionJobsResponse {
  @scala.inline
  def apply(): ListTranscriptionJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTranscriptionJobsResponse]
  }
  @scala.inline
  implicit class ListTranscriptionJobsResponseOps[Self <: ListTranscriptionJobsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: TranscriptionJobStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withTranscriptionJobSummaries(value: TranscriptionJobSummaries): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TranscriptionJobSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranscriptionJobSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TranscriptionJobSummaries")(js.undefined)
        ret
    }
  }
  
}

