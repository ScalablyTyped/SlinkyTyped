package typingsSlinky.awsSdk.textractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDocumentAnalysisResponse extends js.Object {
  /**
    * 
    */
  var AnalyzeDocumentModelVersion: js.UndefOr[String] = js.native
  /**
    * The results of the text-analysis operation.
    */
  var Blocks: js.UndefOr[BlockList] = js.native
  /**
    * Information about a document that Amazon Textract processed. DocumentMetadata is returned in every page of paginated responses from an Amazon Textract video operation.
    */
  var DocumentMetadata: js.UndefOr[typingsSlinky.awsSdk.textractMod.DocumentMetadata] = js.native
  /**
    * The current status of the text detection job.
    */
  var JobStatus: js.UndefOr[typingsSlinky.awsSdk.textractMod.JobStatus] = js.native
  /**
    * If the response is truncated, Amazon Textract returns this token. You can use this token in the subsequent request to retrieve the next set of text detection results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The current status of an asynchronous document-analysis operation.
    */
  var StatusMessage: js.UndefOr[typingsSlinky.awsSdk.textractMod.StatusMessage] = js.native
  /**
    * A list of warnings that occurred during the document-analysis operation.
    */
  var Warnings: js.UndefOr[typingsSlinky.awsSdk.textractMod.Warnings] = js.native
}

object GetDocumentAnalysisResponse {
  @scala.inline
  def apply(): GetDocumentAnalysisResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDocumentAnalysisResponse]
  }
  @scala.inline
  implicit class GetDocumentAnalysisResponseOps[Self <: GetDocumentAnalysisResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnalyzeDocumentModelVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnalyzeDocumentModelVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnalyzeDocumentModelVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnalyzeDocumentModelVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withBlocks(value: BlockList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Blocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlocks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Blocks")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentMetadata(value: DocumentMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withJobStatus(value: JobStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("JobStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: PaginationToken): Self = {
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
    def withStatusMessage(value: StatusMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withWarnings(value: Warnings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Warnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarnings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Warnings")(js.undefined)
        ret
    }
  }
  
}

