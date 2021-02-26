package typingsSlinky.dndCore

import typingsSlinky.dndCore.interfacesMod.BackendFactory
import typingsSlinky.dndCore.interfacesMod.DragDropManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dnd-core", "HandlerRole")
  @js.native
  object HandlerRole extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typingsSlinky.dndCore.interfacesMod.HandlerRole with String] = js.native
    
    /* "SOURCE" */ val SOURCE: typingsSlinky.dndCore.interfacesMod.HandlerRole.SOURCE with String = js.native
    
    /* "TARGET" */ val TARGET: typingsSlinky.dndCore.interfacesMod.HandlerRole.TARGET with String = js.native
  }
  
  @JSImport("dnd-core", "createDragDropManager")
  @js.native
  def createDragDropManager(backendFactory: BackendFactory, globalContext: js.Any, backendOptions: js.Any): DragDropManager = js.native
  @JSImport("dnd-core", "createDragDropManager")
  @js.native
  def createDragDropManager(backendFactory: BackendFactory, globalContext: js.Any, backendOptions: js.Any, debugMode: Boolean): DragDropManager = js.native
}
