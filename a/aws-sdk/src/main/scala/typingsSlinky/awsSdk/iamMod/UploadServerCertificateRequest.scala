package typingsSlinky.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadServerCertificateRequest extends StObject {
  
  /**
    * The contents of the public key certificate in PEM-encoded format. The regex pattern used to validate this parameter is a string of characters consisting of the following:   Any printable ASCII character ranging from the space character (\\u0020) through the end of the ASCII character range   The printable characters in the Basic Latin and Latin-1 Supplement character set (through \\u00FF)   The special characters tab (\\u0009), line feed (\\u000A), and carriage return (\\u000D)  
    */
  var CertificateBody: certificateBodyType = js.native
  
  /**
    * The contents of the certificate chain. This is typically a concatenation of the PEM-encoded public key certificates of the chain. The regex pattern used to validate this parameter is a string of characters consisting of the following:   Any printable ASCII character ranging from the space character (\\u0020) through the end of the ASCII character range   The printable characters in the Basic Latin and Latin-1 Supplement character set (through \\u00FF)   The special characters tab (\\u0009), line feed (\\u000A), and carriage return (\\u000D)  
    */
  var CertificateChain: js.UndefOr[certificateChainType] = js.native
  
  /**
    * The path for the server certificate. For more information about paths, see IAM Identifiers in the IAM User Guide. This parameter is optional. If it is not included, it defaults to a slash (/). This parameter allows (through its regex pattern) a string of characters consisting of either a forward slash (/) by itself or a string that must begin and end with forward slashes. In addition, it can contain any ASCII character from the ! (\\u0021) through the DEL character (\\u007F), including most punctuation characters, digits, and upper and lowercased letters.   If you are uploading a server certificate specifically for use with Amazon CloudFront distributions, you must specify a path using the path parameter. The path must begin with /cloudfront and must include a trailing slash (for example, /cloudfront/test/). 
    */
  var Path: js.UndefOr[pathType] = js.native
  
  /**
    * The contents of the private key in PEM-encoded format. The regex pattern used to validate this parameter is a string of characters consisting of the following:   Any printable ASCII character ranging from the space character (\\u0020) through the end of the ASCII character range   The printable characters in the Basic Latin and Latin-1 Supplement character set (through \\u00FF)   The special characters tab (\\u0009), line feed (\\u000A), and carriage return (\\u000D)  
    */
  var PrivateKey: privateKeyType = js.native
  
  /**
    * The name for the server certificate. Do not include the path in this value. The name of the certificate cannot contain any spaces. This parameter allows (through its regex pattern) a string of characters consisting of upper and lowercase alphanumeric characters with no spaces. You can also include any of the following characters: _+=,.@-
    */
  var ServerCertificateName: serverCertificateNameType = js.native
}
object UploadServerCertificateRequest {
  
  @scala.inline
  def apply(
    CertificateBody: certificateBodyType,
    PrivateKey: privateKeyType,
    ServerCertificateName: serverCertificateNameType
  ): UploadServerCertificateRequest = {
    val __obj = js.Dynamic.literal(CertificateBody = CertificateBody.asInstanceOf[js.Any], PrivateKey = PrivateKey.asInstanceOf[js.Any], ServerCertificateName = ServerCertificateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadServerCertificateRequest]
  }
  
  @scala.inline
  implicit class UploadServerCertificateRequestMutableBuilder[Self <: UploadServerCertificateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateBody(value: certificateBodyType): Self = StObject.set(x, "CertificateBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateChain(value: certificateChainType): Self = StObject.set(x, "CertificateChain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateChainUndefined: Self = StObject.set(x, "CertificateChain", js.undefined)
    
    @scala.inline
    def setPath(value: pathType): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "Path", js.undefined)
    
    @scala.inline
    def setPrivateKey(value: privateKeyType): Self = StObject.set(x, "PrivateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerCertificateName(value: serverCertificateNameType): Self = StObject.set(x, "ServerCertificateName", value.asInstanceOf[js.Any])
  }
}
