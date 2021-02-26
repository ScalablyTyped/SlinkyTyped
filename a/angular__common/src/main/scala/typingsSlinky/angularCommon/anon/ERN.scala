package typingsSlinky.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ERN extends StObject {
  
  var ERN: js.Array[String] = js.native
  
  var JPY: js.Array[String] = js.native
  
  var USD: js.Array[String] = js.native
}
object ERN {
  
  @scala.inline
  def apply(ERN: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): ERN = {
    val __obj = js.Dynamic.literal(ERN = ERN.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[ERN]
  }
  
  @scala.inline
  implicit class ERNMutableBuilder[Self <: ERN] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setERN(value: js.Array[String]): Self = StObject.set(x, "ERN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setERNVarargs(value: String*): Self = StObject.set(x, "ERN", js.Array(value :_*))
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
