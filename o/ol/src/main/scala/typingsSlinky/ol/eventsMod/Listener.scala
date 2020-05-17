package typingsSlinky.ol.eventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ol.eventsMod.ListenerFunction
  - typingsSlinky.ol.eventsMod.ListenerObject
*/
trait Listener extends js.Object

object Listener {
  @scala.inline
  implicit def apply(value: ListenerFunction): Listener = value.asInstanceOf[Listener]
  @scala.inline
  implicit def apply(value: ListenerObject): Listener = value.asInstanceOf[Listener]
}

