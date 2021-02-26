package typingsSlinky.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualNodeSpecListenerTlsCertificateFile extends StObject {
  
  /**
    * The certificate chain for the certificate. Must be between 1 and 255 characters in length.
    */
  var certificateChain: String = js.native
  
  /**
    * The private key for a certificate stored on the file system of the virtual node that the proxy is running on. Must be between 1 and 255 characters in length.
    */
  var privateKey: String = js.native
}
object VirtualNodeSpecListenerTlsCertificateFile {
  
  @scala.inline
  def apply(certificateChain: String, privateKey: String): VirtualNodeSpecListenerTlsCertificateFile = {
    val __obj = js.Dynamic.literal(certificateChain = certificateChain.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecListenerTlsCertificateFile]
  }
  
  @scala.inline
  implicit class VirtualNodeSpecListenerTlsCertificateFileMutableBuilder[Self <: VirtualNodeSpecListenerTlsCertificateFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateChain(value: String): Self = StObject.set(x, "certificateChain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
  }
}
