package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.screeps.OK
  - typingsSlinky.screeps.ERR_NOT_OWNER
  - typingsSlinky.screeps.ERR_BUSY
  - typingsSlinky.screeps.ERR_TIRED
  - typingsSlinky.screeps.ERR_NO_BODYPART
*/
trait CreepMoveReturnCode extends js.Object

object CreepMoveReturnCode {
  @scala.inline
  implicit def apply(value: ERR_BUSY): CreepMoveReturnCode = value.asInstanceOf[CreepMoveReturnCode]
  @scala.inline
  implicit def apply(value: ERR_NOT_OWNER): CreepMoveReturnCode = value.asInstanceOf[CreepMoveReturnCode]
  @scala.inline
  implicit def apply(value: ERR_NO_BODYPART): CreepMoveReturnCode = value.asInstanceOf[CreepMoveReturnCode]
  @scala.inline
  implicit def apply(value: ERR_TIRED): CreepMoveReturnCode = value.asInstanceOf[CreepMoveReturnCode]
  @scala.inline
  implicit def apply(value: OK): CreepMoveReturnCode = value.asInstanceOf[CreepMoveReturnCode]
}

