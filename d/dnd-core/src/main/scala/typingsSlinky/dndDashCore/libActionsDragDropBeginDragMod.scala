package typingsSlinky.dndDashCore

import typingsSlinky.dndDashCore.libInterfacesMod.Action
import typingsSlinky.dndDashCore.libInterfacesMod.BeginDragOptions
import typingsSlinky.dndDashCore.libInterfacesMod.BeginDragPayload
import typingsSlinky.dndDashCore.libInterfacesMod.DragDropManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dnd-core/lib/actions/dragDrop/beginDrag", JSImport.Namespace)
@js.native
object libActionsDragDropBeginDragMod extends js.Object {
  def default(manager: DragDropManager): js.Function2[
    /* sourceIds */ js.UndefOr[js.Array[String]], 
    /* options */ js.UndefOr[BeginDragOptions], 
    js.UndefOr[Action[BeginDragPayload]]
  ] = js.native
}

