package typingsSlinky.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Certificate extends StObject {
  
  /** Output only. A structured description of the issued X.509 certificate. */
  var certificateDescription: js.UndefOr[CertificateDescription] = js.native
  
  /** Immutable. A description of the certificate and key that does not require X.509 or ASN.1. */
  var config: js.UndefOr[CertificateConfig] = js.native
  
  /** Output only. The time at which this Certificate was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Optional. Labels with user-defined metadata. */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typingsSlinky.maximMazurokGapiClientPrivateca.maximMazurokGapiClientPrivatecaStrings.Certificate with TopLevel[js.Any]
  ] = js.native
  
  /**
    * Required. Immutable. The desired lifetime of a certificate. Used to create the "not_before_time" and "not_after_time" fields inside an X.509 certificate. Note that the lifetime may
    * be truncated if it would extend past the life of any certificate authority in the issuing chain.
    */
  var lifetime: js.UndefOr[String] = js.native
  
  /** Output only. The resource path for this Certificate in the format `projects/∗/locations/∗/certificateAuthorities/∗/certificates/ *`. */
  var name: js.UndefOr[String] = js.native
  
  /** Output only. The pem-encoded, signed X.509 certificate. */
  var pemCertificate: js.UndefOr[String] = js.native
  
  /** Output only. The chain that may be used to verify the X.509 certificate. Expected to be in issuer-to-root order according to RFC 5246. */
  var pemCertificateChain: js.UndefOr[js.Array[String]] = js.native
  
  /** Immutable. A pem-encoded X.509 certificate signing request (CSR). */
  var pemCsr: js.UndefOr[String] = js.native
  
  /** Output only. Details regarding the revocation of this Certificate. This Certificate is considered revoked if and only if this field is present. */
  var revocationDetails: js.UndefOr[RevocationDetails] = js.native
  
  /** Output only. The time at which this Certificate was updated. */
  var updateTime: js.UndefOr[String] = js.native
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
    def setCertificateDescription(value: CertificateDescription): Self = StObject.set(x, "certificateDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateDescriptionUndefined: Self = StObject.set(x, "certificateDescription", js.undefined)
    
    @scala.inline
    def setConfig(value: CertificateConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typingsSlinky.maximMazurokGapiClientPrivateca.maximMazurokGapiClientPrivatecaStrings.Certificate with TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setLifetime(value: String): Self = StObject.set(x, "lifetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLifetimeUndefined: Self = StObject.set(x, "lifetime", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPemCertificate(value: String): Self = StObject.set(x, "pemCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPemCertificateChain(value: js.Array[String]): Self = StObject.set(x, "pemCertificateChain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPemCertificateChainUndefined: Self = StObject.set(x, "pemCertificateChain", js.undefined)
    
    @scala.inline
    def setPemCertificateChainVarargs(value: String*): Self = StObject.set(x, "pemCertificateChain", js.Array(value :_*))
    
    @scala.inline
    def setPemCertificateUndefined: Self = StObject.set(x, "pemCertificate", js.undefined)
    
    @scala.inline
    def setPemCsr(value: String): Self = StObject.set(x, "pemCsr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPemCsrUndefined: Self = StObject.set(x, "pemCsr", js.undefined)
    
    @scala.inline
    def setRevocationDetails(value: RevocationDetails): Self = StObject.set(x, "revocationDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevocationDetailsUndefined: Self = StObject.set(x, "revocationDetails", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
