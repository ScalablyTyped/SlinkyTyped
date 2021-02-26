package typingsSlinky.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZMW extends StObject {
  
  var JPY: js.Array[String] = js.native
  
  var USD: js.Array[String] = js.native
  
  var ZMW: js.Array[String] = js.native
}
object ZMW {
  
  @scala.inline
  def apply(JPY: js.Array[String], USD: js.Array[String], ZMW: js.Array[String]): ZMW = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], ZMW = ZMW.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZMW]
  }
  
  @scala.inline
  implicit class ZMWMutableBuilder[Self <: ZMW] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
    
    @scala.inline
    def setZMW(value: js.Array[String]): Self = StObject.set(x, "ZMW", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZMWVarargs(value: String*): Self = StObject.set(x, "ZMW", js.Array(value :_*))
  }
}
