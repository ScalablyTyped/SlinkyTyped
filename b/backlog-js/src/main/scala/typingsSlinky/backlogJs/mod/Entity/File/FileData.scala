package typingsSlinky.backlogJs.mod.Entity.File

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.backlogJs.mod.Entity.File.NodeFileData
  - typingsSlinky.backlogJs.mod.Entity.File.BrowserFileData
*/
trait FileData extends js.Object

object FileData {
  @scala.inline
  implicit def apply(value: BrowserFileData): FileData = value.asInstanceOf[FileData]
  @scala.inline
  implicit def apply(value: NodeFileData): FileData = value.asInstanceOf[FileData]
}

