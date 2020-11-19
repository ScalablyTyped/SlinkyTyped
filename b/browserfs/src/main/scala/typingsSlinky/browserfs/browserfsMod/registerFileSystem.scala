package typingsSlinky.browserfs.browserfsMod

import typingsSlinky.browserfs.fileSystemMod.FileSystemConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("browserfs/dist/node/core/browserfs", "registerFileSystem")
@js.native
object registerFileSystem extends js.Object {
  
  def apply(name: String, fs: FileSystemConstructor): Unit = js.native
}
