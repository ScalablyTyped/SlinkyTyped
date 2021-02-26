package typingsSlinky.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HexName extends StObject {
  
  var hex: String = js.native
  
  var name: String = js.native
}
object HexName {
  
  @scala.inline
  def apply(hex: String, name: String): HexName = {
    val __obj = js.Dynamic.literal(hex = hex.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HexName]
  }
  
  @scala.inline
  implicit class HexNameMutableBuilder[Self <: HexName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
