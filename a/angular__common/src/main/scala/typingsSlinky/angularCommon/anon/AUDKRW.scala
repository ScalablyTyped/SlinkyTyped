package typingsSlinky.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AUDKRW extends StObject {
  
  var AUD: js.Array[String] = js.native
  
  var KRW: js.Array[String] = js.native
  
  var USD: js.Array[String] = js.native
  
  var XXX: js.Array[scala.Nothing] = js.native
}
object AUDKRW {
  
  @scala.inline
  def apply(AUD: js.Array[String], KRW: js.Array[String], USD: js.Array[String], XXX: js.Array[scala.Nothing]): AUDKRW = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], KRW = KRW.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], XXX = XXX.asInstanceOf[js.Any])
    __obj.asInstanceOf[AUDKRW]
  }
  
  @scala.inline
  implicit class AUDKRWMutableBuilder[Self <: AUDKRW] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAUD(value: js.Array[String]): Self = StObject.set(x, "AUD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAUDVarargs(value: String*): Self = StObject.set(x, "AUD", js.Array(value :_*))
    
    @scala.inline
    def setKRW(value: js.Array[String]): Self = StObject.set(x, "KRW", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKRWVarargs(value: String*): Self = StObject.set(x, "KRW", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
    
    @scala.inline
    def setXXX(value: js.Array[scala.Nothing]): Self = StObject.set(x, "XXX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXXXVarargs(value: scala.Nothing*): Self = StObject.set(x, "XXX", js.Array(value :_*))
  }
}
