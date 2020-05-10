package typingsSlinky.jqueryui.JQueryUI

import typingsSlinky.jquery.JQueryXHR
import typingsSlinky.jqueryui.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabsBeforeLoadUIParams extends js.Object {
  var ajaxSettings: js.Any = js.native
  var jqXHR: JQueryXHR = js.native
  var panel: JQuery = js.native
  var tab: JQuery = js.native
}

object TabsBeforeLoadUIParams {
  @scala.inline
  def apply(ajaxSettings: js.Any, jqXHR: JQueryXHR, panel: JQuery, tab: JQuery): TabsBeforeLoadUIParams = {
    val __obj = js.Dynamic.literal(ajaxSettings = ajaxSettings.asInstanceOf[js.Any], jqXHR = jqXHR.asInstanceOf[js.Any], panel = panel.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsBeforeLoadUIParams]
  }
  @scala.inline
  implicit class TabsBeforeLoadUIParamsOps[Self <: TabsBeforeLoadUIParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAjaxSettings(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJqXHR(value: JQueryXHR): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jqXHR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPanel(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTab(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tab")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

