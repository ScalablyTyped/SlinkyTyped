package typingsSlinky.screeps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Direction Constants
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.screeps.TOP
  - typingsSlinky.screeps.TOP_RIGHT
  - typingsSlinky.screeps.RIGHT
  - typingsSlinky.screeps.BOTTOM_RIGHT
  - typingsSlinky.screeps.BOTTOM
  - typingsSlinky.screeps.BOTTOM_LEFT
  - typingsSlinky.screeps.LEFT
  - typingsSlinky.screeps.TOP_LEFT
*/
trait DirectionConstant extends js.Object

object DirectionConstant {
  @scala.inline
  implicit def apply(value: BOTTOM): DirectionConstant = value.asInstanceOf[DirectionConstant]
  @scala.inline
  implicit def apply(value: BOTTOM_LEFT): DirectionConstant = value.asInstanceOf[DirectionConstant]
  @scala.inline
  implicit def apply(value: BOTTOM_RIGHT): DirectionConstant = value.asInstanceOf[DirectionConstant]
  @scala.inline
  implicit def apply(value: LEFT): DirectionConstant = value.asInstanceOf[DirectionConstant]
  @scala.inline
  implicit def apply(value: RIGHT): DirectionConstant = value.asInstanceOf[DirectionConstant]
  @scala.inline
  implicit def apply(value: TOP): DirectionConstant = value.asInstanceOf[DirectionConstant]
  @scala.inline
  implicit def apply(value: TOP_LEFT): DirectionConstant = value.asInstanceOf[DirectionConstant]
  @scala.inline
  implicit def apply(value: TOP_RIGHT): DirectionConstant = value.asInstanceOf[DirectionConstant]
}

