package typingsSlinky.grpc.mod

import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Certificate extends StObject {
  
  /**
    * The raw certificate in DER form.
    */
  var raw: Buffer = js.native
}
object Certificate {
  
  @scala.inline
  def apply(raw: Buffer): Certificate = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Certificate]
  }
  
  @scala.inline
  implicit class CertificateMutableBuilder[Self <: Certificate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRaw(value: Buffer): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
  }
}
