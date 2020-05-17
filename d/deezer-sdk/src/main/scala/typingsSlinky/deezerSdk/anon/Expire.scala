package typingsSlinky.deezerSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Expire extends js.Object {
  var accessToken: String = js.native
  var expire: String = js.native
  var userID: String = js.native
}

object Expire {
  @scala.inline
  def apply(accessToken: String, expire: String, userID: String): Expire = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], expire = expire.asInstanceOf[js.Any], userID = userID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expire]
  }
  @scala.inline
  implicit class ExpireOps[Self <: Expire] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpire(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expire")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

