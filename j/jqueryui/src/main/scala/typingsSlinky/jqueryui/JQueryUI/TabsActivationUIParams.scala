package typingsSlinky.jqueryui.JQueryUI

import typingsSlinky.jqueryui.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabsActivationUIParams extends js.Object {
  var newPanel: JQuery = js.native
  var newTab: JQuery = js.native
  var oldPanel: JQuery = js.native
  var oldTab: JQuery = js.native
}

object TabsActivationUIParams {
  @scala.inline
  def apply(newPanel: JQuery, newTab: JQuery, oldPanel: JQuery, oldTab: JQuery): TabsActivationUIParams = {
    val __obj = js.Dynamic.literal(newPanel = newPanel.asInstanceOf[js.Any], newTab = newTab.asInstanceOf[js.Any], oldPanel = oldPanel.asInstanceOf[js.Any], oldTab = oldTab.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsActivationUIParams]
  }
  @scala.inline
  implicit class TabsActivationUIParamsOps[Self <: TabsActivationUIParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewPanel(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewTab(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newTab")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldPanel(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldPanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldTab(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldTab")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

