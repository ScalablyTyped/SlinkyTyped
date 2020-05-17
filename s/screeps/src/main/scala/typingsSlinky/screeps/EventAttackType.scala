package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.screeps.EVENT_ATTACK_TYPE_MELEE
  - typingsSlinky.screeps.EVENT_ATTACK_TYPE_RANGED
  - typingsSlinky.screeps.EVENT_ATTACK_TYPE_RANGED_MASS
  - typingsSlinky.screeps.EVENT_ATTACK_TYPE_DISMANTLE
  - typingsSlinky.screeps.EVENT_ATTACK_TYPE_HIT_BACK
  - typingsSlinky.screeps.EVENT_ATTACK_TYPE_NUKE
*/
trait EventAttackType extends js.Object

object EventAttackType {
  @scala.inline
  implicit def apply(value: EVENT_ATTACK_TYPE_DISMANTLE): EventAttackType = value.asInstanceOf[EventAttackType]
  @scala.inline
  implicit def apply(value: EVENT_ATTACK_TYPE_HIT_BACK): EventAttackType = value.asInstanceOf[EventAttackType]
  @scala.inline
  implicit def apply(value: EVENT_ATTACK_TYPE_MELEE): EventAttackType = value.asInstanceOf[EventAttackType]
  @scala.inline
  implicit def apply(value: EVENT_ATTACK_TYPE_NUKE): EventAttackType = value.asInstanceOf[EventAttackType]
  @scala.inline
  implicit def apply(value: EVENT_ATTACK_TYPE_RANGED): EventAttackType = value.asInstanceOf[EventAttackType]
  @scala.inline
  implicit def apply(value: EVENT_ATTACK_TYPE_RANGED_MASS): EventAttackType = value.asInstanceOf[EventAttackType]
}

