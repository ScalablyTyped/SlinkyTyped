package typingsSlinky.googleAuthLibrary.oauth2clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefreshOptions extends js.Object {
  var eagerRefreshThresholdMillis: js.UndefOr[Double] = js.native
}

object RefreshOptions {
  @scala.inline
  def apply(): RefreshOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshOptions]
  }
  @scala.inline
  implicit class RefreshOptionsOps[Self <: RefreshOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEagerRefreshThresholdMillis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eagerRefreshThresholdMillis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEagerRefreshThresholdMillis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eagerRefreshThresholdMillis")(js.undefined)
        ret
    }
  }
  
}

