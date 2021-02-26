package typingsSlinky.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateRandomResponse extends StObject {
  
  /**
    * The random byte string. When you use the HTTP API or the AWS CLI, the value is Base64-encoded. Otherwise, it is not Base64-encoded.
    */
  var Plaintext: js.UndefOr[PlaintextType] = js.native
}
object GenerateRandomResponse {
  
  @scala.inline
  def apply(): GenerateRandomResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateRandomResponse]
  }
  
  @scala.inline
  implicit class GenerateRandomResponseMutableBuilder[Self <: GenerateRandomResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPlaintext(value: PlaintextType): Self = StObject.set(x, "Plaintext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaintextUint8Array(value: js.typedarray.Uint8Array): Self = StObject.set(x, "Plaintext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaintextUndefined: Self = StObject.set(x, "Plaintext", js.undefined)
  }
}
