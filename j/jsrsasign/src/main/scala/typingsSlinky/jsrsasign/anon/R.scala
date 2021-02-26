package typingsSlinky.jsrsasign.anon

import typingsSlinky.jsrsasign.jsrsasign.BigInteger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait R extends StObject {
  
  var r: BigInteger = js.native
  
  var s: BigInteger = js.native
}
object R {
  
  @scala.inline
  def apply(r: BigInteger, s: BigInteger): R = {
    val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[R]
  }
  
  @scala.inline
  implicit class RMutableBuilder[Self <: R] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setR(value: BigInteger): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS(value: BigInteger): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
  }
}
