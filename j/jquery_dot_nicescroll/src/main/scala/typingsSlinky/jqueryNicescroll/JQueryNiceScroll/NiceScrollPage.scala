package typingsSlinky.jqueryNicescroll.JQueryNiceScroll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NiceScrollPage extends js.Object {
  var h: Double = js.native
  var height: Double = js.native
  var maxh: Double = js.native
  var maxw: Double = js.native
  var w: Double = js.native
  var width: Double = js.native
}

object NiceScrollPage {
  @scala.inline
  def apply(h: Double, height: Double, maxh: Double, maxw: Double, w: Double, width: Double): NiceScrollPage = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], maxh = maxh.asInstanceOf[js.Any], maxw = maxw.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[NiceScrollPage]
  }
  @scala.inline
  implicit class NiceScrollPageOps[Self <: NiceScrollPage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withH(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("h")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxh(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxh")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxw(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxw")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withW(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("w")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

