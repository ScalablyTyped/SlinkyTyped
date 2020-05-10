package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAppRequest extends js.Object {
  /**
    * The name of the app.
    */
  var AppName: typingsSlinky.awsSdk.sagemakerMod.AppName = js.native
  /**
    * The type of app.
    */
  var AppType: typingsSlinky.awsSdk.sagemakerMod.AppType = js.native
  /**
    * The domain ID.
    */
  var DomainId: typingsSlinky.awsSdk.sagemakerMod.DomainId = js.native
  /**
    * The user profile name.
    */
  var UserProfileName: typingsSlinky.awsSdk.sagemakerMod.UserProfileName = js.native
}

object DescribeAppRequest {
  @scala.inline
  def apply(AppName: AppName, AppType: AppType, DomainId: DomainId, UserProfileName: UserProfileName): DescribeAppRequest = {
    val __obj = js.Dynamic.literal(AppName = AppName.asInstanceOf[js.Any], AppType = AppType.asInstanceOf[js.Any], DomainId = DomainId.asInstanceOf[js.Any], UserProfileName = UserProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAppRequest]
  }
  @scala.inline
  implicit class DescribeAppRequestOps[Self <: DescribeAppRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppName(value: AppName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppType(value: AppType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomainId(value: DomainId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserProfileName(value: UserProfileName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserProfileName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

