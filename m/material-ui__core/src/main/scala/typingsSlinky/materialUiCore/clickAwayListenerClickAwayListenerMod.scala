package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.materialUiCore.materialUiCoreBooleans.`false`
import typingsSlinky.materialUiCore.materialUiCoreStrings.onClick
import typingsSlinky.materialUiCore.materialUiCoreStrings.onMouseDown
import typingsSlinky.materialUiCore.materialUiCoreStrings.onMouseUp
import typingsSlinky.materialUiCore.materialUiCoreStrings.onTouchEnd
import typingsSlinky.materialUiCore.materialUiCoreStrings.onTouchStart
import typingsSlinky.react.mod.ChangeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clickAwayListenerClickAwayListenerMod extends Shortcut {
  
  @JSImport("@material-ui/core/ClickAwayListener/ClickAwayListener", JSImport.Default)
  @js.native
  val default: ReactComponentClass[ClickAwayListenerProps] = js.native
  
  @js.native
  trait ClickAwayListenerProps extends StObject {
    
    var children: ReactElement = js.native
    
    var mouseEvent: js.UndefOr[onClick | onMouseDown | onMouseUp | `false`] = js.native
    
    def onClickAway(event: ChangeEvent[js.Object]): Unit = js.native
    
    var touchEvent: js.UndefOr[onTouchStart | onTouchEnd | `false`] = js.native
  }
  object ClickAwayListenerProps {
    
    @scala.inline
    def apply(onClickAway: ChangeEvent[js.Object] => Unit): ClickAwayListenerProps = {
      val __obj = js.Dynamic.literal(onClickAway = js.Any.fromFunction1(onClickAway))
      __obj.asInstanceOf[ClickAwayListenerProps]
    }
    
    @scala.inline
    implicit class ClickAwayListenerPropsMutableBuilder[Self <: ClickAwayListenerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setMouseEvent(value: onClick | onMouseDown | onMouseUp | `false`): Self = StObject.set(x, "mouseEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMouseEventUndefined: Self = StObject.set(x, "mouseEvent", js.undefined)
      
      @scala.inline
      def setOnClickAway(value: ChangeEvent[js.Object] => Unit): Self = StObject.set(x, "onClickAway", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTouchEvent(value: onTouchStart | onTouchEnd | `false`): Self = StObject.set(x, "touchEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchEventUndefined: Self = StObject.set(x, "touchEvent", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[ClickAwayListenerProps]
  
  /* This means you don't have to write `default`, but can instead just say `clickAwayListenerClickAwayListenerMod.foo` */
  override def _to: ReactComponentClass[ClickAwayListenerProps] = default
}
