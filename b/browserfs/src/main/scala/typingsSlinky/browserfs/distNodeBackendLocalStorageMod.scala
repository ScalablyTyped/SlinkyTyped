package typingsSlinky.browserfs

import typingsSlinky.browserfs.distNodeBackendLocalStorageMod.LocalStorageFileSystem
import typingsSlinky.browserfs.distNodeCoreFileUnderscoreSystemMod.BFSCallback
import typingsSlinky.browserfs.distNodeCoreFileUnderscoreSystemMod.FileSystemOptions
import typingsSlinky.browserfs.distNodeGenericKeyUnderscoreValueUnderscoreFilesystemMod.SimpleSyncStore
import typingsSlinky.browserfs.distNodeGenericKeyUnderscoreValueUnderscoreFilesystemMod.SyncKeyValueFileSystem
import typingsSlinky.browserfs.distNodeGenericKeyUnderscoreValueUnderscoreFilesystemMod.SyncKeyValueStore
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/backend/LocalStorage", JSImport.Namespace)
@js.native
object distNodeBackendLocalStorageMod extends js.Object {
  @js.native
  class LocalStorageStore ()
    extends SyncKeyValueStore
       with SimpleSyncStore {
    /* CompleteClass */
    override def del(key: String): Unit = js.native
    /* CompleteClass */
    override def get(key: String): js.UndefOr[Buffer] = js.native
    /* CompleteClass */
    override def put(key: String, data: Buffer, overwrite: Boolean): Boolean = js.native
  }
  
  @js.native
  /**
    * Creates a new LocalStorage file system using the contents of `localStorage`.
    */
  class default () extends SyncKeyValueFileSystem
  
  /* static members */
  @js.native
  object default extends js.Object {
    val Name: String = js.native
    val Options: FileSystemOptions = js.native
    /**
      * Creates a LocalStorageFileSystem instance.
      */
    def Create(options: js.Any, cb: BFSCallback[LocalStorageFileSystem]): Unit = js.native
    def isAvailable(): Boolean = js.native
  }
  
  type LocalStorageFileSystem = SyncKeyValueFileSystem
}

