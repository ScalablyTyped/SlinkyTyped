package typingsSlinky.androiduix.android.widget.AbsListView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowRunnnable extends js.Object {
  var _AbsListView_this: typingsSlinky.androiduix.android.widget.AbsListView = js.native
  var mOriginalAttachCount: js.Any = js.native
  def rememberWindowAttachCount(): Unit = js.native
  def sameWindow(): Boolean = js.native
}

object WindowRunnnable {
  @scala.inline
  def apply(
    _AbsListView_this: typingsSlinky.androiduix.android.widget.AbsListView,
    mOriginalAttachCount: js.Any,
    rememberWindowAttachCount: () => Unit,
    sameWindow: () => Boolean
  ): WindowRunnnable = {
    val __obj = js.Dynamic.literal(_AbsListView_this = _AbsListView_this.asInstanceOf[js.Any], mOriginalAttachCount = mOriginalAttachCount.asInstanceOf[js.Any], rememberWindowAttachCount = js.Any.fromFunction0(rememberWindowAttachCount), sameWindow = js.Any.fromFunction0(sameWindow))
    __obj.asInstanceOf[WindowRunnnable]
  }
  @scala.inline
  implicit class WindowRunnnableOps[Self <: WindowRunnnable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_AbsListView_this(value: typingsSlinky.androiduix.android.widget.AbsListView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_AbsListView_this")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMOriginalAttachCount(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mOriginalAttachCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRememberWindowAttachCount(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rememberWindowAttachCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSameWindow(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sameWindow")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

