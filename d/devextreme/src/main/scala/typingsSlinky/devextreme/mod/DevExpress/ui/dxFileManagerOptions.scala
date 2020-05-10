package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.AnonComponentDxFileManager
import typingsSlinky.devextreme.AnonCopy
import typingsSlinky.devextreme.AnonFileItem
import typingsSlinky.devextreme.AnonMaxFileSize
import typingsSlinky.devextreme.AnonMode
import typingsSlinky.devextreme.devextremeStrings.multiple
import typingsSlinky.devextreme.devextremeStrings.single_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxFileManagerOptions extends WidgetOptions[dxFileManager] {
  /** Specifies the allowed upload file extensions. */
  var allowedFileExtensions: js.UndefOr[js.Array[String]] = js.native
  /** Configures the context menu settings. */
  var contextMenu: js.UndefOr[dxFileManagerContextMenu] = js.native
  /** Specifies the path that is used when the FileManager is initialized. */
  var currentPath: js.UndefOr[String] = js.native
  /** Customizes columns in details view. Applies only if itemView.mode is "details". */
  var customizeDetailColumns: js.UndefOr[
    js.Function1[/* columns */ js.Array[dxDataGridColumn], js.Array[dxDataGridColumn]]
  ] = js.native
  /** Allows you to provide custom icons to be used as thumbnails. */
  var customizeThumbnail: js.UndefOr[js.Function1[/* fileItem */ js.Any, String]] = js.native
  /** Specifies the file provider. */
  var fileProvider: js.UndefOr[js.Any] = js.native
  /** Configures the file and folder view. */
  var itemView: js.UndefOr[AnonMode] = js.native
  /** A function that is executed when the current directory is changed. */
  var onCurrentDirectoryChanged: js.UndefOr[js.Function1[/* e */ AnonComponentDxFileManager, _]] = js.native
  /** A function that is executed when the selected file is opened. */
  var onSelectedFileOpened: js.UndefOr[js.Function1[/* e */ AnonFileItem, _]] = js.native
  /** Specifies actions that a user is allowed to perform on files and folders. */
  var permissions: js.UndefOr[AnonCopy] = js.native
  /** Specifies the root folder name. */
  var rootFolderName: js.UndefOr[String] = js.native
  /** Specifies whether a user can select a single or multiple files and folders in the item view simultaneously. */
  var selectionMode: js.UndefOr[multiple | single_] = js.native
  /** Configures toolbar settings. */
  var toolbar: js.UndefOr[dxFileManagerToolbar] = js.native
  /** Configures upload settings. */
  var upload: js.UndefOr[AnonMaxFileSize] = js.native
}

object dxFileManagerOptions {
  @scala.inline
  def apply(): dxFileManagerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFileManagerOptions]
  }
  @scala.inline
  implicit class dxFileManagerOptionsOps[Self <: dxFileManagerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedFileExtensions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedFileExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedFileExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedFileExtensions")(js.undefined)
        ret
    }
    @scala.inline
    def withContextMenu(value: dxFileManagerContextMenu): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPath")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomizeDetailColumns(value: /* columns */ js.Array[dxDataGridColumn] => js.Array[dxDataGridColumn]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeDetailColumns")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomizeDetailColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeDetailColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomizeThumbnail(value: /* fileItem */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeThumbnail")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomizeThumbnail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeThumbnail")(js.undefined)
        ret
    }
    @scala.inline
    def withFileProvider(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withItemView(value: AnonMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemView")(js.undefined)
        ret
    }
    @scala.inline
    def withOnCurrentDirectoryChanged(value: /* e */ AnonComponentDxFileManager => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCurrentDirectoryChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnCurrentDirectoryChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onCurrentDirectoryChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectedFileOpened(value: /* e */ AnonFileItem => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectedFileOpened")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelectedFileOpened: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectedFileOpened")(js.undefined)
        ret
    }
    @scala.inline
    def withPermissions(value: AnonCopy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("permissions")(js.undefined)
        ret
    }
    @scala.inline
    def withRootFolderName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootFolderName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootFolderName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootFolderName")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionMode(value: multiple | single_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionMode")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbar(value: dxFileManagerToolbar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbar")(js.undefined)
        ret
    }
    @scala.inline
    def withUpload(value: AnonMaxFileSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload")(js.undefined)
        ret
    }
  }
  
}

