package typingsSlinky.jsqrcode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Detector extends StObject {
  
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
  
  var image: js.typedarray.Uint8Array = js.native
  
  def processFinderPatternInfo(info: FinderPatternInfo): DetectorResult = js.native
  
  var resultPointCallback: ResultPointCallback = js.native
  
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
  implicit class DetectorMutableBuilder[Self <: Detector] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalculateModuleSize(value: (AlignmentPattern, AlignmentPattern, AlignmentPattern) => Double): Self = StObject.set(x, "calculateModuleSize", js.Any.fromFunction3(value))
    
    @scala.inline
    def setCalculateModuleSizeOneWay(value: (AlignmentPattern, AlignmentPattern) => Double): Self = StObject.set(x, "calculateModuleSizeOneWay", js.Any.fromFunction2(value))
    
    @scala.inline
    def setComputeDimension(value: (AlignmentPattern, AlignmentPattern, AlignmentPattern, Double) => Double): Self = StObject.set(x, "computeDimension", js.Any.fromFunction4(value))
    
    @scala.inline
    def setCreateTransform(
      value: (AlignmentPattern, AlignmentPattern, AlignmentPattern, AlignmentPattern, Double) => PerspectiveTransform
    ): Self = StObject.set(x, "createTransform", js.Any.fromFunction5(value))
    
    @scala.inline
    def setDetect(value: () => DetectorResult): Self = StObject.set(x, "detect", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDistance(value: (AlignmentPattern, AlignmentPattern) => Double): Self = StObject.set(x, "distance", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFindAlignmentInRegion(value: (Double, Double, Double, Double) => AlignmentPattern): Self = StObject.set(x, "findAlignmentInRegion", js.Any.fromFunction4(value))
    
    @scala.inline
    def setImage(value: js.typedarray.Uint8Array): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessFinderPatternInfo(value: FinderPatternInfo => DetectorResult): Self = StObject.set(x, "processFinderPatternInfo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResultPointCallback(value: ResultPointCallback): Self = StObject.set(x, "resultPointCallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleGrid(value: (js.typedarray.Uint8Array, PerspectiveTransform, Double) => BitMatrix): Self = StObject.set(x, "sampleGrid", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSizeOfBlackWhiteBlackRun(value: (Double, Double, Double, Double) => Double): Self = StObject.set(x, "sizeOfBlackWhiteBlackRun", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSizeOfBlackWhiteBlackRunBothWays(value: (Double, Double, Double, Double) => Double): Self = StObject.set(x, "sizeOfBlackWhiteBlackRunBothWays", js.Any.fromFunction4(value))
  }
}
