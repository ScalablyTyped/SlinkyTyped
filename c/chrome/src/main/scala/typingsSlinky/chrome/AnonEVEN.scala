package typingsSlinky.chrome

import typingsSlinky.chrome.chromeStrings.even
import typingsSlinky.chrome.chromeStrings.no
import typingsSlinky.chrome.chromeStrings.odd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEVEN extends js.Object {
  var EVEN: even = js.native
  var NO: no = js.native
  var ODD: odd = js.native
}

object AnonEVEN {
  @scala.inline
  def apply(EVEN: even, NO: no, ODD: odd): AnonEVEN = {
    val __obj = js.Dynamic.literal(EVEN = EVEN.asInstanceOf[js.Any], NO = NO.asInstanceOf[js.Any], ODD = ODD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEVEN]
  }
  @scala.inline
  implicit class AnonEVENOps[Self <: AnonEVEN] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEVEN(value: even): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EVEN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNO(value: no): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NO")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withODD(value: odd): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ODD")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

