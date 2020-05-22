package typingsSlinky.browserfs.anon

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.node.Buffer
import typingsSlinky.node.bufferMod.SlowBuffer
import typingsSlinky.node.bufferMod.TranscodeEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofbuffer extends js.Object {
  var Buffer: (Instantiable1[/* str */ String, typingsSlinky.node.bufferMod.Buffer]) with TypeofBuffer_
  val INSPECT_MAX_BYTES: Double
  var SlowBuffer: (Instantiable1[/* size */ Double, typingsSlinky.node.bufferMod.SlowBuffer]) with Instantiable
  val constants: MAXLENGTH
  val kMaxLength: Double
  val kStringMaxLength: Double
  def transcode(source: js.typedarray.Uint8Array, fromEnc: TranscodeEncoding, toEnc: TranscodeEncoding): Buffer
}

object Typeofbuffer {
  @scala.inline
  def apply(
    Buffer: (Instantiable1[/* str */ String, typingsSlinky.node.bufferMod.Buffer]) with TypeofBuffer_,
    INSPECT_MAX_BYTES: Double,
    SlowBuffer: (Instantiable1[/* size */ Double, SlowBuffer]) with Instantiable,
    constants: MAXLENGTH,
    kMaxLength: Double,
    kStringMaxLength: Double,
    transcode: (js.typedarray.Uint8Array, TranscodeEncoding, TranscodeEncoding) => Buffer
  ): Typeofbuffer = {
    val __obj = js.Dynamic.literal(Buffer = Buffer.asInstanceOf[js.Any], INSPECT_MAX_BYTES = INSPECT_MAX_BYTES.asInstanceOf[js.Any], SlowBuffer = SlowBuffer.asInstanceOf[js.Any], constants = constants.asInstanceOf[js.Any], kMaxLength = kMaxLength.asInstanceOf[js.Any], kStringMaxLength = kStringMaxLength.asInstanceOf[js.Any], transcode = js.Any.fromFunction3(transcode))
    __obj.asInstanceOf[Typeofbuffer]
  }
}

