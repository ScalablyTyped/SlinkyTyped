package typingsSlinky.fridaGum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.fridaGum.fridaGumStrings.running
  - typingsSlinky.fridaGum.fridaGumStrings.stopped
  - typingsSlinky.fridaGum.fridaGumStrings.waiting
  - typingsSlinky.fridaGum.fridaGumStrings.uninterruptible
  - typingsSlinky.fridaGum.fridaGumStrings.halted
*/
trait ThreadState extends js.Object

object ThreadState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def halted: typingsSlinky.fridaGum.fridaGumStrings.halted = this.cast("halted")
  @scala.inline
  def running: typingsSlinky.fridaGum.fridaGumStrings.running = this.cast("running")
  @scala.inline
  def stopped: typingsSlinky.fridaGum.fridaGumStrings.stopped = this.cast("stopped")
  @scala.inline
  def uninterruptible: typingsSlinky.fridaGum.fridaGumStrings.uninterruptible = this.cast("uninterruptible")
  @scala.inline
  def waiting: typingsSlinky.fridaGum.fridaGumStrings.waiting = this.cast("waiting")
}

