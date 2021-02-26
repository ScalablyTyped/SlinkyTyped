package typingsSlinky.reactDnd

import slinky.core.facade.ReactRef
import typingsSlinky.dndCore.interfacesMod.DragDropMonitor
import typingsSlinky.dndCore.interfacesMod.DropTarget
import typingsSlinky.dndCore.interfacesMod.Identifier
import typingsSlinky.reactDnd.interfacesMod.DropTargetSpec
import typingsSlinky.reactDnd.monitorsMod.DropTargetMonitor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createTargetFactoryMod {
  
  @JSImport("react-dnd/lib/decorators/createTargetFactory", "createTargetFactory")
  @js.native
  def createTargetFactory[Props](spec: DropTargetSpec[Props]): js.Function2[/* monitor */ DropTargetMonitor, /* ref */ ReactRef[_], Target] = js.native
  
  @js.native
  trait Target extends DropTarget {
    
    def receiveMonitor(monitor: js.Any): Unit = js.native
    
    def receiveProps(props: js.Any): Unit = js.native
  }
  object Target {
    
    @scala.inline
    def apply(
      canDrop: (DragDropMonitor, Identifier) => Boolean,
      drop: (DragDropMonitor, Identifier) => js.Any,
      hover: (DragDropMonitor, Identifier) => Unit,
      receiveMonitor: js.Any => Unit,
      receiveProps: js.Any => Unit
    ): Target = {
      val __obj = js.Dynamic.literal(canDrop = js.Any.fromFunction2(canDrop), drop = js.Any.fromFunction2(drop), hover = js.Any.fromFunction2(hover), receiveMonitor = js.Any.fromFunction1(receiveMonitor), receiveProps = js.Any.fromFunction1(receiveProps))
      __obj.asInstanceOf[Target]
    }
    
    @scala.inline
    implicit class TargetMutableBuilder[Self <: Target] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReceiveMonitor(value: js.Any => Unit): Self = StObject.set(x, "receiveMonitor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReceiveProps(value: js.Any => Unit): Self = StObject.set(x, "receiveProps", js.Any.fromFunction1(value))
    }
  }
}
