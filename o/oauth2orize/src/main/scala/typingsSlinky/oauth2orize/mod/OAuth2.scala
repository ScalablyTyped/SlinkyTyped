package typingsSlinky.oauth2orize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OAuth2 extends js.Object {
  var client: js.Any = js.native
  var info: OAuth2Info = js.native
  var redirectURI: String = js.native
  var req: OAuth2Req = js.native
  var transactionID: String = js.native
  var user: js.Any = js.native
}

object OAuth2 {
  @scala.inline
  def apply(
    client: js.Any,
    info: OAuth2Info,
    redirectURI: String,
    req: OAuth2Req,
    transactionID: String,
    user: js.Any
  ): OAuth2 = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], redirectURI = redirectURI.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], transactionID = transactionID.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuth2]
  }
  @scala.inline
  implicit class OAuth2Ops[Self <: OAuth2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClient(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("client")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfo(value: OAuth2Info): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedirectURI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectURI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReq(value: OAuth2Req): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("req")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransactionID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

