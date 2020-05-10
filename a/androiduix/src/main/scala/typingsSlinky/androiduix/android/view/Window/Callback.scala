package typingsSlinky.androiduix.android.view.Window

import typingsSlinky.androiduix.android.view.KeyEvent
import typingsSlinky.androiduix.android.view.MotionEvent
import typingsSlinky.androiduix.android.view.WindowManager.LayoutParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Callback extends js.Object {
  def dispatchGenericMotionEvent(event: MotionEvent): Boolean = js.native
  def dispatchKeyEvent(event: KeyEvent): Boolean = js.native
  def dispatchTouchEvent(event: MotionEvent): Boolean = js.native
  def onAttachedToWindow(): Unit = js.native
  def onContentChanged(): Unit = js.native
  def onDetachedFromWindow(): Unit = js.native
  def onWindowAttributesChanged(attrs: LayoutParams): Unit = js.native
  def onWindowFocusChanged(hasFocus: Boolean): Unit = js.native
}

object Callback {
  @scala.inline
  def apply(
    dispatchGenericMotionEvent: MotionEvent => Boolean,
    dispatchKeyEvent: KeyEvent => Boolean,
    dispatchTouchEvent: MotionEvent => Boolean,
    onAttachedToWindow: () => Unit,
    onContentChanged: () => Unit,
    onDetachedFromWindow: () => Unit,
    onWindowAttributesChanged: LayoutParams => Unit,
    onWindowFocusChanged: Boolean => Unit
  ): Callback = {
    val __obj = js.Dynamic.literal(dispatchGenericMotionEvent = js.Any.fromFunction1(dispatchGenericMotionEvent), dispatchKeyEvent = js.Any.fromFunction1(dispatchKeyEvent), dispatchTouchEvent = js.Any.fromFunction1(dispatchTouchEvent), onAttachedToWindow = js.Any.fromFunction0(onAttachedToWindow), onContentChanged = js.Any.fromFunction0(onContentChanged), onDetachedFromWindow = js.Any.fromFunction0(onDetachedFromWindow), onWindowAttributesChanged = js.Any.fromFunction1(onWindowAttributesChanged), onWindowFocusChanged = js.Any.fromFunction1(onWindowFocusChanged))
    __obj.asInstanceOf[Callback]
  }
  @scala.inline
  implicit class CallbackOps[Self <: Callback] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDispatchGenericMotionEvent(value: MotionEvent => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatchGenericMotionEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDispatchKeyEvent(value: KeyEvent => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatchKeyEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDispatchTouchEvent(value: MotionEvent => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatchTouchEvent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnAttachedToWindow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAttachedToWindow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnContentChanged(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onContentChanged")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnDetachedFromWindow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDetachedFromWindow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnWindowAttributesChanged(value: LayoutParams => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWindowAttributesChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnWindowFocusChanged(value: Boolean => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onWindowFocusChanged")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

