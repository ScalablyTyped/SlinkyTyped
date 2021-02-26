package typingsSlinky.protobufjs.minimalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("protobufjs/minimal", "Writer")
@js.native
/** Constructs a new writer instance. */
class Writer ()
  extends typingsSlinky.protobufjs.mod.Writer
/* static members */
object Writer {
  
  /**
    * Allocates a buffer of the specified size.
    * @param size Buffer size
    * @returns Buffer
    */
  @JSImport("protobufjs/minimal", "Writer.alloc")
  @js.native
  def alloc(size: Double): js.typedarray.Uint8Array = js.native
  
  /**
    * Creates a new writer.
    * @returns A {@link BufferWriter} when Buffers are supported, otherwise a {@link Writer}
    */
  @JSImport("protobufjs/minimal", "Writer.create")
  @js.native
  def create(): typingsSlinky.protobufjs.mod.BufferWriter | typingsSlinky.protobufjs.mod.Writer = js.native
}
