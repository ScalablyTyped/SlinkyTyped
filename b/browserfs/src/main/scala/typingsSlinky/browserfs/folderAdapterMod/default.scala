package typingsSlinky.browserfs.folderAdapterMod

import typingsSlinky.browserfs.fileSystemMod.BFSCallback
import typingsSlinky.browserfs.fileSystemMod.FileSystem
import typingsSlinky.browserfs.fileSystemMod.FileSystemOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("browserfs/dist/node/backend/FolderAdapter", JSImport.Default)
@js.native
class default protected () extends FolderAdapter {
  /**
    * Wraps a file system, and uses the given folder as its root.
    *
    * @param folder The folder to use as the root directory.
    * @param wrapped The file system to wrap.
    */
  def this(folder: String, wrapped: FileSystem) = this()
}
/* static members */
@JSImport("browserfs/dist/node/backend/FolderAdapter", JSImport.Default)
@js.native
object default extends js.Object {
  
  /**
    * Creates a FolderAdapter instance with the given options.
    */
  def Create(opts: FolderAdapterOptions, cb: BFSCallback[FolderAdapter]): Unit = js.native
  
  val Name: String = js.native
  
  val Options: FileSystemOptions = js.native
  
  def isAvailable(): Boolean = js.native
}
