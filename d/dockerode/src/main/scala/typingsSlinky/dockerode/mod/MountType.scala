package typingsSlinky.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.dockerode.dockerodeStrings.bind
  - typingsSlinky.dockerode.dockerodeStrings.volume
  - typingsSlinky.dockerode.dockerodeStrings.tmpfs
*/
trait MountType extends js.Object

object MountType {
  @scala.inline
  def bind: typingsSlinky.dockerode.dockerodeStrings.bind = this.cast("bind")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def tmpfs: typingsSlinky.dockerode.dockerodeStrings.tmpfs = this.cast("tmpfs")
  @scala.inline
  def volume: typingsSlinky.dockerode.dockerodeStrings.volume = this.cast("volume")
}

