package typingsSlinky.request.mod

import typingsSlinky.request.requestBooleans.`true`
import typingsSlinky.request.requestStrings.body
import typingsSlinky.request.requestStrings.header
import typingsSlinky.request.requestStrings.query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OAuthOptions extends js.Object {
  var body_hash: js.UndefOr[`true` | String] = js.native
  var callback: js.UndefOr[String] = js.native
  var consumer_key: js.UndefOr[String] = js.native
  var consumer_secret: js.UndefOr[String] = js.native
  var token: js.UndefOr[String] = js.native
  var token_secret: js.UndefOr[String] = js.native
  var transport_method: js.UndefOr[body | header | query] = js.native
  var verifier: js.UndefOr[String] = js.native
}

object OAuthOptions {
  @scala.inline
  def apply(): OAuthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OAuthOptions]
  }
  @scala.inline
  implicit class OAuthOptionsOps[Self <: OAuthOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody_hash(value: `true` | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body_hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBody_hash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body_hash")(js.undefined)
        ret
    }
    @scala.inline
    def withCallback(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withConsumer_key(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumer_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsumer_key: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumer_key")(js.undefined)
        ret
    }
    @scala.inline
    def withConsumer_secret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumer_secret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsumer_secret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumer_secret")(js.undefined)
        ret
    }
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(js.undefined)
        ret
    }
    @scala.inline
    def withToken_secret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_secret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken_secret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token_secret")(js.undefined)
        ret
    }
    @scala.inline
    def withTransport_method(value: body | header | query): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transport_method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransport_method: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transport_method")(js.undefined)
        ret
    }
    @scala.inline
    def withVerifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifier")(js.undefined)
        ret
    }
  }
  
}

