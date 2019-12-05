package typingsSlinky.readableDashStream

import typingsSlinky.node.streamMod.Duplex
import typingsSlinky.node.streamMod.PassThrough
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.node.streamMod.Transform
import typingsSlinky.node.streamMod.Writable
import typingsSlinky.node.streamMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Duplex extends js.Object {
  var Duplex: typingsSlinky.node.streamMod.Duplex
  var PassThrough: typingsSlinky.node.streamMod.PassThrough
  var Readable: typingsSlinky.node.streamMod.Readable
  var Stream: ^
  var Transform: typingsSlinky.node.streamMod.Transform
  var Writable: typingsSlinky.node.streamMod.Writable
}

object Anon_Duplex {
  @scala.inline
  def apply(
    Duplex: Duplex,
    PassThrough: PassThrough,
    Readable: Readable,
    Stream: ^,
    Transform: Transform,
    Writable: Writable
  ): Anon_Duplex = {
    val __obj = js.Dynamic.literal(Duplex = Duplex.asInstanceOf[js.Any], PassThrough = PassThrough.asInstanceOf[js.Any], Readable = Readable.asInstanceOf[js.Any], Stream = Stream.asInstanceOf[js.Any], Transform = Transform.asInstanceOf[js.Any], Writable = Writable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Duplex]
  }
}

