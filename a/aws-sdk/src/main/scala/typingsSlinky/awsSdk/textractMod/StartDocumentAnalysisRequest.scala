package typingsSlinky.awsSdk.textractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartDocumentAnalysisRequest extends js.Object {
  
  /**
    * The idempotent token that you use to identify the start request. If you use the same token with multiple StartDocumentAnalysis requests, the same JobId is returned. Use ClientRequestToken to prevent the same job from being accidentally started more than once. For more information, see Calling Amazon Textract Asynchronous Operations.
    */
  var ClientRequestToken: js.UndefOr[typingsSlinky.awsSdk.textractMod.ClientRequestToken] = js.native
  
  /**
    * The location of the document to be processed.
    */
  var DocumentLocation: typingsSlinky.awsSdk.textractMod.DocumentLocation = js.native
  
  /**
    * A list of the types of analysis to perform. Add TABLES to the list to return information about the tables that are detected in the input document. Add FORMS to return detected form data. To perform both types of analysis, add TABLES and FORMS to FeatureTypes. All lines and words detected in the document are included in the response (including text that isn't related to the value of FeatureTypes). 
    */
  var FeatureTypes: typingsSlinky.awsSdk.textractMod.FeatureTypes = js.native
  
  /**
    * An identifier that you specify that's included in the completion notification published to the Amazon SNS topic. For example, you can use JobTag to identify the type of document that the completion notification corresponds to (such as a tax form or a receipt).
    */
  var JobTag: js.UndefOr[typingsSlinky.awsSdk.textractMod.JobTag] = js.native
  
  /**
    * The KMS key used to encrypt the inference results. This can be in either Key ID or Key Alias format. When a KMS key is provided, the KMS key will be used for server-side encryption of the objects in the customer bucket. When this parameter is not enabled, the result will be encrypted server side,using SSE-S3.
    */
  var KMSKeyId: js.UndefOr[typingsSlinky.awsSdk.textractMod.KMSKeyId] = js.native
  
  /**
    * The Amazon SNS topic ARN that you want Amazon Textract to publish the completion status of the operation to. 
    */
  var NotificationChannel: js.UndefOr[typingsSlinky.awsSdk.textractMod.NotificationChannel] = js.native
  
  /**
    * Sets if the output will go to a customer defined bucket. By default, Amazon Textract will save the results internally to be accessed by the GetDocumentAnalysis operation.
    */
  var OutputConfig: js.UndefOr[typingsSlinky.awsSdk.textractMod.OutputConfig] = js.native
}
object StartDocumentAnalysisRequest {
  
  @scala.inline
  def apply(DocumentLocation: DocumentLocation, FeatureTypes: FeatureTypes): StartDocumentAnalysisRequest = {
    val __obj = js.Dynamic.literal(DocumentLocation = DocumentLocation.asInstanceOf[js.Any], FeatureTypes = FeatureTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartDocumentAnalysisRequest]
  }
  
  @scala.inline
  implicit class StartDocumentAnalysisRequestOps[Self <: StartDocumentAnalysisRequest] (val x: Self) extends AnyVal {
    
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
    def setDocumentLocation(value: DocumentLocation): Self = this.set("DocumentLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatureTypesVarargs(value: FeatureType*): Self = this.set("FeatureTypes", js.Array(value :_*))
    
    @scala.inline
    def setFeatureTypes(value: FeatureTypes): Self = this.set("FeatureTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = this.set("ClientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientRequestToken: Self = this.set("ClientRequestToken", js.undefined)
    
    @scala.inline
    def setJobTag(value: JobTag): Self = this.set("JobTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobTag: Self = this.set("JobTag", js.undefined)
    
    @scala.inline
    def setKMSKeyId(value: KMSKeyId): Self = this.set("KMSKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKMSKeyId: Self = this.set("KMSKeyId", js.undefined)
    
    @scala.inline
    def setNotificationChannel(value: NotificationChannel): Self = this.set("NotificationChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationChannel: Self = this.set("NotificationChannel", js.undefined)
    
    @scala.inline
    def setOutputConfig(value: OutputConfig): Self = this.set("OutputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputConfig: Self = this.set("OutputConfig", js.undefined)
  }
}
