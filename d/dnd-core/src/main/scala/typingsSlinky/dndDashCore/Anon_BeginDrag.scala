package typingsSlinky.dndDashCore

import typingsSlinky.dndDashCore.libInterfacesMod.Action
import typingsSlinky.dndDashCore.libInterfacesMod.BeginDragOptions
import typingsSlinky.dndDashCore.libInterfacesMod.BeginDragPayload
import typingsSlinky.dndDashCore.libInterfacesMod.HoverOptions
import typingsSlinky.dndDashCore.libInterfacesMod.HoverPayload
import typingsSlinky.dndDashCore.libInterfacesMod.SentinelAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_BeginDrag extends js.Object {
  def beginDrag(): js.UndefOr[Action[BeginDragPayload]] = js.native
  def beginDrag(sourceIds: js.Array[String]): js.UndefOr[Action[BeginDragPayload]] = js.native
  def beginDrag(sourceIds: js.Array[String], options: BeginDragOptions): js.UndefOr[Action[BeginDragPayload]] = js.native
  def drop(): Unit = js.native
  def drop(options: js.Object): Unit = js.native
  def endDrag(): SentinelAction = js.native
  def hover(targetIdsArg: js.Array[String]): Action[HoverPayload] = js.native
  def hover(targetIdsArg: js.Array[String], hasClientOffset: HoverOptions): Action[HoverPayload] = js.native
  def publishDragSource(): js.UndefOr[SentinelAction] = js.native
}

