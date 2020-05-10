package typingsSlinky.reactFns.networkNetworkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkProps extends js.Object {
  var offlineAt: js.UndefOr[js.Date] = js.native
  var online: Boolean = js.native
}

object NetworkProps {
  @scala.inline
  def apply(online: Boolean): NetworkProps = {
    val __obj = js.Dynamic.literal(online = online.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkProps]
  }
  @scala.inline
  implicit class NetworkPropsOps[Self <: NetworkProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("online")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOfflineAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offlineAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfflineAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offlineAt")(js.undefined)
        ret
    }
  }
  
}

