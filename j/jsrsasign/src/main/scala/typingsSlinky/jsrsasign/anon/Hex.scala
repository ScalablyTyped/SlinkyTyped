package typingsSlinky.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hex extends StObject {
  
  var hex: String = js.native
}
object Hex {
  
  @scala.inline
  def apply(hex: String): Hex = {
    val __obj = js.Dynamic.literal(hex = hex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hex]
  }
  
  @scala.inline
  implicit class HexMutableBuilder[Self <: Hex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
  }
}
