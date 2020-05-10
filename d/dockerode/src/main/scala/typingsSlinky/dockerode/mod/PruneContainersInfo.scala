package typingsSlinky.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PruneContainersInfo extends js.Object {
  var ContainersDeleted: js.Array[String] = js.native
  var SpaceReclaimed: Double = js.native
}

object PruneContainersInfo {
  @scala.inline
  def apply(ContainersDeleted: js.Array[String], SpaceReclaimed: Double): PruneContainersInfo = {
    val __obj = js.Dynamic.literal(ContainersDeleted = ContainersDeleted.asInstanceOf[js.Any], SpaceReclaimed = SpaceReclaimed.asInstanceOf[js.Any])
    __obj.asInstanceOf[PruneContainersInfo]
  }
  @scala.inline
  implicit class PruneContainersInfoOps[Self <: PruneContainersInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainersDeleted(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContainersDeleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpaceReclaimed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpaceReclaimed")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

