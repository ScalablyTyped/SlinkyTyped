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
}

