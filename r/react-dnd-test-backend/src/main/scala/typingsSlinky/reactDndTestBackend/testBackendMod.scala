package typingsSlinky.reactDndTestBackend

import typingsSlinky.dndCore.interfacesMod.Backend
import typingsSlinky.dndCore.interfacesMod.BeginDragOptions
import typingsSlinky.dndCore.interfacesMod.DragDropManager
import typingsSlinky.dndCore.interfacesMod.HoverOptions
import typingsSlinky.dndCore.interfacesMod.Identifier
import typingsSlinky.dndCore.interfacesMod.Unsubscribe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd-test-backend/lib/TestBackend", JSImport.Namespace)
@js.native
object testBackendMod extends js.Object {
  @js.native
  trait ITestBackend extends Backend {
    var didCallSetup: Boolean = js.native
    var didCallTeardown: Boolean = js.native
    def simulateBeginDrag(sourceIds: js.Array[Identifier]): Unit = js.native
    def simulateBeginDrag(sourceIds: js.Array[Identifier], options: js.Any): Unit = js.native
    def simulateDrop(): Unit = js.native
    def simulateEndDrag(): Unit = js.native
    def simulateHover(targetIds: js.Array[Identifier]): Unit = js.native
    def simulateHover(targetIds: js.Array[Identifier], options: js.Any): Unit = js.native
    def simulatePublishDragSource(): Unit = js.native
  }
  
  @js.native
  class TestBackendImpl protected () extends ITestBackend {
    def this(manager: DragDropManager) = this()
    var actions: js.Any = js.native
    var manager: DragDropManager = js.native
    def connectDragPreview(): Unsubscribe = js.native
    def connectDragSource(): Unsubscribe = js.native
    def connectDropTarget(): Unsubscribe = js.native
    def simulateBeginDrag(sourceIds: js.Array[Identifier], options: BeginDragOptions): Unit = js.native
    def simulateHover(targetIds: js.Array[Identifier], options: HoverOptions): Unit = js.native
  }
  
}

