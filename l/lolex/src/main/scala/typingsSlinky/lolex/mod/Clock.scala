package typingsSlinky.lolex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Clock object created by lolex.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.lolex.mod.BrowserClock
  - typingsSlinky.lolex.mod.NodeClock
*/
trait Clock extends js.Object

object Clock {
  @scala.inline
  implicit def apply(value: BrowserClock): Clock = value.asInstanceOf[Clock]
  @scala.inline
  implicit def apply(value: NodeClock): Clock = value.asInstanceOf[Clock]
}

