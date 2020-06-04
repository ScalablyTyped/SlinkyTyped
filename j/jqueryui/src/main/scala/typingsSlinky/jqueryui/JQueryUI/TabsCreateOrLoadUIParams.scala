package typingsSlinky.jqueryui.JQueryUI

import typingsSlinky.jqueryui.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsCreateOrLoadUIParams extends js.Object {
  var panel: JQuery
  var tab: JQuery
}

object TabsCreateOrLoadUIParams {
  @scala.inline
  def apply(panel: JQuery, tab: JQuery): TabsCreateOrLoadUIParams = {
    val __obj = js.Dynamic.literal(panel = panel.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsCreateOrLoadUIParams]
  }
  @scala.inline
  implicit class TabsCreateOrLoadUIParamsOps[Self <: TabsCreateOrLoadUIParams] (val x: Self) extends AnyVal {
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
    def setPanel(value: JQuery): Self = this.set("panel", value.asInstanceOf[js.Any])
    @scala.inline
    def setTab(value: JQuery): Self = this.set("tab", value.asInstanceOf[js.Any])
  }
  
}

