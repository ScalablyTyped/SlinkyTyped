package typingsSlinky.overlayscrollbars.mod

import typingsSlinky.overlayscrollbars.AnonXNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollInfo extends js.Object {
  var handleLength: AnonXNumber = js.native
  var handleLengthRatio: AnonXNumber = js.native
  var handleOffset: AnonXNumber = js.native
  var isRTL: Boolean = js.native
  var isRTLNormalized: Boolean = js.native
  var max: AnonXNumber = js.native
  var position: AnonXNumber = js.native
  var ratio: AnonXNumber = js.native
  var snappedHandleOffset: AnonXNumber = js.native
  var trackLength: AnonXNumber = js.native
}

object ScrollInfo {
  @scala.inline
  def apply(
    handleLength: AnonXNumber,
    handleLengthRatio: AnonXNumber,
    handleOffset: AnonXNumber,
    isRTL: Boolean,
    isRTLNormalized: Boolean,
    max: AnonXNumber,
    position: AnonXNumber,
    ratio: AnonXNumber,
    snappedHandleOffset: AnonXNumber,
    trackLength: AnonXNumber
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
    def withHandleLength(value: AnonXNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandleLengthRatio(value: AnonXNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleLengthRatio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHandleOffset(value: AnonXNumber): Self = {
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
    def withMax(value: AnonXNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: AnonXNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRatio(value: AnonXNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnappedHandleOffset(value: AnonXNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snappedHandleOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrackLength(value: AnonXNumber): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackLength")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

