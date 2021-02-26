package typingsSlinky.rbx

import typingsSlinky.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navbarItemContextMod {
  
  @JSImport("rbx/components/navbar/navbar-item-context", "NavbarItemContext")
  @js.native
  val NavbarItemContext: Context[NavbarItemContextValue] = js.native
  
  @JSImport("rbx/components/navbar/navbar-item-context", "initialValue")
  @js.native
  val initialValue: NavbarItemContextValue = js.native
  
  @js.native
  trait NavbarItemContextValue extends StObject {
    
    var active: Boolean = js.native
    
    def setActive(value: Boolean): Unit = js.native
  }
  object NavbarItemContextValue {
    
    @scala.inline
    def apply(active: Boolean, setActive: Boolean => Unit): NavbarItemContextValue = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], setActive = js.Any.fromFunction1(setActive))
      __obj.asInstanceOf[NavbarItemContextValue]
    }
    
    @scala.inline
    implicit class NavbarItemContextValueMutableBuilder[Self <: NavbarItemContextValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetActive(value: Boolean => Unit): Self = StObject.set(x, "setActive", js.Any.fromFunction1(value))
    }
  }
}
