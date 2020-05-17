package typingsSlinky.ol.eventsMod

import typingsSlinky.ol.targetMod.EventTargetLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/events", "listenOnce")
@js.native
object listenOnce extends js.Object {
  def apply(target: EventTargetLike, `type`: String, listener: ListenerFunction): EventsKey = js.native
  def apply(target: EventTargetLike, `type`: String, listener: ListenerFunction, opt_this: js.Any): EventsKey = js.native
}

