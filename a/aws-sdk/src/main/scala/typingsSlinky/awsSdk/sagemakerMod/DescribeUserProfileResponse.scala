package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUserProfileResponse extends js.Object {
  /**
    * The creation time.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * The domain ID.
    */
  var DomainId: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.DomainId] = js.native
  /**
    * The failure reason.
    */
  var FailureReason: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.FailureReason] = js.native
  /**
    * The homa Amazon Elastic File System (EFS) Uid.
    */
  var HomeEfsFileSystemUid: js.UndefOr[EfsUid] = js.native
  /**
    * The last modified time.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.native
  /**
    * The SSO user identifier.
    */
  var SingleSignOnUserIdentifier: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.SingleSignOnUserIdentifier] = js.native
  /**
    * The SSO user value.
    */
  var SingleSignOnUserValue: js.UndefOr[String256] = js.native
  /**
    * The status.
    */
  var Status: js.UndefOr[UserProfileStatus] = js.native
  /**
    * The user profile Amazon Resource Name (ARN).
    */
  var UserProfileArn: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.UserProfileArn] = js.native
  /**
    * The user profile name.
    */
  var UserProfileName: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.UserProfileName] = js.native
  /**
    * A collection of settings.
    */
  var UserSettings: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.UserSettings] = js.native
}

object DescribeUserProfileResponse {
  @scala.inline
  def apply(): DescribeUserProfileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUserProfileResponse]
  }
  @scala.inline
  implicit class DescribeUserProfileResponseOps[Self <: DescribeUserProfileResponse] (val x: Self) extends AnyVal {
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
    def withDomainId(value: DomainId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainId")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureReason(value: FailureReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailureReason")(js.undefined)
        ret
    }
    @scala.inline
    def withHomeEfsFileSystemUid(value: EfsUid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HomeEfsFileSystemUid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHomeEfsFileSystemUid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HomeEfsFileSystemUid")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleSignOnUserIdentifier(value: SingleSignOnUserIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SingleSignOnUserIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleSignOnUserIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SingleSignOnUserIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleSignOnUserValue(value: String256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SingleSignOnUserValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleSignOnUserValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SingleSignOnUserValue")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: UserProfileStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withUserProfileArn(value: UserProfileArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserProfileArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserProfileArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserProfileArn")(js.undefined)
        ret
    }
    @scala.inline
    def withUserProfileName(value: UserProfileName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserProfileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserProfileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserProfileName")(js.undefined)
        ret
    }
    @scala.inline
    def withUserSettings(value: UserSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserSettings")(js.undefined)
        ret
    }
  }
  
}

