package typingsSlinky.browserfs

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.browserfs.distNodeBackendFolderAdapterMod.FolderAdapter
import typingsSlinky.browserfs.distNodeBackendFolderAdapterMod.FolderAdapterOptions
import typingsSlinky.browserfs.distNodeBackendFolderAdapterMod.default
import typingsSlinky.browserfs.distNodeCoreFileUnderscoreSystemMod.BFSCallback
import typingsSlinky.browserfs.distNodeCoreFileUnderscoreSystemMod.FileSystem
import typingsSlinky.browserfs.distNodeCoreFileUnderscoreSystemMod.FileSystemOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassFolderAdapter extends Instantiable2[/* folder */ String, /* wrapped */ FileSystem, default] {
  val Name: String = js.native
  val Options: FileSystemOptions = js.native
  /**
    * Creates a FolderAdapter instance with the given options.
    */
  def Create(opts: FolderAdapterOptions, cb: BFSCallback[FolderAdapter]): Unit = js.native
  def isAvailable(): Boolean = js.native
}

