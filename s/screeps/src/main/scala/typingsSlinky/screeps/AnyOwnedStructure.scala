package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A discriminated union on Structure.type of all owned structure types
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.screeps.StructureController
  - typingsSlinky.screeps.StructureExtension
  - typingsSlinky.screeps.StructureExtractor
  - typingsSlinky.screeps.StructureFactory
  - typingsSlinky.screeps.StructureInvaderCore
  - typingsSlinky.screeps.StructureKeeperLair
  - typingsSlinky.screeps.StructureLab
  - typingsSlinky.screeps.StructureLink
  - typingsSlinky.screeps.StructureNuker
  - typingsSlinky.screeps.StructureObserver
  - typingsSlinky.screeps.StructurePowerBank
  - typingsSlinky.screeps.StructurePowerSpawn
  - typingsSlinky.screeps.StructureRampart
  - typingsSlinky.screeps.StructureSpawn
  - typingsSlinky.screeps.StructureStorage
  - typingsSlinky.screeps.StructureTerminal
  - typingsSlinky.screeps.StructureTower
*/
trait AnyOwnedStructure extends AnyStructure

object AnyOwnedStructure {
  @scala.inline
  implicit def apply(value: StructureController): AnyOwnedStructure = value.asInstanceOf[AnyOwnedStructure]
  @scala.inline
  implicit def apply(value: StructureExtension): AnyOwnedStructure = value.asInstanceOf[AnyOwnedStructure]
  @scala.inline
  implicit def apply(value: StructureExtractor): AnyOwnedStructure = value.asInstanceOf[AnyOwnedStructure]
  @scala.inline
  implicit def apply(value: StructureFactory): AnyOwnedStructure = value.asInstanceOf[AnyOwnedStructure]
  @scala.inline
  implicit def apply(value: StructureInvaderCore): AnyOwnedStructure = value.asInstanceOf[AnyOwnedStructure]
  @scala.inline
  implicit def apply(value: StructureKeeperLair): AnyOwnedStructure = value.asInstanceOf[AnyOwnedStructure]
  @scala.inline
  implicit def apply(value: StructureLab): AnyOwnedStructure = value.asInstanceOf[AnyOwnedStructure]
  @scala.inline
  implicit def apply(value: StructureLink): AnyOwnedStructure = value.asInstanceOf[AnyOwnedStructure]
  @scala.inline
  implicit def apply(value: StructureNuker): AnyOwnedStructure = value.asInstanceOf[AnyOwnedStructure]
  @scala.inline
  implicit def apply(value: StructureObserver): AnyOwnedStructure = value.asInstanceOf[AnyOwnedStructure]
  @scala.inline
  implicit def apply(value: StructurePowerBank): AnyOwnedStructure = value.asInstanceOf[AnyOwnedStructure]
  @scala.inline
  implicit def apply(value: StructurePowerSpawn): AnyOwnedStructure = value.asInstanceOf[AnyOwnedStructure]
  @scala.inline
  implicit def apply(value: StructureRampart): AnyOwnedStructure = value.asInstanceOf[AnyOwnedStructure]
  @scala.inline
  implicit def apply(value: StructureSpawn): AnyOwnedStructure = value.asInstanceOf[AnyOwnedStructure]
  @scala.inline
  implicit def apply(value: StructureStorage): AnyOwnedStructure = value.asInstanceOf[AnyOwnedStructure]
  @scala.inline
  implicit def apply(value: StructureTerminal): AnyOwnedStructure = value.asInstanceOf[AnyOwnedStructure]
  @scala.inline
  implicit def apply(value: StructureTower): AnyOwnedStructure = value.asInstanceOf[AnyOwnedStructure]
}

