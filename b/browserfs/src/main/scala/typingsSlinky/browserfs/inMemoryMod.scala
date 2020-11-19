package typingsSlinky.browserfs

import typingsSlinky.browserfs.fileSystemMod.BFSCallback
import typingsSlinky.browserfs.fileSystemMod.FileSystemOptions
import typingsSlinky.browserfs.keyValueFilesystemMod.SimpleSyncStore
import typingsSlinky.browserfs.keyValueFilesystemMod.SyncKeyValueFileSystem
import typingsSlinky.browserfs.keyValueFilesystemMod.SyncKeyValueStore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("browserfs/dist/node/backend/InMemory", JSImport.Namespace)
@js.native
object inMemoryMod extends js.Object {
  
  @js.native
  class InMemoryStore ()
    extends SyncKeyValueStore
       with SimpleSyncStore {
    
    var store: js.Any = js.native
  }
  
  @js.native
  class default () extends SyncKeyValueFileSystem
  /* static members */
  @js.native
  object default extends js.Object {
    
    /**
      * Creates an InMemoryFileSystem instance.
      */
    def Create(options: js.Any, cb: BFSCallback[InMemoryFileSystem]): Unit = js.native
    
    val Name: String = js.native
    
    val Options: FileSystemOptions = js.native
  }
  
  type InMemoryFileSystem = SyncKeyValueFileSystem
}
