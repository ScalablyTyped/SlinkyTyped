package typingsSlinky.rcTable.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rcTable.rcTableStrings.left
  - typingsSlinky.rcTable.rcTableStrings.right
  - scala.Boolean
*/
trait FixedType extends js.Object

object FixedType {
  @scala.inline
  def left: typingsSlinky.rcTable.rcTableStrings.left = "left".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.left]
  @scala.inline
  def right: typingsSlinky.rcTable.rcTableStrings.right = "right".asInstanceOf[typingsSlinky.rcTable.rcTableStrings.right]
  @scala.inline
  implicit def apply(value: Boolean): FixedType = value.asInstanceOf[FixedType]
}

