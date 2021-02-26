package typingsSlinky.browserfs.anon

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.browserfs.fileSystemMod.BFSCallback
import typingsSlinky.browserfs.fileSystemMod.FileSystem
import typingsSlinky.browserfs.fileSystemMod.FileSystemOptions
import typingsSlinky.browserfs.overlayFSMod.OverlayFS
import typingsSlinky.browserfs.overlayFSMod.OverlayFSOptions
import typingsSlinky.browserfs.overlayFSMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofOverlayFS
  extends Instantiable2[/* writable */ FileSystem, /* readable */ FileSystem, default]
     with Instantiable3[
      /* writable */ FileSystem, 
      /* readable */ FileSystem, 
      /* deprecateMsg */ Boolean, 
      default
    ] {
  
  /**
    * Constructs and initializes an OverlayFS instance with the given options.
    */
  def Create(opts: OverlayFSOptions, cb: BFSCallback[OverlayFS]): Unit = js.native
  
  val Name: String = js.native
  
  val Options: FileSystemOptions = js.native
  
  def isAvailable(): Boolean = js.native
}
