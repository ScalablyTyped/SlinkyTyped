package typingsSlinky.activexLibreoffice.com_.sun.star.ui.test

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XUITest extends js.Object {
  val TopFocusWindow: XUIObject = js.native
  def executeCommand(command: String): Unit = js.native
  def getTopFocusWindow(): XUIObject = js.native
}

object XUITest {
  @scala.inline
  def apply(TopFocusWindow: XUIObject, executeCommand: String => Unit, getTopFocusWindow: () => XUIObject): XUITest = {
    val __obj = js.Dynamic.literal(TopFocusWindow = TopFocusWindow.asInstanceOf[js.Any], executeCommand = js.Any.fromFunction1(executeCommand), getTopFocusWindow = js.Any.fromFunction0(getTopFocusWindow))
    __obj.asInstanceOf[XUITest]
  }
  @scala.inline
  implicit class XUITestOps[Self <: XUITest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTopFocusWindow(value: XUIObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TopFocusWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExecuteCommand(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executeCommand")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetTopFocusWindow(value: () => XUIObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTopFocusWindow")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

