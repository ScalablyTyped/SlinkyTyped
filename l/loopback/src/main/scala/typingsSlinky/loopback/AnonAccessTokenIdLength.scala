package typingsSlinky.loopback

import typingsSlinky.loopback.mod.ACL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAccessTokenIdLength extends js.Object {
  var accessTokenIdLength: Double = js.native
  var acls: js.Array[ACL] = js.native
  var http: AnonPath = js.native
}

object AnonAccessTokenIdLength {
  @scala.inline
  def apply(accessTokenIdLength: Double, acls: js.Array[ACL], http: AnonPath): AnonAccessTokenIdLength = {
    val __obj = js.Dynamic.literal(accessTokenIdLength = accessTokenIdLength.asInstanceOf[js.Any], acls = acls.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccessTokenIdLength]
  }
  @scala.inline
  implicit class AnonAccessTokenIdLengthOps[Self <: AnonAccessTokenIdLength] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessTokenIdLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessTokenIdLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAcls(value: js.Array[ACL]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttp(value: AnonPath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("http")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

