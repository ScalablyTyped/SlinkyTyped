package typingsSlinky.androiduix.android.text.method

import typingsSlinky.androiduix.android.text.Spannable
import typingsSlinky.androiduix.android.view.KeyEvent
import typingsSlinky.androiduix.android.view.MotionEvent
import typingsSlinky.androiduix.android.widget.TextView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MovementMethod extends js.Object {
  def canSelectArbitrarily(): Boolean = js.native
  def initialize(widget: TextView, text: Spannable): Unit = js.native
  def onGenericMotionEvent(widget: TextView, text: Spannable, event: MotionEvent): Boolean = js.native
  def onKeyDown(widget: TextView, text: Spannable, keyCode: Double, event: KeyEvent): Boolean = js.native
  def onKeyOther(view: TextView, text: Spannable, event: KeyEvent): Boolean = js.native
  def onKeyUp(widget: TextView, text: Spannable, keyCode: Double, event: KeyEvent): Boolean = js.native
  def onTakeFocus(widget: TextView, text: Spannable, direction: Double): Unit = js.native
  def onTouchEvent(widget: TextView, text: Spannable, event: MotionEvent): Boolean = js.native
  def onTrackballEvent(widget: TextView, text: Spannable, event: MotionEvent): Boolean = js.native
}

object MovementMethod {
  @scala.inline
  def apply(
    canSelectArbitrarily: () => Boolean,
    initialize: (TextView, Spannable) => Unit,
    onGenericMotionEvent: (TextView, Spannable, MotionEvent) => Boolean,
    onKeyDown: (TextView, Spannable, Double, KeyEvent) => Boolean,
    onKeyOther: (TextView, Spannable, KeyEvent) => Boolean,
    onKeyUp: (TextView, Spannable, Double, KeyEvent) => Boolean,
    onTakeFocus: (TextView, Spannable, Double) => Unit,
    onTouchEvent: (TextView, Spannable, MotionEvent) => Boolean,
    onTrackballEvent: (TextView, Spannable, MotionEvent) => Boolean
  ): MovementMethod = {
    val __obj = js.Dynamic.literal(canSelectArbitrarily = js.Any.fromFunction0(canSelectArbitrarily), initialize = js.Any.fromFunction2(initialize), onGenericMotionEvent = js.Any.fromFunction3(onGenericMotionEvent), onKeyDown = js.Any.fromFunction4(onKeyDown), onKeyOther = js.Any.fromFunction3(onKeyOther), onKeyUp = js.Any.fromFunction4(onKeyUp), onTakeFocus = js.Any.fromFunction3(onTakeFocus), onTouchEvent = js.Any.fromFunction3(onTouchEvent), onTrackballEvent = js.Any.fromFunction3(onTrackballEvent))
    __obj.asInstanceOf[MovementMethod]
  }
  @scala.inline
  implicit class MovementMethodOps[Self <: MovementMethod] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanSelectArbitrarily(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canSelectArbitrarily")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withInitialize(value: (TextView, Spannable) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialize")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnGenericMotionEvent(value: (TextView, Spannable, MotionEvent) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onGenericMotionEvent")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withOnKeyDown(value: (TextView, Spannable, Double, KeyEvent) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withOnKeyOther(value: (TextView, Spannable, KeyEvent) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyOther")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withOnKeyUp(value: (TextView, Spannable, Double, KeyEvent) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyUp")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withOnTakeFocus(value: (TextView, Spannable, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTakeFocus")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withOnTouchEvent(value: (TextView, Spannable, MotionEvent) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchEvent")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withOnTrackballEvent(value: (TextView, Spannable, MotionEvent) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTrackballEvent")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

