package typingsSlinky.apolloProtobufjs.minimalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@apollo/protobufjs/minimal", "Reader")
@js.native
class Reader protected ()
  extends typingsSlinky.apolloProtobufjs.mod.Reader {
  /**
    * Constructs a new reader instance using the specified buffer.
    * @param buffer Buffer to read from
    */
  def this(buffer: js.typedarray.Uint8Array) = this()
}
/* static members */
object Reader {
  
  /**
    * Creates a new reader using the specified buffer.
    * @param buffer Buffer to read from
    * @returns A {@link BufferReader} if `buffer` is a Buffer, otherwise a {@link Reader}
    * @throws {Error} If `buffer` is not a valid buffer
    */
  @JSImport("@apollo/protobufjs/minimal", "Reader.create")
  @js.native
  def create(buffer: js.typedarray.Uint8Array): typingsSlinky.apolloProtobufjs.mod.Reader | typingsSlinky.apolloProtobufjs.mod.BufferReader = js.native
}
