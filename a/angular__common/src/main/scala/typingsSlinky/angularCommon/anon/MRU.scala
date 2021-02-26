package typingsSlinky.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MRU extends StObject {
  
  var JPY: js.Array[String] = js.native
  
  var MRU: js.Array[String] = js.native
  
  var USD: js.Array[String] = js.native
}
object MRU {
  
  @scala.inline
  def apply(JPY: js.Array[String], MRU: js.Array[String], USD: js.Array[String]): MRU = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], MRU = MRU.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[MRU]
  }
  
  @scala.inline
  implicit class MRUMutableBuilder[Self <: MRU] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setMRU(value: js.Array[String]): Self = StObject.set(x, "MRU", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMRUVarargs(value: String*): Self = StObject.set(x, "MRU", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
