package typingsSlinky.browserfs.anon

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.browserfs.asyncMirrorMod.AsyncMirrorOptions
import typingsSlinky.browserfs.asyncMirrorMod.default
import typingsSlinky.browserfs.fileSystemMod.BFSCallback
import typingsSlinky.browserfs.fileSystemMod.FileSystem
import typingsSlinky.browserfs.fileSystemMod.FileSystemOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofAsyncMirror
  extends Instantiable2[/* sync */ FileSystem, /* async */ FileSystem, default]
     with Instantiable3[/* sync */ FileSystem, /* async */ FileSystem, /* deprecateMsg */ Boolean, default] {
  
  /**
    * Constructs and initializes an AsyncMirror file system with the given options.
    */
  def Create(opts: AsyncMirrorOptions, cb: BFSCallback[typingsSlinky.browserfs.asyncMirrorMod.AsyncMirror]): Unit = js.native
  
  val Name: String = js.native
  
  val Options: FileSystemOptions = js.native
  
  def isAvailable(): Boolean = js.native
}
