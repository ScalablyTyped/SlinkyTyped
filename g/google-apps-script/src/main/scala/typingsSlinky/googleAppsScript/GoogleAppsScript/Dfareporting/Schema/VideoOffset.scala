package typingsSlinky.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoOffset extends js.Object {
  var offsetPercentage: js.UndefOr[Double] = js.native
  var offsetSeconds: js.UndefOr[Double] = js.native
}

object VideoOffset {
  @scala.inline
  def apply(): VideoOffset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoOffset]
  }
  @scala.inline
  implicit class VideoOffsetOps[Self <: VideoOffset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOffsetPercentage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetPercentage")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetSeconds")(js.undefined)
        ret
    }
  }
  
}

