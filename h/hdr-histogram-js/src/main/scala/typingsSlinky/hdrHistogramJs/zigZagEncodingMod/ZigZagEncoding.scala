package typingsSlinky.hdrHistogramJs.zigZagEncodingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class provides encoding and decoding methods for writing and reading
  * ZigZag-encoded LEB128-64b9B-variant (Little Endian Base 128) values to/from a
  * {@link ByteBuffer}. LEB128's variable length encoding provides for using a
  * smaller nuber of bytes for smaller values, and the use of ZigZag encoding
  * allows small (closer to zero) negative values to use fewer bytes. Details
  * on both LEB128 and ZigZag can be readily found elsewhere.
  *
  * The LEB128-64b9B-variant encoding used here diverges from the "original"
  * LEB128 as it extends to 64 bit values: In the original LEB128, a 64 bit
  * value can take up to 10 bytes in the stream, where this variant's encoding
  * of a 64 bit values will max out at 9 bytes.
  *
  * As such, this encoder/decoder should NOT be used for encoding or decoding
  * "standard" LEB128 formats (e.g. Google Protocol Buffers).
  */
@js.native
trait ZigZagEncoding extends js.Object
