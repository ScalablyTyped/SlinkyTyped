package typingsSlinky.firebaseMessaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonApplicationPubKey extends js.Object {
  var applicationPubKey: js.UndefOr[String] = js.native
  var auth: String = js.native
  var endpoint: String = js.native
  var p256dh: String = js.native
}

object AnonApplicationPubKey {
  @scala.inline
  def apply(auth: String, endpoint: String, p256dh: String): AnonApplicationPubKey = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], p256dh = p256dh.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonApplicationPubKey]
  }
  @scala.inline
  implicit class AnonApplicationPubKeyOps[Self <: AnonApplicationPubKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withP256dh(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("p256dh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplicationPubKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationPubKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationPubKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationPubKey")(js.undefined)
        ret
    }
  }
  
}

