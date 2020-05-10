package typingsSlinky.restify.mod.plugins

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThrottleOptions extends js.Object {
  var burst: js.UndefOr[Double] = js.native
  var ip: js.UndefOr[Boolean] = js.native
  var maxKeys: js.UndefOr[Double] = js.native
  var overrides: js.UndefOr[js.Any] = js.native
  var rate: js.UndefOr[Double] = js.native
  var setHeaders: js.UndefOr[Boolean] = js.native
  var tokensTable: js.UndefOr[js.Any] = js.native
  var username: js.UndefOr[Boolean] = js.native
  var xff: js.UndefOr[Boolean] = js.native
}

object ThrottleOptions {
  @scala.inline
  def apply(): ThrottleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThrottleOptions]
  }
  @scala.inline
  implicit class ThrottleOptionsOps[Self <: ThrottleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBurst(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("burst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBurst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("burst")(js.undefined)
        ret
    }
    @scala.inline
    def withIp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxKeys(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrides(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrides")(js.undefined)
        ret
    }
    @scala.inline
    def withRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rate")(js.undefined)
        ret
    }
    @scala.inline
    def withSetHeaders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withTokensTable(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokensTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTokensTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tokensTable")(js.undefined)
        ret
    }
    @scala.inline
    def withUsername(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUsername: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(js.undefined)
        ret
    }
    @scala.inline
    def withXff(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXff: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xff")(js.undefined)
        ret
    }
  }
  
}

