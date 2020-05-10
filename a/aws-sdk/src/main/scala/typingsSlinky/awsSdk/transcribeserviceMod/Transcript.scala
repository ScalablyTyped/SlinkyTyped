package typingsSlinky.awsSdk.transcribeserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transcript extends js.Object {
  /**
    * The S3 object location of the redacted transcript. Use this URI to access the redacated transcript. If you specified an S3 bucket in the OutputBucketName field when you created the job, this is the URI of that bucket. If you chose to store the transcript in Amazon Transcribe, this is a shareable URL that provides secure access to that location.
    */
  var RedactedTranscriptFileUri: js.UndefOr[Uri] = js.native
  /**
    * The S3 object location of the the transcript. Use this URI to access the transcript. If you specified an S3 bucket in the OutputBucketName field when you created the job, this is the URI of that bucket. If you chose to store the transcript in Amazon Transcribe, this is a shareable URL that provides secure access to that location.
    */
  var TranscriptFileUri: js.UndefOr[Uri] = js.native
}

object Transcript {
  @scala.inline
  def apply(): Transcript = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Transcript]
  }
  @scala.inline
  implicit class TranscriptOps[Self <: Transcript] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRedactedTranscriptFileUri(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RedactedTranscriptFileUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedactedTranscriptFileUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RedactedTranscriptFileUri")(js.undefined)
        ret
    }
    @scala.inline
    def withTranscriptFileUri(value: Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TranscriptFileUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTranscriptFileUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TranscriptFileUri")(js.undefined)
        ret
    }
  }
  
}

