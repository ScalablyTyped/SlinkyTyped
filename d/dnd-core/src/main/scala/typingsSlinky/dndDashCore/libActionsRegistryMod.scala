package typingsSlinky.dndDashCore

import typingsSlinky.dndDashCore.dndDashCoreStrings.`dnd-coreSlashADD_SOURCE`
import typingsSlinky.dndDashCore.dndDashCoreStrings.`dnd-coreSlashADD_TARGET`
import typingsSlinky.dndDashCore.dndDashCoreStrings.`dnd-coreSlashREMOVE_SOURCE`
import typingsSlinky.dndDashCore.dndDashCoreStrings.`dnd-coreSlashREMOVE_TARGET`
import typingsSlinky.dndDashCore.libInterfacesMod.Action
import typingsSlinky.dndDashCore.libInterfacesMod.SourceIdPayload
import typingsSlinky.dndDashCore.libInterfacesMod.TargetIdPayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dnd-core/lib/actions/registry", JSImport.Namespace)
@js.native
object libActionsRegistryMod extends js.Object {
  val ADD_SOURCE: `dnd-coreSlashADD_SOURCE` = js.native
  val ADD_TARGET: `dnd-coreSlashADD_TARGET` = js.native
  val REMOVE_SOURCE: `dnd-coreSlashREMOVE_SOURCE` = js.native
  val REMOVE_TARGET: `dnd-coreSlashREMOVE_TARGET` = js.native
  def addSource(sourceId: String): Action[SourceIdPayload] = js.native
  def addTarget(targetId: String): Action[TargetIdPayload] = js.native
  def removeSource(sourceId: String): Action[SourceIdPayload] = js.native
  def removeTarget(targetId: String): Action[TargetIdPayload] = js.native
}

