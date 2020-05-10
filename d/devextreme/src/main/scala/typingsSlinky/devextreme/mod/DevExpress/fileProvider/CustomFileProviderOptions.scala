package typingsSlinky.devextreme.mod.DevExpress.fileProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomFileProviderOptions extends FileProviderOptions[CustomFileProvider] {
  /** A function that cancels the file upload. */
  var abortFileUpload: js.UndefOr[js.Function] = js.native
  /** A function that copies files or folders. */
  var copyItem: js.UndefOr[js.Function] = js.native
  /** A function that creates a folder. */
  var createDirectory: js.UndefOr[js.Function] = js.native
  /** A function that deletes a file or folder. */
  var deleteItem: js.UndefOr[js.Function] = js.native
  /** A function that downloads a file or folder. */
  var downloadItems: js.UndefOr[js.Function] = js.native
  /** A function that gets file system items. */
  var getItems: js.UndefOr[js.Function] = js.native
  /** A function that get items content. */
  var getItemsContent: js.UndefOr[js.Function] = js.native
  /** A function or the name of a data source field that provides information on whether a file or folder contains sub directories. */
  var hasSubDirectoriesExpr: js.UndefOr[String | js.Function] = js.native
  /** A function that moves files and folders. */
  var moveItem: js.UndefOr[js.Function] = js.native
  /** A function that renames files and folders. */
  var renameItem: js.UndefOr[js.Function] = js.native
  /** Specifies a chunk size in bytes. */
  var uploadChunkSize: js.UndefOr[Double] = js.native
  /** A function that uploads a file in chunks. */
  var uploadFileChunk: js.UndefOr[js.Function] = js.native
}

object CustomFileProviderOptions {
  @scala.inline
  def apply(): CustomFileProviderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomFileProviderOptions]
  }
  @scala.inline
  implicit class CustomFileProviderOptionsOps[Self <: CustomFileProviderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbortFileUpload(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abortFileUpload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbortFileUpload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abortFileUpload")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyItem(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCopyItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyItem")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateDirectory(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createDirectory")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteItem(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteItem")(js.undefined)
        ret
    }
    @scala.inline
    def withDownloadItems(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadItems")(js.undefined)
        ret
    }
    @scala.inline
    def withGetItems(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItems")(js.undefined)
        ret
    }
    @scala.inline
    def withGetItemsContent(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemsContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetItemsContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemsContent")(js.undefined)
        ret
    }
    @scala.inline
    def withHasSubDirectoriesExpr(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSubDirectoriesExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasSubDirectoriesExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSubDirectoriesExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withMoveItem(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoveItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moveItem")(js.undefined)
        ret
    }
    @scala.inline
    def withRenameItem(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenameItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renameItem")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadChunkSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadChunkSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadChunkSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadChunkSize")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadFileChunk(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadFileChunk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadFileChunk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadFileChunk")(js.undefined)
        ret
    }
  }
  
}

