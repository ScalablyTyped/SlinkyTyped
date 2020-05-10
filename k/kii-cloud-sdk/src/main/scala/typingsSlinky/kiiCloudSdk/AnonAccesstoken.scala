package typingsSlinky.kiiCloudSdk

import typingsSlinky.kiiCloudSdk.KiiCloud.KiiSocialConnectOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAccesstoken extends KiiSocialConnectOptions {
  var access_token: String = js.native
  var openID: js.UndefOr[String] = js.native
}

object AnonAccesstoken {
  @scala.inline
  def apply(access_token: String): AnonAccesstoken = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccesstoken]
  }
  @scala.inline
  implicit class AnonAccesstokenOps[Self <: AnonAccesstoken] (val x: Self) extends AnyVal {
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
    def withOpenID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openID")(js.undefined)
        ret
    }
  }
  
}

