package typingsSlinky.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvelopeSummary extends StObject {
  
  /**
    * An object that describes the status of the bulk send envelopes.
    */
  var bulkEnvelopeStatus: js.UndefOr[BulkEnvelopeStatus] = js.native
  
  /**
    * The envelope ID of the envelope status that failed to post.
    */
  var envelopeId: js.UndefOr[String] = js.native
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.native
  
  /**
    * Indicates the envelope status. Valid values are:
    *
    * * `completed`: The envelope has been completed and all tags have been signed.
    * * `created`: The envelope is created as a draft. It can be modified and sent later.
    * * `declined`: The envelope has been declined by the recipients.
    * * `delivered`: The envelope has been delivered to the recipients.
    * * `sent`: The envelope is sent to the recipients.
    * * `signed`: The envelope has been signed by the recipients.
    * * `voided`: The envelope is no longer valid and recipients cannot access or sign the envelope.
    *
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * The DateTime that the envelope changed status (i.e. was created or sent.)
    */
  var statusDateTime: js.UndefOr[String] = js.native
  
  /**
    * A URI containing the user ID.
    */
  var uri: js.UndefOr[String] = js.native
}
object EnvelopeSummary {
  
  @scala.inline
  def apply(): EnvelopeSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopeSummary]
  }
  
  @scala.inline
  implicit class EnvelopeSummaryMutableBuilder[Self <: EnvelopeSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBulkEnvelopeStatus(value: BulkEnvelopeStatus): Self = StObject.set(x, "bulkEnvelopeStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBulkEnvelopeStatusUndefined: Self = StObject.set(x, "bulkEnvelopeStatus", js.undefined)
    
    @scala.inline
    def setEnvelopeId(value: String): Self = StObject.set(x, "envelopeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvelopeIdUndefined: Self = StObject.set(x, "envelopeId", js.undefined)
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusDateTime(value: String): Self = StObject.set(x, "statusDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusDateTimeUndefined: Self = StObject.set(x, "statusDateTime", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
