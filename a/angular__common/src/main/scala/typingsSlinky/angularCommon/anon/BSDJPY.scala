package typingsSlinky.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BSDJPY extends StObject {
  
  var BSD: js.Array[String] = js.native
  
  var JPY: js.Array[String] = js.native
  
  var USD: js.Array[String] = js.native
}
object BSDJPY {
  
  @scala.inline
  def apply(BSD: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): BSDJPY = {
    val __obj = js.Dynamic.literal(BSD = BSD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[BSDJPY]
  }
  
  @scala.inline
  implicit class BSDJPYMutableBuilder[Self <: BSDJPY] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBSD(value: js.Array[String]): Self = StObject.set(x, "BSD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBSDVarargs(value: String*): Self = StObject.set(x, "BSD", js.Array(value :_*))
    
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
