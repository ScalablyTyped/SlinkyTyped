package typingsSlinky.chromeApps

import typingsSlinky.chromeApps.chromeAppsStrings.in_
import typingsSlinky.chromeApps.chromeAppsStrings.out_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIN extends js.Object {
  var IN: in_ = js.native
  var OUT: out_ = js.native
}

object AnonIN {
  @scala.inline
  def apply(IN: in_, OUT: out_): AnonIN = {
    val __obj = js.Dynamic.literal(IN = IN.asInstanceOf[js.Any], OUT = OUT.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIN]
  }
  @scala.inline
  implicit class AnonINOps[Self <: AnonIN] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIN(value: in_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOUT(value: out_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OUT")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

