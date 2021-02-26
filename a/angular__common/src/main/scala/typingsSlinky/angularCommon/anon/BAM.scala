package typingsSlinky.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BAM extends StObject {
  
  var BAM: js.Array[String] = js.native
  
  var CZK: js.Array[String] = js.native
  
  var PLN: js.Array[String] = js.native
  
  var RSD: js.Array[String] = js.native
  
  var TRY: js.Array[String] = js.native
  
  var USD: js.Array[String] = js.native
}
object BAM {
  
  @scala.inline
  def apply(
    BAM: js.Array[String],
    CZK: js.Array[String],
    PLN: js.Array[String],
    RSD: js.Array[String],
    TRY: js.Array[String],
    USD: js.Array[String]
  ): BAM = {
    val __obj = js.Dynamic.literal(BAM = BAM.asInstanceOf[js.Any], CZK = CZK.asInstanceOf[js.Any], PLN = PLN.asInstanceOf[js.Any], RSD = RSD.asInstanceOf[js.Any], TRY = TRY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[BAM]
  }
  
  @scala.inline
  implicit class BAMMutableBuilder[Self <: BAM] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBAM(value: js.Array[String]): Self = StObject.set(x, "BAM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBAMVarargs(value: String*): Self = StObject.set(x, "BAM", js.Array(value :_*))
    
    @scala.inline
    def setCZK(value: js.Array[String]): Self = StObject.set(x, "CZK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCZKVarargs(value: String*): Self = StObject.set(x, "CZK", js.Array(value :_*))
    
    @scala.inline
    def setPLN(value: js.Array[String]): Self = StObject.set(x, "PLN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPLNVarargs(value: String*): Self = StObject.set(x, "PLN", js.Array(value :_*))
    
    @scala.inline
    def setRSD(value: js.Array[String]): Self = StObject.set(x, "RSD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRSDVarargs(value: String*): Self = StObject.set(x, "RSD", js.Array(value :_*))
    
    @scala.inline
    def setTRY(value: js.Array[String]): Self = StObject.set(x, "TRY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTRYVarargs(value: String*): Self = StObject.set(x, "TRY", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
