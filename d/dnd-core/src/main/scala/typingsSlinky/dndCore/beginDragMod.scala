package typingsSlinky.dndCore

import typingsSlinky.dndCore.interfacesMod.Action
import typingsSlinky.dndCore.interfacesMod.BeginDragOptions
import typingsSlinky.dndCore.interfacesMod.BeginDragPayload
import typingsSlinky.dndCore.interfacesMod.DragDropManager
import typingsSlinky.dndCore.interfacesMod.Identifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dnd-core/lib/actions/dragDrop/beginDrag", JSImport.Namespace)
@js.native
object beginDragMod extends js.Object {
  
  def createBeginDrag(manager: DragDropManager): js.Function2[
    /* sourceIds */ js.UndefOr[js.Array[Identifier]], 
    /* options */ js.UndefOr[BeginDragOptions], 
    js.UndefOr[Action[BeginDragPayload]]
  ] = js.native
}
