package typingsSlinky.dingtalkRobotSender.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseUrlOptions extends js.Object {
  var accessToken: String = js.native
  var baseUrl: String = js.native
  var httpclient: js.UndefOr[js.Any] = js.native
}

object BaseUrlOptions {
  @scala.inline
  def apply(accessToken: String, baseUrl: String): BaseUrlOptions = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], baseUrl = baseUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseUrlOptions]
  }
  @scala.inline
  implicit class BaseUrlOptionsOps[Self <: BaseUrlOptions] (val x: Self) extends AnyVal {
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
    def withBaseUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttpclient(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpclient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpclient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpclient")(js.undefined)
        ret
    }
  }
  
}

