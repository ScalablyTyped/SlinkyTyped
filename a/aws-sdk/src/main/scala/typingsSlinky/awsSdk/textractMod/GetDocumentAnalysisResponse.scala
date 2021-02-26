package typingsSlinky.awsSdk.textractMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDocumentAnalysisResponse extends StObject {
  
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
    * Returns if the detection job could not be completed. Contains explanation for what error occured.
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
  implicit class GetDocumentAnalysisResponseMutableBuilder[Self <: GetDocumentAnalysisResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnalyzeDocumentModelVersion(value: String): Self = StObject.set(x, "AnalyzeDocumentModelVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnalyzeDocumentModelVersionUndefined: Self = StObject.set(x, "AnalyzeDocumentModelVersion", js.undefined)
    
    @scala.inline
    def setBlocks(value: BlockList): Self = StObject.set(x, "Blocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlocksUndefined: Self = StObject.set(x, "Blocks", js.undefined)
    
    @scala.inline
    def setBlocksVarargs(value: Block*): Self = StObject.set(x, "Blocks", js.Array(value :_*))
    
    @scala.inline
    def setDocumentMetadata(value: DocumentMetadata): Self = StObject.set(x, "DocumentMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentMetadataUndefined: Self = StObject.set(x, "DocumentMetadata", js.undefined)
    
    @scala.inline
    def setJobStatus(value: JobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobStatusUndefined: Self = StObject.set(x, "JobStatus", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: StatusMessage): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    @scala.inline
    def setWarnings(value: Warnings): Self = StObject.set(x, "Warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningsUndefined: Self = StObject.set(x, "Warnings", js.undefined)
    
    @scala.inline
    def setWarningsVarargs(value: Warning*): Self = StObject.set(x, "Warnings", js.Array(value :_*))
  }
}
