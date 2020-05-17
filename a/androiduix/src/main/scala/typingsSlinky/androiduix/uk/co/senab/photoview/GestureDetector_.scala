package typingsSlinky.androiduix.uk.co.senab.photoview

import typingsSlinky.androiduix.android.view.MotionEvent
import typingsSlinky.androiduix.android.view.ScaleGestureDetector
import typingsSlinky.androiduix.uk.co.senab.photoview.GestureDetector.OnGestureListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GestureDetector_ extends js.Object {
  var mActivePointerId: js.Any = js.native
  var mActivePointerIndex: js.Any = js.native
  var mIsDragging: js.Any = js.native
  var mLastTouchX: Double = js.native
  var mLastTouchY: Double = js.native
  var mListener: OnGestureListener = js.native
  var mMinimumVelocity: Double = js.native
  var mScaleDetector: ScaleGestureDetector = js.native
  var mTouchSlop: Double = js.native
  var mVelocityTracker: js.Any = js.native
  def getActiveX(ev: MotionEvent): Double = js.native
  def getActiveY(ev: MotionEvent): Double = js.native
  def isDragging(): Boolean = js.native
  def isScaling(): Boolean = js.native
  def onTouchEvent(ev: MotionEvent): Boolean = js.native
  def setOnGestureListener(listener: OnGestureListener): Unit = js.native
}

object GestureDetector_ {
  @scala.inline
  def apply(
    getActiveX: MotionEvent => Double,
    getActiveY: MotionEvent => Double,
    isDragging: () => Boolean,
    isScaling: () => Boolean,
    mActivePointerId: js.Any,
    mActivePointerIndex: js.Any,
    mIsDragging: js.Any,
    mLastTouchX: Double,
    mLastTouchY: Double,
    mListener: OnGestureListener,
    mMinimumVelocity: Double,
    mScaleDetector: ScaleGestureDetector,
    mTouchSlop: Double,
    mVelocityTracker: js.Any,
    onTouchEvent: MotionEvent => Boolean,
    setOnGestureListener: OnGestureListener => Unit
  ): GestureDetector_ = {
    val __obj = js.Dynamic.literal(getActiveX = js.Any.fromFunction1(getActiveX), getActiveY = js.Any.fromFunction1(getActiveY), isDragging = js.Any.fromFunction0(isDragging), isScaling = js.Any.fromFunction0(isScaling), mActivePointerId = mActivePointerId.asInstanceOf[js.Any], mActivePointerIndex = mActivePointerIndex.asInstanceOf[js.Any], mIsDragging = mIsDragging.asInstanceOf[js.Any], mLastTouchX = mLastTouchX.asInstanceOf[js.Any], mLastTouchY = mLastTouchY.asInstanceOf[js.Any], mListener = mListener.asInstanceOf[js.Any], mMinimumVelocity = mMinimumVelocity.asInstanceOf[js.Any], mScaleDetector = mScaleDetector.asInstanceOf[js.Any], mTouchSlop = mTouchSlop.asInstanceOf[js.Any], mVelocityTracker = mVelocityTracker.asInstanceOf[js.Any], onTouchEvent = js.Any.fromFunction1(onTouchEvent), setOnGestureListener = js.Any.fromFunction1(setOnGestureListener))
    __obj.asInstanceOf[GestureDetector_]
  }
  @scala.inline
  implicit class GestureDetector_Ops[Self <: GestureDetector_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetActiveX(value: MotionEvent => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveX")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetActiveY(value: MotionEvent => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getActiveY")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsDragging(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDragging")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsScaling(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isScaling")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMActivePointerId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mActivePointerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMActivePointerIndex(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mActivePointerIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMIsDragging(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mIsDragging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMLastTouchX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mLastTouchX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMLastTouchY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mLastTouchY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMListener(value: OnGestureListener): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mListener")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMMinimumVelocity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mMinimumVelocity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMScaleDetector(value: ScaleGestureDetector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mScaleDetector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMTouchSlop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mTouchSlop")(value.asInstanceOf[js.Any])
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
    def withSetOnGestureListener(value: OnGestureListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOnGestureListener")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

