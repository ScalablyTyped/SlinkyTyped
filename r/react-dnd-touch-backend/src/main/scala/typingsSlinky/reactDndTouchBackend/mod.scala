package typingsSlinky.reactDndTouchBackend

import typingsSlinky.dndCore.interfacesMod.BackendFactory
import typingsSlinky.dndCore.interfacesMod.DragDropManager
import typingsSlinky.reactDndTouchBackend.interfacesMod.TouchBackendContext
import typingsSlinky.reactDndTouchBackend.interfacesMod.TouchBackendOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-dnd-touch-backend", "TouchBackend")
  @js.native
  val TouchBackend: BackendFactory = js.native
  
  @JSImport("react-dnd-touch-backend", "TouchBackendImpl")
  @js.native
  class TouchBackendImpl protected ()
    extends typingsSlinky.reactDndTouchBackend.touchBackendImplMod.TouchBackendImpl {
    def this(manager: DragDropManager, context: TouchBackendContext, options: TouchBackendOptions) = this()
  }
  /* static members */
  object TouchBackendImpl {
    
    @JSImport("react-dnd-touch-backend", "TouchBackendImpl")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-dnd-touch-backend", "TouchBackendImpl.isSetUp")
    @js.native
    def isSetUp: js.Any = js.native
    @scala.inline
    def isSetUp_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSetUp")(x.asInstanceOf[js.Any])
  }
}
