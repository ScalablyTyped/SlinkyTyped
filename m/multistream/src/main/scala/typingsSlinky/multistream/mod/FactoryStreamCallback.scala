package typingsSlinky.multistream.mod

import typingsSlinky.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FactoryStreamCallback extends js.Object {
  def apply(): js.Any = js.native
  def apply(err: Null, stream: ReadableStream): js.Any = js.native
  def apply(err: js.Error): js.Any = js.native
}

