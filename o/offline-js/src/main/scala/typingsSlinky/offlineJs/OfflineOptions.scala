package typingsSlinky.offlineJs

import typingsSlinky.offlineJs.anon.Delay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OfflineOptions extends js.Object {
  // TODO Should these types be `boolean|Function`?
  // The project documentation is not clear here.
  var checkOnLoad: js.UndefOr[Boolean] = js.native
  var checks: js.UndefOr[OfflineChecks] = js.native
  var game: js.UndefOr[Boolean] = js.native
  var interceptRequests: js.UndefOr[Boolean] = js.native
  var reconnect: Delay = js.native
  var requests: js.UndefOr[Boolean] = js.native
}

object OfflineOptions {
  @scala.inline
  def apply(reconnect: Delay): OfflineOptions = {
    val __obj = js.Dynamic.literal(reconnect = reconnect.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfflineOptions]
  }
  @scala.inline
  implicit class OfflineOptionsOps[Self <: OfflineOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReconnect(value: Delay): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckOnLoad(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkOnLoad")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckOnLoad: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkOnLoad")(js.undefined)
        ret
    }
    @scala.inline
    def withChecks(value: OfflineChecks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChecks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checks")(js.undefined)
        ret
    }
    @scala.inline
    def withGame(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("game")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGame: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("game")(js.undefined)
        ret
    }
    @scala.inline
    def withInterceptRequests(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interceptRequests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterceptRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interceptRequests")(js.undefined)
        ret
    }
    @scala.inline
    def withRequests(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requests")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequests: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requests")(js.undefined)
        ret
    }
  }
  
}

