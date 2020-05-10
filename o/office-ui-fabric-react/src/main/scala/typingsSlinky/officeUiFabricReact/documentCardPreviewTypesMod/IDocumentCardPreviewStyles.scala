package typingsSlinky.officeUiFabricReact.documentCardPreviewTypesMod

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDocumentCardPreviewStyles extends js.Object {
  var fileList: IStyle = js.native
  var fileListIcon: IStyle = js.native
  var fileListLink: IStyle = js.native
  var fileListOverflowText: IStyle = js.native
  var icon: IStyle = js.native
  var previewIcon: IStyle = js.native
  var root: IStyle = js.native
}

object IDocumentCardPreviewStyles {
  @scala.inline
  def apply(): IDocumentCardPreviewStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDocumentCardPreviewStyles]
  }
  @scala.inline
  implicit class IDocumentCardPreviewStylesOps[Self <: IDocumentCardPreviewStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileList(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileList")(js.undefined)
        ret
    }
    @scala.inline
    def withFileListNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileList")(null)
        ret
    }
    @scala.inline
    def withFileListIcon(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileListIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileListIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileListIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withFileListIconNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileListIcon")(null)
        ret
    }
    @scala.inline
    def withFileListLink(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileListLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileListLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileListLink")(js.undefined)
        ret
    }
    @scala.inline
    def withFileListLinkNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileListLink")(null)
        ret
    }
    @scala.inline
    def withFileListOverflowText(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileListOverflowText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileListOverflowText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileListOverflowText")(js.undefined)
        ret
    }
    @scala.inline
    def withFileListOverflowTextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileListOverflowText")(null)
        ret
    }
    @scala.inline
    def withIcon(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withIconNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(null)
        ret
    }
    @scala.inline
    def withPreviewIcon(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviewIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviewIconNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewIcon")(null)
        ret
    }
    @scala.inline
    def withRoot(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
    @scala.inline
    def withRootNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(null)
        ret
    }
  }
  
}

