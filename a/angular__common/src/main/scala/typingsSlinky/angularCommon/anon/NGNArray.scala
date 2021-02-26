package typingsSlinky.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NGNArray extends StObject {
  
  var NGN: js.Array[String] = js.native
}
object NGNArray {
  
  @scala.inline
  def apply(NGN: js.Array[String]): NGNArray = {
    val __obj = js.Dynamic.literal(NGN = NGN.asInstanceOf[js.Any])
    __obj.asInstanceOf[NGNArray]
  }
  
  @scala.inline
  implicit class NGNArrayMutableBuilder[Self <: NGNArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNGN(value: js.Array[String]): Self = StObject.set(x, "NGN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNGNVarargs(value: String*): Self = StObject.set(x, "NGN", js.Array(value :_*))
  }
}
