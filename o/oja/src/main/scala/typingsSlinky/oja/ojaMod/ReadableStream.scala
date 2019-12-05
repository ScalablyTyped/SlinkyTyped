package typingsSlinky.oja.ojaMod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("oja", "ReadableStream")
@js.native
class ReadableStream protected () extends Readable {
  def this(topic: String, emitter: EventEmitter) = this()
}

