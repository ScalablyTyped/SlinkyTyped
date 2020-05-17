package typingsSlinky.pulumiCloud.serviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pulumiCloud.serviceMod.SharedVolume
  - typingsSlinky.pulumiCloud.serviceMod.HostPathVolume
*/
trait Volume extends js.Object

object Volume {
  @scala.inline
  implicit def apply(value: HostPathVolume): Volume = value.asInstanceOf[Volume]
  @scala.inline
  implicit def apply(value: SharedVolume): Volume = value.asInstanceOf[Volume]
}

