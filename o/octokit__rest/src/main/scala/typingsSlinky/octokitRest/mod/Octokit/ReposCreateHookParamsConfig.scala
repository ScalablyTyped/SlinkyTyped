package typingsSlinky.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReposCreateHookParamsConfig extends js.Object {
  var content_type: js.UndefOr[String] = js.native
  var insecure_ssl: js.UndefOr[String] = js.native
  var secret: js.UndefOr[String] = js.native
  var url: String = js.native
}

object ReposCreateHookParamsConfig {
  @scala.inline
  def apply(url: String): ReposCreateHookParamsConfig = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCreateHookParamsConfig]
  }
  @scala.inline
  implicit class ReposCreateHookParamsConfigOps[Self <: ReposCreateHookParamsConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_type")(js.undefined)
        ret
    }
    @scala.inline
    def withInsecure_ssl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insecure_ssl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsecure_ssl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insecure_ssl")(js.undefined)
        ret
    }
    @scala.inline
    def withSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secret")(js.undefined)
        ret
    }
  }
  
}

