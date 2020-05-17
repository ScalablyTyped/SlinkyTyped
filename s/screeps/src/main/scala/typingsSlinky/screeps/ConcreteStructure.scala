package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Conditional type for all concrete implementations of Structure.
  * Unlike Structure<T>, ConcreteStructure<T> gives you the actual concrete class that extends Structure<T>.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.screeps.StructureInvaderCore
  - typingsSlinky.screeps.StructurePortal
  - typingsSlinky.screeps.StructurePowerBank
  - typingsSlinky.screeps.StructureController
  - typingsSlinky.screeps.StructureKeeperLair
  - typingsSlinky.screeps.StructureFactory
  - typingsSlinky.screeps.StructureNuker
  - typingsSlinky.screeps.StructureContainer
  - typingsSlinky.screeps.StructureTerminal
  - typingsSlinky.screeps.StructureLab
  - typingsSlinky.screeps.StructureExtractor
  - typingsSlinky.screeps.StructurePowerSpawn
  - typingsSlinky.screeps.StructureObserver
  - typingsSlinky.screeps.StructureTower
  - typingsSlinky.screeps.StructureStorage
  - typingsSlinky.screeps.StructureWall
  - typingsSlinky.screeps.StructureLink
  - typingsSlinky.screeps.StructureSpawn
  - typingsSlinky.screeps.StructureRoad
  - typingsSlinky.screeps.StructureRampart
  - typingsSlinky.screeps.StructureExtension
*/
trait ConcreteStructure[T /* <: StructureConstant */] extends js.Object

object ConcreteStructure {
  @scala.inline
  implicit def apply[T](value: StructureContainer): ConcreteStructure[T] = value.asInstanceOf[ConcreteStructure[T]]
  @scala.inline
  implicit def apply[T](value: StructureController): ConcreteStructure[T] = value.asInstanceOf[ConcreteStructure[T]]
  @scala.inline
  implicit def apply[T](value: StructureExtension): ConcreteStructure[T] = value.asInstanceOf[ConcreteStructure[T]]
  @scala.inline
  implicit def apply[T](value: StructureExtractor): ConcreteStructure[T] = value.asInstanceOf[ConcreteStructure[T]]
  @scala.inline
  implicit def apply[T](value: StructureFactory): ConcreteStructure[T] = value.asInstanceOf[ConcreteStructure[T]]
  @scala.inline
  implicit def apply[T](value: StructureInvaderCore): ConcreteStructure[T] = value.asInstanceOf[ConcreteStructure[T]]
  @scala.inline
  implicit def apply[T](value: StructureKeeperLair): ConcreteStructure[T] = value.asInstanceOf[ConcreteStructure[T]]
  @scala.inline
  implicit def apply[T](value: StructureLab): ConcreteStructure[T] = value.asInstanceOf[ConcreteStructure[T]]
  @scala.inline
  implicit def apply[T](value: StructureLink): ConcreteStructure[T] = value.asInstanceOf[ConcreteStructure[T]]
  @scala.inline
  implicit def apply[T](value: StructureNuker): ConcreteStructure[T] = value.asInstanceOf[ConcreteStructure[T]]
  @scala.inline
  implicit def apply[T](value: StructureObserver): ConcreteStructure[T] = value.asInstanceOf[ConcreteStructure[T]]
  @scala.inline
  implicit def apply[T](value: StructurePortal): ConcreteStructure[T] = value.asInstanceOf[ConcreteStructure[T]]
  @scala.inline
  implicit def apply[T](value: StructurePowerBank): ConcreteStructure[T] = value.asInstanceOf[ConcreteStructure[T]]
  @scala.inline
  implicit def apply[T](value: StructurePowerSpawn): ConcreteStructure[T] = value.asInstanceOf[ConcreteStructure[T]]
  @scala.inline
  implicit def apply[T](value: StructureRampart): ConcreteStructure[T] = value.asInstanceOf[ConcreteStructure[T]]
  @scala.inline
  implicit def apply[T](value: StructureRoad): ConcreteStructure[T] = value.asInstanceOf[ConcreteStructure[T]]
  @scala.inline
  implicit def apply[T](value: StructureSpawn): ConcreteStructure[T] = value.asInstanceOf[ConcreteStructure[T]]
  @scala.inline
  implicit def apply[T](value: StructureStorage): ConcreteStructure[T] = value.asInstanceOf[ConcreteStructure[T]]
  @scala.inline
  implicit def apply[T](value: StructureTerminal): ConcreteStructure[T] = value.asInstanceOf[ConcreteStructure[T]]
  @scala.inline
  implicit def apply[T](value: StructureTower): ConcreteStructure[T] = value.asInstanceOf[ConcreteStructure[T]]
  @scala.inline
  implicit def apply[T](value: StructureWall): ConcreteStructure[T] = value.asInstanceOf[ConcreteStructure[T]]
}

