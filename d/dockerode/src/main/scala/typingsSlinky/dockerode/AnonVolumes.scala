package typingsSlinky.dockerode

import typingsSlinky.dockerode.mod.VolumeInspectInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonVolumes extends js.Object {
  var Volumes: js.Array[VolumeInspectInfo] = js.native
  var Warnings: js.Array[String] = js.native
}

object AnonVolumes {
  @scala.inline
  def apply(Volumes: js.Array[VolumeInspectInfo], Warnings: js.Array[String]): AnonVolumes = {
    val __obj = js.Dynamic.literal(Volumes = Volumes.asInstanceOf[js.Any], Warnings = Warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonVolumes]
  }
  @scala.inline
  implicit class AnonVolumesOps[Self <: AnonVolumes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVolumes(value: js.Array[VolumeInspectInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Volumes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWarnings(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Warnings")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

