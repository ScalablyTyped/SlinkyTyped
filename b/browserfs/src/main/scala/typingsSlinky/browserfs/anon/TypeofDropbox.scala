package typingsSlinky.browserfs.anon

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.browserfs.dropboxMod.DropboxFileSystem
import typingsSlinky.browserfs.dropboxMod.DropboxFileSystemOptions
import typingsSlinky.browserfs.dropboxMod.default
import typingsSlinky.browserfs.fileSystemMod.BFSCallback
import typingsSlinky.browserfs.fileSystemMod.FileSystemOptions
import typingsSlinky.dropboxjs.Dropbox.Client
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofDropbox
  extends Instantiable1[/* client */ Client, default]
     with Instantiable2[/* client */ Client, /* deprecateMsg */ Boolean, default] {
  
  /**
    * Creates a new DropboxFileSystem instance with the given options.
    * Must be given an *authenticated* DropboxJS client from the old v0.10 version of the Dropbox JS SDK.
    */
  def Create(opts: DropboxFileSystemOptions, cb: BFSCallback[DropboxFileSystem]): Unit = js.native
  
  val Name: String = js.native
  
  val Options: FileSystemOptions = js.native
  
  def isAvailable(): Boolean = js.native
}
