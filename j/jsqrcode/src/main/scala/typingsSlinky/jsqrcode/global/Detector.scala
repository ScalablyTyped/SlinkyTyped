package typingsSlinky.jsqrcode.global

import typingsSlinky.jsqrcode.ResultPointCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Detector")
@js.native
class Detector protected ()
  extends typingsSlinky.jsqrcode.Detector {
  def this(image: js.typedarray.Uint8Array) = this()
  /* CompleteClass */
  override var image: js.typedarray.Uint8Array = js.native
  /* CompleteClass */
  override var resultPointCallback: ResultPointCallback = js.native
  /* CompleteClass */
  override def calculateModuleSize(
    topLeft: typingsSlinky.jsqrcode.AlignmentPattern,
    topRight: typingsSlinky.jsqrcode.AlignmentPattern,
    bottomLeft: typingsSlinky.jsqrcode.AlignmentPattern
  ): Double = js.native
  /* CompleteClass */
  override def calculateModuleSizeOneWay(
    pattern: typingsSlinky.jsqrcode.AlignmentPattern,
    otherPattern: typingsSlinky.jsqrcode.AlignmentPattern
  ): Double = js.native
  /* CompleteClass */
  override def computeDimension(
    topLeft: typingsSlinky.jsqrcode.AlignmentPattern,
    topRight: typingsSlinky.jsqrcode.AlignmentPattern,
    bottomLeft: typingsSlinky.jsqrcode.AlignmentPattern,
    moduleSize: Double
  ): Double = js.native
  /* CompleteClass */
  override def createTransform(
    topLeft: typingsSlinky.jsqrcode.AlignmentPattern,
    topRight: typingsSlinky.jsqrcode.AlignmentPattern,
    bottomLeft: typingsSlinky.jsqrcode.AlignmentPattern,
    alignmentPattern: typingsSlinky.jsqrcode.AlignmentPattern,
    dimension: Double
  ): typingsSlinky.jsqrcode.PerspectiveTransform = js.native
  /* CompleteClass */
  override def detect(): typingsSlinky.jsqrcode.DetectorResult = js.native
  /* CompleteClass */
  override def distance(
    pattern1: typingsSlinky.jsqrcode.AlignmentPattern,
    pattern2: typingsSlinky.jsqrcode.AlignmentPattern
  ): Double = js.native
  /* CompleteClass */
  override def findAlignmentInRegion(
    overallEstModuleSize: Double,
    estAlignmentX: Double,
    estAlignmentY: Double,
    allowanceFactor: Double
  ): typingsSlinky.jsqrcode.AlignmentPattern = js.native
  /* CompleteClass */
  override def processFinderPatternInfo(info: typingsSlinky.jsqrcode.FinderPatternInfo): typingsSlinky.jsqrcode.DetectorResult = js.native
  /* CompleteClass */
  override def sampleGrid(
    image: js.typedarray.Uint8Array,
    transform: typingsSlinky.jsqrcode.PerspectiveTransform,
    dimension: Double
  ): typingsSlinky.jsqrcode.BitMatrix = js.native
  /* CompleteClass */
  override def sizeOfBlackWhiteBlackRun(fromX: Double, fromY: Double, toX: Double, toY: Double): Double = js.native
  /* CompleteClass */
  override def sizeOfBlackWhiteBlackRunBothWays(fromX: Double, fromY: Double, toX: Double, toY: Double): Double = js.native
}

