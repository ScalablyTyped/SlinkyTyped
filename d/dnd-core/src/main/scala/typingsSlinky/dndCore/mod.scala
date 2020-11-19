package typingsSlinky.dndCore

import typingsSlinky.dndCore.interfacesMod.BackendFactory
import typingsSlinky.dndCore.interfacesMod.DragDropManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dnd-core", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def createDragDropManager(backendFactory: BackendFactory, globalContext: js.Any, backendOptions: js.Any): DragDropManager = js.native
  def createDragDropManager(backendFactory: BackendFactory, globalContext: js.Any, backendOptions: js.Any, debugMode: Boolean): DragDropManager = js.native
  
  @js.native
  object HandlerRole extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.dndCore.interfacesMod.HandlerRole with String] = js.native
    
    /* "SOURCE" */ val SOURCE: typingsSlinky.dndCore.interfacesMod.HandlerRole.SOURCE with String = js.native
    
    /* "TARGET" */ val TARGET: typingsSlinky.dndCore.interfacesMod.HandlerRole.TARGET with String = js.native
  }
}
