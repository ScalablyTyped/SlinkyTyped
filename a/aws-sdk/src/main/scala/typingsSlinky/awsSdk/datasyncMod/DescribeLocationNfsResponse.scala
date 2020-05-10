package typingsSlinky.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLocationNfsResponse extends js.Object {
  /**
    * The time that the NFS location was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * The Amazon resource Name (ARN) of the NFS location that was described.
    */
  var LocationArn: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.LocationArn] = js.native
  /**
    * The URL of the source NFS location that was described.
    */
  var LocationUri: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.LocationUri] = js.native
  /**
    * The NFS mount options that DataSync used to mount your NFS share.
    */
  var MountOptions: js.UndefOr[NfsMountOptions] = js.native
  var OnPremConfig: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.OnPremConfig] = js.native
}

object DescribeLocationNfsResponse {
  @scala.inline
  def apply(): DescribeLocationNfsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLocationNfsResponse]
  }
  @scala.inline
  implicit class DescribeLocationNfsResponseOps[Self <: DescribeLocationNfsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationArn(value: LocationArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocationArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocationArn")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationUri(value: LocationUri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocationUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocationUri")(js.undefined)
        ret
    }
    @scala.inline
    def withMountOptions(value: NfsMountOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MountOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMountOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MountOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPremConfig(value: OnPremConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnPremConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnPremConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnPremConfig")(js.undefined)
        ret
    }
  }
  
}

