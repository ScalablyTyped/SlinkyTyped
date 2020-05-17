package typingsSlinky.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuItem extends js.Object {
  def disable(): Unit = js.native
  def enable(): Unit = js.native
  def setIcon(iconUrl: String): Unit = js.native
  def setText(text: String): Unit = js.native
}

object MenuItem {
  @scala.inline
  def apply(disable: () => Unit, enable: () => Unit, setIcon: String => Unit, setText: String => Unit): MenuItem = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), setIcon = js.Any.fromFunction1(setIcon), setText = js.Any.fromFunction1(setText))
    __obj.asInstanceOf[MenuItem]
  }
  @scala.inline
  implicit class MenuItemOps[Self <: MenuItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEnable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetIcon(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setIcon")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetText(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setText")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

