package typingsSlinky.androiduix.android.view

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewConfiguration extends js.Object {
  var density: js.Any = js.native
  var mDoubleTapSlop: Double = js.native
  var mDoubleTapTouchSlop: Double = js.native
  var mEdgeSlop: Double = js.native
  var mFadingEdgeLength: Double = js.native
  var mMaximumDrawingCacheSize: Double = js.native
  var mMaximumFlingVelocity: Double = js.native
  var mMinimumFlingVelocity: Double = js.native
  var mOverflingDistance: Double = js.native
  var mOverscrollDistance: Double = js.native
  var mPagingTouchSlop: Double = js.native
  var mScrollbarSize: Double = js.native
  var mTouchSlop: Double = js.native
  var mWindowTouchSlop: Double = js.native
  var sizeAndDensity: js.Any = js.native
  def getScaledDoubleTapSlop(): Double = js.native
  def getScaledDoubleTapTouchSlop(): Double = js.native
  def getScaledEdgeSlop(): Double = js.native
  def getScaledFadingEdgeLength(): Double = js.native
  def getScaledMaximumDrawingCacheSize(): Double = js.native
  def getScaledMaximumFlingVelocity(): Double = js.native
  def getScaledMinimumFlingVelocity(): Double = js.native
  def getScaledOverflingDistance(): Double = js.native
  def getScaledOverscrollDistance(): Double = js.native
  def getScaledPagingTouchSlop(): Double = js.native
  def getScaledScrollBarSize(): Double = js.native
  def getScaledTouchSlop(): Double = js.native
  def getScaledWindowTouchSlop(): Double = js.native
}

object ViewConfiguration {
  @scala.inline
  def apply(
    density: js.Any,
    getScaledDoubleTapSlop: () => Double,
    getScaledDoubleTapTouchSlop: () => Double,
    getScaledEdgeSlop: () => Double,
    getScaledFadingEdgeLength: () => Double,
    getScaledMaximumDrawingCacheSize: () => Double,
    getScaledMaximumFlingVelocity: () => Double,
    getScaledMinimumFlingVelocity: () => Double,
    getScaledOverflingDistance: () => Double,
    getScaledOverscrollDistance: () => Double,
    getScaledPagingTouchSlop: () => Double,
    getScaledScrollBarSize: () => Double,
    getScaledTouchSlop: () => Double,
    getScaledWindowTouchSlop: () => Double,
    mDoubleTapSlop: Double,
    mDoubleTapTouchSlop: Double,
    mEdgeSlop: Double,
    mFadingEdgeLength: Double,
    mMaximumDrawingCacheSize: Double,
    mMaximumFlingVelocity: Double,
    mMinimumFlingVelocity: Double,
    mOverflingDistance: Double,
    mOverscrollDistance: Double,
    mPagingTouchSlop: Double,
    mScrollbarSize: Double,
    mTouchSlop: Double,
    mWindowTouchSlop: Double,
    sizeAndDensity: js.Any
  ): ViewConfiguration = {
    val __obj = js.Dynamic.literal(density = density.asInstanceOf[js.Any], getScaledDoubleTapSlop = js.Any.fromFunction0(getScaledDoubleTapSlop), getScaledDoubleTapTouchSlop = js.Any.fromFunction0(getScaledDoubleTapTouchSlop), getScaledEdgeSlop = js.Any.fromFunction0(getScaledEdgeSlop), getScaledFadingEdgeLength = js.Any.fromFunction0(getScaledFadingEdgeLength), getScaledMaximumDrawingCacheSize = js.Any.fromFunction0(getScaledMaximumDrawingCacheSize), getScaledMaximumFlingVelocity = js.Any.fromFunction0(getScaledMaximumFlingVelocity), getScaledMinimumFlingVelocity = js.Any.fromFunction0(getScaledMinimumFlingVelocity), getScaledOverflingDistance = js.Any.fromFunction0(getScaledOverflingDistance), getScaledOverscrollDistance = js.Any.fromFunction0(getScaledOverscrollDistance), getScaledPagingTouchSlop = js.Any.fromFunction0(getScaledPagingTouchSlop), getScaledScrollBarSize = js.Any.fromFunction0(getScaledScrollBarSize), getScaledTouchSlop = js.Any.fromFunction0(getScaledTouchSlop), getScaledWindowTouchSlop = js.Any.fromFunction0(getScaledWindowTouchSlop), mDoubleTapSlop = mDoubleTapSlop.asInstanceOf[js.Any], mDoubleTapTouchSlop = mDoubleTapTouchSlop.asInstanceOf[js.Any], mEdgeSlop = mEdgeSlop.asInstanceOf[js.Any], mFadingEdgeLength = mFadingEdgeLength.asInstanceOf[js.Any], mMaximumDrawingCacheSize = mMaximumDrawingCacheSize.asInstanceOf[js.Any], mMaximumFlingVelocity = mMaximumFlingVelocity.asInstanceOf[js.Any], mMinimumFlingVelocity = mMinimumFlingVelocity.asInstanceOf[js.Any], mOverflingDistance = mOverflingDistance.asInstanceOf[js.Any], mOverscrollDistance = mOverscrollDistance.asInstanceOf[js.Any], mPagingTouchSlop = mPagingTouchSlop.asInstanceOf[js.Any], mScrollbarSize = mScrollbarSize.asInstanceOf[js.Any], mTouchSlop = mTouchSlop.asInstanceOf[js.Any], mWindowTouchSlop = mWindowTouchSlop.asInstanceOf[js.Any], sizeAndDensity = sizeAndDensity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewConfiguration]
  }
  @scala.inline
  implicit class ViewConfigurationOps[Self <: ViewConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDensity(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("density")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetScaledDoubleTapSlop(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScaledDoubleTapSlop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetScaledDoubleTapTouchSlop(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScaledDoubleTapTouchSlop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetScaledEdgeSlop(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScaledEdgeSlop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetScaledFadingEdgeLength(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScaledFadingEdgeLength")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetScaledMaximumDrawingCacheSize(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScaledMaximumDrawingCacheSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetScaledMaximumFlingVelocity(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScaledMaximumFlingVelocity")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetScaledMinimumFlingVelocity(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScaledMinimumFlingVelocity")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetScaledOverflingDistance(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScaledOverflingDistance")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetScaledOverscrollDistance(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScaledOverscrollDistance")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetScaledPagingTouchSlop(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScaledPagingTouchSlop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetScaledScrollBarSize(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScaledScrollBarSize")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetScaledTouchSlop(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScaledTouchSlop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetScaledWindowTouchSlop(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScaledWindowTouchSlop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMDoubleTapSlop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDoubleTapSlop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDoubleTapTouchSlop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDoubleTapTouchSlop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMEdgeSlop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mEdgeSlop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMFadingEdgeLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mFadingEdgeLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMMaximumDrawingCacheSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mMaximumDrawingCacheSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMMaximumFlingVelocity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mMaximumFlingVelocity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMMinimumFlingVelocity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mMinimumFlingVelocity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMOverflingDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mOverflingDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMOverscrollDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mOverscrollDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMPagingTouchSlop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mPagingTouchSlop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMScrollbarSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mScrollbarSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMTouchSlop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mTouchSlop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMWindowTouchSlop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mWindowTouchSlop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSizeAndDensity(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeAndDensity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

