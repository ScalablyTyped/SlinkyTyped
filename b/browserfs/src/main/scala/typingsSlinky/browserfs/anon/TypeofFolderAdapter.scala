package typingsSlinky.browserfs.anon

import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.browserfs.fileSystemMod.BFSCallback
import typingsSlinky.browserfs.fileSystemMod.FileSystem
import typingsSlinky.browserfs.fileSystemMod.FileSystemOptions
import typingsSlinky.browserfs.folderAdapterMod.FolderAdapter
import typingsSlinky.browserfs.folderAdapterMod.FolderAdapterOptions
import typingsSlinky.browserfs.folderAdapterMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofFolderAdapter extends Instantiable2[/* folder */ String, /* wrapped */ FileSystem, default] {
  
  /**
    * Creates a FolderAdapter instance with the given options.
    */
  def Create(opts: FolderAdapterOptions, cb: BFSCallback[FolderAdapter]): Unit = js.native
  
  val Name: String = js.native
  
  val Options: FileSystemOptions = js.native
  
  def isAvailable(): Boolean = js.native
}
