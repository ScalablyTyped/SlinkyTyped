package typingsSlinky.rcTable.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rcTable.rcTableStrings.left
  - typingsSlinky.rcTable.rcTableStrings.center
  - typingsSlinky.rcTable.rcTableStrings.right
*/
trait AlignType extends js.Object

object AlignType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def center: typingsSlinky.rcTable.rcTableStrings.center = this.cast("center")
  @scala.inline
  def left: typingsSlinky.rcTable.rcTableStrings.left = this.cast("left")
  @scala.inline
  def right: typingsSlinky.rcTable.rcTableStrings.right = this.cast("right")
}

