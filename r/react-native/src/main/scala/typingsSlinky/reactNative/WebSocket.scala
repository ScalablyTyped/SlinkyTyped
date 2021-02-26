package typingsSlinky.reactNative

import org.scalajs.dom.raw.Blob
import typingsSlinky.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebSocket extends EventTarget {
  
  def close(): Unit = js.native
  def close(code: js.UndefOr[scala.Nothing], reason: String): Unit = js.native
  def close(code: Double): Unit = js.native
  def close(code: Double, reason: String): Unit = js.native
  
  var onclose: (js.Function1[/* event */ WebSocketCloseEvent, Unit]) | Null = js.native
  
  var onerror: (js.Function1[/* event */ WebSocketErrorEvent, Unit]) | Null = js.native
  
  var onmessage: (js.Function1[/* event */ WebSocketMessageEvent, Unit]) | Null = js.native
  
  var onopen: js.Function0[Unit] | Null = js.native
  
  val readyState: Double = js.native
  
  def send(data: String): Unit = js.native
  def send(data: js.typedarray.ArrayBuffer): Unit = js.native
  def send(data: js.typedarray.ArrayBufferView): Unit = js.native
  def send(data: Blob): Unit = js.native
}
