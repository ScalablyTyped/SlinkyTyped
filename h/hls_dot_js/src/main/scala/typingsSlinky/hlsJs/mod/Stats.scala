package typingsSlinky.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stats extends js.Object {
  var length: js.UndefOr[Double] = js.native
  var mtime: Double = js.native
  var tbuffered: js.UndefOr[Double] = js.native
  /**
    * performance.now() of first received byte
    */
  var tfirst: Double = js.native
  /**
    * performance.now() on load complete
    */
  var tload: Double = js.native
  /**
    * performance.now() just after load() has been called
    */
  var trequest: Double = js.native
}

object Stats {
  @scala.inline
  def apply(mtime: Double, tfirst: Double, tload: Double, trequest: Double): Stats = {
    val __obj = js.Dynamic.literal(mtime = mtime.asInstanceOf[js.Any], tfirst = tfirst.asInstanceOf[js.Any], tload = tload.asInstanceOf[js.Any], trequest = trequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
  @scala.inline
  implicit class StatsOps[Self <: Stats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMtime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mtime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTfirst(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tfirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTload(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrequest(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
    @scala.inline
    def withTbuffered(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tbuffered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTbuffered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tbuffered")(js.undefined)
        ret
    }
  }
  
}

