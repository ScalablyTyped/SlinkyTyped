package typingsSlinky.ionicUtilsFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ionicUtilsFs.mod.RegularFileNode
  - typingsSlinky.ionicUtilsFs.mod.DirectoryNode
*/
trait FileNode extends js.Object

object FileNode {
  @scala.inline
  implicit def apply(value: DirectoryNode): FileNode = value.asInstanceOf[FileNode]
  @scala.inline
  implicit def apply(value: RegularFileNode): FileNode = value.asInstanceOf[FileNode]
}

