package typingsSlinky.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonInkBar extends js.Object {
  var inkBar: Boolean = js.native
  var tabPane: Boolean = js.native
}

object AnonInkBar {
  @scala.inline
  def apply(inkBar: Boolean, tabPane: Boolean): AnonInkBar = {
    val __obj = js.Dynamic.literal(inkBar = inkBar.asInstanceOf[js.Any], tabPane = tabPane.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInkBar]
  }
  @scala.inline
  implicit class AnonInkBarOps[Self <: AnonInkBar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInkBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inkBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTabPane(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabPane")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

