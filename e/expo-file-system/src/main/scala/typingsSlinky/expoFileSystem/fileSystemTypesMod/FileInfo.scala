package typingsSlinky.expoFileSystem.fileSystemTypesMod

import typingsSlinky.expoFileSystem.anon.Exists
import typingsSlinky.expoFileSystem.anon.IsDirectory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.expoFileSystem.anon.Exists
  - typingsSlinky.expoFileSystem.anon.IsDirectory
*/
trait FileInfo extends js.Object

object FileInfo {
  @scala.inline
  implicit def apply(value: Exists): FileInfo = value.asInstanceOf[FileInfo]
  @scala.inline
  implicit def apply(value: IsDirectory): FileInfo = value.asInstanceOf[FileInfo]
}

