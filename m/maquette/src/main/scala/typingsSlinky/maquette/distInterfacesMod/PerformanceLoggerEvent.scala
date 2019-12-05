package typingsSlinky.maquette.distInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.maquette.maquetteStrings.domEvent
  - typings.maquette.maquetteStrings.domEventProcessed
  - typings.maquette.maquetteStrings.renderStart
  - typings.maquette.maquetteStrings.rendered
  - typings.maquette.maquetteStrings.patched
  - typings.maquette.maquetteStrings.renderDone
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

