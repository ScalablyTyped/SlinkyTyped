package typingsSlinky.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Alg extends StObject {
  
  var alg: String = js.native
  
  var hash: String = js.native
}
object Alg {
  
  @scala.inline
  def apply(alg: String, hash: String): Alg = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alg]
  }
  
  @scala.inline
  implicit class AlgMutableBuilder[Self <: Alg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlg(value: String): Self = StObject.set(x, "alg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
  }
}
