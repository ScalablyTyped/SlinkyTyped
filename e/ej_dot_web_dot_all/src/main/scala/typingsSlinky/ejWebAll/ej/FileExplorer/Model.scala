package typingsSlinky.ejWebAll.ej.FileExplorer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Sets the URL of server side AJAX handling method that handles file operation like Read, Remove, Rename, Create, Upload, Download, Copy and Move in FileExplorer.
    */
  var ajaxAction: js.UndefOr[String] = js.native
  /** Specifies the data type of server side AJAX handling method.
    * @Default {json}
    */
  var ajaxDataType: js.UndefOr[String] = js.native
  /** By using ajaxSettings property, you can customize the AJAX configurations. Normally you can customize the following option in AJAX handling data, URL, type, async, contentType,
    * dataType and success. For upload, download and getImage API, you can only customize URL.
    * @Default {{ read: {}, createFolder: {}, remove: {}, rename: {}, paste: {}, getDetails: {}, download: {}, upload: {}, getImage: {}, search: {}}}
    */
  var ajaxSettings: js.UndefOr[js.Any] = js.native
  /** The FileExplorer allows to move the files from one folder to another folder of FileExplorer by using drag and drop option. Also it supports to upload a file by dragging it from
    * windows explorer to the necessary folder of ejFileExplorer.
    * @Default {true}
    */
  var allowDragAndDrop: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable keyboard support for FileExplorer actions.
    * @Default {true}
    */
  var allowKeyboardNavigation: js.UndefOr[Boolean] = js.native
  /** The FileExplorer allows to select multiple files by enabling the allowMultiSelection property. You can perform multi selection by pressing the Ctrl key or Shift key.
    * @Default {true}
    */
  var allowMultiSelection: js.UndefOr[Boolean] = js.native
  /** Fires before the AJAX request is performed.
    */
  var beforeAjaxRequest: js.UndefOr[js.Function1[/* e */ BeforeAjaxRequestEventArgs, Unit]] = js.native
  /** Fires before downloading the files.
    */
  var beforeDownload: js.UndefOr[js.Function1[/* e */ BeforeDownloadEventArgs, Unit]] = js.native
  /** Fires before getting a requested image from server. Also this event will be triggered when you have enabled thumbnail image compression option in FileExplorer.Using this event,
    * you can customize the image compression size.
    */
  var beforeGetImage: js.UndefOr[js.Function1[/* e */ BeforeGetImageEventArgs, Unit]] = js.native
  /** Fires before files or folders open.
    */
  var beforeOpen: js.UndefOr[js.Function1[/* e */ BeforeOpenEventArgs, Unit]] = js.native
  /** Fires before uploading the files.
    */
  var beforeUpload: js.UndefOr[js.Function1[/* e */ BeforeUploadEventArgs, Unit]] = js.native
  /** Fires before opening the upload dialog.
    */
  var beforeUploadDialogOpen: js.UndefOr[js.Function1[/* e */ BeforeUploadDialogOpenEventArgs, Unit]] = js.native
  /** Event is fired before the upload progress is started.
    */
  var beforeUploadSend: js.UndefOr[js.Function1[/* e */ BeforeUploadSendEventArgs, Unit]] = js.native
  /** By using the contextMenuSettings property, you can customize the ContextMenu in the FileExplorer control.
    */
  var contextMenuSettings: js.UndefOr[ContextMenuSettings] = js.native
  /** Fires when file or folder is copied successfully.
    */
  var copy: js.UndefOr[js.Function1[/* e */ CopyEventArgs, Unit]] = js.native
  /** Fires when FileExplorer control was created
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  /** Fires when new folder is created successfully in file system.
    */
  var createFolder: js.UndefOr[js.Function1[/* e */ CreateFolderEventArgs, Unit]] = js.native
  /** Sets the root class for FileExplorer theme. This cssClass API allows to use custom skinning option for File Explorer control. By defining the root class by using this API, you
    * have to include this root class in CSS.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Fires when file or folder is cut successfully.
    */
  var cut: js.UndefOr[js.Function1[/* e */ CutEventArgs, Unit]] = js.native
  /** Fires when the FileExplorer is destroyed successfully.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  /** Fires when the files or directory is dragging over on the FileExplorer.
    */
  var drag: js.UndefOr[js.Function1[/* e */ DragEventArgs, Unit]] = js.native
  /** Fires when the files or directory has been started to drag over on the FileExplorer
    */
  var dragStart: js.UndefOr[js.Function1[/* e */ DragStartEventArgs, Unit]] = js.native
  /** Fires when the files or directory has been stopped to drag over on FileExplorer
    */
  var dragStop: js.UndefOr[js.Function1[/* e */ DragStopEventArgs, Unit]] = js.native
  /** Fires when the files or directory is dropped to the target folder of FileExplorer
    */
  var drop: js.UndefOr[js.Function1[/* e */ DropEventArgs, Unit]] = js.native
  /** Specify the enablePersistence to FileExplorer to save the current model value in browser cookies for state maintains.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.native
  /** Enables or disables the Right to Left alignment support in FileExplorer control.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  /** Enables or disables the resize support in FileExplorer control.
    * @Default {false}
    */
  var enableResize: js.UndefOr[Boolean] = js.native
  /** Enables or disables the thumbnail image compression option in FileExplorer control. By enabling this option, you can reduce the thumbnail image size while loading.
    * @Default {false}
    */
  var enableThumbnailCompress: js.UndefOr[Boolean] = js.native
  /** Allows specified type of files only to display in FileExplorer control.
    * @Default {* . *}
    */
  var fileTypes: js.UndefOr[String] = js.native
  /** By using filterSettings property, you can customize the search functionality of the search bar in FileExplorer control.
    */
  var filterSettings: js.UndefOr[FilterSettings] = js.native
  /** Fires after loading the requested image from server. Using this event, you can get the details of loaded image.
    */
  var getImage: js.UndefOr[js.Function1[/* e */ GetImageEventArgs, Unit]] = js.native
  /** By using the gridSettings property, you can customize the grid behavior in the FileExplorer control.
    */
  var gridSettings: js.UndefOr[GridSettings] = js.native
  /** Specifies the height of FileExplorer control.
    * @Default {400}
    */
  var height: js.UndefOr[String | Double] = js.native
  /** Enables or disables the responsive support for FileExplorer control during the window resizing time.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  /** Fires when keydown in FileExplorer control.
    */
  var keydown: js.UndefOr[js.Function1[/* e */ KeydownEventArgs, Unit]] = js.native
  /** Sets the file view type. There are three view types available such as Grid, Tile and Large icons. See layoutType.
    * @Default {ej.FileExplorer.layoutType.Grid}
    */
  var layout: js.UndefOr[layoutType | String] = js.native
  /** Fires when the file view type is changed.
    */
  var layoutChange: js.UndefOr[js.Function1[/* e */ LayoutChangeEventArgs, Unit]] = js.native
  /** Sets the culture in FileExplorer.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Sets the maximum height of FileExplorer control.
    * @Default {null}
    */
  var maxHeight: js.UndefOr[String | Double] = js.native
  /** Sets the maximum width of FileExplorer control.
    * @Default {null}
    */
  var maxWidth: js.UndefOr[String | Double] = js.native
  /** Fires when before the ContextMenu opening.
    */
  var menuBeforeOpen: js.UndefOr[js.Function1[/* e */ MenuBeforeOpenEventArgs, Unit]] = js.native
  /** Fires when click the ContextMenu item.
    */
  var menuClick: js.UndefOr[js.Function1[/* e */ MenuClickEventArgs, Unit]] = js.native
  /** Fires when ContextMenu is successfully opened.
    */
  var menuOpen: js.UndefOr[js.Function1[/* e */ MenuOpenEventArgs, Unit]] = js.native
  /** Sets the minimum height of FileExplorer control.
    * @Default {250px}
    */
  var minHeight: js.UndefOr[String | Double] = js.native
  /** Sets the minimum width of FileExplorer control.
    * @Default {400px}
    */
  var minWidth: js.UndefOr[String | Double] = js.native
  /** Fires when files are successfully opened.
    */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.native
  /** Fires when a file or folder is pasted successfully.
    */
  var paste: js.UndefOr[js.Function1[/* e */ PasteEventArgs, Unit]] = js.native
  /** The property path denotes the filesystem path that are to be explored. The path for the filesystem can be physical path or relative path, but it has to be relevant to where the
    * Web API is hosted.
    */
  var path: js.UndefOr[String] = js.native
  /** Fires when file or folder is deleted successfully.
    */
  var remove: js.UndefOr[js.Function1[/* e */ RemoveEventArgs, Unit]] = js.native
  /** Fires when resizing is performed for FileExplorer.
    */
  var resize: js.UndefOr[js.Function1[/* e */ ResizeEventArgs, Unit]] = js.native
  /** Fires when resizing is started for FileExplorer.
    */
  var resizeStart: js.UndefOr[js.Function1[/* e */ ResizeStartEventArgs, Unit]] = js.native
  /** Fires this event when the resizing is stopped for FileExplorer.
    */
  var resizeStop: js.UndefOr[js.Function1[/* e */ ResizeStopEventArgs, Unit]] = js.native
  /** Sets the alias name of root folder name in FileExplorer. It is used to replace the actual root folder name in FileExplorer.
    */
  var rootFolderName: js.UndefOr[String] = js.native
  /** Fires when the items from grid view or tile view of FileExplorer control is selected.
    */
  var select: js.UndefOr[js.Function1[/* e */ SelectEventArgs, Unit]] = js.native
  /** The selectedFolder is used to select the specified folder of FileExplorer control.
    */
  var selectedFolder: js.UndefOr[String] = js.native
  /** The selectedItems is used to select the specified items (file, folder) of FileExplorer control.
    */
  var selectedItems: js.UndefOr[String | js.Array[_]] = js.native
  /** Enables or disables the checkbox option in FileExplorer control.
    * @Default {true}
    */
  var showCheckbox: js.UndefOr[Boolean] = js.native
  /** Enables or disables the context menu option in FileExplorer control.
    * @Default {true}
    */
  var showContextMenu: js.UndefOr[Boolean] = js.native
  /** Enables or disables the footer in FileExplorer control. The footer element displays the details of the current selected files and folders. And also the footer having the switcher
    * to change the layout view.
    * @Default {true}
    */
  var showFooter: js.UndefOr[Boolean] = js.native
  /** Enables or disables the navigation pane in FileExplorer control. The navigation pane contains a tree view element that displays all the folders from the filesystem in a
    * hierarchical manner. This is useful to a quick navigation of any folder in the filesystem.
    * @Default {true}
    */
  var showNavigationPane: js.UndefOr[Boolean] = js.native
  /** FileExplorer control is displayed with rounded corner when this property is set to true.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.native
  /** FileExplorer control is rendered with thumbnail preview of images in Tile and LargeIcons layout when this property set to true.
    * @Default {true}
    */
  var showThumbnail: js.UndefOr[Boolean] = js.native
  /** Shows or disables the toolbar in FileExplorer control.
    * @Default {true}
    */
  var showToolbar: js.UndefOr[Boolean] = js.native
  /** Triggered when refresh the template column elements in the grid view of FileExplorer control.
    */
  var templateRefresh: js.UndefOr[js.Function1[/* e */ TemplateRefreshEventArgs, Unit]] = js.native
  /** The tools property is used to configure and group required toolbar items in FileExplorer control.
    * @Default {{ creation: [NewFolder], navigation: [Back, Forward, Upward], addressBar: [Addressbar], editing: [Refresh, Upload, Delete, Rename, Download], copyPaste: [Cut, Copy,
    * Paste], getProperties: [Details], searchBar: [Searchbar], layout: [Layout], sortBy: [SortBy]}}
    */
  var tools: js.UndefOr[js.Any] = js.native
  /** The toolsList property is used to arrange the toolbar items in the FileExplorer control.
    * @Default {[layout, creation, navigation, addressBar, editing, copyPaste, sortBy, getProperties, searchBar]}
    */
  var toolsList: js.UndefOr[js.Array[_]] = js.native
  /** Fires when the items from grid view or tile view or large icons view of FileExplorer control is unselected.
    */
  var unselect: js.UndefOr[js.Function1[/* e */ UnselectEventArgs, Unit]] = js.native
  /** Event is fired when the file upload progress gets completed.
    */
  var uploadComplete: js.UndefOr[js.Function1[/* e */ UploadCompleteEventArgs, Unit]] = js.native
  /** Event is fired when the file upload fails due to some error.
    */
  var uploadError: js.UndefOr[js.Function1[/* e */ UploadErrorEventArgs, Unit]] = js.native
  /** Gets or sets an object that indicates whether to customize the upload behavior in the FileExplorer.
    */
  var uploadSettings: js.UndefOr[UploadSettings] = js.native
  /** Event is fired when the file upload progress gets succeeded.
    */
  var uploadSuccess: js.UndefOr[js.Function1[/* e */ UploadSuccessEventArgs, Unit]] = js.native
  /** Specifies the virtual item count for virtual support.
    * @Default {0}
    */
  var virtualItemCount: js.UndefOr[Double] = js.native
  /** Specifies the width of FileExplorer control.
    * @Default {850}
    */
  var width: js.UndefOr[String | Double] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAjaxAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAjaxAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxAction")(js.undefined)
        ret
    }
    @scala.inline
    def withAjaxDataType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxDataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAjaxDataType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxDataType")(js.undefined)
        ret
    }
    @scala.inline
    def withAjaxSettings(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAjaxSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ajaxSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowDragAndDrop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDragAndDrop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDragAndDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDragAndDrop")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowKeyboardNavigation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowKeyboardNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowKeyboardNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowKeyboardNavigation")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowMultiSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultiSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowMultiSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultiSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeAjaxRequest(value: /* e */ BeforeAjaxRequestEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeAjaxRequest")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeAjaxRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeAjaxRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeDownload(value: /* e */ BeforeDownloadEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDownload")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeDownload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeDownload")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeGetImage(value: /* e */ BeforeGetImageEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeGetImage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeGetImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeGetImage")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeOpen(value: /* e */ BeforeOpenEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeUpload(value: /* e */ BeforeUploadEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeUpload")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeUpload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeUpload")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeUploadDialogOpen(value: /* e */ BeforeUploadDialogOpenEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeUploadDialogOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeUploadDialogOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeUploadDialogOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeUploadSend(value: /* e */ BeforeUploadSendEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeUploadSend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeUploadSend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeUploadSend")(js.undefined)
        ret
    }
    @scala.inline
    def withContextMenuSettings(value: ContextMenuSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextMenuSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contextMenuSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withCopy(value: /* e */ CopyEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCopy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copy")(js.undefined)
        ret
    }
    @scala.inline
    def withCreate(value: /* e */ CreateEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateFolder(value: /* e */ CreateFolderEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFolder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCreateFolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createFolder")(js.undefined)
        ret
    }
    @scala.inline
    def withCssClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withCut(value: /* e */ CutEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cut")(js.undefined)
        ret
    }
    @scala.inline
    def withDestroy(value: /* e */ DestroyEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDestroy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destroy")(js.undefined)
        ret
    }
    @scala.inline
    def withDrag(value: /* e */ DragEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drag")(js.undefined)
        ret
    }
    @scala.inline
    def withDragStart(value: /* e */ DragStartEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDragStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStart")(js.undefined)
        ret
    }
    @scala.inline
    def withDragStop(value: /* e */ DragStopEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDragStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dragStop")(js.undefined)
        ret
    }
    @scala.inline
    def withDrop(value: /* e */ DropEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drop")(js.undefined)
        ret
    }
    @scala.inline
    def withEnablePersistence(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePersistence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnablePersistence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enablePersistence")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableRTL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableRTL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableRTL")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableResize")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableThumbnailCompress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableThumbnailCompress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableThumbnailCompress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableThumbnailCompress")(js.undefined)
        ret
    }
    @scala.inline
    def withFileTypes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterSettings(value: FilterSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withGetImage(value: /* e */ GetImageEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getImage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getImage")(js.undefined)
        ret
    }
    @scala.inline
    def withGridSettings(value: GridSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withIsResponsive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResponsive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsResponsive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isResponsive")(js.undefined)
        ret
    }
    @scala.inline
    def withKeydown(value: /* e */ KeydownEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keydown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutKeydown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keydown")(js.undefined)
        ret
    }
    @scala.inline
    def withLayout(value: layoutType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layout")(js.undefined)
        ret
    }
    @scala.inline
    def withLayoutChange(value: /* e */ LayoutChangeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLayoutChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutChange")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxHeight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuBeforeOpen(value: /* e */ MenuBeforeOpenEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuBeforeOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMenuBeforeOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuBeforeOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuClick(value: /* e */ MenuClickEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMenuClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuClick")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuOpen(value: /* e */ MenuOpenEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMenuOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withMinHeight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withMinWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen(value: /* e */ OpenEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.undefined)
        ret
    }
    @scala.inline
    def withPaste(value: /* e */ PasteEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paste")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paste")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withRemove(value: /* e */ RemoveEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.undefined)
        ret
    }
    @scala.inline
    def withResize(value: /* e */ ResizeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resize")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeStart(value: /* e */ ResizeStartEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutResizeStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeStart")(js.undefined)
        ret
    }
    @scala.inline
    def withResizeStop(value: /* e */ ResizeStopEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeStop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutResizeStop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeStop")(js.undefined)
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
    def withSelect(value: /* e */ SelectEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedFolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedFolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedFolder")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedItems(value: String | js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedItems")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCheckbox(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCheckbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCheckbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCheckbox")(js.undefined)
        ret
    }
    @scala.inline
    def withShowContextMenu(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showContextMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowContextMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showContextMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFooter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFooter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFooter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFooter")(js.undefined)
        ret
    }
    @scala.inline
    def withShowNavigationPane(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNavigationPane")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowNavigationPane: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNavigationPane")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRoundedCorner(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRoundedCorner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRoundedCorner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRoundedCorner")(js.undefined)
        ret
    }
    @scala.inline
    def withShowThumbnail(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showThumbnail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowThumbnail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showThumbnail")(js.undefined)
        ret
    }
    @scala.inline
    def withShowToolbar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showToolbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowToolbar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showToolbar")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateRefresh(value: /* e */ TemplateRefreshEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateRefresh")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTemplateRefresh: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateRefresh")(js.undefined)
        ret
    }
    @scala.inline
    def withTools(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTools: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tools")(js.undefined)
        ret
    }
    @scala.inline
    def withToolsList(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolsList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolsList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolsList")(js.undefined)
        ret
    }
    @scala.inline
    def withUnselect(value: /* e */ UnselectEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUnselect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unselect")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadComplete(value: /* e */ UploadCompleteEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUploadComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadError(value: /* e */ UploadErrorEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUploadError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadError")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadSettings(value: UploadSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadSuccess(value: /* e */ UploadSuccessEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadSuccess")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUploadSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadSuccess")(js.undefined)
        ret
    }
    @scala.inline
    def withVirtualItemCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualItemCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVirtualItemCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualItemCount")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

