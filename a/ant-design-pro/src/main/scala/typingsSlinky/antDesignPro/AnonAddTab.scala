package typingsSlinky.antDesignPro

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddTab extends js.Object {
  def addTab(id: js.Any): Unit = js.native
  def removeTab(id: js.Any): Unit = js.native
}

object AnonAddTab {
  @scala.inline
  def apply(addTab: js.Any => Unit, removeTab: js.Any => Unit): AnonAddTab = {
    val __obj = js.Dynamic.literal(addTab = js.Any.fromFunction1(addTab), removeTab = js.Any.fromFunction1(removeTab))
    __obj.asInstanceOf[AnonAddTab]
  }
  @scala.inline
  implicit class AnonAddTabOps[Self <: AnonAddTab] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddTab(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addTab")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveTab(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeTab")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

