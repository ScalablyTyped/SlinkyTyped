package typingsSlinky.reactTimeout.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.NodeJS.Timer
  - scala.Double
*/
trait Timer extends js.Object

object Timer {
  @scala.inline
  implicit def apply(value: Double): Timer = value.asInstanceOf[Timer]
  @scala.inline
  implicit def apply(value: typingsSlinky.node.NodeJS.Timer): Timer = value.asInstanceOf[Timer]
}

