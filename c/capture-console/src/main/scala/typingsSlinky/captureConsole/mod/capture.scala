package typingsSlinky.captureConsole.mod

import typingsSlinky.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("capture-console", "capture")
@js.native
object capture extends js.Object {
  
  def apply(streams: js.Array[WritableStream], exec: js.Function0[Unit]): js.Array[String] = js.native
  def apply(streams: js.Array[WritableStream], opts: CaptureOptions, exec: js.Function0[Unit]): js.Array[String] = js.native
  def apply(streams: WritableStream, exec: js.Function0[Unit]): js.Array[String] = js.native
  def apply(streams: WritableStream, opts: CaptureOptions, exec: js.Function0[Unit]): js.Array[String] = js.native
}
