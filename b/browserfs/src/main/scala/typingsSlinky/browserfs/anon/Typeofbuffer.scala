package typingsSlinky.browserfs.anon

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.node.Buffer
import typingsSlinky.node.bufferMod.SlowBuffer
import typingsSlinky.node.bufferMod.TranscodeEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofbuffer extends js.Object {
  var Buffer: (Instantiable1[/* str */ String, typingsSlinky.node.bufferMod.Buffer]) with TypeofBuffer_ = js.native
  val INSPECT_MAX_BYTES: Double = js.native
  var SlowBuffer: (Instantiable1[/* size */ Double, typingsSlinky.node.bufferMod.SlowBuffer]) with Instantiable = js.native
  val constants: MAXLENGTH = js.native
  val kMaxLength: Double = js.native
  val kStringMaxLength: Double = js.native
  def transcode(source: js.typedarray.Uint8Array, fromEnc: TranscodeEncoding, toEnc: TranscodeEncoding): Buffer = js.native
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
  @scala.inline
  implicit class TypeofbufferOps[Self <: Typeofbuffer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuffer(value: (Instantiable1[/* str */ String, typingsSlinky.node.bufferMod.Buffer]) with TypeofBuffer_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Buffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withINSPECT_MAX_BYTES(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("INSPECT_MAX_BYTES")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlowBuffer(value: (Instantiable1[/* size */ Double, SlowBuffer]) with Instantiable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SlowBuffer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConstants(value: MAXLENGTH): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKMaxLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kMaxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKStringMaxLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kStringMaxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTranscode(value: (js.typedarray.Uint8Array, TranscodeEncoding, TranscodeEncoding) => Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transcode")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

