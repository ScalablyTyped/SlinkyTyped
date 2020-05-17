package typingsSlinky.dockSpawn.dockspawn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dialog extends js.Object {
  def bringToFront(): Unit = js.native
  def resize(width: Double, height: Double): Unit = js.native
  def setPosition(x: Double, y: Double): Unit = js.native
  def setTitle(title: String): Unit = js.native
  def setTitleIcon(iconName: String): Unit = js.native
}

object Dialog {
  @scala.inline
  def apply(
    bringToFront: () => Unit,
    resize: (Double, Double) => Unit,
    setPosition: (Double, Double) => Unit,
    setTitle: String => Unit,
    setTitleIcon: String => Unit
  ): Dialog = {
    val __obj = js.Dynamic.literal(bringToFront = js.Any.fromFunction0(bringToFront), resize = js.Any.fromFunction2(resize), setPosition = js.Any.fromFunction2(setPosition), setTitle = js.Any.fromFunction1(setTitle), setTitleIcon = js.Any.fromFunction1(setTitleIcon))
    __obj.asInstanceOf[Dialog]
  }
  @scala.inline
  implicit class DialogOps[Self <: Dialog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBringToFront(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bringToFront")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withResize(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetPosition(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPosition")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetTitle(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetTitleIcon(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitleIcon")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

