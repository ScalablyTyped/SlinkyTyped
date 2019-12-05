package typingsSlinky.atJupyterlabServices.libKernelKernelMod.Kernel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The valid Kernel status states.
  */
/* Rewritten from type alias, can be one of: 
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.unknown
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.starting
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.reconnecting
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.idle
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.busy
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.restarting
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.autorestarting
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.dead
  - typings.atJupyterlabServices.atJupyterlabServicesStrings.connected
*/
trait Status extends js.Object

object Status {
  @scala.inline
  def autorestarting: typingsSlinky.atJupyterlabServices.atJupyterlabServicesStrings.autorestarting = this.cast("autorestarting")
  @scala.inline
  def busy: typingsSlinky.atJupyterlabServices.atJupyterlabServicesStrings.busy = this.cast("busy")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def connected: typingsSlinky.atJupyterlabServices.atJupyterlabServicesStrings.connected = this.cast("connected")
  @scala.inline
  def dead: typingsSlinky.atJupyterlabServices.atJupyterlabServicesStrings.dead = this.cast("dead")
  @scala.inline
  def idle: typingsSlinky.atJupyterlabServices.atJupyterlabServicesStrings.idle = this.cast("idle")
  @scala.inline
  def reconnecting: typingsSlinky.atJupyterlabServices.atJupyterlabServicesStrings.reconnecting = this.cast("reconnecting")
  @scala.inline
  def restarting: typingsSlinky.atJupyterlabServices.atJupyterlabServicesStrings.restarting = this.cast("restarting")
  @scala.inline
  def starting: typingsSlinky.atJupyterlabServices.atJupyterlabServicesStrings.starting = this.cast("starting")
  @scala.inline
  def unknown: typingsSlinky.atJupyterlabServices.atJupyterlabServicesStrings.unknown = this.cast("unknown")
}

