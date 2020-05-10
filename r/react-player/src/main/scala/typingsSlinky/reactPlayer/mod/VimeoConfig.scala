package typingsSlinky.reactPlayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VimeoConfig extends js.Object {
  var playerOptions: js.UndefOr[js.Object] = js.native
  var preload: js.UndefOr[Boolean] = js.native
}

object VimeoConfig {
  @scala.inline
  def apply(): VimeoConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VimeoConfig]
  }
  @scala.inline
  implicit class VimeoConfigOps[Self <: VimeoConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlayerOptions(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playerOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlayerOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playerOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withPreload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preload")(js.undefined)
        ret
    }
  }
  
}

