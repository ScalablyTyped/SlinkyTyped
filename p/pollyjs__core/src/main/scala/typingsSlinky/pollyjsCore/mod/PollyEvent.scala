package typingsSlinky.pollyjsCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pollyjsCore.pollyjsCoreStrings.create
  - typingsSlinky.pollyjsCore.pollyjsCoreStrings.stop
  - typingsSlinky.pollyjsCore.pollyjsCoreStrings.register
*/
trait PollyEvent extends js.Object

object PollyEvent {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def create: typingsSlinky.pollyjsCore.pollyjsCoreStrings.create = this.cast("create")
  @scala.inline
  def register: typingsSlinky.pollyjsCore.pollyjsCoreStrings.register = this.cast("register")
  @scala.inline
  def stop: typingsSlinky.pollyjsCore.pollyjsCoreStrings.stop = this.cast("stop")
}

