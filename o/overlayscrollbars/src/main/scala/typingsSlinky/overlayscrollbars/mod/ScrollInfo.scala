package typingsSlinky.overlayscrollbars.mod

import typingsSlinky.overlayscrollbars.anon.XNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollInfo extends js.Object {
  var handleLength: XNumber = js.native
  var handleLengthRatio: XNumber = js.native
  var handleOffset: XNumber = js.native
  var isRTL: Boolean = js.native
  var isRTLNormalized: Boolean = js.native
  var max: XNumber = js.native
  var position: XNumber = js.native
  var ratio: XNumber = js.native
  var snappedHandleOffset: XNumber = js.native
  var trackLength: XNumber = js.native
}

object ScrollInfo {
  @scala.inline
  def apply(
    handleLength: XNumber,
    handleLengthRatio: XNumber,
    handleOffset: XNumber,
    isRTL: Boolean,
    isRTLNormalized: Boolean,
    max: XNumber,
    position: XNumber,
    ratio: XNumber,
    snappedHandleOffset: XNumber,
    trackLength: XNumber
  ): ScrollInfo = {
    val __obj = js.Dynamic.literal(handleLength = handleLength.asInstanceOf[js.Any], handleLengthRatio = handleLengthRatio.asInstanceOf[js.Any], handleOffset = handleOffset.asInstanceOf[js.Any], isRTL = isRTL.asInstanceOf[js.Any], isRTLNormalized = isRTLNormalized.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], ratio = ratio.asInstanceOf[js.Any], snappedHandleOffset = snappedHandleOffset.asInstanceOf[js.Any], trackLength = trackLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollInfo]
  }
  @scala.inline
  implicit class ScrollInfoOps[Self <: ScrollInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandleLength(value: XNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandleLengthRatio(value: XNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleLengthRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandleOffset(value: XNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRTL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRTLNormalized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRTLNormalized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax(value: XNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: XNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRatio(value: XNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnappedHandleOffset(value: XNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snappedHandleOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrackLength(value: XNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackLength")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

