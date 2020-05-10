package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileManagerPreviewPane extends js.Object {
  var metaFields: js.UndefOr[js.Any] = js.native
  var multipleFilesTemplate: js.UndefOr[String | js.Function] = js.native
  var noFileTemplate: js.UndefOr[String | js.Function] = js.native
  var singleFileTemplate: js.UndefOr[String | js.Function] = js.native
}

object FileManagerPreviewPane {
  @scala.inline
  def apply(): FileManagerPreviewPane = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileManagerPreviewPane]
  }
  @scala.inline
  implicit class FileManagerPreviewPaneOps[Self <: FileManagerPreviewPane] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetaFields(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetaFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metaFields")(js.undefined)
        ret
    }
    @scala.inline
    def withMultipleFilesTemplate(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleFilesTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultipleFilesTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipleFilesTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withNoFileTemplate(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noFileTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoFileTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noFileTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleFileTemplate(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleFileTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleFileTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleFileTemplate")(js.undefined)
        ret
    }
  }
  
}

