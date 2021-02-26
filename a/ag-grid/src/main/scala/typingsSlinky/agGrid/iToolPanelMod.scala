package typingsSlinky.agGrid

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.agGrid.gridPanelMod.GridPanel
import typingsSlinky.agGrid.iComponentMod.IComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iToolPanelMod {
  
  @js.native
  trait IToolPanel
    extends IComponent[js.Any] {
    
    def getPreferredWidth(): Double = js.native
    
    def isToolPanelShowing(): Boolean = js.native
    
    def refresh(): Unit = js.native
    
    def registerGridComp(gridPanel: GridPanel): Unit = js.native
    
    def showToolPanel(show: Boolean): Unit = js.native
  }
  object IToolPanel {
    
    @scala.inline
    def apply(
      getGui: () => HTMLElement,
      getPreferredWidth: () => Double,
      isToolPanelShowing: () => Boolean,
      refresh: () => Unit,
      registerGridComp: GridPanel => Unit,
      showToolPanel: Boolean => Unit
    ): IToolPanel = {
      val __obj = js.Dynamic.literal(getGui = js.Any.fromFunction0(getGui), getPreferredWidth = js.Any.fromFunction0(getPreferredWidth), isToolPanelShowing = js.Any.fromFunction0(isToolPanelShowing), refresh = js.Any.fromFunction0(refresh), registerGridComp = js.Any.fromFunction1(registerGridComp), showToolPanel = js.Any.fromFunction1(showToolPanel))
      __obj.asInstanceOf[IToolPanel]
    }
    
    @scala.inline
    implicit class IToolPanelMutableBuilder[Self <: IToolPanel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetPreferredWidth(value: () => Double): Self = StObject.set(x, "getPreferredWidth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsToolPanelShowing(value: () => Boolean): Self = StObject.set(x, "isToolPanelShowing", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRegisterGridComp(value: GridPanel => Unit): Self = StObject.set(x, "registerGridComp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShowToolPanel(value: Boolean => Unit): Self = StObject.set(x, "showToolPanel", js.Any.fromFunction1(value))
    }
  }
}
