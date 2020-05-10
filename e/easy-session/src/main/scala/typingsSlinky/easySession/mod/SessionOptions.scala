package typingsSlinky.easySession.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionOptions extends js.Object {
  var freshTimeout: js.UndefOr[Double] = js.native
  var ipCheck: js.UndefOr[Boolean] = js.native
  var maxFreshTimeout: js.UndefOr[Double] = js.native
  var uaCheck: js.UndefOr[Boolean] = js.native
}

object SessionOptions {
  @scala.inline
  def apply(): SessionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionOptions]
  }
  @scala.inline
  implicit class SessionOptionsOps[Self <: SessionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFreshTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freshTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFreshTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("freshTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withIpCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipCheck")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFreshTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFreshTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFreshTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFreshTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withUaCheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uaCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUaCheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uaCheck")(js.undefined)
        ret
    }
  }
  
}

