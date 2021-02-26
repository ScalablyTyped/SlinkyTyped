package typingsSlinky.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait USDUZS extends StObject {
  
  var JPY: js.Array[String] = js.native
  
  var USD: js.Array[String] = js.native
  
  var UZS: js.Array[String] = js.native
}
object USDUZS {
  
  @scala.inline
  def apply(JPY: js.Array[String], USD: js.Array[String], UZS: js.Array[String]): USDUZS = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], UZS = UZS.asInstanceOf[js.Any])
    __obj.asInstanceOf[USDUZS]
  }
  
  @scala.inline
  implicit class USDUZSMutableBuilder[Self <: USDUZS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
    
    @scala.inline
    def setUZS(value: js.Array[String]): Self = StObject.set(x, "UZS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUZSVarargs(value: String*): Self = StObject.set(x, "UZS", js.Array(value :_*))
  }
}
