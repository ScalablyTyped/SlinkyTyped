package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSystemDataSource extends js.Object {
  /**
    * The full path to the directory to associate with the channel.
    */
  var DirectoryPath: typingsSlinky.awsSdk.sagemakerMod.DirectoryPath = js.native
  /**
    * The access mode of the mount of the directory associated with the channel. A directory can be mounted either in ro (read-only) or rw (read-write) mode.
    */
  var FileSystemAccessMode: typingsSlinky.awsSdk.sagemakerMod.FileSystemAccessMode = js.native
  /**
    * The file system id.
    */
  var FileSystemId: typingsSlinky.awsSdk.sagemakerMod.FileSystemId = js.native
  /**
    * The file system type. 
    */
  var FileSystemType: typingsSlinky.awsSdk.sagemakerMod.FileSystemType = js.native
}

object FileSystemDataSource {
  @scala.inline
  def apply(
    DirectoryPath: DirectoryPath,
    FileSystemAccessMode: FileSystemAccessMode,
    FileSystemId: FileSystemId,
    FileSystemType: FileSystemType
  ): FileSystemDataSource = {
    val __obj = js.Dynamic.literal(DirectoryPath = DirectoryPath.asInstanceOf[js.Any], FileSystemAccessMode = FileSystemAccessMode.asInstanceOf[js.Any], FileSystemId = FileSystemId.asInstanceOf[js.Any], FileSystemType = FileSystemType.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemDataSource]
  }
  @scala.inline
  implicit class FileSystemDataSourceOps[Self <: FileSystemDataSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirectoryPath(value: DirectoryPath): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DirectoryPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileSystemAccessMode(value: FileSystemAccessMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileSystemAccessMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileSystemId(value: FileSystemId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileSystemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileSystemType(value: FileSystemType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileSystemType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

