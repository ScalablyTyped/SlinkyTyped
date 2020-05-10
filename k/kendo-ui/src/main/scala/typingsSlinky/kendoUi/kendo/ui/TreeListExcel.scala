package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeListExcel extends js.Object {
  var fileName: js.UndefOr[String] = js.native
  var filterable: js.UndefOr[Boolean] = js.native
  var forceProxy: js.UndefOr[Boolean] = js.native
  var proxyURL: js.UndefOr[String] = js.native
}

object TreeListExcel {
  @scala.inline
  def apply(): TreeListExcel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeListExcel]
  }
  @scala.inline
  implicit class TreeListExcelOps[Self <: TreeListExcel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileName")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterable")(js.undefined)
        ret
    }
    @scala.inline
    def withForceProxy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceProxy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceProxy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceProxy")(js.undefined)
        ret
    }
    @scala.inline
    def withProxyURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProxyURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proxyURL")(js.undefined)
        ret
    }
  }
  
}

