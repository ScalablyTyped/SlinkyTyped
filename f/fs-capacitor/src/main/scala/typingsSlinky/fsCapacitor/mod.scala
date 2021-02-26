package typingsSlinky.fsCapacitor

import typingsSlinky.node.streamMod.ReadableOptions
import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fs-capacitor", "ReadAfterDestroyedError")
  @js.native
  class ReadAfterDestroyedError () extends Error
  
  @JSImport("fs-capacitor", "ReadStream")
  @js.native
  class ReadStream ()
    extends typingsSlinky.node.fsMod.ReadStream {
    def this(opts: ReadableOptions) = this()
  }
  
  @JSImport("fs-capacitor", "WriteStream")
  @js.native
  class WriteStream ()
    extends typingsSlinky.node.fsMod.WriteStream {
    
    def createReadStream(): ReadStream = js.native
    def createReadStream(name: String): ReadStream = js.native
  }
}
