package typingsSlinky.chunkedDc.chunkedDc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Unchunker extends js.Object {
  
  def add(chunk: js.typedarray.ArrayBuffer): Unit = js.native
  def add(chunk: js.typedarray.ArrayBuffer, context: js.Any): Unit = js.native
  
  def gc(maxAge: Double): Double = js.native
  
  def onMessage(message: js.typedarray.Uint8Array): Unit = js.native
  def onMessage(message: js.typedarray.Uint8Array, context: js.Any): Unit = js.native
  @JSName("onMessage")
  var onMessage_Original: MessageListener = js.native
}
