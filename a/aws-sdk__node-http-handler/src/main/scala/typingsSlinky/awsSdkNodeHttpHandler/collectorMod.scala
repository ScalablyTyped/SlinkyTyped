package typingsSlinky.awsSdkNodeHttpHandler

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Writable
import typingsSlinky.node.streamMod.WritableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collectorMod {
  
  @JSImport("@aws-sdk/node-http-handler/dist/cjs/stream-collector/collector", "Collector")
  @js.native
  class Collector () extends Writable {
    def this(opts: WritableOptions) = this()
    
    def _write(chunk: Buffer, encoding: String, callback: js.Function1[/* err */ js.UndefOr[js.Error], Unit]): Unit = js.native
    
    val bufferedBytes: js.Array[Buffer] = js.native
  }
}
