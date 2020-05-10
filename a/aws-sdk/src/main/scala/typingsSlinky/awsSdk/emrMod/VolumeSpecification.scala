package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VolumeSpecification extends js.Object {
  /**
    * The number of I/O operations per second (IOPS) that the volume supports.
    */
  var Iops: js.UndefOr[Integer] = js.native
  /**
    * The volume size, in gibibytes (GiB). This can be a number from 1 - 1024. If the volume type is EBS-optimized, the minimum value is 10.
    */
  var SizeInGB: Integer = js.native
  /**
    * The volume type. Volume types supported are gp2, io1, standard.
    */
  var VolumeType: String = js.native
}

object VolumeSpecification {
  @scala.inline
  def apply(SizeInGB: Integer, VolumeType: String): VolumeSpecification = {
    val __obj = js.Dynamic.literal(SizeInGB = SizeInGB.asInstanceOf[js.Any], VolumeType = VolumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[VolumeSpecification]
  }
  @scala.inline
  implicit class VolumeSpecificationOps[Self <: VolumeSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSizeInGB(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SizeInGB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVolumeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIops(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Iops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIops: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Iops")(js.undefined)
        ret
    }
  }
  
}

