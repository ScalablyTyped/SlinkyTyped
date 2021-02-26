package typingsSlinky.devtoolsProtocol.mod.Protocol.DOM

import typingsSlinky.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RGBA extends StObject {
  
  /**
    * The alpha component, in the [0-1] range (default: 1).
    */
  var a: js.UndefOr[Double] = js.native
  
  /**
    * The blue component, in the [0-255] range.
    */
  var b: integer = js.native
  
  /**
    * The green component, in the [0-255] range.
    */
  var g: integer = js.native
  
  /**
    * The red component, in the [0-255] range.
    */
  var r: integer = js.native
}
object RGBA {
  
  @scala.inline
  def apply(b: integer, g: integer, r: integer): RGBA = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[RGBA]
  }
  
  @scala.inline
  implicit class RGBAMutableBuilder[Self <: RGBA] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAUndefined: Self = StObject.set(x, "a", js.undefined)
    
    @scala.inline
    def setB(value: integer): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setG(value: integer): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR(value: integer): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
  }
}
