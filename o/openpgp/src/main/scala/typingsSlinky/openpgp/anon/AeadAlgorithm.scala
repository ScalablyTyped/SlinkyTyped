package typingsSlinky.openpgp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AeadAlgorithm extends StObject {
  
  var aeadAlgorithm: String = js.native
  
  var algorithm: String = js.native
  
  var data: js.typedarray.Uint8Array = js.native
}
object AeadAlgorithm {
  
  @scala.inline
  def apply(aeadAlgorithm: String, algorithm: String, data: js.typedarray.Uint8Array): AeadAlgorithm = {
    val __obj = js.Dynamic.literal(aeadAlgorithm = aeadAlgorithm.asInstanceOf[js.Any], algorithm = algorithm.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[AeadAlgorithm]
  }
  
  @scala.inline
  implicit class AeadAlgorithmMutableBuilder[Self <: AeadAlgorithm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAeadAlgorithm(value: String): Self = StObject.set(x, "aeadAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
