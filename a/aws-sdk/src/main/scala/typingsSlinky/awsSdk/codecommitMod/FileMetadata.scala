package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileMetadata extends js.Object {
  /**
    * The full path to the file to be added or updated, including the name of the file.
    */
  var absolutePath: js.UndefOr[Path] = js.native
  /**
    * The blob ID that contains the file information.
    */
  var blobId: js.UndefOr[ObjectId] = js.native
  /**
    * The extrapolated file mode permissions for the file. Valid values include EXECUTABLE and NORMAL.
    */
  var fileMode: js.UndefOr[FileModeTypeEnum] = js.native
}

object FileMetadata {
  @scala.inline
  def apply(): FileMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileMetadata]
  }
  @scala.inline
  implicit class FileMetadataOps[Self <: FileMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbsolutePath(value: Path): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absolutePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAbsolutePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("absolutePath")(js.undefined)
        ret
    }
    @scala.inline
    def withBlobId(value: ObjectId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blobId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlobId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blobId")(js.undefined)
        ret
    }
    @scala.inline
    def withFileMode(value: FileModeTypeEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileMode")(js.undefined)
        ret
    }
  }
  
}

