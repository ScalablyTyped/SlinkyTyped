package typingsSlinky.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollingLegacy extends js.Object {
  var bAutoCss: Boolean = js.native
  var bCollapse: Boolean = js.native
  var bInfinite: Boolean = js.native
  var iBarWidth: Double = js.native
  var iLoadGap: Double = js.native
  var sX: String = js.native
  var sY: String = js.native
}

object ScrollingLegacy {
  @scala.inline
  def apply(
    bAutoCss: Boolean,
    bCollapse: Boolean,
    bInfinite: Boolean,
    iBarWidth: Double,
    iLoadGap: Double,
    sX: String,
    sY: String
  ): ScrollingLegacy = {
    val __obj = js.Dynamic.literal(bAutoCss = bAutoCss.asInstanceOf[js.Any], bCollapse = bCollapse.asInstanceOf[js.Any], bInfinite = bInfinite.asInstanceOf[js.Any], iBarWidth = iBarWidth.asInstanceOf[js.Any], iLoadGap = iLoadGap.asInstanceOf[js.Any], sX = sX.asInstanceOf[js.Any], sY = sY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollingLegacy]
  }
  @scala.inline
  implicit class ScrollingLegacyOps[Self <: ScrollingLegacy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBAutoCss(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bAutoCss")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBCollapse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bCollapse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBInfinite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bInfinite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIBarWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iBarWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withILoadGap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iLoadGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSX(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSY(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sY")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

