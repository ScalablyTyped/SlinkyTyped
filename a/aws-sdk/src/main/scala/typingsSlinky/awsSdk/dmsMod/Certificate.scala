package typingsSlinky.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Certificate extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) for the certificate.
    */
  var CertificateArn: js.UndefOr[String] = js.native
  
  /**
    * The date that the certificate was created.
    */
  var CertificateCreationDate: js.UndefOr[js.Date] = js.native
  
  /**
    * A customer-assigned name for the certificate. Identifiers must begin with a letter and must contain only ASCII letters, digits, and hyphens. They can't end with a hyphen or contain two consecutive hyphens.
    */
  var CertificateIdentifier: js.UndefOr[String] = js.native
  
  /**
    * The owner of the certificate.
    */
  var CertificateOwner: js.UndefOr[String] = js.native
  
  /**
    * The contents of a .pem file, which contains an X.509 certificate.
    */
  var CertificatePem: js.UndefOr[String] = js.native
  
  /**
    * The location of an imported Oracle Wallet certificate for use with SSL.
    */
  var CertificateWallet: js.UndefOr[typingsSlinky.awsSdk.dmsMod.CertificateWallet] = js.native
  
  /**
    * The key length of the cryptographic algorithm being used.
    */
  var KeyLength: js.UndefOr[IntegerOptional] = js.native
  
  /**
    * The signing algorithm for the certificate.
    */
  var SigningAlgorithm: js.UndefOr[String] = js.native
  
  /**
    * The beginning date that the certificate is valid.
    */
  var ValidFromDate: js.UndefOr[js.Date] = js.native
  
  /**
    * The final date that the certificate is valid.
    */
  var ValidToDate: js.UndefOr[js.Date] = js.native
}
object Certificate {
  
  @scala.inline
  def apply(): Certificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Certificate]
  }
  
  @scala.inline
  implicit class CertificateMutableBuilder[Self <: Certificate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateArn(value: String): Self = StObject.set(x, "CertificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateArnUndefined: Self = StObject.set(x, "CertificateArn", js.undefined)
    
    @scala.inline
    def setCertificateCreationDate(value: js.Date): Self = StObject.set(x, "CertificateCreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateCreationDateUndefined: Self = StObject.set(x, "CertificateCreationDate", js.undefined)
    
    @scala.inline
    def setCertificateIdentifier(value: String): Self = StObject.set(x, "CertificateIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateIdentifierUndefined: Self = StObject.set(x, "CertificateIdentifier", js.undefined)
    
    @scala.inline
    def setCertificateOwner(value: String): Self = StObject.set(x, "CertificateOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateOwnerUndefined: Self = StObject.set(x, "CertificateOwner", js.undefined)
    
    @scala.inline
    def setCertificatePem(value: String): Self = StObject.set(x, "CertificatePem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificatePemUndefined: Self = StObject.set(x, "CertificatePem", js.undefined)
    
    @scala.inline
    def setCertificateWallet(value: CertificateWallet): Self = StObject.set(x, "CertificateWallet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateWalletUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "CertificateWallet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateWalletUndefined: Self = StObject.set(x, "CertificateWallet", js.undefined)
    
    @scala.inline
    def setKeyLength(value: IntegerOptional): Self = StObject.set(x, "KeyLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyLengthUndefined: Self = StObject.set(x, "KeyLength", js.undefined)
    
    @scala.inline
    def setSigningAlgorithm(value: String): Self = StObject.set(x, "SigningAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningAlgorithmUndefined: Self = StObject.set(x, "SigningAlgorithm", js.undefined)
    
    @scala.inline
    def setValidFromDate(value: js.Date): Self = StObject.set(x, "ValidFromDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidFromDateUndefined: Self = StObject.set(x, "ValidFromDate", js.undefined)
    
    @scala.inline
    def setValidToDate(value: js.Date): Self = StObject.set(x, "ValidToDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidToDateUndefined: Self = StObject.set(x, "ValidToDate", js.undefined)
  }
}
