package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A discriminated union on Structure.type of all structure types
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.screeps.AnyOwnedStructure
  - typingsSlinky.screeps.StructureContainer
  - typingsSlinky.screeps.StructurePortal
  - typingsSlinky.screeps.StructureRoad
  - typingsSlinky.screeps.StructureWall
*/
trait AnyStructure extends js.Object

object AnyStructure {
  @scala.inline
  implicit def apply(value: AnyOwnedStructure): AnyStructure = value.asInstanceOf[AnyStructure]
  @scala.inline
  implicit def apply(value: StructureContainer): AnyStructure = value.asInstanceOf[AnyStructure]
  @scala.inline
  implicit def apply(value: StructurePortal): AnyStructure = value.asInstanceOf[AnyStructure]
  @scala.inline
  implicit def apply(value: StructureRoad): AnyStructure = value.asInstanceOf[AnyStructure]
  @scala.inline
  implicit def apply(value: StructureWall): AnyStructure = value.asInstanceOf[AnyStructure]
}

