package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePresignedDomainUrlRequest extends js.Object {
  /**
    * The domain ID.
    */
  var DomainId: typingsSlinky.awsSdk.sagemakerMod.DomainId = js.native
  /**
    * The session expiration duration in seconds.
    */
  var SessionExpirationDurationInSeconds: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.SessionExpirationDurationInSeconds] = js.native
  /**
    * The name of the UserProfile to sign-in as.
    */
  var UserProfileName: typingsSlinky.awsSdk.sagemakerMod.UserProfileName = js.native
}

object CreatePresignedDomainUrlRequest {
  @scala.inline
  def apply(DomainId: DomainId, UserProfileName: UserProfileName): CreatePresignedDomainUrlRequest = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any], UserProfileName = UserProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePresignedDomainUrlRequest]
  }
  @scala.inline
  implicit class CreatePresignedDomainUrlRequestOps[Self <: CreatePresignedDomainUrlRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    @scala.inline
    def withSessionExpirationDurationInSeconds(value: SessionExpirationDurationInSeconds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SessionExpirationDurationInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionExpirationDurationInSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SessionExpirationDurationInSeconds")(js.undefined)
        ret
    }
  }
  
}

