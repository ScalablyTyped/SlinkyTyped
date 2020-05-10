package typingsSlinky.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowserLegacy extends js.Object {
  var bBounding: Boolean = js.native
  var bScrollOversize: Boolean = js.native
  var bScrollbarLeft: Boolean = js.native
  var barWidth: Double = js.native
}

object BrowserLegacy {
  @scala.inline
  def apply(bBounding: Boolean, bScrollOversize: Boolean, bScrollbarLeft: Boolean, barWidth: Double): BrowserLegacy = {
    val __obj = js.Dynamic.literal(bBounding = bBounding.asInstanceOf[js.Any], bScrollOversize = bScrollOversize.asInstanceOf[js.Any], bScrollbarLeft = bScrollbarLeft.asInstanceOf[js.Any], barWidth = barWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserLegacy]
  }
  @scala.inline
  implicit class BrowserLegacyOps[Self <: BrowserLegacy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBBounding(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bBounding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBScrollOversize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bScrollOversize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBScrollbarLeft(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bScrollbarLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBarWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("barWidth")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

