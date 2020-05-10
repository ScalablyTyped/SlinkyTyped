package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileManagerMessagesToolbar extends js.Object {
  var createFolder: js.UndefOr[String] = js.native
  var dateCreatedField: js.UndefOr[String] = js.native
  var dateModifiedField: js.UndefOr[String] = js.native
  var delete: js.UndefOr[String] = js.native
  var details: js.UndefOr[String] = js.native
  var detailsChecked: js.UndefOr[String] = js.native
  var detailsUnchecked: js.UndefOr[String] = js.native
  var nameField: js.UndefOr[String] = js.native
  var rename: js.UndefOr[String] = js.native
  var search: js.UndefOr[String] = js.native
  var sizeField: js.UndefOr[String] = js.native
  var sortDirection: js.UndefOr[String] = js.native
  var sortDirectionAsc: js.UndefOr[String] = js.native
  var sortDirectionDesc: js.UndefOr[String] = js.native
  var sortField: js.UndefOr[String] = js.native
  var typeField: js.UndefOr[String] = js.native
  var uploadDialog: js.UndefOr[String] = js.native
}

object FileManagerMessagesToolbar {
  @scala.inline
  def apply(): FileManagerMessagesToolbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileManagerMessagesToolbar]
  }
  @scala.inline
  implicit class FileManagerMessagesToolbarOps[Self <: FileManagerMessagesToolbar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateFolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateFolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFolder")(js.undefined)
        ret
    }
    @scala.inline
    def withDateCreatedField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateCreatedField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateCreatedField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateCreatedField")(js.undefined)
        ret
    }
    @scala.inline
    def withDateModifiedField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateModifiedField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateModifiedField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateModifiedField")(js.undefined)
        ret
    }
    @scala.inline
    def withDelete(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.undefined)
        ret
    }
    @scala.inline
    def withDetails(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("details")(js.undefined)
        ret
    }
    @scala.inline
    def withDetailsChecked(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailsChecked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetailsChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailsChecked")(js.undefined)
        ret
    }
    @scala.inline
    def withDetailsUnchecked(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailsUnchecked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetailsUnchecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detailsUnchecked")(js.undefined)
        ret
    }
    @scala.inline
    def withNameField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameField")(js.undefined)
        ret
    }
    @scala.inline
    def withRename(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rename")(js.undefined)
        ret
    }
    @scala.inline
    def withSearch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeField")(js.undefined)
        ret
    }
    @scala.inline
    def withSortDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDirection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withSortDirectionAsc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDirectionAsc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortDirectionAsc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDirectionAsc")(js.undefined)
        ret
    }
    @scala.inline
    def withSortDirectionDesc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDirectionDesc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortDirectionDesc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortDirectionDesc")(js.undefined)
        ret
    }
    @scala.inline
    def withSortField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortField")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeField")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadDialog(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadDialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadDialog: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadDialog")(js.undefined)
        ret
    }
  }
  
}

