package typingsSlinky.googleDashGax.googleDashGaxMod.fallback.protobuf

import typingsSlinky.protobufjs.protobufjsMod.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax", "fallback.protobuf.Reader")
@js.native
class Reader protected ()
  extends typingsSlinky.googleDashGax.buildSrcFallbackMod.protobuf.Reader {
  /**
    * Constructs a new reader instance using the specified buffer.
    * @param buffer Buffer to read from
    */
  def this(buffer: scala.scalajs.js.typedarray.Uint8Array) = this()
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
  def create(buffer: Buffer | scala.scalajs.js.typedarray.Uint8Array): typingsSlinky.protobufjs.protobufjsMod.Reader | typingsSlinky.protobufjs.protobufjsMod.BufferReader = js.native
}

