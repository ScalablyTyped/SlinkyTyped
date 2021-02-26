package typingsSlinky.carbonComponents

import typingsSlinky.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipMod {
  
  @JSImport("carbon-components/components/tooltip/tooltip", JSImport.Default)
  @js.native
  class default protected () extends Tooltip {
    def this(element: js.Any, options: js.Any) = this()
  }
  object default {
    
    @JSImport("carbon-components/components/tooltip/tooltip", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("carbon-components/components/tooltip/tooltip", "default.components")
    @js.native
    def components: WeakMap[js.Object, js.Any] = js.native
    @scala.inline
    def components_=(x: WeakMap[js.Object, js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("components")(x.asInstanceOf[js.Any])
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @js.native
  trait Tooltip extends StObject {
    
    def _handleClick(hasRelatedTargetTypeHadContextMenuDetails: js.Any): Unit = js.native
    
    var _hasContextMenu: Boolean = js.native
    
    def _hookOn(element: js.Any): Unit = js.native
    
    def changeState(state: js.Any, detail: js.Any, callback: js.Any): Unit = js.native
    
    def createdByEvent(event: js.Any): Unit = js.native
  }
  object Tooltip {
    
    @scala.inline
    def apply(
      _handleClick: js.Any => Unit,
      _hasContextMenu: Boolean,
      _hookOn: js.Any => Unit,
      changeState: (js.Any, js.Any, js.Any) => Unit,
      createdByEvent: js.Any => Unit
    ): Tooltip = {
      val __obj = js.Dynamic.literal(_handleClick = js.Any.fromFunction1(_handleClick), _hasContextMenu = _hasContextMenu.asInstanceOf[js.Any], _hookOn = js.Any.fromFunction1(_hookOn), changeState = js.Any.fromFunction3(changeState), createdByEvent = js.Any.fromFunction1(createdByEvent))
      __obj.asInstanceOf[Tooltip]
    }
    
    @scala.inline
    implicit class TooltipMutableBuilder[Self <: Tooltip] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChangeState(value: (js.Any, js.Any, js.Any) => Unit): Self = StObject.set(x, "changeState", js.Any.fromFunction3(value))
      
      @scala.inline
      def setCreatedByEvent(value: js.Any => Unit): Self = StObject.set(x, "createdByEvent", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_handleClick(value: js.Any => Unit): Self = StObject.set(x, "_handleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_hasContextMenu(value: Boolean): Self = StObject.set(x, "_hasContextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_hookOn(value: js.Any => Unit): Self = StObject.set(x, "_hookOn", js.Any.fromFunction1(value))
    }
  }
}
