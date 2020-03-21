package typingsSlinky.jupyterlabServices.kernelKernelMod.Kernel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The valid Kernel status states.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.unknown
  - typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.starting
  - typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.reconnecting
  - typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.idle
  - typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.busy
  - typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.restarting
  - typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.autorestarting
  - typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.dead
  - typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.connected
*/
trait Status extends js.Object

object Status {
  @scala.inline
  def autorestarting: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.autorestarting = this.cast("autorestarting")
  @scala.inline
  def busy: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.busy = this.cast("busy")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connected: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.connected = this.cast("connected")
  @scala.inline
  def dead: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.dead = this.cast("dead")
  @scala.inline
  def idle: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.idle = this.cast("idle")
  @scala.inline
  def reconnecting: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.reconnecting = this.cast("reconnecting")
  @scala.inline
  def restarting: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.restarting = this.cast("restarting")
  @scala.inline
  def starting: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.starting = this.cast("starting")
  @scala.inline
  def unknown: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.unknown = this.cast("unknown")
}

