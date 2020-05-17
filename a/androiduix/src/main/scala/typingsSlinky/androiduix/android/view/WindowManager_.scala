package typingsSlinky.androiduix.android.view

import typingsSlinky.androiduix.android.view.ViewGroup.LayoutParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowManager_ extends js.Object {
  var mActiveWindow: Window = js.native
  var mWindowsLayout: js.Any = js.native
  def addWindow(window: Window): Unit = js.native
  def getWindowsLayout(): ViewGroup = js.native
  def removeWindow(window: Window): Unit = js.native
  def updateWindowLayout(window: Window, params: LayoutParams): Unit = js.native
}

object WindowManager_ {
  @scala.inline
  def apply(
    addWindow: Window => Unit,
    getWindowsLayout: () => ViewGroup,
    mActiveWindow: Window,
    mWindowsLayout: js.Any,
    removeWindow: Window => Unit,
    updateWindowLayout: (Window, LayoutParams) => Unit
  ): WindowManager_ = {
    val __obj = js.Dynamic.literal(addWindow = js.Any.fromFunction1(addWindow), getWindowsLayout = js.Any.fromFunction0(getWindowsLayout), mActiveWindow = mActiveWindow.asInstanceOf[js.Any], mWindowsLayout = mWindowsLayout.asInstanceOf[js.Any], removeWindow = js.Any.fromFunction1(removeWindow), updateWindowLayout = js.Any.fromFunction2(updateWindowLayout))
    __obj.asInstanceOf[WindowManager_]
  }
  @scala.inline
  implicit class WindowManager_Ops[Self <: WindowManager_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddWindow(value: Window => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addWindow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetWindowsLayout(value: () => ViewGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getWindowsLayout")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMActiveWindow(value: Window): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mActiveWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMWindowsLayout(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mWindowsLayout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoveWindow(value: Window => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeWindow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateWindowLayout(value: (Window, LayoutParams) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateWindowLayout")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

