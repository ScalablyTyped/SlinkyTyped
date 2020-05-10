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
  def bind: typingsSlinky.dockerode.dockerodeStrings.bind = "bind".asInstanceOf[typingsSlinky.dockerode.dockerodeStrings.bind]
  @scala.inline
  def tmpfs: typingsSlinky.dockerode.dockerodeStrings.tmpfs = "tmpfs".asInstanceOf[typingsSlinky.dockerode.dockerodeStrings.tmpfs]
  @scala.inline
  def volume: typingsSlinky.dockerode.dockerodeStrings.volume = "volume".asInstanceOf[typingsSlinky.dockerode.dockerodeStrings.volume]
}

