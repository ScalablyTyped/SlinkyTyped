package typingsSlinky.awsSdk.cloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeLunaClientResponse extends StObject {
  
  /**
    * The certificate installed on the HSMs used by this client.
    */
  var Certificate: js.UndefOr[typingsSlinky.awsSdk.cloudhsmMod.Certificate] = js.native
  
  /**
    * The certificate fingerprint.
    */
  var CertificateFingerprint: js.UndefOr[typingsSlinky.awsSdk.cloudhsmMod.CertificateFingerprint] = js.native
  
  /**
    * The ARN of the client.
    */
  var ClientArn: js.UndefOr[typingsSlinky.awsSdk.cloudhsmMod.ClientArn] = js.native
  
  /**
    * The label of the client.
    */
  var Label: js.UndefOr[typingsSlinky.awsSdk.cloudhsmMod.Label] = js.native
  
  /**
    * The date and time the client was last modified.
    */
  var LastModifiedTimestamp: js.UndefOr[Timestamp] = js.native
}
object DescribeLunaClientResponse {
  
  @scala.inline
  def apply(): DescribeLunaClientResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLunaClientResponse]
  }
  
  @scala.inline
  implicit class DescribeLunaClientResponseMutableBuilder[Self <: DescribeLunaClientResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificate(value: Certificate): Self = StObject.set(x, "Certificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateFingerprint(value: CertificateFingerprint): Self = StObject.set(x, "CertificateFingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateFingerprintUndefined: Self = StObject.set(x, "CertificateFingerprint", js.undefined)
    
    @scala.inline
    def setCertificateUndefined: Self = StObject.set(x, "Certificate", js.undefined)
    
    @scala.inline
    def setClientArn(value: ClientArn): Self = StObject.set(x, "ClientArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientArnUndefined: Self = StObject.set(x, "ClientArn", js.undefined)
    
    @scala.inline
    def setLabel(value: Label): Self = StObject.set(x, "Label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "Label", js.undefined)
    
    @scala.inline
    def setLastModifiedTimestamp(value: Timestamp): Self = StObject.set(x, "LastModifiedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimestampUndefined: Self = StObject.set(x, "LastModifiedTimestamp", js.undefined)
  }
}
