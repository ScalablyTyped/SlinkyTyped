package typingsSlinky.browserfs.anon

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.browserfs.fileSystemMod.BFSCallback
import typingsSlinky.browserfs.fileSystemMod.FileSystemOptions
import typingsSlinky.browserfs.inMemoryMod.InMemoryFileSystem
import typingsSlinky.browserfs.inMemoryMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofInMemory extends Instantiable0[default] {
  
  /**
    * Creates an InMemoryFileSystem instance.
    */
  def Create(options: js.Any, cb: BFSCallback[InMemoryFileSystem]): Unit = js.native
  
  val Name: String = js.native
  
  val Options: FileSystemOptions = js.native
}
