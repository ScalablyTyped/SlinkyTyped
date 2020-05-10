package typingsSlinky.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLocationSmbResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the source SMB file system location that is created.
    */
  var AgentArns: js.UndefOr[AgentArnList] = js.native
  /**
    * The time that the SMB location was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * The name of the Windows domain that the SMB server belongs to.
    */
  var Domain: js.UndefOr[SmbDomain] = js.native
  /**
    * The Amazon resource Name (ARN) of the SMB location that was described.
    */
  var LocationArn: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.LocationArn] = js.native
  /**
    * The URL of the source SBM location that was described.
    */
  var LocationUri: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.LocationUri] = js.native
  /**
    * The mount options that are available for DataSync to use to access an SMB location.
    */
  var MountOptions: js.UndefOr[SmbMountOptions] = js.native
  /**
    * The user who can mount the share, has the permissions to access files and folders in the SMB share.
    */
  var User: js.UndefOr[SmbUser] = js.native
}

object DescribeLocationSmbResponse {
  @scala.inline
  def apply(): DescribeLocationSmbResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLocationSmbResponse]
  }
  @scala.inline
  implicit class DescribeLocationSmbResponseOps[Self <: DescribeLocationSmbResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgentArns(value: AgentArnList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AgentArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgentArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AgentArns")(js.undefined)
        ret
    }
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
    def withDomain(value: SmbDomain): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Domain")(js.undefined)
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
    def withMountOptions(value: SmbMountOptions): Self = {
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
    def withUser(value: SmbUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("User")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("User")(js.undefined)
        ret
    }
  }
  
}

