package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputDetail extends js.Object {
  /**
    * Duration in milliseconds
    */
  var DurationInMs: js.UndefOr[integer] = js.native
  /**
    * Contains details about the output's video stream
    */
  var VideoDetails: js.UndefOr[VideoDetail] = js.native
}

object OutputDetail {
  @scala.inline
  def apply(): OutputDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OutputDetail]
  }
  @scala.inline
  implicit class OutputDetailOps[Self <: OutputDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDurationInMs(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DurationInMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationInMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DurationInMs")(js.undefined)
        ret
    }
    @scala.inline
    def withVideoDetails(value: VideoDetail): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VideoDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVideoDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VideoDetails")(js.undefined)
        ret
    }
  }
  
}

