package typingsSlinky.browserfs

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.browserfs.distNodeBackendEmscriptenMod.EmscriptenFileSystem
import typingsSlinky.browserfs.distNodeBackendEmscriptenMod.EmscriptenFileSystemOptions
import typingsSlinky.browserfs.distNodeBackendEmscriptenMod.default
import typingsSlinky.browserfs.distNodeCoreFileUnderscoreSystemMod.BFSCallback
import typingsSlinky.browserfs.distNodeCoreFileUnderscoreSystemMod.FileSystemOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassEmscripten
  extends Instantiable1[/* _FS */ js.Any, default] {
  val Name: String = js.native
  val Options: FileSystemOptions = js.native
  /**
    * Create an EmscriptenFileSystem instance with the given options.
    */
  def Create(opts: EmscriptenFileSystemOptions, cb: BFSCallback[EmscriptenFileSystem]): Unit = js.native
  def isAvailable(): Boolean = js.native
}

