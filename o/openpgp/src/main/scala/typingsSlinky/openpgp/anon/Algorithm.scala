package typingsSlinky.openpgp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Algorithm extends StObject {
  
  var algorithm: String = js.native
  
  var data: js.typedarray.Uint8Array = js.native
}
object Algorithm {
  
  @scala.inline
  def apply(algorithm: String, data: js.typedarray.Uint8Array): Algorithm = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Algorithm]
  }
  
  @scala.inline
  implicit class AlgorithmMutableBuilder[Self <: Algorithm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
