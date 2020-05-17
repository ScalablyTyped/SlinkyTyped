package typingsSlinky.reconnectingwebsocket

import org.scalajs.dom.raw.Blob
import typingsSlinky.std.ArrayBufferLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object anon extends js.Object {
  @js.native
  trait FnCall extends js.Object {
    def apply(): Unit = js.native
    def apply(code: Double): Unit = js.native
    def apply(code: Double, reason: String): Unit = js.native
  }
  
  @js.native
  trait FnCallData extends js.Object {
    def apply(data: String): Unit = js.native
    def apply(data: ArrayBufferLike): Unit = js.native
    def apply(data: js.typedarray.ArrayBufferView): Unit = js.native
    def apply(data: Blob): Unit = js.native
  }
  
}

