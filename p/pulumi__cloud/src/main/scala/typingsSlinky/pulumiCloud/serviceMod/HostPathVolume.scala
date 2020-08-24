package typingsSlinky.pulumiCloud.serviceMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostPathVolume extends Volume {
  var kind: typingsSlinky.pulumiCloud.pulumiCloudStrings.HostPathVolume = js.native
  var path: String = js.native
}

@JSImport("@pulumi/cloud/service", "HostPathVolume")
@js.native
object HostPathVolume extends TopLevel[HostPathVolumeConstructor]

