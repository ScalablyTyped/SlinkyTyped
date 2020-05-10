package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NativeScrollEvent extends js.Object {
  var contentInset: NativeScrollRectangle = js.native
  var contentOffset: NativeScrollPoint = js.native
  var contentSize: NativeScrollSize = js.native
  var layoutMeasurement: NativeScrollSize = js.native
  var velocity: js.UndefOr[NativeScrollVelocity] = js.native
  var zoomScale: Double = js.native
}

object NativeScrollEvent {
  @scala.inline
  def apply(
    contentInset: NativeScrollRectangle,
    contentOffset: NativeScrollPoint,
    contentSize: NativeScrollSize,
    layoutMeasurement: NativeScrollSize,
    zoomScale: Double
  ): NativeScrollEvent = {
    val __obj = js.Dynamic.literal(contentInset = contentInset.asInstanceOf[js.Any], contentOffset = contentOffset.asInstanceOf[js.Any], contentSize = contentSize.asInstanceOf[js.Any], layoutMeasurement = layoutMeasurement.asInstanceOf[js.Any], zoomScale = zoomScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeScrollEvent]
  }
  @scala.inline
  implicit class NativeScrollEventOps[Self <: NativeScrollEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentInset(value: NativeScrollRectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentInset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentOffset(value: NativeScrollPoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentSize(value: NativeScrollSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayoutMeasurement(value: NativeScrollSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutMeasurement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZoomScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVelocity(value: NativeScrollVelocity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("velocity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVelocity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("velocity")(js.undefined)
        ret
    }
  }
  
}

