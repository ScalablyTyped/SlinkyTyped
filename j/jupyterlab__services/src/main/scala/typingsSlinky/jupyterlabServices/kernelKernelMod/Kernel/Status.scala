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
  def autorestarting: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.autorestarting = "autorestarting".asInstanceOf[typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.autorestarting]
  @scala.inline
  def busy: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.busy = "busy".asInstanceOf[typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.busy]
  @scala.inline
  def connected: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.connected = "connected".asInstanceOf[typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.connected]
  @scala.inline
  def dead: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.dead = "dead".asInstanceOf[typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.dead]
  @scala.inline
  def idle: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.idle = "idle".asInstanceOf[typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.idle]
  @scala.inline
  def reconnecting: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.reconnecting = "reconnecting".asInstanceOf[typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.reconnecting]
  @scala.inline
  def restarting: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.restarting = "restarting".asInstanceOf[typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.restarting]
  @scala.inline
  def starting: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.starting = "starting".asInstanceOf[typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.starting]
  @scala.inline
  def unknown: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.unknown = "unknown".asInstanceOf[typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.unknown]
}

