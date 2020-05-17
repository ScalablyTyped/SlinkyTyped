package typingsSlinky.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveSeekableRange extends js.Object {
  var end: js.UndefOr[Double] = js.native
  var isLiveDone: js.UndefOr[Boolean] = js.native
  var isMovingWindow: js.UndefOr[Boolean] = js.native
  var start: js.UndefOr[Double] = js.native
}

object LiveSeekableRange {
  @scala.inline
  def apply(): LiveSeekableRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveSeekableRange]
  }
  @scala.inline
  implicit class LiveSeekableRangeOps[Self <: LiveSeekableRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLiveDone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLiveDone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsLiveDone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLiveDone")(js.undefined)
        ret
    }
    @scala.inline
    def withIsMovingWindow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMovingWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsMovingWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMovingWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
  }
  
}

