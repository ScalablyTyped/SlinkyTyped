package typingsSlinky.peerjs.mod

import org.scalajs.dom.experimental.mediastream.MediaStream
import org.scalajs.dom.experimental.webrtc.RTCPeerConnection
import typingsSlinky.peerjs.peerjsStrings.close
import typingsSlinky.peerjs.peerjsStrings.error
import typingsSlinky.peerjs.peerjsStrings.stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaConnection extends js.Object {
  
  def answer(): Unit = js.native
  def answer(stream: js.UndefOr[scala.Nothing], options: AnswerOption): Unit = js.native
  def answer(stream: MediaStream): Unit = js.native
  def answer(stream: MediaStream, options: AnswerOption): Unit = js.native
  
  def close(): Unit = js.native
  
  var metadata: js.Any = js.native
  
  def off(event: String, fn: js.Function): Unit = js.native
  def off(event: String, fn: js.Function, once: Boolean): Unit = js.native
  
  def on(event: String, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_close(event: close, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_error(event: error, cb: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  @JSName("on")
  def on_stream(event: stream, cb: js.Function1[/* stream */ MediaStream, Unit]): Unit = js.native
  
  var open: Boolean = js.native
  
  var peer: String = js.native
  
  var peerConnection: RTCPeerConnection = js.native
  
  var `type`: String = js.native
}
