package typingsSlinky.firebaseInstallations.apiResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateInstallationResponse extends js.Object {
  val authToken: GenerateAuthTokenResponse = js.native
  val fid: js.UndefOr[String] = js.native
  val refreshToken: String = js.native
}

object CreateInstallationResponse {
  @scala.inline
  def apply(authToken: GenerateAuthTokenResponse, refreshToken: String): CreateInstallationResponse = {
    val __obj = js.Dynamic.literal(authToken = authToken.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInstallationResponse]
  }
  @scala.inline
  implicit class CreateInstallationResponseOps[Self <: CreateInstallationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthToken(value: GenerateAuthTokenResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefreshToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fid")(js.undefined)
        ret
    }
  }
  
}

