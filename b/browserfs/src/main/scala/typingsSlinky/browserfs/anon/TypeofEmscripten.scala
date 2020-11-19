package typingsSlinky.browserfs.anon

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.browserfs.emscriptenMod.EmscriptenFileSystem
import typingsSlinky.browserfs.emscriptenMod.EmscriptenFileSystemOptions
import typingsSlinky.browserfs.emscriptenMod.default
import typingsSlinky.browserfs.fileSystemMod.BFSCallback
import typingsSlinky.browserfs.fileSystemMod.FileSystemOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofEmscripten
  extends Instantiable1[/* _FS */ js.Any, default] {
  
  /**
    * Create an EmscriptenFileSystem instance with the given options.
    */
  def Create(opts: EmscriptenFileSystemOptions, cb: BFSCallback[EmscriptenFileSystem]): Unit = js.native
  
  val Name: String = js.native
  
  val Options: FileSystemOptions = js.native
  
  def isAvailable(): Boolean = js.native
}
