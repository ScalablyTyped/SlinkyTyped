package typingsSlinky.androiduix.android.view

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchDelegate extends js.Object {
  var mBounds: js.Any = js.native
  var mDelegateTargeted: js.Any = js.native
  var mDelegateView: js.Any = js.native
  var mSlop: js.Any = js.native
  var mSlopBounds: js.Any = js.native
  def onTouchEvent(event: MotionEvent): Boolean = js.native
}

object TouchDelegate {
  @scala.inline
  def apply(
    mBounds: js.Any,
    mDelegateTargeted: js.Any,
    mDelegateView: js.Any,
    mSlop: js.Any,
    mSlopBounds: js.Any,
    onTouchEvent: MotionEvent => Boolean
  ): TouchDelegate = {
    val __obj = js.Dynamic.literal(mBounds = mBounds.asInstanceOf[js.Any], mDelegateTargeted = mDelegateTargeted.asInstanceOf[js.Any], mDelegateView = mDelegateView.asInstanceOf[js.Any], mSlop = mSlop.asInstanceOf[js.Any], mSlopBounds = mSlopBounds.asInstanceOf[js.Any], onTouchEvent = js.Any.fromFunction1(onTouchEvent))
    __obj.asInstanceOf[TouchDelegate]
  }
  @scala.inline
  implicit class TouchDelegateOps[Self <: TouchDelegate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMBounds(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDelegateTargeted(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDelegateTargeted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDelegateView(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDelegateView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMSlop(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mSlop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMSlopBounds(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mSlopBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnTouchEvent(value: MotionEvent => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEvent")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

