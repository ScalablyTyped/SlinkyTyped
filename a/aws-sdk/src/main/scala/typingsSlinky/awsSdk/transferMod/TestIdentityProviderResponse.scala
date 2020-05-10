package typingsSlinky.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestIdentityProviderResponse extends js.Object {
  /**
    * A message that indicates whether the test was successful or not. 
    */
  var Message: js.UndefOr[typingsSlinky.awsSdk.transferMod.Message] = js.native
  /**
    * The response that is returned from your API Gateway.
    */
  var Response: js.UndefOr[typingsSlinky.awsSdk.transferMod.Response] = js.native
  /**
    * The HTTP status code that is the response from your API Gateway.
    */
  var StatusCode: typingsSlinky.awsSdk.transferMod.StatusCode = js.native
  /**
    * The endpoint of the service used to authenticate a user.
    */
  var Url: typingsSlinky.awsSdk.transferMod.Url = js.native
}

object TestIdentityProviderResponse {
  @scala.inline
  def apply(StatusCode: StatusCode, Url: Url): TestIdentityProviderResponse = {
    val __obj = js.Dynamic.literal(StatusCode = StatusCode.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestIdentityProviderResponse]
  }
  @scala.inline
  implicit class TestIdentityProviderResponseOps[Self <: TestIdentityProviderResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatusCode(value: StatusCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: Message): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(js.undefined)
        ret
    }
    @scala.inline
    def withResponse(value: Response): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Response")(js.undefined)
        ret
    }
  }
  
}

