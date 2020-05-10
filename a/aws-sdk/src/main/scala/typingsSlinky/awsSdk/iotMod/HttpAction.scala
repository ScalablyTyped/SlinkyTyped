package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpAction extends js.Object {
  /**
    * The authentication method to use when sending data to an HTTPS endpoint.
    */
  var auth: js.UndefOr[HttpAuthorization] = js.native
  /**
    * The URL to which AWS IoT sends a confirmation message. The value of the confirmation URL must be a prefix of the endpoint URL. If you do not specify a confirmation URL AWS IoT uses the endpoint URL as the confirmation URL. If you use substitution templates in the confirmationUrl, you must create and enable topic rule destinations that match each possible value of the substituion template before traffic is allowed to your endpoint URL.
    */
  var confirmationUrl: js.UndefOr[Url] = js.native
  /**
    * The HTTP headers to send with the message data.
    */
  var headers: js.UndefOr[HeaderList] = js.native
  /**
    * The endpoint URL. If substitution templates are used in the URL, you must also specify a confirmationUrl. If this is a new destination, a new TopicRuleDestination is created if possible.
    */
  var url: Url = js.native
}

object HttpAction {
  @scala.inline
  def apply(url: Url): HttpAction = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpAction]
  }
  @scala.inline
  implicit class HttpActionOps[Self <: HttpAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuth(value: HttpAuthorization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withConfirmationUrl(value: Url): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmationUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfirmationUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmationUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: HeaderList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
  }
  
}

