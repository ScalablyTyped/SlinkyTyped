package typingsSlinky.reactMdMenu

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.react.mod.MutableRefObject
import typingsSlinky.reactMdMenu.reactMdMenuStrings.first
import typingsSlinky.reactMdMenu.reactMdMenuStrings.last
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuEventsMod {
  
  @JSImport("@react-md/menu/types/MenuEvents", "MenuEvents")
  @js.native
  def MenuEvents(hasMenuRefCancelledDefaultFocus: MenuEventsProps): Null = js.native
  
  @js.native
  trait MenuEventsProps extends StObject {
    
    var cancelled: Boolean = js.native
    
    var defaultFocus: first | last | String = js.native
    
    var menuRef: MutableRefObject[HTMLDivElement | Null] = js.native
  }
  object MenuEventsProps {
    
    @scala.inline
    def apply(
      cancelled: Boolean,
      defaultFocus: first | last | String,
      menuRef: MutableRefObject[HTMLDivElement | Null]
    ): MenuEventsProps = {
      val __obj = js.Dynamic.literal(cancelled = cancelled.asInstanceOf[js.Any], defaultFocus = defaultFocus.asInstanceOf[js.Any], menuRef = menuRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuEventsProps]
    }
    
    @scala.inline
    implicit class MenuEventsPropsMutableBuilder[Self <: MenuEventsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelled(value: Boolean): Self = StObject.set(x, "cancelled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultFocus(value: first | last | String): Self = StObject.set(x, "defaultFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuRef(value: MutableRefObject[HTMLDivElement | Null]): Self = StObject.set(x, "menuRef", value.asInstanceOf[js.Any])
    }
  }
}
