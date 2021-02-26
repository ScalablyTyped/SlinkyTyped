package typingsSlinky.carbonComponents

import typingsSlinky.carbonComponents.anon.Left
import typingsSlinky.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object overflowMenuMod {
  
  @JSImport("carbon-components/components/overflow-menu/overflow-menu", JSImport.Default)
  @js.native
  class default protected () extends OverflowMenu {
    def this(element: js.Any, options: js.Any) = this()
  }
  object default {
    
    @JSImport("carbon-components/components/overflow-menu/overflow-menu", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/overflow-menu/overflow-menu", "default.components")
    @js.native
    def components: WeakMap[js.Object, js.Any] = js.native
    @scala.inline
    def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("carbon-components/components/overflow-menu/overflow-menu", "getMenuOffset")
  @js.native
  def getMenuOffset(menuBody: js.Any, direction: js.Any, trigger: js.Any): js.UndefOr[Left] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @js.native
  trait OverflowMenu extends StObject {
    
    def _handleDocumentClick(event: js.Any): Unit = js.native
    
    def _handleKeyPress(event: js.Any): Unit = js.native
    
    def changeState(state: js.Any, detail: js.Any, callback: js.Any): Unit = js.native
    
    def getCurrentNavigation(): js.Any = js.native
    
    def navigate(direction: js.Any): Unit = js.native
  }
  object OverflowMenu {
    
    @scala.inline
    def apply(
      _handleDocumentClick: js.Any => Unit,
      _handleKeyPress: js.Any => Unit,
      changeState: (js.Any, js.Any, js.Any) => Unit,
      getCurrentNavigation: () => js.Any,
      navigate: js.Any => Unit
    ): OverflowMenu = {
      val __obj = js.Dynamic.literal(_handleDocumentClick = js.Any.fromFunction1(_handleDocumentClick), _handleKeyPress = js.Any.fromFunction1(_handleKeyPress), changeState = js.Any.fromFunction3(changeState), getCurrentNavigation = js.Any.fromFunction0(getCurrentNavigation), navigate = js.Any.fromFunction1(navigate))
      __obj.asInstanceOf[OverflowMenu]
    }
    
    @scala.inline
    implicit class OverflowMenuMutableBuilder[Self <: OverflowMenu] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChangeState(value: (js.Any, js.Any, js.Any) => Unit): Self = StObject.set(x, "changeState", js.Any.fromFunction3(value))
      
      @scala.inline
      def setGetCurrentNavigation(value: () => js.Any): Self = StObject.set(x, "getCurrentNavigation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNavigate(value: js.Any => Unit): Self = StObject.set(x, "navigate", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_handleDocumentClick(value: js.Any => Unit): Self = StObject.set(x, "_handleDocumentClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_handleKeyPress(value: js.Any => Unit): Self = StObject.set(x, "_handleKeyPress", js.Any.fromFunction1(value))
    }
  }
}
