package typingsSlinky.atom.mod

import typingsSlinky.atom.atomStrings.created
import typingsSlinky.atom.atomStrings.deleted
import typingsSlinky.atom.atomStrings.modified
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.atom.mod.FilesystemChangeBasic[
typingsSlinky.atom.atomStrings.created | typingsSlinky.atom.atomStrings.modified | typingsSlinky.atom.atomStrings.deleted]
  - typingsSlinky.atom.mod.FilesystemChangeRename
*/
trait FilesystemChange extends js.Object

object FilesystemChange {
  @scala.inline
  implicit def apply(value: FilesystemChangeBasic[created | modified | deleted]): FilesystemChange = value.asInstanceOf[FilesystemChange]
  @scala.inline
  implicit def apply(value: FilesystemChangeRename): FilesystemChange = value.asInstanceOf[FilesystemChange]
}

