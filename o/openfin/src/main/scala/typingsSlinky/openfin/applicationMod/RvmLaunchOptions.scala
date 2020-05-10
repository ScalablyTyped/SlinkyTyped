package typingsSlinky.openfin.applicationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RvmLaunchOptions extends js.Object {
  var noUi: js.UndefOr[Boolean] = js.native
  var userAppConfigArgs: js.UndefOr[js.Object] = js.native
}

object RvmLaunchOptions {
  @scala.inline
  def apply(): RvmLaunchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RvmLaunchOptions]
  }
  @scala.inline
  implicit class RvmLaunchOptionsOps[Self <: RvmLaunchOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNoUi(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noUi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoUi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noUi")(js.undefined)
        ret
    }
    @scala.inline
    def withUserAppConfigArgs(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAppConfigArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserAppConfigArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAppConfigArgs")(js.undefined)
        ret
    }
  }
  
}

