package typingsSlinky.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PruneVolumesInfo extends js.Object {
  var SpaceReclaimed: Double = js.native
  var VolumesDeleted: js.Array[String] = js.native
}

object PruneVolumesInfo {
  @scala.inline
  def apply(SpaceReclaimed: Double, VolumesDeleted: js.Array[String]): PruneVolumesInfo = {
    val __obj = js.Dynamic.literal(SpaceReclaimed = SpaceReclaimed.asInstanceOf[js.Any], VolumesDeleted = VolumesDeleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[PruneVolumesInfo]
  }
  @scala.inline
  implicit class PruneVolumesInfoOps[Self <: PruneVolumesInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSpaceReclaimed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpaceReclaimed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVolumesDeleted(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumesDeleted")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

