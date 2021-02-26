package typingsSlinky.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WST extends StObject {
  
  var JPY: js.Array[String] = js.native
  
  var USD: js.Array[String] = js.native
  
  var WST: js.Array[String] = js.native
}
object WST {
  
  @scala.inline
  def apply(JPY: js.Array[String], USD: js.Array[String], WST: js.Array[String]): WST = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], WST = WST.asInstanceOf[js.Any])
    __obj.asInstanceOf[WST]
  }
  
  @scala.inline
  implicit class WSTMutableBuilder[Self <: WST] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
    
    @scala.inline
    def setWST(value: js.Array[String]): Self = StObject.set(x, "WST", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWSTVarargs(value: String*): Self = StObject.set(x, "WST", js.Array(value :_*))
  }
}
