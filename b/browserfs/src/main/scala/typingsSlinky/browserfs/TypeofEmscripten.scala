package typingsSlinky.browserfs

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.browserfs.emscriptenMod.EmscriptenFileSystem
import typingsSlinky.browserfs.emscriptenMod.EmscriptenFileSystemOptions
import typingsSlinky.browserfs.emscriptenMod.default
import typingsSlinky.browserfs.fileSystemMod.BFSCallback
import typingsSlinky.browserfs.fileSystemMod.FileSystemOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofEmscripten
  extends Instantiable1[/* _FS */ js.Any, default] {
  val Name: String = js.native
  val Options: FileSystemOptions = js.native
  /**
    * Create an EmscriptenFileSystem instance with the given options.
    */
  def Create(opts: EmscriptenFileSystemOptions, cb: BFSCallback[EmscriptenFileSystem]): Unit = js.native
  def isAvailable(): Boolean = js.native
}

