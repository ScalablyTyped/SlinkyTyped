package typingsSlinky.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Detector extends js.Object {
  var image: js.typedarray.Uint8Array = js.native
  var resultPointCallback: ResultPointCallback = js.native
  def calculateModuleSize(topLeft: AlignmentPattern, topRight: AlignmentPattern, bottomLeft: AlignmentPattern): Double = js.native
  def calculateModuleSizeOneWay(pattern: AlignmentPattern, otherPattern: AlignmentPattern): Double = js.native
  def computeDimension(
    topLeft: AlignmentPattern,
    topRight: AlignmentPattern,
    bottomLeft: AlignmentPattern,
    moduleSize: Double
  ): Double = js.native
  def createTransform(
    topLeft: AlignmentPattern,
    topRight: AlignmentPattern,
    bottomLeft: AlignmentPattern,
    alignmentPattern: AlignmentPattern,
    dimension: Double
  ): PerspectiveTransform = js.native
  def detect(): DetectorResult = js.native
  def distance(pattern1: AlignmentPattern, pattern2: AlignmentPattern): Double = js.native
  def findAlignmentInRegion(
    overallEstModuleSize: Double,
    estAlignmentX: Double,
    estAlignmentY: Double,
    allowanceFactor: Double
  ): AlignmentPattern = js.native
  def processFinderPatternInfo(info: FinderPatternInfo): DetectorResult = js.native
  def sampleGrid(image: js.typedarray.Uint8Array, transform: PerspectiveTransform, dimension: Double): BitMatrix = js.native
  def sizeOfBlackWhiteBlackRun(fromX: Double, fromY: Double, toX: Double, toY: Double): Double = js.native
  def sizeOfBlackWhiteBlackRunBothWays(fromX: Double, fromY: Double, toX: Double, toY: Double): Double = js.native
}

object Detector {
  @scala.inline
  def apply(
    calculateModuleSize: (AlignmentPattern, AlignmentPattern, AlignmentPattern) => Double,
    calculateModuleSizeOneWay: (AlignmentPattern, AlignmentPattern) => Double,
    computeDimension: (AlignmentPattern, AlignmentPattern, AlignmentPattern, Double) => Double,
    createTransform: (AlignmentPattern, AlignmentPattern, AlignmentPattern, AlignmentPattern, Double) => PerspectiveTransform,
    detect: () => DetectorResult,
    distance: (AlignmentPattern, AlignmentPattern) => Double,
    findAlignmentInRegion: (Double, Double, Double, Double) => AlignmentPattern,
    image: js.typedarray.Uint8Array,
    processFinderPatternInfo: FinderPatternInfo => DetectorResult,
    resultPointCallback: ResultPointCallback,
    sampleGrid: (js.typedarray.Uint8Array, PerspectiveTransform, Double) => BitMatrix,
    sizeOfBlackWhiteBlackRun: (Double, Double, Double, Double) => Double,
    sizeOfBlackWhiteBlackRunBothWays: (Double, Double, Double, Double) => Double
  ): Detector = {
    val __obj = js.Dynamic.literal(calculateModuleSize = js.Any.fromFunction3(calculateModuleSize), calculateModuleSizeOneWay = js.Any.fromFunction2(calculateModuleSizeOneWay), computeDimension = js.Any.fromFunction4(computeDimension), createTransform = js.Any.fromFunction5(createTransform), detect = js.Any.fromFunction0(detect), distance = js.Any.fromFunction2(distance), findAlignmentInRegion = js.Any.fromFunction4(findAlignmentInRegion), image = image.asInstanceOf[js.Any], processFinderPatternInfo = js.Any.fromFunction1(processFinderPatternInfo), resultPointCallback = resultPointCallback.asInstanceOf[js.Any], sampleGrid = js.Any.fromFunction3(sampleGrid), sizeOfBlackWhiteBlackRun = js.Any.fromFunction4(sizeOfBlackWhiteBlackRun), sizeOfBlackWhiteBlackRunBothWays = js.Any.fromFunction4(sizeOfBlackWhiteBlackRunBothWays))
    __obj.asInstanceOf[Detector]
  }
  @scala.inline
  implicit class DetectorOps[Self <: Detector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalculateModuleSize(value: (AlignmentPattern, AlignmentPattern, AlignmentPattern) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateModuleSize")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withCalculateModuleSizeOneWay(value: (AlignmentPattern, AlignmentPattern) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateModuleSizeOneWay")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withComputeDimension(value: (AlignmentPattern, AlignmentPattern, AlignmentPattern, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeDimension")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withCreateTransform(
      value: (AlignmentPattern, AlignmentPattern, AlignmentPattern, AlignmentPattern, Double) => PerspectiveTransform
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTransform")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withDetect(value: () => DetectorResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDistance(value: (AlignmentPattern, AlignmentPattern) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFindAlignmentInRegion(value: (Double, Double, Double, Double) => AlignmentPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findAlignmentInRegion")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withImage(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessFinderPatternInfo(value: FinderPatternInfo => DetectorResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processFinderPatternInfo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withResultPointCallback(value: ResultPointCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultPointCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSampleGrid(value: (js.typedarray.Uint8Array, PerspectiveTransform, Double) => BitMatrix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sampleGrid")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSizeOfBlackWhiteBlackRun(value: (Double, Double, Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeOfBlackWhiteBlackRun")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withSizeOfBlackWhiteBlackRunBothWays(value: (Double, Double, Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeOfBlackWhiteBlackRunBothWays")(js.Any.fromFunction4(value))
        ret
    }
  }
  
}

