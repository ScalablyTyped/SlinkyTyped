package typingsSlinky.eventToPromise.mod

import org.scalajs.dom.raw.EventTarget
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.eventsMod.EventEmitter
  - typingsSlinky.std.EventTarget
*/
trait EventSource extends js.Object

object EventSource {
  @scala.inline
  implicit def apply(value: EventEmitter): EventSource = value.asInstanceOf[EventSource]
  @scala.inline
  implicit def apply(value: EventTarget): EventSource = value.asInstanceOf[EventSource]
}

