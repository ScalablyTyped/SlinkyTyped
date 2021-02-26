package typingsSlinky.nodeForge.mod.tls

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.nodeForge.mod.md.MessageDigest
import typingsSlinky.nodeForge.mod.pki.Certificate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Session extends StObject {
  
  var cipherSuite: CipherSuite | Null = js.native
  
  var clientCertificate: Certificate | Null = js.native
  
  var compressionMethod: CompressionMethod | Null = js.native
  
  var extensions: StringDictionary[js.Object] = js.native
  
  var md5: MessageDigest = js.native
  
  var serverCertificate: Certificate | Null = js.native
  
  var sha1: MessageDigest = js.native
  
  var version: ProtocolVersion | Null = js.native
}
object Session {
  
  @scala.inline
  def apply(extensions: StringDictionary[js.Object], md5: MessageDigest, sha1: MessageDigest): Session = {
    val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], md5 = md5.asInstanceOf[js.Any], sha1 = sha1.asInstanceOf[js.Any])
    __obj.asInstanceOf[Session]
  }
  
  @scala.inline
  implicit class SessionMutableBuilder[Self <: Session] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCipherSuite(value: CipherSuite): Self = StObject.set(x, "cipherSuite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCipherSuiteNull: Self = StObject.set(x, "cipherSuite", null)
    
    @scala.inline
    def setClientCertificate(value: Certificate): Self = StObject.set(x, "clientCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientCertificateNull: Self = StObject.set(x, "clientCertificate", null)
    
    @scala.inline
    def setCompressionMethod(value: CompressionMethod): Self = StObject.set(x, "compressionMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressionMethodNull: Self = StObject.set(x, "compressionMethod", null)
    
    @scala.inline
    def setExtensions(value: StringDictionary[js.Object]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMd5(value: MessageDigest): Self = StObject.set(x, "md5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerCertificate(value: Certificate): Self = StObject.set(x, "serverCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerCertificateNull: Self = StObject.set(x, "serverCertificate", null)
    
    @scala.inline
    def setSha1(value: MessageDigest): Self = StObject.set(x, "sha1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: ProtocolVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNull: Self = StObject.set(x, "version", null)
  }
}
