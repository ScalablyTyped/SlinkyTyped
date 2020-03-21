package typingsSlinky.pulumiCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/cloud", "HostPathVolume")
@js.native
class HostPathVolumeCls protected ()
  extends typingsSlinky.pulumiCloud.serviceMod.HostPathVolume {
  /**
    * Construct a new Volume with the given unique name.
    */
  def this(path: String) = this()
  /* CompleteClass */
  override var kind: typingsSlinky.pulumiCloud.pulumiCloudStrings.HostPathVolume = js.native
  /* CompleteClass */
  override var path: String = js.native
}

