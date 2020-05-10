package typingsSlinky.akuminaCore.isavepagewidgetrequestMod

import typingsSlinky.akuminaCore.ipagewidgetMod.IPageWidget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISavePageWidgetRequest extends js.Object {
  var pageId: String = js.native
  var pageWidgets: js.Array[IPageWidget] = js.native
}

object ISavePageWidgetRequest {
  @scala.inline
  def apply(pageId: String, pageWidgets: js.Array[IPageWidget]): ISavePageWidgetRequest = {
    val __obj = js.Dynamic.literal(pageId = pageId.asInstanceOf[js.Any], pageWidgets = pageWidgets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISavePageWidgetRequest]
  }
  @scala.inline
  implicit class ISavePageWidgetRequestOps[Self <: ISavePageWidgetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageWidgets(value: js.Array[IPageWidget]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageWidgets")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

