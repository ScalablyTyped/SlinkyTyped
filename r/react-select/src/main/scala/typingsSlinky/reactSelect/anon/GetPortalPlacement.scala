package typingsSlinky.reactSelect.anon

import typingsSlinky.reactSelect.menuMod.MenuState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPortalPlacement extends StObject {
  
  def getPortalPlacement(state: MenuState): Unit = js.native
}
object GetPortalPlacement {
  
  @scala.inline
  def apply(getPortalPlacement: MenuState => Unit): GetPortalPlacement = {
    val __obj = js.Dynamic.literal(getPortalPlacement = js.Any.fromFunction1(getPortalPlacement))
    __obj.asInstanceOf[GetPortalPlacement]
  }
  
  @scala.inline
  implicit class GetPortalPlacementMutableBuilder[Self <: GetPortalPlacement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetPortalPlacement(value: MenuState => Unit): Self = StObject.set(x, "getPortalPlacement", js.Any.fromFunction1(value))
  }
}
