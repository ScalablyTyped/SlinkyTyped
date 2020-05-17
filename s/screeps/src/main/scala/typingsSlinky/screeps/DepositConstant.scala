package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The raw deposits */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.screeps.RESOURCE_MIST
  - typingsSlinky.screeps.RESOURCE_BIOMASS
  - typingsSlinky.screeps.RESOURCE_METAL
  - typingsSlinky.screeps.RESOURCE_SILICON
*/
trait DepositConstant extends ResourceConstant

object DepositConstant {
  @scala.inline
  implicit def apply(value: RESOURCE_BIOMASS): DepositConstant = value.asInstanceOf[DepositConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_METAL): DepositConstant = value.asInstanceOf[DepositConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_MIST): DepositConstant = value.asInstanceOf[DepositConstant]
  @scala.inline
  implicit def apply(value: RESOURCE_SILICON): DepositConstant = value.asInstanceOf[DepositConstant]
}

