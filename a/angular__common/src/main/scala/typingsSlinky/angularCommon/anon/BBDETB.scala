package typingsSlinky.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BBDETB extends StObject {
  
  var BBD: js.Array[String] = js.native
  
  var ETB: js.Array[String] = js.native
  
  var JPY: js.Array[String] = js.native
  
  var SOS: js.Array[String] = js.native
  
  var USD: js.Array[String] = js.native
}
object BBDETB {
  
  @scala.inline
  def apply(
    BBD: js.Array[String],
    ETB: js.Array[String],
    JPY: js.Array[String],
    SOS: js.Array[String],
    USD: js.Array[String]
  ): BBDETB = {
    val __obj = js.Dynamic.literal(BBD = BBD.asInstanceOf[js.Any], ETB = ETB.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], SOS = SOS.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[BBDETB]
  }
  
  @scala.inline
  implicit class BBDETBMutableBuilder[Self <: BBDETB] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBBD(value: js.Array[String]): Self = StObject.set(x, "BBD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBBDVarargs(value: String*): Self = StObject.set(x, "BBD", js.Array(value :_*))
    
    @scala.inline
    def setETB(value: js.Array[String]): Self = StObject.set(x, "ETB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setETBVarargs(value: String*): Self = StObject.set(x, "ETB", js.Array(value :_*))
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setSOS(value: js.Array[String]): Self = StObject.set(x, "SOS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSOSVarargs(value: String*): Self = StObject.set(x, "SOS", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
