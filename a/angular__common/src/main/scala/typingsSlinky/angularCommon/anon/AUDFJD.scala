package typingsSlinky.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AUDFJD extends StObject {
  
  var AUD: js.Array[String] = js.native
  
  var FJD: js.Array[js.UndefOr[String]] = js.native
  
  var JPY: js.Array[String] = js.native
  
  var NZD: js.Array[String] = js.native
  
  var SBD: js.Array[js.UndefOr[String]] = js.native
  
  var TOP: js.Array[String] = js.native
  
  var USD: js.Array[String] = js.native
}
object AUDFJD {
  
  @scala.inline
  def apply(
    AUD: js.Array[String],
    FJD: js.Array[js.UndefOr[String]],
    JPY: js.Array[String],
    NZD: js.Array[String],
    SBD: js.Array[js.UndefOr[String]],
    TOP: js.Array[String],
    USD: js.Array[String]
  ): AUDFJD = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], FJD = FJD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], NZD = NZD.asInstanceOf[js.Any], SBD = SBD.asInstanceOf[js.Any], TOP = TOP.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AUDFJD]
  }
  
  @scala.inline
  implicit class AUDFJDMutableBuilder[Self <: AUDFJD] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAUD(value: js.Array[String]): Self = StObject.set(x, "AUD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAUDVarargs(value: String*): Self = StObject.set(x, "AUD", js.Array(value :_*))
    
    @scala.inline
    def setFJD(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "FJD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFJDVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "FJD", js.Array(value :_*))
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setNZD(value: js.Array[String]): Self = StObject.set(x, "NZD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNZDVarargs(value: String*): Self = StObject.set(x, "NZD", js.Array(value :_*))
    
    @scala.inline
    def setSBD(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "SBD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSBDVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "SBD", js.Array(value :_*))
    
    @scala.inline
    def setTOP(value: js.Array[String]): Self = StObject.set(x, "TOP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTOPVarargs(value: String*): Self = StObject.set(x, "TOP", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
