package typingsSlinky.readableStream.mod

import typingsSlinky.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BufferRequest extends js.Object {
  var chunk: js.Any = js.native
   // TODO
  var encoding: BufferEncoding = js.native
  var isBuf: Boolean = js.native
  var next: BufferRequest | Null = js.native
  def callback(): Unit = js.native
  def callback(error: js.Error): Unit = js.native
}

