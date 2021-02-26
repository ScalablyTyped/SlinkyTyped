package typingsSlinky.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NAD extends StObject {
  
  var JPY: js.Array[String] = js.native
  
  var NAD: js.Array[String] = js.native
  
  var USD: js.Array[String] = js.native
}
object NAD {
  
  @scala.inline
  def apply(JPY: js.Array[String], NAD: js.Array[String], USD: js.Array[String]): NAD = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], NAD = NAD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[NAD]
  }
  
  @scala.inline
  implicit class NADMutableBuilder[Self <: NAD] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setNAD(value: js.Array[String]): Self = StObject.set(x, "NAD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNADVarargs(value: String*): Self = StObject.set(x, "NAD", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
