package typingsSlinky.mockFs.filesystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSystem extends js.Object {
  /**
    * Get a file system item.
    *
    * @param filepath Path to item.
    * @return The item (or null if not found).
    */
  def getItem(filepath: String): typingsSlinky.mockFs.itemMod.^
  /** Get the root directory. */
  def getRoot(): typingsSlinky.mockFs.directoryMod.^
}

object FileSystem {
  @scala.inline
  def apply(
    getItem: String => typingsSlinky.mockFs.itemMod.^,
    getRoot: () => typingsSlinky.mockFs.directoryMod.^
  ): FileSystem = {
    val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), getRoot = js.Any.fromFunction0(getRoot))
    __obj.asInstanceOf[FileSystem]
  }
}

