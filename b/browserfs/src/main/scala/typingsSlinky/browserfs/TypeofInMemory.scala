package typingsSlinky.browserfs

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.browserfs.fileSystemMod.BFSCallback
import typingsSlinky.browserfs.fileSystemMod.FileSystemOptions
import typingsSlinky.browserfs.inMemoryMod.InMemoryFileSystem
import typingsSlinky.browserfs.inMemoryMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofInMemory extends Instantiable0[default] {
  val Name: String = js.native
  val Options: FileSystemOptions = js.native
  /**
    * Creates an InMemoryFileSystem instance.
    */
  def Create(options: js.Any, cb: BFSCallback[InMemoryFileSystem]): Unit = js.native
}

