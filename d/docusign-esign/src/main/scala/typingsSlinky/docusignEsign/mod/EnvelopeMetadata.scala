package typingsSlinky.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvelopeMetadata extends StObject {
  
  /**
    * Specifies if the Advanced Correct feature is enabled for the envelope. This feature enables you to correct the details of in process envelopes that
    * you sent or are shared with you. It offers more functionality than the Correct feature.
    */
  var allowAdvancedCorrect: js.UndefOr[String] = js.native
  
  /**
    * Specifies if the Correct feature is enabled for the envelope. This feature enables you to correct the details of in process envelopes that you sent or
    * are shared with you, including the recipient, envelope, and document information.
    */
  var allowCorrect: js.UndefOr[String] = js.native
  
  /**
    * Specifies if DocuSign eNotary service is enabled for the envelope.
    */
  var enableSignWithNotary: js.UndefOr[String] = js.native
}
object EnvelopeMetadata {
  
  @scala.inline
  def apply(): EnvelopeMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopeMetadata]
  }
  
  @scala.inline
  implicit class EnvelopeMetadataMutableBuilder[Self <: EnvelopeMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowAdvancedCorrect(value: String): Self = StObject.set(x, "allowAdvancedCorrect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowAdvancedCorrectUndefined: Self = StObject.set(x, "allowAdvancedCorrect", js.undefined)
    
    @scala.inline
    def setAllowCorrect(value: String): Self = StObject.set(x, "allowCorrect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowCorrectUndefined: Self = StObject.set(x, "allowCorrect", js.undefined)
    
    @scala.inline
    def setEnableSignWithNotary(value: String): Self = StObject.set(x, "enableSignWithNotary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableSignWithNotaryUndefined: Self = StObject.set(x, "enableSignWithNotary", js.undefined)
  }
}
