package typingsSlinky.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLocationFsxWindowsResponse extends js.Object {
  /**
    * The time that the FSx for Windows location was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * The name of the Windows domain that the FSx for Windows server belongs to.
    */
  var Domain: js.UndefOr[SmbDomain] = js.native
  /**
    * The Amazon resource Name (ARN) of the FSx for Windows location that was described.
    */
  var LocationArn: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.LocationArn] = js.native
  /**
    * The URL of the FSx for Windows location that was described.
    */
  var LocationUri: js.UndefOr[typingsSlinky.awsSdk.datasyncMod.LocationUri] = js.native
  /**
    * The Amazon Resource Names (ARNs) of the security groups that are configured for the for the FSx for Windows file system.
    */
  var SecurityGroupArns: js.UndefOr[Ec2SecurityGroupArnList] = js.native
  /**
    * The user who has the permissions to access files and folders in the FSx for Windows file system.
    */
  var User: js.UndefOr[SmbUser] = js.native
}

object DescribeLocationFsxWindowsResponse {
  @scala.inline
  def apply(): DescribeLocationFsxWindowsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLocationFsxWindowsResponse]
  }
  @scala.inline
  implicit class DescribeLocationFsxWindowsResponseOps[Self <: DescribeLocationFsxWindowsResponse] (val x: Self) extends AnyVal {
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
    def withSecurityGroupArns(value: Ec2SecurityGroupArnList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroupArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroupArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroupArns")(js.undefined)
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

