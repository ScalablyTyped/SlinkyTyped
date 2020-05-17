package typingsSlinky.dndCore.anon

import typingsSlinky.dndCore.interfacesMod.Action
import typingsSlinky.dndCore.interfacesMod.BeginDragOptions
import typingsSlinky.dndCore.interfacesMod.BeginDragPayload
import typingsSlinky.dndCore.interfacesMod.HoverOptions
import typingsSlinky.dndCore.interfacesMod.HoverPayload
import typingsSlinky.dndCore.interfacesMod.SentinelAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeginDrag extends js.Object {
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

