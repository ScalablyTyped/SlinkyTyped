package typingsSlinky.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Version extends js.Object {
  val AlignmentPatternCenters: js.Array[Double] = js.native
  val DimensionForVersion: Double = js.native
  val TotalCodewords: Double = js.native
  val VersionNumber: Double = js.native
  var alignmentPatternCenters: js.Array[Double] = js.native
  var ecBlocks: js.Array[ECBlocks] = js.native
  var versionNumber: Double = js.native
  def buildFunctionPattern(): BitMatrix = js.native
  def getECBlocksForLevel(ecLevel: ErrorCorrectionLevel): ECBlocks = js.native
}

object Version {
  @scala.inline
  def apply(
    AlignmentPatternCenters: js.Array[Double],
    DimensionForVersion: Double,
    TotalCodewords: Double,
    VersionNumber: Double,
    alignmentPatternCenters: js.Array[Double],
    buildFunctionPattern: () => BitMatrix,
    ecBlocks: js.Array[ECBlocks],
    getECBlocksForLevel: ErrorCorrectionLevel => ECBlocks,
    versionNumber: Double
  ): Version = {
    val __obj = js.Dynamic.literal(AlignmentPatternCenters = AlignmentPatternCenters.asInstanceOf[js.Any], DimensionForVersion = DimensionForVersion.asInstanceOf[js.Any], TotalCodewords = TotalCodewords.asInstanceOf[js.Any], VersionNumber = VersionNumber.asInstanceOf[js.Any], alignmentPatternCenters = alignmentPatternCenters.asInstanceOf[js.Any], buildFunctionPattern = js.Any.fromFunction0(buildFunctionPattern), ecBlocks = ecBlocks.asInstanceOf[js.Any], getECBlocksForLevel = js.Any.fromFunction1(getECBlocksForLevel), versionNumber = versionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[Version]
  }
  @scala.inline
  implicit class VersionOps[Self <: Version] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignmentPatternCenters(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AlignmentPatternCenters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDimensionForVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DimensionForVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalCodewords(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalCodewords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersionNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBuildFunctionPattern(value: () => BitMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildFunctionPattern")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withEcBlocks(value: js.Array[ECBlocks]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ecBlocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetECBlocksForLevel(value: ErrorCorrectionLevel => ECBlocks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getECBlocksForLevel")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

