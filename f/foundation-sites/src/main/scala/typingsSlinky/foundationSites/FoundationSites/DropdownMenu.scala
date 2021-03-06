package typingsSlinky.foundationSites.FoundationSites

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://get.foundation/sites/docs/dropdown-menu.html#javascript-reference
@js.native
trait DropdownMenu extends StObject {
  
  def destroy(): Unit = js.native
}
object DropdownMenu {
  
  @scala.inline
  def apply(destroy: () => Unit): DropdownMenu = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
    __obj.asInstanceOf[DropdownMenu]
  }
  
  @scala.inline
  implicit class DropdownMenuMutableBuilder[Self <: DropdownMenu] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
  }
}
