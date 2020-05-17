package typingsSlinky.podium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.podium.mod.EventOptionsObject
  - typingsSlinky.podium.mod.Podium
*/
trait Events extends js.Object

object Events {
  @scala.inline
  implicit def apply(value: EventOptionsObject): Events = value.asInstanceOf[Events]
  @scala.inline
  implicit def apply(value: Podium): Events = value.asInstanceOf[Events]
  @scala.inline
  implicit def apply(value: String): Events = value.asInstanceOf[Events]
}

