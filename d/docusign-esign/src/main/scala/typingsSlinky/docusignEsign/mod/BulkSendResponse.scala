package typingsSlinky.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkSendResponse extends StObject {
  
  /**
    * A batch identifier that you can use to get the status of the batch.
    */
  var batchId: js.UndefOr[String] = js.native
  
  /**
    * The GUID of the envelope or template that was sent.
    */
  var envelopeOrTemplateId: js.UndefOr[String] = js.native
  
  /**
    * A human-readable object that describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * A list of errors that occurred. This information is intended to be parsed by machine.
    */
  var errors: js.UndefOr[js.Array[String]] = js.native
}
object BulkSendResponse {
  
  @scala.inline
  def apply(): BulkSendResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkSendResponse]
  }
  
  @scala.inline
  implicit class BulkSendResponseMutableBuilder[Self <: BulkSendResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBatchId(value: String): Self = StObject.set(x, "batchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchIdUndefined: Self = StObject.set(x, "batchId", js.undefined)
    
    @scala.inline
    def setEnvelopeOrTemplateId(value: String): Self = StObject.set(x, "envelopeOrTemplateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvelopeOrTemplateIdUndefined: Self = StObject.set(x, "envelopeOrTemplateId", js.undefined)
    
    @scala.inline
    def setErrorDetails(value: js.Array[String]): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    @scala.inline
    def setErrorDetailsVarargs(value: String*): Self = StObject.set(x, "errorDetails", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value :_*))
  }
}
