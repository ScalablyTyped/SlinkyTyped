package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows injection of keyboard and mouse events
  * @since LibreOffice 5.1
  */
@js.native
trait XToolkitRobot extends js.Object {
  def keyPress(aKeyEvent: KeyEvent): Unit = js.native
  def keyRelease(aKeyEvent: KeyEvent): Unit = js.native
  def mouseMove(aMouseEvent: MouseEvent): Unit = js.native
  def mousePress(aMouseEvent: MouseEvent): Unit = js.native
  def mouseRelease(aMouseEvent: MouseEvent): Unit = js.native
}

object XToolkitRobot {
  @scala.inline
  def apply(
    keyPress: KeyEvent => Unit,
    keyRelease: KeyEvent => Unit,
    mouseMove: MouseEvent => Unit,
    mousePress: MouseEvent => Unit,
    mouseRelease: MouseEvent => Unit
  ): XToolkitRobot = {
    val __obj = js.Dynamic.literal(keyPress = js.Any.fromFunction1(keyPress), keyRelease = js.Any.fromFunction1(keyRelease), mouseMove = js.Any.fromFunction1(mouseMove), mousePress = js.Any.fromFunction1(mousePress), mouseRelease = js.Any.fromFunction1(mouseRelease))
    __obj.asInstanceOf[XToolkitRobot]
  }
  @scala.inline
  implicit class XToolkitRobotOps[Self <: XToolkitRobot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeyPress(value: KeyEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyPress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKeyRelease(value: KeyEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyRelease")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMouseMove(value: MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseMove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMousePress(value: MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mousePress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMouseRelease(value: MouseEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouseRelease")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

