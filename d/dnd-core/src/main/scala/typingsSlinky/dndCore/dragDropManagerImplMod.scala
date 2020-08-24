package typingsSlinky.dndCore

import typingsSlinky.dndCore.interfacesMod.Backend
import typingsSlinky.dndCore.interfacesMod.DragDropManager
import typingsSlinky.redux.mod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dnd-core/lib/DragDropManagerImpl", JSImport.Namespace)
@js.native
object dragDropManagerImplMod extends js.Object {
  @js.native
  class DragDropManagerImpl () extends DragDropManager {
    def this(debugMode: Boolean) = this()
    var backend: js.Any = js.native
    var handleRefCountChange: js.Any = js.native
    var isSetUp: js.Any = js.native
    var monitor: js.Any = js.native
    var store: js.Any = js.native
    def dispatch(action: Action[_]): Unit = js.native
    def receiveBackend(backend: Backend): Unit = js.native
  }
  
}

