package typingsSlinky.gitlab.baseServiceMod

import typingsSlinky.gitlab.gitlabNumbers.`3`
import typingsSlinky.gitlab.gitlabNumbers.`4`
import typingsSlinky.gitlab.gitlabStrings.execution
import typingsSlinky.gitlab.gitlabStrings.memory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseServiceOptions extends js.Object {
  var camelize: js.UndefOr[Boolean] = js.native
  var host: js.UndefOr[String] = js.native
  var jobToken: js.UndefOr[String] = js.native
  var oauthToken: js.UndefOr[String] = js.native
  var profileMode: js.UndefOr[execution | memory] = js.native
  var profileToken: js.UndefOr[String] = js.native
  var rejectUnauthorized: js.UndefOr[Boolean] = js.native
  var requestTimeout: js.UndefOr[Double] = js.native
  var requester: js.UndefOr[Requester] = js.native
  var sudo: js.UndefOr[String | Double] = js.native
  var token: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
  var version: js.UndefOr[`3` | `4`] = js.native
}

object BaseServiceOptions {
  @scala.inline
  def apply(): BaseServiceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseServiceOptions]
  }
  @scala.inline
  implicit class BaseServiceOptionsOps[Self <: BaseServiceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCamelize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camelize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCamelize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camelize")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withJobToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJobToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jobToken")(js.undefined)
        ret
    }
    @scala.inline
    def withOauthToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauthToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOauthToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oauthToken")(js.undefined)
        ret
    }
    @scala.inline
    def withProfileMode(value: execution | memory): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileMode")(js.undefined)
        ret
    }
    @scala.inline
    def withProfileToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileToken")(js.undefined)
        ret
    }
    @scala.inline
    def withRejectUnauthorized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectUnauthorized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRejectUnauthorized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejectUnauthorized")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withRequester(value: Requester): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requester")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequester: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requester")(js.undefined)
        ret
    }
    @scala.inline
    def withSudo(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sudo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSudo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sudo")(js.undefined)
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
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: `3` | `4`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

