package typingsSlinky.hdrHistogramJs.mod

import typingsSlinky.hdrHistogramJs.byteBufferMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hdr-histogram-js", "ByteBuffer")
@js.native
class ByteBuffer protected () extends default {
  def this(data: js.typedarray.Uint8Array) = this()
}
/* static members */
@JSImport("hdr-histogram-js", "ByteBuffer")
@js.native
object ByteBuffer extends js.Object {
  
  def allocate(): typingsSlinky.hdrHistogramJs.byteBufferMod.ByteBuffer = js.native
  def allocate(size: Double): typingsSlinky.hdrHistogramJs.byteBufferMod.ByteBuffer = js.native
}
