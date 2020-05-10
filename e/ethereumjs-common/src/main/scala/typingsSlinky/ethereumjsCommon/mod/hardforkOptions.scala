package typingsSlinky.ethereumjsCommon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait hardforkOptions extends js.Object {
  /** optional, only active HFs (default: false) */
  var onlyActive: js.UndefOr[Boolean] = js.native
  /** optional, only allow supported HFs (default: false) */
  var onlySupported: js.UndefOr[Boolean] = js.native
}

object hardforkOptions {
  @scala.inline
  def apply(): hardforkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[hardforkOptions]
  }
  @scala.inline
  implicit class hardforkOptionsOps[Self <: hardforkOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnlyActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyActive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlyActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlyActive")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlySupported(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlySupported")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnlySupported: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlySupported")(js.undefined)
        ret
    }
  }
  
}

