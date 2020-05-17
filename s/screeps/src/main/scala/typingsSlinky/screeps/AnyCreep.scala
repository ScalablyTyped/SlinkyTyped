package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.screeps.Creep
  - typingsSlinky.screeps.PowerCreep
*/
trait AnyCreep extends js.Object

object AnyCreep {
  @scala.inline
  implicit def apply(value: Creep): AnyCreep = value.asInstanceOf[AnyCreep]
  @scala.inline
  implicit def apply(value: PowerCreep): AnyCreep = value.asInstanceOf[AnyCreep]
}

