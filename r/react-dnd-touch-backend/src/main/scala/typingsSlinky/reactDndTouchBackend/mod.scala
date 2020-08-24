package typingsSlinky.reactDndTouchBackend

import typingsSlinky.dndCore.interfacesMod.BackendFactory
import typingsSlinky.dndCore.interfacesMod.DragDropManager
import typingsSlinky.reactDndTouchBackend.interfacesMod.TouchBackendContext
import typingsSlinky.reactDndTouchBackend.interfacesMod.TouchBackendOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd-touch-backend", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class TouchBackendImpl protected ()
    extends typingsSlinky.reactDndTouchBackend.touchBackendImplMod.TouchBackendImpl {
    def this(manager: DragDropManager, context: TouchBackendContext, options: TouchBackendOptions) = this()
  }
  
  val TouchBackend: BackendFactory = js.native
  /* static members */
  @js.native
  object TouchBackendImpl extends js.Object {
    var isSetUp: js.Any = js.native
  }
  
}

