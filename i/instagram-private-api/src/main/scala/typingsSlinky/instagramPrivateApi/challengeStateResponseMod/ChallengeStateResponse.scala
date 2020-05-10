package typingsSlinky.instagramPrivateApi.challengeStateResponseMod

import typingsSlinky.instagramPrivateApi.accountRepositoryLoginResponseMod.AccountRepositoryLoginResponseLoggedInUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChallengeStateResponse extends js.Object {
  var action: String = js.native
  var logged_in_user: js.UndefOr[AccountRepositoryLoginResponseLoggedInUser] = js.native
  var nonce_code: String = js.native
  var status: String = js.native
  var step_data: ChallengeRepositoryStateResponseStepData = js.native
  var step_name: String = js.native
  var user_id: Double = js.native
}

object ChallengeStateResponse {
  @scala.inline
  def apply(
    action: String,
    nonce_code: String,
    status: String,
    step_data: ChallengeRepositoryStateResponseStepData,
    step_name: String,
    user_id: Double
  ): ChallengeStateResponse = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], nonce_code = nonce_code.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], step_data = step_data.asInstanceOf[js.Any], step_name = step_name.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChallengeStateResponse]
  }
  @scala.inline
  implicit class ChallengeStateResponseOps[Self <: ChallengeStateResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNonce_code(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonce_code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStep_data(value: ChallengeRepositoryStateResponseStepData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step_data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStep_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogged_in_user(value: AccountRepositoryLoginResponseLoggedInUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logged_in_user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogged_in_user: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logged_in_user")(js.undefined)
        ret
    }
  }
  
}

