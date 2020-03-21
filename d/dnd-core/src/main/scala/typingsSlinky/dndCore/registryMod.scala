package typingsSlinky.dndCore

import typingsSlinky.dndCore.dndCoreStrings.`dnd-coreSlashADD_SOURCE`
import typingsSlinky.dndCore.dndCoreStrings.`dnd-coreSlashADD_TARGET`
import typingsSlinky.dndCore.dndCoreStrings.`dnd-coreSlashREMOVE_SOURCE`
import typingsSlinky.dndCore.dndCoreStrings.`dnd-coreSlashREMOVE_TARGET`
import typingsSlinky.dndCore.interfacesMod.Action
import typingsSlinky.dndCore.interfacesMod.SourceIdPayload
import typingsSlinky.dndCore.interfacesMod.TargetIdPayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dnd-core/lib/actions/registry", JSImport.Namespace)
@js.native
object registryMod extends js.Object {
  val ADD_SOURCE: `dnd-coreSlashADD_SOURCE` = js.native
  val ADD_TARGET: `dnd-coreSlashADD_TARGET` = js.native
  val REMOVE_SOURCE: `dnd-coreSlashREMOVE_SOURCE` = js.native
  val REMOVE_TARGET: `dnd-coreSlashREMOVE_TARGET` = js.native
  def addSource(sourceId: String): Action[SourceIdPayload] = js.native
  def addTarget(targetId: String): Action[TargetIdPayload] = js.native
  def removeSource(sourceId: String): Action[SourceIdPayload] = js.native
  def removeTarget(targetId: String): Action[TargetIdPayload] = js.native
}

