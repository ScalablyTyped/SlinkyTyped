package typingsSlinky.jsqrcode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Version extends StObject {
  
  val AlignmentPatternCenters: js.Array[Double] = js.native
  
  val DimensionForVersion: Double = js.native
  
  val TotalCodewords: Double = js.native
  
  val VersionNumber: Double = js.native
  
  var alignmentPatternCenters: js.Array[Double] = js.native
  
  def buildFunctionPattern(): BitMatrix = js.native
  
  var ecBlocks: js.Array[ECBlocks] = js.native
  
  def getECBlocksForLevel(ecLevel: ErrorCorrectionLevel): ECBlocks = js.native
  
  var versionNumber: Double = js.native
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
  implicit class VersionMutableBuilder[Self <: Version] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignmentPatternCenters(value: js.Array[Double]): Self = StObject.set(x, "AlignmentPatternCenters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignmentPatternCentersVarargs(value: Double*): Self = StObject.set(x, "AlignmentPatternCenters", js.Array(value :_*))
    
    @scala.inline
    def setBuildFunctionPattern(value: () => BitMatrix): Self = StObject.set(x, "buildFunctionPattern", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDimensionForVersion(value: Double): Self = StObject.set(x, "DimensionForVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEcBlocks(value: js.Array[ECBlocks]): Self = StObject.set(x, "ecBlocks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEcBlocksVarargs(value: ECBlocks*): Self = StObject.set(x, "ecBlocks", js.Array(value :_*))
    
    @scala.inline
    def setGetECBlocksForLevel(value: ErrorCorrectionLevel => ECBlocks): Self = StObject.set(x, "getECBlocksForLevel", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTotalCodewords(value: Double): Self = StObject.set(x, "TotalCodewords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNumber(value: Double): Self = StObject.set(x, "VersionNumber", value.asInstanceOf[js.Any])
  }
}
