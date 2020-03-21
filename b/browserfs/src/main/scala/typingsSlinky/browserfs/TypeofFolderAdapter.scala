package typingsSlinky.browserfs

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.browserfs.fileSystemMod.BFSCallback
import typingsSlinky.browserfs.fileSystemMod.FileSystem
import typingsSlinky.browserfs.fileSystemMod.FileSystemOptions
import typingsSlinky.browserfs.folderAdapterMod.FolderAdapter
import typingsSlinky.browserfs.folderAdapterMod.FolderAdapterOptions
import typingsSlinky.browserfs.folderAdapterMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofFolderAdapter extends Instantiable2[/* folder */ String, /* wrapped */ FileSystem, default] {
  val Name: String = js.native
  val Options: FileSystemOptions = js.native
  /**
    * Creates a FolderAdapter instance with the given options.
    */
  def Create(opts: FolderAdapterOptions, cb: BFSCallback[FolderAdapter]): Unit = js.native
  def isAvailable(): Boolean = js.native
}

