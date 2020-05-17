package typingsSlinky.androiduix.android.view

import typingsSlinky.androiduix.android.view.ViewTreeObserver.OnDrawListener
import typingsSlinky.androiduix.android.view.ViewTreeObserver.OnGlobalLayoutListener
import typingsSlinky.androiduix.android.view.ViewTreeObserver.OnPreDrawListener
import typingsSlinky.androiduix.android.view.ViewTreeObserver.OnScrollChangedListener
import typingsSlinky.androiduix.android.view.ViewTreeObserver.OnTouchModeChangeListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewTreeObserver_ extends js.Object {
  var mAlive: js.Any = js.native
  var mOnDrawListeners: js.Any = js.native
  var mOnGlobalLayoutListeners: js.Any = js.native
  var mOnPreDrawListeners: js.Any = js.native
  var mOnScrollChangedListeners: js.Any = js.native
  var mOnTouchModeChangeListeners: js.Any = js.native
  def addOnDrawListener(listener: OnDrawListener): Unit = js.native
  def addOnGlobalLayoutListener(listener: OnGlobalLayoutListener): Unit = js.native
  def addOnPreDrawListener(listener: OnPreDrawListener): Unit = js.native
  def addOnScrollChangedListener(listener: OnScrollChangedListener): Unit = js.native
  def addOnTouchModeChangeListener(listener: OnTouchModeChangeListener): Unit = js.native
  /* private */ def checkIsAlive(): js.Any = js.native
  def dispatchOnDraw(): Unit = js.native
  def dispatchOnGlobalLayout(): Unit = js.native
  def dispatchOnPreDraw(): Boolean = js.native
  def dispatchOnScrollChanged(): Unit = js.native
  def dispatchOnTouchModeChanged(inTouchMode: Boolean): Unit = js.native
  def isAlive(): Boolean = js.native
  /* private */ def kill(): js.Any = js.native
  def merge(observer: ViewTreeObserver): Unit = js.native
  def removeGlobalOnLayoutListener(victim: OnGlobalLayoutListener): Unit = js.native
  def removeOnDrawListener(victim: OnDrawListener): Unit = js.native
  def removeOnGlobalLayoutListener(victim: OnGlobalLayoutListener): Unit = js.native
  def removeOnPreDrawListener(victim: OnPreDrawListener): Unit = js.native
  def removeOnScrollChangedListener(victim: OnScrollChangedListener): Unit = js.native
  def removeOnTouchModeChangeListener(victim: OnTouchModeChangeListener): Unit = js.native
}

