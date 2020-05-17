package typingsSlinky.androiduix.android.view

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScaleGestureDetector_ extends js.Object {
  var mCurrSpan: js.Any = js.native
  var mCurrSpanX: js.Any = js.native
  var mCurrSpanY: js.Any = js.native
  var mCurrTime: js.Any = js.native
  var mDoubleTapEvent: js.Any = js.native
  var mDoubleTapMode: js.Any = js.native
  var mEventBeforeOrAboveStartingGestureEvent: js.Any = js.native
  var mFocusX: js.Any = js.native
  var mFocusY: js.Any = js.native
  var mGestureDetector: js.Any = js.native
  var mHandler: js.Any = js.native
  var mInProgress: js.Any = js.native
  var mInitialSpan: js.Any = js.native
  var mListener: js.Any = js.native
  var mMinSpan: js.Any = js.native
  var mPrevSpan: js.Any = js.native
  var mPrevSpanX: js.Any = js.native
  var mPrevSpanY: js.Any = js.native
  var mPrevTime: js.Any = js.native
  var mQuickScaleEnabled: js.Any = js.native
  var mSpanSlop: js.Any = js.native
  var mTouchHistoryDirection: js.Any = js.native
  var mTouchHistoryLastAccepted: js.Any = js.native
  var mTouchHistoryLastAcceptedTime: js.Any = js.native
  var mTouchLower: js.Any = js.native
  var mTouchMinMajor: js.Any = js.native
  var mTouchUpper: js.Any = js.native
  /* private */ def addTouchHistory(ev: js.Any): js.Any = js.native
  /* private */ def clearTouchHistory(): js.Any = js.native
  def getCurrentSpan(): Double = js.native
  def getCurrentSpanX(): Double = js.native
  def getCurrentSpanY(): Double = js.native
  def getEventTime(): Double = js.native
  def getFocusX(): Double = js.native
  def getFocusY(): Double = js.native
  def getPreviousSpan(): Double = js.native
  def getPreviousSpanX(): Double = js.native
  def getPreviousSpanY(): Double = js.native
  def getScaleFactor(): Double = js.native
  def getTimeDelta(): Double = js.native
  /* private */ def inDoubleTapMode(): js.Any = js.native
  def isInProgress(): Boolean = js.native
  def isQuickScaleEnabled(): Boolean = js.native
  def onTouchEvent(event: MotionEvent): Boolean = js.native
  def setQuickScaleEnabled(scales: Boolean): Unit = js.native
}

