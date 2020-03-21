package typingsSlinky.nssm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nssm.nssmStrings.install
  - typingsSlinky.nssm.nssmStrings.remove
  - typingsSlinky.nssm.nssmStrings.start
  - typingsSlinky.nssm.nssmStrings.stop
  - typingsSlinky.nssm.nssmStrings.restart
  - typingsSlinky.nssm.nssmStrings.status
  - typingsSlinky.nssm.nssmStrings.pause
  - typingsSlinky.nssm.nssmStrings.continue
  - typingsSlinky.nssm.nssmStrings.rotate
  - typingsSlinky.nssm.nssmStrings.get
  - typingsSlinky.nssm.nssmStrings.set
  - typingsSlinky.nssm.nssmStrings.reset
*/
trait Command extends js.Object

object Command {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def continue: typingsSlinky.nssm.nssmStrings.continue = this.cast("continue")
  @scala.inline
  def get: typingsSlinky.nssm.nssmStrings.get = this.cast("get")
  @scala.inline
  def install: typingsSlinky.nssm.nssmStrings.install = this.cast("install")
  @scala.inline
  def pause: typingsSlinky.nssm.nssmStrings.pause = this.cast("pause")
  @scala.inline
  def remove: typingsSlinky.nssm.nssmStrings.remove = this.cast("remove")
  @scala.inline
  def reset: typingsSlinky.nssm.nssmStrings.reset = this.cast("reset")
  @scala.inline
  def restart: typingsSlinky.nssm.nssmStrings.restart = this.cast("restart")
  @scala.inline
  def rotate: typingsSlinky.nssm.nssmStrings.rotate = this.cast("rotate")
  @scala.inline
  def set: typingsSlinky.nssm.nssmStrings.set = this.cast("set")
  @scala.inline
  def start: typingsSlinky.nssm.nssmStrings.start = this.cast("start")
  @scala.inline
  def status: typingsSlinky.nssm.nssmStrings.status = this.cast("status")
  @scala.inline
  def stop: typingsSlinky.nssm.nssmStrings.stop = this.cast("stop")
}

