package typingsSlinky.activexOutlook.anon

import typingsSlinky.activexOutlook.Outlook.OlContextMenu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContextMenu extends StObject {
  
  val ContextMenu: OlContextMenu = js.native
}
object ContextMenu {
  
  @scala.inline
  def apply(ContextMenu: OlContextMenu): ContextMenu = {
    val __obj = js.Dynamic.literal(ContextMenu = ContextMenu.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextMenu]
  }
  
  @scala.inline
  implicit class ContextMenuMutableBuilder[Self <: ContextMenu] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContextMenu(value: OlContextMenu): Self = StObject.set(x, "ContextMenu", value.asInstanceOf[js.Any])
  }
}
