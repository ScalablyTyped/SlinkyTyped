package typingsSlinky.jqueryui.JQueryUI

import typingsSlinky.jqueryui.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccordionUIParams extends js.Object {
  var newHeader: JQuery = js.native
  var newPanel: JQuery = js.native
  var oldHeader: JQuery = js.native
  var oldPanel: JQuery = js.native
}

object AccordionUIParams {
  @scala.inline
  def apply(newHeader: JQuery, newPanel: JQuery, oldHeader: JQuery, oldPanel: JQuery): AccordionUIParams = {
    val __obj = js.Dynamic.literal(newHeader = newHeader.asInstanceOf[js.Any], newPanel = newPanel.asInstanceOf[js.Any], oldHeader = oldHeader.asInstanceOf[js.Any], oldPanel = oldPanel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionUIParams]
  }
  @scala.inline
  implicit class AccordionUIParamsOps[Self <: AccordionUIParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewHeader(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNewPanel(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newPanel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldHeader(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOldPanel(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldPanel")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

