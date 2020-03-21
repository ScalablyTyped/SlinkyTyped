package typingsSlinky.qIo.Qio

import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Writer extends js.Object {
  var node: WritableStream = js.native
  def close(): Unit = js.native
  def destroy(): Unit = js.native
  def flush(): Promise[Unit] = js.native
  def write(content: String): Unit = js.native
  def write(content: Buffer): Unit = js.native
}

