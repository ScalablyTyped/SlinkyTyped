package typingsSlinky.pulumiCloud.serviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pulumiCloud.pulumiCloudStrings.SharedVolume
  - typingsSlinky.pulumiCloud.pulumiCloudStrings.HostPathVolume
*/
trait VolumeKind extends js.Object

object VolumeKind {
  @scala.inline
  def HostPathVolume: typingsSlinky.pulumiCloud.pulumiCloudStrings.HostPathVolume = this.cast("HostPathVolume")
  @scala.inline
  def SharedVolume: typingsSlinky.pulumiCloud.pulumiCloudStrings.SharedVolume = this.cast("SharedVolume")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

