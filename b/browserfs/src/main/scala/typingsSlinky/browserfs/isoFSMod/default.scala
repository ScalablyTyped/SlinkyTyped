package typingsSlinky.browserfs.isoFSMod

import typingsSlinky.browserfs.fileSystemMod.BFSCallback
import typingsSlinky.browserfs.fileSystemMod.FileSystemOptions
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("browserfs/dist/node/backend/IsoFS", JSImport.Default)
@js.native
class default protected () extends IsoFS {
  /**
    * **Deprecated. Please use IsoFS.Create() method instead.**
    *
    * Constructs a read-only file system from the given ISO.
    * @param data The ISO file in a buffer.
    * @param name The name of the ISO (optional; used for debug messages / identification via getName()).
    */
  def this(data: Buffer) = this()
  def this(data: Buffer, name: String) = this()
  def this(data: Buffer, name: js.UndefOr[scala.Nothing], deprecateMsg: Boolean) = this()
  def this(data: Buffer, name: String, deprecateMsg: Boolean) = this()
}
/* static members */
@JSImport("browserfs/dist/node/backend/IsoFS", JSImport.Default)
@js.native
object default extends js.Object {
  
  /**
    * Creates an IsoFS instance with the given options.
    */
  def Create(opts: IsoFSOptions, cb: BFSCallback[IsoFS]): Unit = js.native
  
  val Name: String = js.native
  
  val Options: FileSystemOptions = js.native
  
  def isAvailable(): Boolean = js.native
}
