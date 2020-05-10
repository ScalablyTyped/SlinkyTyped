package typingsSlinky.androiduix.android.view.View

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnAttachStateChangeListener extends js.Object {
  def onViewAttachedToWindow(v: typingsSlinky.androiduix.android.view.View): js.Any = js.native
  def onViewDetachedFromWindow(v: typingsSlinky.androiduix.android.view.View): js.Any = js.native
}

object OnAttachStateChangeListener {
  @scala.inline
  def apply(
    onViewAttachedToWindow: typingsSlinky.androiduix.android.view.View => js.Any,
    onViewDetachedFromWindow: typingsSlinky.androiduix.android.view.View => js.Any
  ): OnAttachStateChangeListener = {
    val __obj = js.Dynamic.literal(onViewAttachedToWindow = js.Any.fromFunction1(onViewAttachedToWindow), onViewDetachedFromWindow = js.Any.fromFunction1(onViewDetachedFromWindow))
    __obj.asInstanceOf[OnAttachStateChangeListener]
  }
  @scala.inline
  implicit class OnAttachStateChangeListenerOps[Self <: OnAttachStateChangeListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnViewAttachedToWindow(value: typingsSlinky.androiduix.android.view.View => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onViewAttachedToWindow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnViewDetachedFromWindow(value: typingsSlinky.androiduix.android.view.View => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onViewDetachedFromWindow")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

