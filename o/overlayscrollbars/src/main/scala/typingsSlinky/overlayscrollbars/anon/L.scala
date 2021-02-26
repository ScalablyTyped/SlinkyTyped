package typingsSlinky.overlayscrollbars.anon

import typingsSlinky.overlayscrollbars.mod.Position
import typingsSlinky.overlayscrollbars.mod._Coordinates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait L extends _Coordinates {
  
  var l: js.UndefOr[Position] = js.native
  
  var t: js.UndefOr[Position] = js.native
}
object L {
  
  @scala.inline
  def apply(): L = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[L]
  }
  
  @scala.inline
  implicit class LMutableBuilder[Self <: L] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setL(value: Position): Self = StObject.set(x, "l", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLUndefined: Self = StObject.set(x, "l", js.undefined)
    
    @scala.inline
    def setT(value: Position): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTUndefined: Self = StObject.set(x, "t", js.undefined)
  }
}
