package typingsSlinky.qIo

import typingsSlinky.node.Buffer
import typingsSlinky.qIo.Qio.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QioBufferWriter extends js.Object {
  var Writer: typingsSlinky.qIo.Qio.Writer = js.native
  def apply(writer: Buffer): Writer = js.native
}

