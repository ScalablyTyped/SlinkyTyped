package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.screeps.OK
  - typingsSlinky.screeps.ERR_NOT_OWNER
  - typingsSlinky.screeps.ERR_BUSY
  - typingsSlinky.screeps.ERR_INVALID_TARGET
  - typingsSlinky.screeps.ERR_NOT_IN_RANGE
  - typingsSlinky.screeps.ERR_NO_BODYPART
  - typingsSlinky.screeps.ERR_TIRED
*/
trait CreepActionReturnCode extends js.Object

object CreepActionReturnCode {
  @scala.inline
  implicit def apply(value: ERR_BUSY): CreepActionReturnCode = value.asInstanceOf[CreepActionReturnCode]
  @scala.inline
  implicit def apply(value: ERR_INVALID_TARGET): CreepActionReturnCode = value.asInstanceOf[CreepActionReturnCode]
  @scala.inline
  implicit def apply(value: ERR_NOT_IN_RANGE): CreepActionReturnCode = value.asInstanceOf[CreepActionReturnCode]
  @scala.inline
  implicit def apply(value: ERR_NOT_OWNER): CreepActionReturnCode = value.asInstanceOf[CreepActionReturnCode]
  @scala.inline
  implicit def apply(value: ERR_NO_BODYPART): CreepActionReturnCode = value.asInstanceOf[CreepActionReturnCode]
  @scala.inline
  implicit def apply(value: ERR_TIRED): CreepActionReturnCode = value.asInstanceOf[CreepActionReturnCode]
  @scala.inline
  implicit def apply(value: OK): CreepActionReturnCode = value.asInstanceOf[CreepActionReturnCode]
}

