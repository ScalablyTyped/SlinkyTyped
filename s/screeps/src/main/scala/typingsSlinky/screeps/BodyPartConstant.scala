package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Body Part Constants
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.screeps.MOVE
  - typingsSlinky.screeps.WORK
  - typingsSlinky.screeps.CARRY
  - typingsSlinky.screeps.ATTACK
  - typingsSlinky.screeps.RANGED_ATTACK
  - typingsSlinky.screeps.TOUGH
  - typingsSlinky.screeps.HEAL
  - typingsSlinky.screeps.CLAIM
*/
trait BodyPartConstant extends js.Object

object BodyPartConstant {
  @scala.inline
  implicit def apply(value: ATTACK): BodyPartConstant = value.asInstanceOf[BodyPartConstant]
  @scala.inline
  implicit def apply(value: CARRY): BodyPartConstant = value.asInstanceOf[BodyPartConstant]
  @scala.inline
  implicit def apply(value: CLAIM): BodyPartConstant = value.asInstanceOf[BodyPartConstant]
  @scala.inline
  implicit def apply(value: HEAL): BodyPartConstant = value.asInstanceOf[BodyPartConstant]
  @scala.inline
  implicit def apply(value: MOVE): BodyPartConstant = value.asInstanceOf[BodyPartConstant]
  @scala.inline
  implicit def apply(value: RANGED_ATTACK): BodyPartConstant = value.asInstanceOf[BodyPartConstant]
  @scala.inline
  implicit def apply(value: TOUGH): BodyPartConstant = value.asInstanceOf[BodyPartConstant]
  @scala.inline
  implicit def apply(value: WORK): BodyPartConstant = value.asInstanceOf[BodyPartConstant]
}

