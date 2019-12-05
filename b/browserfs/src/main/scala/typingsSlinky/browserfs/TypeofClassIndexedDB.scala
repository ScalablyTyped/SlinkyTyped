package typingsSlinky.browserfs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.browserfs.distNodeBackendIndexedDBMod.IndexedDBFileSystem
import typingsSlinky.browserfs.distNodeBackendIndexedDBMod.IndexedDBFileSystemOptions
import typingsSlinky.browserfs.distNodeBackendIndexedDBMod.default
import typingsSlinky.browserfs.distNodeCoreFileUnderscoreSystemMod.BFSCallback
import typingsSlinky.browserfs.distNodeCoreFileUnderscoreSystemMod.FileSystemOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassIndexedDB
  extends Instantiable1[/* cb */ BFSCallback[IndexedDBFileSystem], default]
     with Instantiable2[/* cb */ BFSCallback[IndexedDBFileSystem], /* storeName */ String, default]
     with Instantiable3[
      /* cb */ BFSCallback[IndexedDBFileSystem], 
      /* storeName */ String, 
      /* deprecateMsg */ Boolean, 
      default
    ] {
  val Name: String = js.native
  val Options: FileSystemOptions = js.native
  /**
    * Constructs an IndexedDB file system with the given options.
    */
  def Create(opts: IndexedDBFileSystemOptions, cb: BFSCallback[IndexedDBFileSystem]): Unit = js.native
  def isAvailable(): Boolean = js.native
}

