package typingsSlinky.googleGax.mod.fallback.protobuf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax", "fallback.protobuf.Reader")
@js.native
class Reader protected ()
  extends typingsSlinky.googleGax.fallbackMod.protobuf.Reader {
  /**
    * Constructs a new reader instance using the specified buffer.
    * @param buffer Buffer to read from
    */
  def this(buffer: js.typedarray.Uint8Array) = this()
}

/* static members */
@JSImport("google-gax", "fallback.protobuf.Reader")
@js.native
object Reader extends js.Object {
  /**
    * Creates a new reader using the specified buffer.
    * @param buffer Buffer to read from
    * @returns A {@link BufferReader} if `buffer` is a Buffer, otherwise a {@link Reader}
    * @throws {Error} If `buffer` is not a valid buffer
    */
  def create(buffer: js.typedarray.Uint8Array): typingsSlinky.protobufjs.mod.Reader | typingsSlinky.protobufjs.mod.BufferReader = js.native
}

