package typingsSlinky.chrome.anon

import typingsSlinky.chrome.chromeStrings.mixed
import typingsSlinky.chrome.chromeStrings.normal
import typingsSlinky.chrome.chromeStrings.off
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MIXED extends js.Object {
  var MIXED: mixed = js.native
  var NORMAL: normal = js.native
  var OFF: off = js.native
}

object MIXED {
  @scala.inline
  def apply(MIXED: mixed, NORMAL: normal, OFF: off): MIXED = {
    val __obj = js.Dynamic.literal(MIXED = MIXED.asInstanceOf[js.Any], NORMAL = NORMAL.asInstanceOf[js.Any], OFF = OFF.asInstanceOf[js.Any])
    __obj.asInstanceOf[MIXED]
  }
  @scala.inline
  implicit class MIXEDOps[Self <: MIXED] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMIXED(value: mixed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MIXED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNORMAL(value: normal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NORMAL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOFF(value: off): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OFF")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

