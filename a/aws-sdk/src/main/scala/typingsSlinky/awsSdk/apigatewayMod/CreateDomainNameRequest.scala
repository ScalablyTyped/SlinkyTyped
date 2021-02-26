package typingsSlinky.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDomainNameRequest extends StObject {
  
  /**
    * The reference to an AWS-managed certificate that will be used by edge-optimized endpoint for this domain name. AWS Certificate Manager is the only supported source.
    */
  var certificateArn: js.UndefOr[String] = js.native
  
  /**
    * [Deprecated] The body of the server certificate that will be used by edge-optimized endpoint for this domain name provided by your certificate authority.
    */
  var certificateBody: js.UndefOr[String] = js.native
  
  /**
    * [Deprecated] The intermediate certificates and optionally the root certificate, one after the other without any blank lines, used by an edge-optimized endpoint for this domain name. If you include the root certificate, your certificate chain must start with intermediate certificates and end with the root certificate. Use the intermediate certificates that were provided by your certificate authority. Do not include any intermediaries that are not in the chain of trust path.
    */
  var certificateChain: js.UndefOr[String] = js.native
  
  /**
    * The user-friendly name of the certificate that will be used by edge-optimized endpoint for this domain name.
    */
  var certificateName: js.UndefOr[String] = js.native
  
  /**
    * [Deprecated] Your edge-optimized endpoint's domain name certificate's private key.
    */
  var certificatePrivateKey: js.UndefOr[String] = js.native
  
  /**
    * [Required] The name of the DomainName resource.
    */
  var domainName: String = js.native
  
  /**
    * The endpoint configuration of this DomainName showing the endpoint types of the domain name.
    */
  var endpointConfiguration: js.UndefOr[EndpointConfiguration] = js.native
  
  var mutualTlsAuthentication: js.UndefOr[MutualTlsAuthenticationInput] = js.native
  
  /**
    * The reference to an AWS-managed certificate that will be used by regional endpoint for this domain name. AWS Certificate Manager is the only supported source.
    */
  var regionalCertificateArn: js.UndefOr[String] = js.native
  
  /**
    * The user-friendly name of the certificate that will be used by regional endpoint for this domain name.
    */
  var regionalCertificateName: js.UndefOr[String] = js.native
  
  /**
    * The Transport Layer Security (TLS) version + cipher suite for this DomainName. The valid values are TLS_1_0 and TLS_1_2.
    */
  var securityPolicy: js.UndefOr[SecurityPolicy] = js.native
  
  /**
    * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must not start with aws:. The tag value can be up to 256 characters.
    */
  var tags: js.UndefOr[MapOfStringToString] = js.native
}
object CreateDomainNameRequest {
  
  @scala.inline
  def apply(domainName: String): CreateDomainNameRequest = {
    val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDomainNameRequest]
  }
  
  @scala.inline
  implicit class CreateDomainNameRequestMutableBuilder[Self <: CreateDomainNameRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateArn(value: String): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateArnUndefined: Self = StObject.set(x, "certificateArn", js.undefined)
    
    @scala.inline
    def setCertificateBody(value: String): Self = StObject.set(x, "certificateBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateBodyUndefined: Self = StObject.set(x, "certificateBody", js.undefined)
    
    @scala.inline
    def setCertificateChain(value: String): Self = StObject.set(x, "certificateChain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateChainUndefined: Self = StObject.set(x, "certificateChain", js.undefined)
    
    @scala.inline
    def setCertificateName(value: String): Self = StObject.set(x, "certificateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateNameUndefined: Self = StObject.set(x, "certificateName", js.undefined)
    
    @scala.inline
    def setCertificatePrivateKey(value: String): Self = StObject.set(x, "certificatePrivateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificatePrivateKeyUndefined: Self = StObject.set(x, "certificatePrivateKey", js.undefined)
    
    @scala.inline
    def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointConfiguration(value: EndpointConfiguration): Self = StObject.set(x, "endpointConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointConfigurationUndefined: Self = StObject.set(x, "endpointConfiguration", js.undefined)
    
    @scala.inline
    def setMutualTlsAuthentication(value: MutualTlsAuthenticationInput): Self = StObject.set(x, "mutualTlsAuthentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMutualTlsAuthenticationUndefined: Self = StObject.set(x, "mutualTlsAuthentication", js.undefined)
    
    @scala.inline
    def setRegionalCertificateArn(value: String): Self = StObject.set(x, "regionalCertificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionalCertificateArnUndefined: Self = StObject.set(x, "regionalCertificateArn", js.undefined)
    
    @scala.inline
    def setRegionalCertificateName(value: String): Self = StObject.set(x, "regionalCertificateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionalCertificateNameUndefined: Self = StObject.set(x, "regionalCertificateName", js.undefined)
    
    @scala.inline
    def setSecurityPolicy(value: SecurityPolicy): Self = StObject.set(x, "securityPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityPolicyUndefined: Self = StObject.set(x, "securityPolicy", js.undefined)
    
    @scala.inline
    def setTags(value: MapOfStringToString): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
