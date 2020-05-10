package typingsSlinky.paypalRestSdk.mod.payment

import typingsSlinky.paypalRestSdk.mod.Amount
import typingsSlinky.paypalRestSdk.mod.AuthorizationResource
import typingsSlinky.paypalRestSdk.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizationResponse
  extends AuthorizationResource
     with Response {
  /* InferMemberOverrides */
  override val create_time: js.UndefOr[String] = js.native
}

object AuthorizationResponse {
  @scala.inline
  def apply(amount: Amount, httpStatusCode: Double, id: String, update_time: String, valid_until: String): AuthorizationResponse = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], httpStatusCode = httpStatusCode.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], update_time = update_time.asInstanceOf[js.Any], valid_until = valid_until.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizationResponse]
  }
  @scala.inline
  implicit class AuthorizationResponseOps[Self <: AuthorizationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate_time(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create_time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreate_time: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create_time")(js.undefined)
        ret
    }
  }
  
}

