package typingsSlinky.androiduix.android.view.KeyEvent

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Callback extends js.Object {
  def onKeyDown(keyCode: Double, event: typingsSlinky.androiduix.android.view.KeyEvent): Boolean = js.native
  def onKeyLongPress(keyCode: Double, event: typingsSlinky.androiduix.android.view.KeyEvent): Boolean = js.native
  def onKeyUp(keyCode: Double, event: typingsSlinky.androiduix.android.view.KeyEvent): Boolean = js.native
}

object Callback {
  @scala.inline
  def apply(
    onKeyDown: (Double, typingsSlinky.androiduix.android.view.KeyEvent) => Boolean,
    onKeyLongPress: (Double, typingsSlinky.androiduix.android.view.KeyEvent) => Boolean,
    onKeyUp: (Double, typingsSlinky.androiduix.android.view.KeyEvent) => Boolean
  ): Callback = {
    val __obj = js.Dynamic.literal(onKeyDown = js.Any.fromFunction2(onKeyDown), onKeyLongPress = js.Any.fromFunction2(onKeyLongPress), onKeyUp = js.Any.fromFunction2(onKeyUp))
    __obj.asInstanceOf[Callback]
  }
  @scala.inline
  implicit class CallbackOps[Self <: Callback] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnKeyDown(value: (Double, typingsSlinky.androiduix.android.view.KeyEvent) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyDown")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnKeyLongPress(value: (Double, typingsSlinky.androiduix.android.view.KeyEvent) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyLongPress")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnKeyUp(value: (Double, typingsSlinky.androiduix.android.view.KeyEvent) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKeyUp")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

