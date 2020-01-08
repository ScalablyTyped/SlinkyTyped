package typingsSlinky.pump

import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pump", JSImport.Namespace)
@js.native
object pumpMod extends js.Object {
  // callback have to be passed as last argument
  def apply(streams: (Stream | Callback)*): Stream = js.native
  def apply(streams: js.Array[Stream]): Stream = js.native
  def apply(streams: js.Array[Stream], callback: Callback): Stream = js.native
  type Callback = js.Function1[/* err */ js.Error, js.Any]
  type Stream = ReadableStream | WritableStream
}

