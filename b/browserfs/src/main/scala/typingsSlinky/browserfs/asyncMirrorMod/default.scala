package typingsSlinky.browserfs.asyncMirrorMod

import typingsSlinky.browserfs.fileSystemMod.BFSCallback
import typingsSlinky.browserfs.fileSystemMod.FileSystem
import typingsSlinky.browserfs.fileSystemMod.FileSystemOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("browserfs/dist/node/backend/AsyncMirror", JSImport.Default)
@js.native
class default protected () extends AsyncMirror {
  /**
    * **Deprecated; use AsyncMirror.Create() method instead.**
    *
    * Mirrors the synchronous file system into the asynchronous file system.
    *
    * **IMPORTANT**: You must call `initialize` on the file system before it can be used.
    * @param sync The synchronous file system to mirror the asynchronous file system to.
    * @param async The asynchronous file system to mirror.
    */
  def this(sync: FileSystem, async: FileSystem) = this()
  def this(sync: FileSystem, async: FileSystem, deprecateMsg: Boolean) = this()
}
/* static members */
@JSImport("browserfs/dist/node/backend/AsyncMirror", JSImport.Default)
@js.native
object default extends js.Object {
  
  /**
    * Constructs and initializes an AsyncMirror file system with the given options.
    */
  def Create(opts: AsyncMirrorOptions, cb: BFSCallback[AsyncMirror]): Unit = js.native
  
  val Name: String = js.native
  
  val Options: FileSystemOptions = js.native
  
  def isAvailable(): Boolean = js.native
}
