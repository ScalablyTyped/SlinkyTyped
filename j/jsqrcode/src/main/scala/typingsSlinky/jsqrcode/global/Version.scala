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

