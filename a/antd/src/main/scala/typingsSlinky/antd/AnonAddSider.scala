package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAddSider extends js.Object {
  def addSider(id: String): Unit = js.native
  def removeSider(id: String): Unit = js.native
}

object AnonAddSider {
  @scala.inline
  def apply(addSider: String => Unit, removeSider: String => Unit): AnonAddSider = {
    val __obj = js.Dynamic.literal(addSider = js.Any.fromFunction1(addSider), removeSider = js.Any.fromFunction1(removeSider))
    __obj.asInstanceOf[AnonAddSider]
  }
  @scala.inline
  implicit class AnonAddSiderOps[Self <: AnonAddSider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddSider(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSider")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemoveSider(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeSider")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

