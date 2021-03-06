package typingsSlinky.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RONUSD extends StObject {
  
  var JPY: js.Array[String] = js.native
  
  var RON: js.Array[String] = js.native
  
  var USD: js.Array[String] = js.native
}
object RONUSD {
  
  @scala.inline
  def apply(JPY: js.Array[String], RON: js.Array[String], USD: js.Array[String]): RONUSD = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], RON = RON.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[RONUSD]
  }
  
  @scala.inline
  implicit class RONUSDMutableBuilder[Self <: RONUSD] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setRON(value: js.Array[String]): Self = StObject.set(x, "RON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRONVarargs(value: String*): Self = StObject.set(x, "RON", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
