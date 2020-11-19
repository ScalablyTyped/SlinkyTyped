package typingsSlinky.browserfs.indexedDBMod

import typingsSlinky.browserfs.fileSystemMod.BFSCallback
import typingsSlinky.browserfs.fileSystemMod.FileSystemOptions
import typingsSlinky.browserfs.keyValueFilesystemMod.AsyncKeyValueFileSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("browserfs/dist/node/backend/IndexedDB", JSImport.Default)
@js.native
class default protected () extends AsyncKeyValueFileSystem {
  /**
    * **Deprecated. Use IndexedDB.Create() method instead.**
    *
    * Constructs an IndexedDB file system.
    * @param cb Called once the database is instantiated and ready for use.
    *   Passes an error if there was an issue instantiating the database.
    * @param storeName The name of this file system. You can have
    *   multiple IndexedDB file systems operating at once, but each must have
    *   a different name.
    */
  def this(cb: BFSCallback[IndexedDBFileSystem]) = this()
  def this(cb: BFSCallback[IndexedDBFileSystem], storeName: String) = this()
  def this(cb: BFSCallback[IndexedDBFileSystem], storeName: js.UndefOr[scala.Nothing], deprecateMsg: Boolean) = this()
  def this(cb: BFSCallback[IndexedDBFileSystem], storeName: String, deprecateMsg: Boolean) = this()
}
/* static members */
@JSImport("browserfs/dist/node/backend/IndexedDB", JSImport.Default)
@js.native
object default extends js.Object {
  
  /**
    * Constructs an IndexedDB file system with the given options.
    */
  def Create(opts: IndexedDBFileSystemOptions, cb: BFSCallback[IndexedDBFileSystem]): Unit = js.native
  
  val Name: String = js.native
  
  val Options: FileSystemOptions = js.native
  
  def isAvailable(): Boolean = js.native
}
