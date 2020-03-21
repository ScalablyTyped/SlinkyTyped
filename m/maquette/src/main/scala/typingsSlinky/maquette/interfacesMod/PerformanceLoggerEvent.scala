package typingsSlinky.maquette.interfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.maquette.maquetteStrings.domEvent
  - typingsSlinky.maquette.maquetteStrings.domEventProcessed
  - typingsSlinky.maquette.maquetteStrings.renderStart
  - typingsSlinky.maquette.maquetteStrings.rendered
  - typingsSlinky.maquette.maquetteStrings.patched
  - typingsSlinky.maquette.maquetteStrings.renderDone
*/
trait PerformanceLoggerEvent extends js.Object

object PerformanceLoggerEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def domEvent: typingsSlinky.maquette.maquetteStrings.domEvent = this.cast("domEvent")
  @scala.inline
  def domEventProcessed: typingsSlinky.maquette.maquetteStrings.domEventProcessed = this.cast("domEventProcessed")
  @scala.inline
  def patched: typingsSlinky.maquette.maquetteStrings.patched = this.cast("patched")
  @scala.inline
  def renderDone: typingsSlinky.maquette.maquetteStrings.renderDone = this.cast("renderDone")
  @scala.inline
  def renderStart: typingsSlinky.maquette.maquetteStrings.renderStart = this.cast("renderStart")
  @scala.inline
  def rendered: typingsSlinky.maquette.maquetteStrings.rendered = this.cast("rendered")
}

