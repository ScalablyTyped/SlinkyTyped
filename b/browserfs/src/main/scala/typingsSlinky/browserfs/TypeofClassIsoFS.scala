package typingsSlinky.browserfs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.browserfs.distNodeBackendIsoFSMod.IsoFS
import typingsSlinky.browserfs.distNodeBackendIsoFSMod.IsoFSOptions
import typingsSlinky.browserfs.distNodeBackendIsoFSMod.default
import typingsSlinky.browserfs.distNodeCoreFileUnderscoreSystemMod.BFSCallback
import typingsSlinky.browserfs.distNodeCoreFileUnderscoreSystemMod.FileSystemOptions
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassIsoFS
  extends Instantiable1[/* data */ Buffer, default]
     with Instantiable2[/* data */ Buffer, /* name */ String, default]
     with Instantiable3[/* data */ Buffer, /* name */ String, /* deprecateMsg */ Boolean, default] {
  val Name: String = js.native
  val Options: FileSystemOptions = js.native
  /**
    * Creates an IsoFS instance with the given options.
    */
  def Create(opts: IsoFSOptions, cb: BFSCallback[IsoFS]): Unit = js.native
  def isAvailable(): Boolean = js.native
}

