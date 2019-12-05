package typingsSlinky.dndDashCore

import typingsSlinky.dndDashCore.libInterfacesMod.Action
import typingsSlinky.dndDashCore.libInterfacesMod.DragDropManager
import typingsSlinky.dndDashCore.libInterfacesMod.HoverOptions
import typingsSlinky.dndDashCore.libInterfacesMod.HoverPayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dnd-core/lib/actions/dragDrop/hover", JSImport.Namespace)
@js.native
object libActionsDragDropHoverMod extends js.Object {
  def default(manager: DragDropManager): js.Function2[
    /* targetIdsArg */ js.Array[String], 
    /* hasClientOffset */ js.UndefOr[HoverOptions], 
    Action[HoverPayload]
  ] = js.native
}

