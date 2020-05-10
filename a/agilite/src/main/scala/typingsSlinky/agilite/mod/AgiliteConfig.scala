package typingsSlinky.agilite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgiliteConfig extends js.Object {
  var apiKey: js.UndefOr[String] = js.native
  var apiServerUrl: js.UndefOr[String] = js.native
  var teamId: js.UndefOr[String] = js.native
}

object AgiliteConfig {
  @scala.inline
  def apply(): AgiliteConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgiliteConfig]
  }
  @scala.inline
  implicit class AgiliteConfigOps[Self <: AgiliteConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApiKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiKey")(js.undefined)
        ret
    }
    @scala.inline
    def withApiServerUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiServerUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApiServerUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("apiServerUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withTeamId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTeamId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("teamId")(js.undefined)
        ret
    }
  }
  
}

