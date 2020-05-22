package typingsSlinky.jsqrcode.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BitMatrixParser")
@js.native
class BitMatrixParser protected ()
  extends typingsSlinky.jsqrcode.BitMatrixParser {
  def this(bitMatrix: typingsSlinky.jsqrcode.BitMatrix) = this()
  /* CompleteClass */
  override var bitMatrix: typingsSlinky.jsqrcode.BitMatrix = js.native
  /* CompleteClass */
  override var parsedFormatInfo: typingsSlinky.jsqrcode.FormatInformation = js.native
  /* CompleteClass */
  override var parsedVersion: typingsSlinky.jsqrcode.Version = js.native
  /* CompleteClass */
  override def copyBit(i: Double, j: Double, versionBits: Double): Double = js.native
  /* CompleteClass */
  override def readCodewords(): js.Array[Double] = js.native
  /* CompleteClass */
  override def readFormatInformation(): typingsSlinky.jsqrcode.FormatInformation = js.native
  /* CompleteClass */
  override def readVersion(): typingsSlinky.jsqrcode.Version = js.native
}

