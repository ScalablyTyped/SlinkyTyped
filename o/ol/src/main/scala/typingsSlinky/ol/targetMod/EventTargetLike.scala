package typingsSlinky.ol.targetMod

import org.scalajs.dom.raw.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.EventTarget
  - typingsSlinky.ol.targetMod.Target
*/
trait EventTargetLike extends js.Object

object EventTargetLike {
  @scala.inline
  implicit def apply(value: EventTarget): EventTargetLike = value.asInstanceOf[EventTargetLike]
  @scala.inline
  implicit def apply(value: Target): EventTargetLike = value.asInstanceOf[EventTargetLike]
}

