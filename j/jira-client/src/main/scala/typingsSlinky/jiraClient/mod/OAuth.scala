package typingsSlinky.jiraClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OAuth extends js.Object {
  var access_token: String = js.native
  var access_token_secret: String = js.native
  var consumer_key: String = js.native
  var consumer_secret: String = js.native
  var signature_method: js.UndefOr[String] = js.native
}

object OAuth {
  @scala.inline
  def apply(access_token: String, access_token_secret: String, consumer_key: String, consumer_secret: String): OAuth = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], access_token_secret = access_token_secret.asInstanceOf[js.Any], consumer_key = consumer_key.asInstanceOf[js.Any], consumer_secret = consumer_secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuth]
  }
  @scala.inline
  implicit class OAuthOps[Self <: OAuth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccess_token(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access_token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAccess_token_secret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("access_token_secret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConsumer_key(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumer_key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConsumer_secret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumer_secret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSignature_method(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature_method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignature_method: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signature_method")(js.undefined)
        ret
    }
  }
  
}

