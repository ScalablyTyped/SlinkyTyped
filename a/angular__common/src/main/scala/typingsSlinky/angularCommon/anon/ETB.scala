package typingsSlinky.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ETB extends StObject {
  
  var ETB: js.Array[String] = js.native
  
  var JPY: js.Array[String] = js.native
  
  var KES: js.Array[String] = js.native
  
  var USD: js.Array[String] = js.native
}
object ETB {
  
  @scala.inline
  def apply(ETB: js.Array[String], JPY: js.Array[String], KES: js.Array[String], USD: js.Array[String]): ETB = {
    val __obj = js.Dynamic.literal(ETB = ETB.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], KES = KES.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[ETB]
  }
  
  @scala.inline
  implicit class ETBMutableBuilder[Self <: ETB] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setETB(value: js.Array[String]): Self = StObject.set(x, "ETB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setETBVarargs(value: String*): Self = StObject.set(x, "ETB", js.Array(value :_*))
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setKES(value: js.Array[String]): Self = StObject.set(x, "KES", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKESVarargs(value: String*): Self = StObject.set(x, "KES", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
