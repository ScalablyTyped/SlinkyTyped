package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVolumesRequest extends js.Object {
  /**
    * The instance ID. If you use this parameter, DescribeVolumes returns descriptions of the volumes associated with the specified instance.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * The RAID array ID. If you use this parameter, DescribeVolumes returns descriptions of the volumes associated with the specified RAID array.
    */
  var RaidArrayId: js.UndefOr[String] = js.native
  /**
    * A stack ID. The action describes the stack's registered Amazon EBS volumes.
    */
  var StackId: js.UndefOr[String] = js.native
  /**
    * Am array of volume IDs. If you use this parameter, DescribeVolumes returns descriptions of the specified volumes. Otherwise, it returns a description of every volume.
    */
  var VolumeIds: js.UndefOr[Strings] = js.native
}

object DescribeVolumesRequest {
  @scala.inline
  def apply(): DescribeVolumesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVolumesRequest]
  }
  @scala.inline
  implicit class DescribeVolumesRequestOps[Self <: DescribeVolumesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(js.undefined)
        ret
    }
    @scala.inline
    def withRaidArrayId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RaidArrayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRaidArrayId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RaidArrayId")(js.undefined)
        ret
    }
    @scala.inline
    def withStackId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackId")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeIds(value: Strings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeIds")(js.undefined)
        ret
    }
  }
  
}

