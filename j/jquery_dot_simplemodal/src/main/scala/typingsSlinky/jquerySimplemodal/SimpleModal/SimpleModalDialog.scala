package typingsSlinky.jquerySimplemodal.SimpleModal

import typingsSlinky.jquerySimplemodal.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Sent to callbacks as a parameter. */
@js.native
trait SimpleModalDialog extends js.Object {
  var container: JQuery = js.native
  var data: js.Any = js.native
  var iframe: JQuery = js.native
  var overlay: JQuery = js.native
}

object SimpleModalDialog {
  @scala.inline
  def apply(container: JQuery, data: js.Any, iframe: JQuery, overlay: JQuery): SimpleModalDialog = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], iframe = iframe.asInstanceOf[js.Any], overlay = overlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleModalDialog]
  }
  @scala.inline
  implicit class SimpleModalDialogOps[Self <: SimpleModalDialog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainer(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIframe(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iframe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverlay(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overlay")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

