package typingsSlinky.activexShdocvw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonToolBar extends js.Object {
  val ToolBar: Boolean = js.native
}

object AnonToolBar {
  @scala.inline
  def apply(ToolBar: Boolean): AnonToolBar = {
    val __obj = js.Dynamic.literal(ToolBar = ToolBar.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonToolBar]
  }
  @scala.inline
  implicit class AnonToolBarOps[Self <: AnonToolBar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToolBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ToolBar")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

