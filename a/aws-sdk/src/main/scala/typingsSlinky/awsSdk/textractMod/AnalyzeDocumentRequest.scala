package typingsSlinky.awsSdk.textractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyzeDocumentRequest extends js.Object {
  
  /**
    * The input document as base64-encoded bytes or an Amazon S3 object. If you use the AWS CLI to call Amazon Textract operations, you can't pass image bytes. The document must be an image in JPEG or PNG format. If you're using an AWS SDK to call Amazon Textract, you might not need to base64-encode image bytes that are passed using the Bytes field. 
    */
  var Document: typingsSlinky.awsSdk.textractMod.Document = js.native
  
  /**
    * A list of the types of analysis to perform. Add TABLES to the list to return information about the tables that are detected in the input document. Add FORMS to return detected form data. To perform both types of analysis, add TABLES and FORMS to FeatureTypes. All lines and words detected in the document are included in the response (including text that isn't related to the value of FeatureTypes). 
    */
  var FeatureTypes: typingsSlinky.awsSdk.textractMod.FeatureTypes = js.native
  
  /**
    * Sets the configuration for the human in the loop workflow for analyzing documents.
    */
  var HumanLoopConfig: js.UndefOr[typingsSlinky.awsSdk.textractMod.HumanLoopConfig] = js.native
}
object AnalyzeDocumentRequest {
  
  @scala.inline
  def apply(Document: Document, FeatureTypes: FeatureTypes): AnalyzeDocumentRequest = {
    val __obj = js.Dynamic.literal(Document = Document.asInstanceOf[js.Any], FeatureTypes = FeatureTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyzeDocumentRequest]
  }
  
  @scala.inline
  implicit class AnalyzeDocumentRequestOps[Self <: AnalyzeDocumentRequest] (val x: Self) extends AnyVal {
    
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
    def setDocument(value: Document): Self = this.set("Document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureTypesVarargs(value: FeatureType*): Self = this.set("FeatureTypes", js.Array(value :_*))
    
    @scala.inline
    def setFeatureTypes(value: FeatureTypes): Self = this.set("FeatureTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHumanLoopConfig(value: HumanLoopConfig): Self = this.set("HumanLoopConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHumanLoopConfig: Self = this.set("HumanLoopConfig", js.undefined)
  }
}
