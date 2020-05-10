package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserContext extends js.Object {
  /**
    * The domain associated with the user.
    */
  var DomainId: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the user's profile.
    */
  var UserProfileArn: js.UndefOr[String] = js.native
  /**
    * The name of the user's profile.
    */
  var UserProfileName: js.UndefOr[String] = js.native
}

object UserContext {
  @scala.inline
  def apply(): UserContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserContext]
  }
  @scala.inline
  implicit class UserContextOps[Self <: UserContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainId(value: String): Self = {
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
    def withUserProfileArn(value: String): Self = {
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
    def withUserProfileName(value: String): Self = {
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

