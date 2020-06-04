package typingsSlinky.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InkBar extends js.Object {
  var inkBar: Boolean
  var tabPane: Boolean
}

object InkBar {
  @scala.inline
  def apply(inkBar: Boolean, tabPane: Boolean): InkBar = {
    val __obj = js.Dynamic.literal(inkBar = inkBar.asInstanceOf[js.Any], tabPane = tabPane.asInstanceOf[js.Any])
    __obj.asInstanceOf[InkBar]
  }
  @scala.inline
  implicit class InkBarOps[Self <: InkBar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInkBar(value: Boolean): Self = this.set("inkBar", value.asInstanceOf[js.Any])
    @scala.inline
    def setTabPane(value: Boolean): Self = this.set("tabPane", value.asInstanceOf[js.Any])
  }
  
}

