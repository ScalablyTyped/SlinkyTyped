package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserProfileDetails extends js.Object {
  /**
    * The creation time.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * The domain ID.
    */
  var DomainId: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.DomainId] = js.native
  /**
    * The last modified time.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.native
  /**
    * The status.
    */
  var Status: js.UndefOr[UserProfileStatus] = js.native
  /**
    * The user profile name.
    */
  var UserProfileName: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.UserProfileName] = js.native
}

object UserProfileDetails {
  @scala.inline
  def apply(): UserProfileDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserProfileDetails]
  }
  @scala.inline
  implicit class UserProfileDetailsOps[Self <: UserProfileDetails] (val x: Self) extends AnyVal {
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
  }
  
}

