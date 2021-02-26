package typingsSlinky.dndCore

import typingsSlinky.dndCore.interfacesMod.Action
import typingsSlinky.dndCore.interfacesMod.BeginDragOptions
import typingsSlinky.dndCore.interfacesMod.BeginDragPayload
import typingsSlinky.dndCore.interfacesMod.DragDropManager
import typingsSlinky.dndCore.interfacesMod.Identifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object beginDragMod {
  
  @JSImport("dnd-core/lib/actions/dragDrop/beginDrag", "createBeginDrag")
  @js.native
  def createBeginDrag(manager: DragDropManager): js.Function2[
    /* sourceIds */ js.UndefOr[js.Array[Identifier]], 
    /* options */ js.UndefOr[BeginDragOptions], 
    js.UndefOr[Action[BeginDragPayload]]
  ] = js.native
}
