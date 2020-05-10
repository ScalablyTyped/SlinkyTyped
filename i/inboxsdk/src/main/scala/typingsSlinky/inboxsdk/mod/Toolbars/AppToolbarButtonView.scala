package typingsSlinky.inboxsdk.mod.Toolbars

import typingsSlinky.inboxsdk.inboxsdkStrings.destroy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppToolbarButtonView extends js.Object {
  var destroyed: Boolean = js.native
  def close(): Unit = js.native
  @JSName("on")
  def on_destroy(name: destroy, cb: js.Function0[Unit]): Unit = js.native
  def open(): Unit = js.native
  def remove(): Unit = js.native
}

object AppToolbarButtonView {
  @scala.inline
  def apply(
    close: () => Unit,
    destroyed: Boolean,
    on: (destroy, js.Function0[Unit]) => Unit,
    open: () => Unit,
    remove: () => Unit
  ): AppToolbarButtonView = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), destroyed = destroyed.asInstanceOf[js.Any], on = js.Any.fromFunction2(on), open = js.Any.fromFunction0(open), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[AppToolbarButtonView]
  }
  @scala.inline
  implicit class AppToolbarButtonViewOps[Self <: AppToolbarButtonView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDestroyed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroyed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOn(value: (destroy, js.Function0[Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("on")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOpen(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemove(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

