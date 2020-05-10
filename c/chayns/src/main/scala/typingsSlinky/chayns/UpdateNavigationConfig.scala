package typingsSlinky.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.updateNavigation()
@js.native
trait UpdateNavigationConfig extends js.Object {
  var stateOnly: js.UndefOr[Boolean] = js.native
  var updateTapp: js.UndefOr[Boolean] = js.native
}

object UpdateNavigationConfig {
  @scala.inline
  def apply(): UpdateNavigationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateNavigationConfig]
  }
  @scala.inline
  implicit class UpdateNavigationConfigOps[Self <: UpdateNavigationConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStateOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateTapp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTapp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateTapp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateTapp")(js.undefined)
        ret
    }
  }
  
}

