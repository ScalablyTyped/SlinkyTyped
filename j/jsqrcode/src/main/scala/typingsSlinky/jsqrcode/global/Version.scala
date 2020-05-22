package typingsSlinky.jsqrcode.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Version")
@js.native
class Version protected ()
  extends typingsSlinky.jsqrcode.Version {
  def this(
    versionNumber: Double,
    alignmentPatternCenters: js.Array[Double],
    ecBlocks1: typingsSlinky.jsqrcode.ECBlocks,
    ecBlocks2: typingsSlinky.jsqrcode.ECBlocks,
    ecBlocks3: typingsSlinky.jsqrcode.ECBlocks,
    ecBlocks4: typingsSlinky.jsqrcode.ECBlocks
  ) = this()
  /* CompleteClass */
  override val AlignmentPatternCenters: js.Array[Double] = js.native
  /* CompleteClass */
  override val DimensionForVersion: Double = js.native
  /* CompleteClass */
  override val TotalCodewords: Double = js.native
  /* CompleteClass */
  override val VersionNumber: Double = js.native
  /* CompleteClass */
  override var alignmentPatternCenters: js.Array[Double] = js.native
  /* CompleteClass */
  override var ecBlocks: js.Array[typingsSlinky.jsqrcode.ECBlocks] = js.native
  /* CompleteClass */
  override var versionNumber: Double = js.native
  /* CompleteClass */
  override def buildFunctionPattern(): typingsSlinky.jsqrcode.BitMatrix = js.native
  /* CompleteClass */
  override def getECBlocksForLevel(ecLevel: typingsSlinky.jsqrcode.ErrorCorrectionLevel): typingsSlinky.jsqrcode.ECBlocks = js.native
}

/* static members */
@JSGlobal("Version")
@js.native
object Version extends js.Object {
  val VERSIONS: js.Array[typingsSlinky.jsqrcode.Version] = js.native
  val VERSION_DECODE_INFO: js.Array[js.Any] = js.native
  def decodeVersionInformation(versionBits: Double): typingsSlinky.jsqrcode.Version = js.native
  def getProvisionalVersionForDimension(dimension: Double): typingsSlinky.jsqrcode.Version = js.native
  def getVersionForNumber(versionNumber: Double): typingsSlinky.jsqrcode.Version = js.native
}

