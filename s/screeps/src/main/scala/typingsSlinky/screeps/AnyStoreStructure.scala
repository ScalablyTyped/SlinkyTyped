package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.screeps.StructureExtension
  - typingsSlinky.screeps.StructureFactory
  - typingsSlinky.screeps.StructureLab
  - typingsSlinky.screeps.StructureLink
  - typingsSlinky.screeps.StructureNuker
  - typingsSlinky.screeps.StructurePowerSpawn
  - typingsSlinky.screeps.StructureSpawn
  - typingsSlinky.screeps.StructureStorage
  - typingsSlinky.screeps.StructureTerminal
  - typingsSlinky.screeps.StructureTower
  - typingsSlinky.screeps.StructureContainer
*/
trait AnyStoreStructure extends js.Object

object AnyStoreStructure {
  @scala.inline
  implicit def apply(value: StructureContainer): AnyStoreStructure = value.asInstanceOf[AnyStoreStructure]
  @scala.inline
  implicit def apply(value: StructureExtension): AnyStoreStructure = value.asInstanceOf[AnyStoreStructure]
  @scala.inline
  implicit def apply(value: StructureFactory): AnyStoreStructure = value.asInstanceOf[AnyStoreStructure]
  @scala.inline
  implicit def apply(value: StructureLab): AnyStoreStructure = value.asInstanceOf[AnyStoreStructure]
  @scala.inline
  implicit def apply(value: StructureLink): AnyStoreStructure = value.asInstanceOf[AnyStoreStructure]
  @scala.inline
  implicit def apply(value: StructureNuker): AnyStoreStructure = value.asInstanceOf[AnyStoreStructure]
  @scala.inline
  implicit def apply(value: StructurePowerSpawn): AnyStoreStructure = value.asInstanceOf[AnyStoreStructure]
  @scala.inline
  implicit def apply(value: StructureSpawn): AnyStoreStructure = value.asInstanceOf[AnyStoreStructure]
  @scala.inline
  implicit def apply(value: StructureStorage): AnyStoreStructure = value.asInstanceOf[AnyStoreStructure]
  @scala.inline
  implicit def apply(value: StructureTerminal): AnyStoreStructure = value.asInstanceOf[AnyStoreStructure]
  @scala.inline
  implicit def apply(value: StructureTower): AnyStoreStructure = value.asInstanceOf[AnyStoreStructure]
}

