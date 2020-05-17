package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chromeAppsStrings.bottom_
import typingsSlinky.chromeApps.chromeAppsStrings.left_
import typingsSlinky.chromeApps.chromeAppsStrings.right_
import typingsSlinky.chromeApps.chromeAppsStrings.top_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BOTTOM extends js.Object {
  var BOTTOM: bottom_ = js.native
  var LEFT: left_ = js.native
  var RIGHT: right_ = js.native
  var TOP: top_ = js.native
}

object BOTTOM {
  @scala.inline
  def apply(BOTTOM: bottom_, LEFT: left_, RIGHT: right_, TOP: top_): BOTTOM = {
    val __obj = js.Dynamic.literal(BOTTOM = BOTTOM.asInstanceOf[js.Any], LEFT = LEFT.asInstanceOf[js.Any], RIGHT = RIGHT.asInstanceOf[js.Any], TOP = TOP.asInstanceOf[js.Any])
    __obj.asInstanceOf[BOTTOM]
  }
  @scala.inline
  implicit class BOTTOMOps[Self <: BOTTOM] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBOTTOM(value: bottom_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BOTTOM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLEFT(value: left_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LEFT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRIGHT(value: right_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RIGHT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTOP(value: top_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TOP")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

