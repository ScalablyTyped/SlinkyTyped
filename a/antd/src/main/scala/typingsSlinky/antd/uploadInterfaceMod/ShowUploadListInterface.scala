package typingsSlinky.antd.uploadInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShowUploadListInterface extends js.Object {
  var showDownloadIcon: js.UndefOr[Boolean] = js.native
  var showPreviewIcon: js.UndefOr[Boolean] = js.native
  var showRemoveIcon: js.UndefOr[Boolean] = js.native
}

object ShowUploadListInterface {
  @scala.inline
  def apply(): ShowUploadListInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowUploadListInterface]
  }
  @scala.inline
  implicit class ShowUploadListInterfaceOps[Self <: ShowUploadListInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShowDownloadIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDownloadIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDownloadIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDownloadIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPreviewIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPreviewIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPreviewIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPreviewIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRemoveIcon(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRemoveIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRemoveIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRemoveIcon")(js.undefined)
        ret
    }
  }
  
}

