package typingsSlinky.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SZL extends StObject {
  
  var JPY: js.Array[String] = js.native
  
  var SZL: js.Array[String] = js.native
  
  var USD: js.Array[String] = js.native
}
object SZL {
  
  @scala.inline
  def apply(JPY: js.Array[String], SZL: js.Array[String], USD: js.Array[String]): SZL = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], SZL = SZL.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[SZL]
  }
  
  @scala.inline
  implicit class SZLMutableBuilder[Self <: SZL] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setSZL(value: js.Array[String]): Self = StObject.set(x, "SZL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSZLVarargs(value: String*): Self = StObject.set(x, "SZL", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
