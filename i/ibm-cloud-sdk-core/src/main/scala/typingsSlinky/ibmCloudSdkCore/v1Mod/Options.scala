package typingsSlinky.ibmCloudSdkCore.v1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var iamAccessToken: js.UndefOr[String] = js.native
  var iamApikey: js.UndefOr[String] = js.native
  var iamUrl: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIamAccessToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamAccessToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamAccessToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamAccessToken")(js.undefined)
        ret
    }
    @scala.inline
    def withIamApikey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamApikey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamApikey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamApikey")(js.undefined)
        ret
    }
    @scala.inline
    def withIamUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIamUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iamUrl")(js.undefined)
        ret
    }
  }
  
}

