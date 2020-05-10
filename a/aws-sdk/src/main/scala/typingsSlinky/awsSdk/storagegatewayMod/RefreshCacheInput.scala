package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefreshCacheInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the file share you want to refresh.
    */
  var FileShareARN: typingsSlinky.awsSdk.storagegatewayMod.FileShareARN = js.native
  /**
    * A comma-separated list of the paths of folders to refresh in the cache. The default is ["/"]. The default refreshes objects and folders at the root of the Amazon S3 bucket. If Recursive is set to "true", the entire S3 bucket that the file share has access to is refreshed.
    */
  var FolderList: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.FolderList] = js.native
  /**
    * A value that specifies whether to recursively refresh folders in the cache. The refresh includes folders that were in the cache the last time the gateway listed the folder's contents. If this value set to "true", each folder that is listed in FolderList is recursively updated. Otherwise, subfolders listed in FolderList are not refreshed. Only objects that are in folders listed directly under FolderList are found and used for the update. The default is "true".
    */
  var Recursive: js.UndefOr[Boolean] = js.native
}

object RefreshCacheInput {
  @scala.inline
  def apply(FileShareARN: FileShareARN): RefreshCacheInput = {
    val __obj = js.Dynamic.literal(FileShareARN = FileShareARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshCacheInput]
  }
  @scala.inline
  implicit class RefreshCacheInputOps[Self <: RefreshCacheInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileShareARN(value: FileShareARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileShareARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFolderList(value: FolderList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FolderList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFolderList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FolderList")(js.undefined)
        ret
    }
    @scala.inline
    def withRecursive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Recursive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecursive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Recursive")(js.undefined)
        ret
    }
  }
  
}

