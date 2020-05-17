package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ASPxClientWebDocumentViewerBrickNavigation extends js.Object {
  var drillDownKey: String = js.native
  var target: String = js.native
  var url: String = js.native
}

object ASPxClientWebDocumentViewerBrickNavigation {
  @scala.inline
  def apply(drillDownKey: String, target: String, url: String): ASPxClientWebDocumentViewerBrickNavigation = {
    val __obj = js.Dynamic.literal(drillDownKey = drillDownKey.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientWebDocumentViewerBrickNavigation]
  }
  @scala.inline
  implicit class ASPxClientWebDocumentViewerBrickNavigationOps[Self <: ASPxClientWebDocumentViewerBrickNavigation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDrillDownKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drillDownKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

