package typingsSlinky.inAppPurchase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonClientEmail extends js.Object {
  // client email from Google API service account JSON key file
  var clientEmail: String = js.native
  // private key string from Google API service account JSON key file
  var privateKey: String = js.native
}

object AnonClientEmail {
  @scala.inline
  def apply(clientEmail: String, privateKey: String): AnonClientEmail = {
    val __obj = js.Dynamic.literal(clientEmail = clientEmail.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClientEmail]
  }
  @scala.inline
  implicit class AnonClientEmailOps[Self <: AnonClientEmail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientEmail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivateKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

