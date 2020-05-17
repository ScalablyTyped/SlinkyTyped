package typingsSlinky.androiduix.android.widget.ListPopupWindow

import typingsSlinky.androiduix.android.view.MotionEvent
import typingsSlinky.androiduix.android.view.View
import typingsSlinky.androiduix.android.view.View.OnAttachStateChangeListener
import typingsSlinky.androiduix.android.view.View.OnTouchListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ForwardingListener_
  extends OnTouchListener
     with OnAttachStateChangeListener {
  var mActivePointerId: js.Any = js.native
  var mDisallowIntercept: js.Any = js.native
  var mForwarding: js.Any = js.native
  var mScaledTouchSlop: js.Any = js.native
  var mSrc: js.Any = js.native
  var mTapTimeout: js.Any = js.native
  def getPopup(): typingsSlinky.androiduix.android.widget.ListPopupWindow = js.native
  /* protected */ def onForwardingStarted(): Boolean = js.native
  /* protected */ def onForwardingStopped(): Boolean = js.native
  /* private */ def onTouchForwarded(srcEvent: js.Any): js.Any = js.native
  /* private */ def onTouchObserved(srcEvent: js.Any): js.Any = js.native
}

object ForwardingListener_ {
  @scala.inline
  def apply(
    getPopup: () => typingsSlinky.androiduix.android.widget.ListPopupWindow,
    mActivePointerId: js.Any,
    mDisallowIntercept: js.Any,
    mForwarding: js.Any,
    mScaledTouchSlop: js.Any,
    mSrc: js.Any,
    mTapTimeout: js.Any,
    onForwardingStarted: () => Boolean,
    onForwardingStopped: () => Boolean,
    onTouch: (View, MotionEvent) => Unit,
    onTouchForwarded: js.Any => js.Any,
    onTouchObserved: js.Any => js.Any,
    onViewAttachedToWindow: View => js.Any,
    onViewDetachedFromWindow: View => js.Any
  ): ForwardingListener_ = {
    val __obj = js.Dynamic.literal(getPopup = js.Any.fromFunction0(getPopup), mActivePointerId = mActivePointerId.asInstanceOf[js.Any], mDisallowIntercept = mDisallowIntercept.asInstanceOf[js.Any], mForwarding = mForwarding.asInstanceOf[js.Any], mScaledTouchSlop = mScaledTouchSlop.asInstanceOf[js.Any], mSrc = mSrc.asInstanceOf[js.Any], mTapTimeout = mTapTimeout.asInstanceOf[js.Any], onForwardingStarted = js.Any.fromFunction0(onForwardingStarted), onForwardingStopped = js.Any.fromFunction0(onForwardingStopped), onTouch = js.Any.fromFunction2(onTouch), onTouchForwarded = js.Any.fromFunction1(onTouchForwarded), onTouchObserved = js.Any.fromFunction1(onTouchObserved), onViewAttachedToWindow = js.Any.fromFunction1(onViewAttachedToWindow), onViewDetachedFromWindow = js.Any.fromFunction1(onViewDetachedFromWindow))
    __obj.asInstanceOf[ForwardingListener_]
  }
  @scala.inline
  implicit class ForwardingListener_Ops[Self <: ForwardingListener_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetPopup(value: () => typingsSlinky.androiduix.android.widget.ListPopupWindow): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPopup")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMActivePointerId(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mActivePointerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMDisallowIntercept(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mDisallowIntercept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMForwarding(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mForwarding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMScaledTouchSlop(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mScaledTouchSlop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMSrc(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mSrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMTapTimeout(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mTapTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnForwardingStarted(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onForwardingStarted")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnForwardingStopped(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onForwardingStopped")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnTouchForwarded(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchForwarded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnTouchObserved(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchObserved")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

