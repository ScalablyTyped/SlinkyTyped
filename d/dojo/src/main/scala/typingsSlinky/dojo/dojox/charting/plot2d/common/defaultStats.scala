package typingsSlinky.dojo.dojox.charting.plot2d.common

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/plot2d/common.defaultStats.html
  *
  *
  */
@js.native
trait defaultStats extends js.Object {
  /**
    *
    */
  var hmax: js.Object = js.native
  /**
    *
    */
  var hmin: js.Object = js.native
  /**
    *
    */
  var vmax: js.Object = js.native
  /**
    *
    */
  var vmin: js.Object = js.native
}

object defaultStats {
  @scala.inline
  def apply(hmax: js.Object, hmin: js.Object, vmax: js.Object, vmin: js.Object): defaultStats = {
    val __obj = js.Dynamic.literal(hmax = hmax.asInstanceOf[js.Any], hmin = hmin.asInstanceOf[js.Any], vmax = vmax.asInstanceOf[js.Any], vmin = vmin.asInstanceOf[js.Any])
    __obj.asInstanceOf[defaultStats]
  }
  @scala.inline
  implicit class defaultStatsOps[Self <: defaultStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHmax(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hmax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHmin(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hmin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVmax(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVmin(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vmin")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

