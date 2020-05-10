package typingsSlinky.openfin.applicationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShortCutConfig extends js.Object {
  var desktop: js.UndefOr[Boolean] = js.native
  var startMenu: js.UndefOr[Boolean] = js.native
  var systemStartup: js.UndefOr[Boolean] = js.native
}

object ShortCutConfig {
  @scala.inline
  def apply(): ShortCutConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShortCutConfig]
  }
  @scala.inline
  implicit class ShortCutConfigOps[Self <: ShortCutConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDesktop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesktop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktop")(js.undefined)
        ret
    }
    @scala.inline
    def withStartMenu(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withSystemStartup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemStartup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSystemStartup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemStartup")(js.undefined)
        ret
    }
  }
  
}

