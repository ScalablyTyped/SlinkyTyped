package typingsSlinky.figma.mod.global

import typingsSlinky.figma.anon.Delay
import typingsSlinky.figma.anon.Timeout
import typingsSlinky.figma.anon.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.figma.anon.`1`
  - typingsSlinky.figma.anon.Timeout
  - typingsSlinky.figma.anon.Delay
*/
trait Trigger extends js.Object

object Trigger {
  @scala.inline
  implicit def apply(value: `1`): Trigger = value.asInstanceOf[Trigger]
  @scala.inline
  implicit def apply(value: Delay): Trigger = value.asInstanceOf[Trigger]
  @scala.inline
  implicit def apply(value: Timeout): Trigger = value.asInstanceOf[Trigger]
}

