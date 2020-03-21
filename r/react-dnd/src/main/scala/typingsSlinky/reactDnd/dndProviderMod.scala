package typingsSlinky.reactDnd

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-dnd/lib/common/DndProvider", JSImport.Namespace)
@js.native
object dndProviderMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactDnd.AnonManager
    - typingsSlinky.reactDnd.AnonBackend[BackendContext, BackendOptions]
  */
  trait DndProviderProps[BackendContext, BackendOptions] extends js.Object
  
  val DndProvider: ReactComponentClass[DndProviderProps[js.Any, js.Any]] = js.native
}