object ScaleGestureDetector_ {
  @scala.inline
  def apply(
    addTouchHistory: js.Any => js.Any,
    clearTouchHistory: () => js.Any,
    getCurrentSpan: () => Double,
    getCurrentSpanX: () => Double,
    getCurrentSpanY: () => Double,
    getEventTime: () => Double,
    getFocusX: () => Double,
    getFocusY: () => Double,
    getPreviousSpan: () => Double,
    getPreviousSpanX: () => Double,
    getPreviousSpanY: () => Double,
    getScaleFactor: () => Double,
    getTimeDelta: () => Double,
    inDoubleTapMode: () => js.Any,
    isInProgress: () => Boolean,
    isQuickScaleEnabled: () => Boolean,
    mCurrSpan: js.Any,
    mCurrSpanX: js.Any,
    mCurrSpanY: js.Any,
    mCurrTime: js.Any,
    mDoubleTapEvent: js.Any,
    mDoubleTapMode: js.Any,
    mEventBeforeOrAboveStartingGestureEvent: js.Any,
    mFocusX: js.Any,
    mFocusY: js.Any,
    mGestureDetector: js.Any,
    mHandler: js.Any,
    mInProgress: js.Any,
    mInitialSpan: js.Any,
    mListener: js.Any,
    mMinSpan: js.Any,
    mPrevSpan: js.Any,
    mPrevSpanX: js.Any,
    mPrevSpanY: js.Any,
    mPrevTime: js.Any,
    mQuickScaleEnabled: js.Any,
    mSpanSlop: js.Any,
    mTouchHistoryDirection: js.Any,
    mTouchHistoryLastAccepted: js.Any,
    mTouchHistoryLastAcceptedTime: js.Any,
    mTouchLower: js.Any,
    mTouchMinMajor: js.Any,
    mTouchUpper: js.Any,
    onTouchEvent: MotionEvent => Boolean,
    setQuickScaleEnabled: Boolean => Unit
  ): ScaleGestureDetector_ = {
    val __obj = js.Dynamic.literal(addTouchHistory = js.Any.fromFunction1(addTouchHistory), clearTouchHistory = js.Any.fromFunction0(clearTouchHistory), getCurrentSpan = js.Any.fromFunction0(getCurrentSpan), getCurrentSpanX = js.Any.fromFunction0(getCurrentSpanX), getCurrentSpanY = js.Any.fromFunction0(getCurrentSpanY), getEventTime = js.Any.fromFunction0(getEventTime), getFocusX = js.Any.fromFunction0(getFocusX), getFocusY = js.Any.fromFunction0(getFocusY), getPreviousSpan = js.Any.fromFunction0(getPreviousSpan), getPreviousSpanX = js.Any.fromFunction0(getPreviousSpanX), getPreviousSpanY = js.Any.fromFunction0(getPreviousSpanY), getScaleFactor = js.Any.fromFunction0(getScaleFactor), getTimeDelta = js.Any.fromFunction0(getTimeDelta), inDoubleTapMode = js.Any.fromFunction0(inDoubleTapMode), isInProgress = js.Any.fromFunction0(isInProgress), isQuickScaleEnabled = js.Any.fromFunction0(isQuickScaleEnabled), mCurrSpan = mCurrSpan.asInstanceOf[js.Any], mCurrSpanX = mCurrSpanX.asInstanceOf[js.Any], mCurrSpanY = mCurrSpanY.asInstanceOf[js.Any], mCurrTime = mCurrTime.asInstanceOf[js.Any], mDoubleTapEvent = mDoubleTapEvent.asInstanceOf[js.Any], mDoubleTapMode = mDoubleTapMode.asInstanceOf[js.Any], mEventBeforeOrAboveStartingGestureEvent = mEventBeforeOrAboveStartingGestureEvent.asInstanceOf[js.Any], mFocusX = mFocusX.asInstanceOf[js.Any], mFocusY = mFocusY.asInstanceOf[js.Any], mGestureDetector = mGestureDetector.asInstanceOf[js.Any], mHandler = mHandler.asInstanceOf[js.Any], mInProgress = mInProgress.asInstanceOf[js.Any], mInitialSpan = mInitialSpan.asInstanceOf[js.Any], mListener = mListener.asInstanceOf[js.Any], mMinSpan = mMinSpan.asInstanceOf[js.Any], mPrevSpan = mPrevSpan.asInstanceOf[js.Any], mPrevSpanX = mPrevSpanX.asInstanceOf[js.Any], mPrevSpanY = mPrevSpanY.asInstanceOf[js.Any], mPrevTime = mPrevTime.asInstanceOf[js.Any], mQuickScaleEnabled = mQuickScaleEnabled.asInstanceOf[js.Any], mSpanSlop = mSpanSlop.asInstanceOf[js.Any], mTouchHistoryDirection = mTouchHistoryDirection.asInstanceOf[js.Any], mTouchHistoryLastAccepted = mTouchHistoryLastAccepted.asInstanceOf[js.Any], mTouchHistoryLastAcceptedTime = mTouchHistoryLastAcceptedTime.asInstanceOf[js.Any], mTouchLower = mTouchLower.asInstanceOf[js.Any], mTouchMinMajor = mTouchMinMajor.asInstanceOf[js.Any], mTouchUpper = mTouchUpper.asInstanceOf[js.Any], onTouchEvent = js.Any.fromFunction1(onTouchEvent), setQuickScaleEnabled = js.Any.fromFunction1(setQuickScaleEnabled))
    __obj.asInstanceOf[ScaleGestureDetector_]
  }
  @scala.inline
  implicit class ScaleGestureDetector_Ops[Self <: ScaleGestureDetector_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddTouchHistory(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addTouchHistory")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClearTouchHistory(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearTouchHistory")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCurrentSpan(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentSpan")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCurrentSpanX(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentSpanX")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetCurrentSpanY(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCurrentSpanY")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetEventTime(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEventTime")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFocusX(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFocusX")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetFocusY(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFocusY")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPreviousSpan(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPreviousSpan")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPreviousSpanX(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPreviousSpanX")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPreviousSpanY(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPreviousSpanY")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetScaleFactor(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getScaleFactor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTimeDelta(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTimeDelta")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInDoubleTapMode(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inDoubleTapMode")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsInProgress(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInProgress")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsQuickScaleEnabled(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isQuickScaleEnabled")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMCurrSpan(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mCurrSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMCurrSpanX(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mCurrSpanX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMCurrSpanY(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mCurrSpanY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMCurrTime(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mCurrTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDoubleTapEvent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDoubleTapEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDoubleTapMode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDoubleTapMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMEventBeforeOrAboveStartingGestureEvent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mEventBeforeOrAboveStartingGestureEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMFocusX(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mFocusX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMFocusY(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mFocusY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMGestureDetector(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mGestureDetector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMHandler(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMInProgress(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mInProgress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMInitialSpan(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mInitialSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMListener(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mListener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMMinSpan(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mMinSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMPrevSpan(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mPrevSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMPrevSpanX(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mPrevSpanX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMPrevSpanY(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mPrevSpanY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMPrevTime(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mPrevTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMQuickScaleEnabled(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mQuickScaleEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMSpanSlop(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mSpanSlop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMTouchHistoryDirection(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mTouchHistoryDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMTouchHistoryLastAccepted(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mTouchHistoryLastAccepted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMTouchHistoryLastAcceptedTime(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mTouchHistoryLastAcceptedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMTouchLower(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mTouchLower")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMTouchMinMajor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mTouchMinMajor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMTouchUpper(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mTouchUpper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnTouchEvent(value: MotionEvent => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetQuickScaleEnabled(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setQuickScaleEnabled")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

