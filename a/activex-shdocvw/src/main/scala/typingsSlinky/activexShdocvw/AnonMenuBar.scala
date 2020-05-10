package typingsSlinky.activexShdocvw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMenuBar extends js.Object {
  val MenuBar: Boolean = js.native
}

object AnonMenuBar {
  @scala.inline
  def apply(MenuBar: Boolean): AnonMenuBar = {
    val __obj = js.Dynamic.literal(MenuBar = MenuBar.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMenuBar]
  }
  @scala.inline
  implicit class AnonMenuBarOps[Self <: AnonMenuBar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMenuBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MenuBar")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

