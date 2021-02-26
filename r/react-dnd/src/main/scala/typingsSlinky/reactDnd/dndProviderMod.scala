package typingsSlinky.reactDnd

import slinky.core.ReactComponentClass
import typingsSlinky.dndCore.interfacesMod.DragDropManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dndProviderMod {
  
  @JSImport("react-dnd/lib/common/DndProvider", "DndProvider")
  @js.native
  val DndProvider: ReactComponentClass[DndProviderProps[js.Any, js.Any]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactDnd.anon.Manager
    - typingsSlinky.reactDnd.anon.Backend[BackendContext, BackendOptions]
  */
  trait DndProviderProps[BackendContext, BackendOptions] extends StObject
  object DndProviderProps {
    
    @scala.inline
    def Backend[BackendContext, BackendOptions](
      backend: (/* manager */ DragDropManager, /* globalContext */ js.UndefOr[js.Any], /* configuration */ js.UndefOr[js.Any]) => typingsSlinky.dndCore.interfacesMod.Backend
    ): typingsSlinky.reactDnd.anon.Backend[BackendContext, BackendOptions] = {
      val __obj = js.Dynamic.literal(backend = js.Any.fromFunction3(backend))
      __obj.asInstanceOf[typingsSlinky.reactDnd.anon.Backend[BackendContext, BackendOptions]]
    }
    
    @scala.inline
    def Manager(manager: DragDropManager): typingsSlinky.reactDnd.anon.Manager = {
      val __obj = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.reactDnd.anon.Manager]
    }
  }
}
