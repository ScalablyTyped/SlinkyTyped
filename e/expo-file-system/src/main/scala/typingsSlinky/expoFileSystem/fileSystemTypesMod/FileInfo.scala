package typingsSlinky.expoFileSystem.fileSystemTypesMod

import typingsSlinky.expoFileSystem.expoFileSystemBooleans.`false`
import typingsSlinky.expoFileSystem.expoFileSystemBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.expoFileSystem.AnonExists
  - typingsSlinky.expoFileSystem.AnonIsDirectory
*/
trait FileInfo extends js.Object

object FileInfo {
  @scala.inline
  def AnonExists(exists: `true`, isDirectory: Boolean, modificationTime: Double, size: Double, uri: String): FileInfo = {
    val __obj = js.Dynamic.literal(exists = exists.asInstanceOf[js.Any], isDirectory = isDirectory.asInstanceOf[js.Any], modificationTime = modificationTime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileInfo]
  }
  @scala.inline
  def AnonIsDirectory(exists: `false`, isDirectory: `false`, uri: String): FileInfo = {
    val __obj = js.Dynamic.literal(exists = exists.asInstanceOf[js.Any], isDirectory = isDirectory.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileInfo]
  }
}

