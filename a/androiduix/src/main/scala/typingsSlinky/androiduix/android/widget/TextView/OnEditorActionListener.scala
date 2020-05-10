package typingsSlinky.androiduix.android.widget.TextView

import typingsSlinky.androiduix.android.view.KeyEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnEditorActionListener extends js.Object {
  def onEditorAction(v: typingsSlinky.androiduix.android.widget.TextView, actionId: Double, event: KeyEvent): Boolean = js.native
}

object OnEditorActionListener {
  @scala.inline
  def apply(onEditorAction: (typingsSlinky.androiduix.android.widget.TextView, Double, KeyEvent) => Boolean): OnEditorActionListener = {
    val __obj = js.Dynamic.literal(onEditorAction = js.Any.fromFunction3(onEditorAction))
    __obj.asInstanceOf[OnEditorActionListener]
  }
  @scala.inline
  implicit class OnEditorActionListenerOps[Self <: OnEditorActionListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnEditorAction(value: (typingsSlinky.androiduix.android.widget.TextView, Double, KeyEvent) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEditorAction")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

