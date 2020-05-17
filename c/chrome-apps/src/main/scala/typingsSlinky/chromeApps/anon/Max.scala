package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chromeAppsStrings.tls1
import typingsSlinky.chromeApps.chromeAppsStrings.tls1Dot1
import typingsSlinky.chromeApps.chromeAppsStrings.tls1Dot2
import typingsSlinky.chromeApps.chromeAppsStrings.tls1Dot3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Max extends js.Object {
  var max: js.UndefOr[tls1 | tls1Dot1 | tls1Dot2 | tls1Dot3] = js.native
  var min: js.UndefOr[tls1 | tls1Dot1 | tls1Dot2 | tls1Dot3] = js.native
}

object Max {
  @scala.inline
  def apply(): Max = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Max]
  }
  @scala.inline
  implicit class MaxOps[Self <: Max] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMax(value: tls1 | tls1Dot1 | tls1Dot2 | tls1Dot3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: tls1 | tls1Dot1 | tls1Dot2 | tls1Dot3): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
  }
  
}

