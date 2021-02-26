package typingsSlinky.agGrid

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.agGrid.gridPanelMod.GridPanel
import typingsSlinky.agGrid.iComponentMod.IComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iStatusBarMod {
  
  @js.native
  trait IStatusBar
    extends IComponent[js.Any] {
    
    def registerGridPanel(gridPanel: GridPanel): Unit = js.native
  }
  object IStatusBar {
    
    @scala.inline
    def apply(getGui: () => HTMLElement, registerGridPanel: GridPanel => Unit): IStatusBar = {
      val __obj = js.Dynamic.literal(getGui = js.Any.fromFunction0(getGui), registerGridPanel = js.Any.fromFunction1(registerGridPanel))
      __obj.asInstanceOf[IStatusBar]
    }
    
    @scala.inline
    implicit class IStatusBarMutableBuilder[Self <: IStatusBar] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegisterGridPanel(value: GridPanel => Unit): Self = StObject.set(x, "registerGridPanel", js.Any.fromFunction1(value))
    }
  }
}
