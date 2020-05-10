package typingsSlinky.reactFns.windowSizeWindowSizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowSizeConfig extends js.Object {
  var throttle: js.UndefOr[Double] = js.native
}

object WindowSizeConfig {
  @scala.inline
  def apply(): WindowSizeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowSizeConfig]
  }
  @scala.inline
  implicit class WindowSizeConfigOps[Self <: WindowSizeConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withThrottle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrottle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttle")(js.undefined)
        ret
    }
  }
  
}

