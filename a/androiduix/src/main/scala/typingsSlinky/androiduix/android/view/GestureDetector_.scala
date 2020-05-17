package typingsSlinky.androiduix.android.view

import typingsSlinky.androiduix.android.view.GestureDetector.OnDoubleTapListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GestureDetector_ extends js.Object {
  var mAlwaysInBiggerTapRegion: js.Any = js.native
  var mAlwaysInTapRegion: js.Any = js.native
  var mCurrentDownEvent: js.Any = js.native
  var mDeferConfirmSingleTap: js.Any = js.native
  var mDoubleTapListener: js.Any = js.native
  var mDoubleTapSlopSquare: js.Any = js.native
  var mDoubleTapTouchSlopSquare: js.Any = js.native
  var mDownFocusX: js.Any = js.native
  var mDownFocusY: js.Any = js.native
  var mHandler: js.Any = js.native
  var mInLongPress: js.Any = js.native
  var mIsDoubleTapping: js.Any = js.native
  var mIsLongpressEnabled: js.Any = js.native
  var mLastFocusX: js.Any = js.native
  var mLastFocusY: js.Any = js.native
  var mListener: js.Any = js.native
  var mMaximumFlingVelocity: js.Any = js.native
  var mMinimumFlingVelocity: js.Any = js.native
  var mPreviousUpEvent: js.Any = js.native
  var mStillDown: js.Any = js.native
  var mTouchSlopSquare: js.Any = js.native
  var mVelocityTracker: js.Any = js.native
  /* private */ def cancel(): js.Any = js.native
  /* private */ def cancelTaps(): js.Any = js.native
  /* private */ def dispatchLongPress(): js.Any = js.native
  /* private */ def init(): js.Any = js.native
  /* private */ def isConsideredDoubleTap(firstDown: js.Any, firstUp: js.Any, secondDown: js.Any): js.Any = js.native
  def isLongpressEnabled(): Boolean = js.native
  def onTouchEvent(ev: MotionEvent): Boolean = js.native
  def setIsLongpressEnabled(isLongpressEnabled: Boolean): Unit = js.native
  def setOnDoubleTapListener(onDoubleTapListener: OnDoubleTapListener): Unit = js.native
}