object ViewTreeObserver_ {
  @scala.inline
  def apply(
    addOnDrawListener: OnDrawListener => Unit,
    addOnGlobalLayoutListener: OnGlobalLayoutListener => Unit,
    addOnPreDrawListener: OnPreDrawListener => Unit,
    addOnScrollChangedListener: OnScrollChangedListener => Unit,
    addOnTouchModeChangeListener: OnTouchModeChangeListener => Unit,
    checkIsAlive: () => js.Any,
    dispatchOnDraw: () => Unit,
    dispatchOnGlobalLayout: () => Unit,
    dispatchOnPreDraw: () => Boolean,
    dispatchOnScrollChanged: () => Unit,
    dispatchOnTouchModeChanged: Boolean => Unit,
    isAlive: () => Boolean,
    kill: () => js.Any,
    mAlive: js.Any,
    mOnDrawListeners: js.Any,
    mOnGlobalLayoutListeners: js.Any,
    mOnPreDrawListeners: js.Any,
    mOnScrollChangedListeners: js.Any,
    mOnTouchModeChangeListeners: js.Any,
    merge: ViewTreeObserver => Unit,
    removeGlobalOnLayoutListener: OnGlobalLayoutListener => Unit,
    removeOnDrawListener: OnDrawListener => Unit,
    removeOnGlobalLayoutListener: OnGlobalLayoutListener => Unit,
    removeOnPreDrawListener: OnPreDrawListener => Unit,
    removeOnScrollChangedListener: OnScrollChangedListener => Unit,
    removeOnTouchModeChangeListener: OnTouchModeChangeListener => Unit
  ): ViewTreeObserver_ = {
    val __obj = js.Dynamic.literal(addOnDrawListener = js.Any.fromFunction1(addOnDrawListener), addOnGlobalLayoutListener = js.Any.fromFunction1(addOnGlobalLayoutListener), addOnPreDrawListener = js.Any.fromFunction1(addOnPreDrawListener), addOnScrollChangedListener = js.Any.fromFunction1(addOnScrollChangedListener), addOnTouchModeChangeListener = js.Any.fromFunction1(addOnTouchModeChangeListener), checkIsAlive = js.Any.fromFunction0(checkIsAlive), dispatchOnDraw = js.Any.fromFunction0(dispatchOnDraw), dispatchOnGlobalLayout = js.Any.fromFunction0(dispatchOnGlobalLayout), dispatchOnPreDraw = js.Any.fromFunction0(dispatchOnPreDraw), dispatchOnScrollChanged = js.Any.fromFunction0(dispatchOnScrollChanged), dispatchOnTouchModeChanged = js.Any.fromFunction1(dispatchOnTouchModeChanged), isAlive = js.Any.fromFunction0(isAlive), kill = js.Any.fromFunction0(kill), mAlive = mAlive.asInstanceOf[js.Any], mOnDrawListeners = mOnDrawListeners.asInstanceOf[js.Any], mOnGlobalLayoutListeners = mOnGlobalLayoutListeners.asInstanceOf[js.Any], mOnPreDrawListeners = mOnPreDrawListeners.asInstanceOf[js.Any], mOnScrollChangedListeners = mOnScrollChangedListeners.asInstanceOf[js.Any], mOnTouchModeChangeListeners = mOnTouchModeChangeListeners.asInstanceOf[js.Any], merge = js.Any.fromFunction1(merge), removeGlobalOnLayoutListener = js.Any.fromFunction1(removeGlobalOnLayoutListener), removeOnDrawListener = js.Any.fromFunction1(removeOnDrawListener), removeOnGlobalLayoutListener = js.Any.fromFunction1(removeOnGlobalLayoutListener), removeOnPreDrawListener = js.Any.fromFunction1(removeOnPreDrawListener), removeOnScrollChangedListener = js.Any.fromFunction1(removeOnScrollChangedListener), removeOnTouchModeChangeListener = js.Any.fromFunction1(removeOnTouchModeChangeListener))
    __obj.asInstanceOf[ViewTreeObserver_]
  }
  @scala.inline
  implicit class ViewTreeObserver_Ops[Self <: ViewTreeObserver_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddOnDrawListener(value: OnDrawListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOnDrawListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddOnGlobalLayoutListener(value: OnGlobalLayoutListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOnGlobalLayoutListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddOnPreDrawListener(value: OnPreDrawListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOnPreDrawListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddOnScrollChangedListener(value: OnScrollChangedListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOnScrollChangedListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddOnTouchModeChangeListener(value: OnTouchModeChangeListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addOnTouchModeChangeListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCheckIsAlive(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkIsAlive")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDispatchOnDraw(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatchOnDraw")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDispatchOnGlobalLayout(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatchOnGlobalLayout")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDispatchOnPreDraw(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatchOnPreDraw")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDispatchOnScrollChanged(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatchOnScrollChanged")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDispatchOnTouchModeChanged(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatchOnTouchModeChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsAlive(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAlive")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withKill(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kill")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMAlive(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mAlive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMOnDrawListeners(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mOnDrawListeners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMOnGlobalLayoutListeners(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mOnGlobalLayoutListeners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMOnPreDrawListeners(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mOnPreDrawListeners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMOnScrollChangedListeners(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mOnScrollChangedListeners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMOnTouchModeChangeListeners(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mOnTouchModeChangeListeners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMerge(value: ViewTreeObserver => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merge")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveGlobalOnLayoutListener(value: OnGlobalLayoutListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeGlobalOnLayoutListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveOnDrawListener(value: OnDrawListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeOnDrawListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveOnGlobalLayoutListener(value: OnGlobalLayoutListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeOnGlobalLayoutListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveOnPreDrawListener(value: OnPreDrawListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeOnPreDrawListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveOnScrollChangedListener(value: OnScrollChangedListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeOnScrollChangedListener")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveOnTouchModeChangeListener(value: OnTouchModeChangeListener => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeOnTouchModeChangeListener")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

