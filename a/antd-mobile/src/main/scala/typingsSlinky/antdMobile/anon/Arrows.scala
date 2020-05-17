package typingsSlinky.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Arrows extends js.Object {
  var arrows: Boolean = js.native
  var autoplay: Boolean = js.native
  var cellAlign: String = js.native
  var dots: Boolean = js.native
  var infinite: Boolean = js.native
  var prefixCls: String = js.native
  var selectedIndex: Double = js.native
}

object Arrows {
  @scala.inline
  def apply(
    arrows: Boolean,
    autoplay: Boolean,
    cellAlign: String,
    dots: Boolean,
    infinite: Boolean,
    prefixCls: String,
    selectedIndex: Double
  ): Arrows = {
    val __obj = js.Dynamic.literal(arrows = arrows.asInstanceOf[js.Any], autoplay = autoplay.asInstanceOf[js.Any], cellAlign = cellAlign.asInstanceOf[js.Any], dots = dots.asInstanceOf[js.Any], infinite = infinite.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], selectedIndex = selectedIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arrows]
  }
  @scala.inline
  implicit class ArrowsOps[Self <: Arrows] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoplay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoplay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDots(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfinite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infinite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedIndex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

