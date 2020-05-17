package typingsSlinky.androiduix.android.widget.ListPopupWindow.ForwardingListener

import typingsSlinky.androiduix.java_.lang.Runnable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisallowIntercept extends Runnable {
  var _ForwardingListener_this: typingsSlinky.androiduix.android.widget.ListPopupWindow.ForwardingListener = js.native
}

object DisallowIntercept {
  @scala.inline
  def apply(
    _ForwardingListener_this: typingsSlinky.androiduix.android.widget.ListPopupWindow.ForwardingListener,
    run: () => js.Any
  ): DisallowIntercept = {
    val __obj = js.Dynamic.literal(_ForwardingListener_this = _ForwardingListener_this.asInstanceOf[js.Any], run = js.Any.fromFunction0(run))
    __obj.asInstanceOf[DisallowIntercept]
  }
  @scala.inline
  implicit class DisallowInterceptOps[Self <: DisallowIntercept] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_ForwardingListener_this(value: typingsSlinky.androiduix.android.widget.ListPopupWindow.ForwardingListener): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_ForwardingListener_this")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