object GestureDetector_ {
  @scala.inline
  def apply(
    cancel: () => js.Any,
    cancelTaps: () => js.Any,
    dispatchLongPress: () => js.Any,
    init: () => js.Any,
    isConsideredDoubleTap: (js.Any, js.Any, js.Any) => js.Any,
    isLongpressEnabled: () => Boolean,
    mAlwaysInBiggerTapRegion: js.Any,
    mAlwaysInTapRegion: js.Any,
    mCurrentDownEvent: js.Any,
    mDeferConfirmSingleTap: js.Any,
    mDoubleTapListener: js.Any,
    mDoubleTapSlopSquare: js.Any,
    mDoubleTapTouchSlopSquare: js.Any,
    mDownFocusX: js.Any,
    mDownFocusY: js.Any,
    mHandler: js.Any,
    mInLongPress: js.Any,
    mIsDoubleTapping: js.Any,
    mIsLongpressEnabled: js.Any,
    mLastFocusX: js.Any,
    mLastFocusY: js.Any,
    mListener: js.Any,
    mMaximumFlingVelocity: js.Any,
    mMinimumFlingVelocity: js.Any,
    mPreviousUpEvent: js.Any,
    mStillDown: js.Any,
    mTouchSlopSquare: js.Any,
    mVelocityTracker: js.Any,
    onTouchEvent: MotionEvent => Boolean,
    setIsLongpressEnabled: Boolean => Unit,
    setOnDoubleTapListener: OnDoubleTapListener => Unit
  ): GestureDetector_ = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), cancelTaps = js.Any.fromFunction0(cancelTaps), dispatchLongPress = js.Any.fromFunction0(dispatchLongPress), init = js.Any.fromFunction0(init), isConsideredDoubleTap = js.Any.fromFunction3(isConsideredDoubleTap), isLongpressEnabled = js.Any.fromFunction0(isLongpressEnabled), mAlwaysInBiggerTapRegion = mAlwaysInBiggerTapRegion.asInstanceOf[js.Any], mAlwaysInTapRegion = mAlwaysInTapRegion.asInstanceOf[js.Any], mCurrentDownEvent = mCurrentDownEvent.asInstanceOf[js.Any], mDeferConfirmSingleTap = mDeferConfirmSingleTap.asInstanceOf[js.Any], mDoubleTapListener = mDoubleTapListener.asInstanceOf[js.Any], mDoubleTapSlopSquare = mDoubleTapSlopSquare.asInstanceOf[js.Any], mDoubleTapTouchSlopSquare = mDoubleTapTouchSlopSquare.asInstanceOf[js.Any], mDownFocusX = mDownFocusX.asInstanceOf[js.Any], mDownFocusY = mDownFocusY.asInstanceOf[js.Any], mHandler = mHandler.asInstanceOf[js.Any], mInLongPress = mInLongPress.asInstanceOf[js.Any], mIsDoubleTapping = mIsDoubleTapping.asInstanceOf[js.Any], mIsLongpressEnabled = mIsLongpressEnabled.asInstanceOf[js.Any], mLastFocusX = mLastFocusX.asInstanceOf[js.Any], mLastFocusY = mLastFocusY.asInstanceOf[js.Any], mListener = mListener.asInstanceOf[js.Any], mMaximumFlingVelocity = mMaximumFlingVelocity.asInstanceOf[js.Any], mMinimumFlingVelocity = mMinimumFlingVelocity.asInstanceOf[js.Any], mPreviousUpEvent = mPreviousUpEvent.asInstanceOf[js.Any], mStillDown = mStillDown.asInstanceOf[js.Any], mTouchSlopSquare = mTouchSlopSquare.asInstanceOf[js.Any], mVelocityTracker = mVelocityTracker.asInstanceOf[js.Any], onTouchEvent = js.Any.fromFunction1(onTouchEvent), setIsLongpressEnabled = js.Any.fromFunction1(setIsLongpressEnabled), setOnDoubleTapListener = js.Any.fromFunction1(setOnDoubleTapListener))
    __obj.asInstanceOf[GestureDetector_]
  }
  @scala.inline
  implicit class GestureDetector_Ops[Self <: GestureDetector_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCancelTaps(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelTaps")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDispatchLongPress(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatchLongPress")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInit(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("init")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsConsideredDoubleTap(value: (js.Any, js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isConsideredDoubleTap")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withIsLongpressEnabled(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLongpressEnabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMAlwaysInBiggerTapRegion(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mAlwaysInBiggerTapRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMAlwaysInTapRegion(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mAlwaysInTapRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMCurrentDownEvent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mCurrentDownEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDeferConfirmSingleTap(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDeferConfirmSingleTap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDoubleTapListener(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDoubleTapListener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDoubleTapSlopSquare(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDoubleTapSlopSquare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDoubleTapTouchSlopSquare(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDoubleTapTouchSlopSquare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDownFocusX(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDownFocusX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDownFocusY(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDownFocusY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMHandler(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMInLongPress(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mInLongPress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMIsDoubleTapping(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mIsDoubleTapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMIsLongpressEnabled(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mIsLongpressEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMLastFocusX(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mLastFocusX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMLastFocusY(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mLastFocusY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMListener(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mListener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMMaximumFlingVelocity(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mMaximumFlingVelocity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMMinimumFlingVelocity(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mMinimumFlingVelocity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMPreviousUpEvent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mPreviousUpEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMStillDown(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mStillDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMTouchSlopSquare(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mTouchSlopSquare")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMVelocityTracker(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mVelocityTracker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnTouchEvent(value: MotionEvent => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetIsLongpressEnabled(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIsLongpressEnabled")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetOnDoubleTapListener(value: OnDoubleTapListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOnDoubleTapListener")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

