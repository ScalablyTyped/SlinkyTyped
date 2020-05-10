package typingsSlinky.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoDetail extends js.Object {
  /**
    * Height in pixels for the output
    */
  var HeightInPx: js.UndefOr[integer] = js.native
  /**
    * Width in pixels for the output
    */
  var WidthInPx: js.UndefOr[integer] = js.native
}

object VideoDetail {
  @scala.inline
  def apply(): VideoDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoDetail]
  }
  @scala.inline
  implicit class VideoDetailOps[Self <: VideoDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeightInPx(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeightInPx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeightInPx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HeightInPx")(js.undefined)
        ret
    }
    @scala.inline
    def withWidthInPx(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WidthInPx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidthInPx: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WidthInPx")(js.undefined)
        ret
    }
  }
  
}

