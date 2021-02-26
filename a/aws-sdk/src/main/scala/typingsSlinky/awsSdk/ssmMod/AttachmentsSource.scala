package typingsSlinky.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachmentsSource extends StObject {
  
  /**
    * The key of a key-value pair that identifies the location of an attachment to a document.
    */
  var Key: js.UndefOr[AttachmentsSourceKey] = js.native
  
  /**
    * The name of the document attachment file.
    */
  var Name: js.UndefOr[AttachmentIdentifier] = js.native
  
  /**
    * The value of a key-value pair that identifies the location of an attachment to a document. The format for Value depends on the type of key you specify.   For the key SourceUrl, the value is an S3 bucket location. For example:  "Values": [ "s3://doc-example-bucket/my-folder" ]    For the key S3FileUrl, the value is a file in an S3 bucket. For example:  "Values": [ "s3://doc-example-bucket/my-folder/my-file.py" ]    For the key AttachmentReference, the value is constructed from the name of another SSM document in your account, a version number of that document, and a file attached to that document version that you want to reuse. For example:  "Values": [ "MyOtherDocument/3/my-other-file.py" ]  However, if the SSM document is shared with you from another account, the full SSM document ARN must be specified instead of the document name only. For example:  "Values": [ "arn:aws:ssm:us-east-2:111122223333:document/OtherAccountDocument/3/their-file.py" ]   
    */
  var Values: js.UndefOr[AttachmentsSourceValues] = js.native
}
object AttachmentsSource {
  
  @scala.inline
  def apply(): AttachmentsSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachmentsSource]
  }
  
  @scala.inline
  implicit class AttachmentsSourceMutableBuilder[Self <: AttachmentsSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: AttachmentsSourceKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    @scala.inline
    def setName(value: AttachmentIdentifier): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setValues(value: AttachmentsSourceValues): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: AttachmentsSourceValue*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
