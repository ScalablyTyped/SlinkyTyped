package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EBSOptions extends js.Object {
  /**
    * Specifies whether EBS-based storage is enabled.
    */
  var EBSEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the IOPD for a Provisioned IOPS EBS volume (SSD).
    */
  var Iops: js.UndefOr[IntegerClass] = js.native
  /**
    *  Integer to specify the size of an EBS volume.
    */
  var VolumeSize: js.UndefOr[IntegerClass] = js.native
  /**
    *  Specifies the volume type for EBS-based storage.
    */
  var VolumeType: js.UndefOr[typingsSlinky.awsSdk.esMod.VolumeType] = js.native
}

object EBSOptions {
  @scala.inline
  def apply(): EBSOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EBSOptions]
  }
  @scala.inline
  implicit class EBSOptionsOps[Self <: EBSOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEBSEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EBSEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEBSEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EBSEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withIops(value: IntegerClass): Self = {
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
    @scala.inline
    def withVolumeSize(value: IntegerClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeSize")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeType(value: VolumeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VolumeType")(js.undefined)
        ret
    }
  }
  
}

