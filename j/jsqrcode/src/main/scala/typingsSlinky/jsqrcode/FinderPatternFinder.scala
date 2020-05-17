package typingsSlinky.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FinderPatternFinder extends js.Object {
  val CrossCheckStateCount: js.Tuple5[Double, Double, Double, Double, Double] = js.native
  var crossCheckStateCount: js.Tuple5[Double, Double, Double, Double, Double] = js.native
  var hasSkipped: Boolean = js.native
  var image: js.typedarray.Uint8Array = js.native
  var possibleCenters: js.Array[FinderPattern] = js.native
  var resultPointCallback: ResultPointCallback = js.native
  def centerFromEnd(stateCount: js.Tuple5[Double, Double, Double, Double, Double], end: Double): Double = js.native
  def crossCheckHorizontal(startJ: Double, centerI: Double, maxCount: Double, originalStateCountTotal: Double): Double = js.native
  def crossCheckVertical(startI: Double, centerJ: Double, maxCount: Double, originalStateCountTotal: Double): Double = js.native
  def findFinderPattern(image: js.typedarray.Uint8Array): FinderPatternInfo = js.native
  def findRowSkip(): Double = js.native
  def foundPatternCross(stateCount: js.Tuple5[Double, Double, Double, Double, Double]): Boolean = js.native
  def handlePossibleCenter(stateCount: js.Tuple5[Double, Double, Double, Double, Double], i: Double, j: Double): Boolean = js.native
  def haveMultiplyConfirmedCenters(): Boolean = js.native
  def selectBestPatterns(): Double = js.native
}

object FinderPatternFinder {
  @scala.inline
  def apply(
    CrossCheckStateCount: js.Tuple5[Double, Double, Double, Double, Double],
    centerFromEnd: (js.Tuple5[Double, Double, Double, Double, Double], Double) => Double,
    crossCheckHorizontal: (Double, Double, Double, Double) => Double,
    crossCheckStateCount: js.Tuple5[Double, Double, Double, Double, Double],
    crossCheckVertical: (Double, Double, Double, Double) => Double,
    findFinderPattern: js.typedarray.Uint8Array => FinderPatternInfo,
    findRowSkip: () => Double,
    foundPatternCross: js.Tuple5[Double, Double, Double, Double, Double] => Boolean,
    handlePossibleCenter: (js.Tuple5[Double, Double, Double, Double, Double], Double, Double) => Boolean,
    hasSkipped: Boolean,
    haveMultiplyConfirmedCenters: () => Boolean,
    image: js.typedarray.Uint8Array,
    possibleCenters: js.Array[FinderPattern],
    resultPointCallback: ResultPointCallback,
    selectBestPatterns: () => Double
  ): FinderPatternFinder = {
    val __obj = js.Dynamic.literal(CrossCheckStateCount = CrossCheckStateCount.asInstanceOf[js.Any], centerFromEnd = js.Any.fromFunction2(centerFromEnd), crossCheckHorizontal = js.Any.fromFunction4(crossCheckHorizontal), crossCheckStateCount = crossCheckStateCount.asInstanceOf[js.Any], crossCheckVertical = js.Any.fromFunction4(crossCheckVertical), findFinderPattern = js.Any.fromFunction1(findFinderPattern), findRowSkip = js.Any.fromFunction0(findRowSkip), foundPatternCross = js.Any.fromFunction1(foundPatternCross), handlePossibleCenter = js.Any.fromFunction3(handlePossibleCenter), hasSkipped = hasSkipped.asInstanceOf[js.Any], haveMultiplyConfirmedCenters = js.Any.fromFunction0(haveMultiplyConfirmedCenters), image = image.asInstanceOf[js.Any], possibleCenters = possibleCenters.asInstanceOf[js.Any], resultPointCallback = resultPointCallback.asInstanceOf[js.Any], selectBestPatterns = js.Any.fromFunction0(selectBestPatterns))
    __obj.asInstanceOf[FinderPatternFinder]
  }
  @scala.inline
  implicit class FinderPatternFinderOps[Self <: FinderPatternFinder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrossCheckStateCount(value: js.Tuple5[Double, Double, Double, Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CrossCheckStateCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCenterFromEnd(value: (js.Tuple5[Double, Double, Double, Double, Double], Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerFromEnd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCrossCheckHorizontal(value: (Double, Double, Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossCheckHorizontal")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withCrossCheckVertical(value: (Double, Double, Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossCheckVertical")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withFindFinderPattern(value: js.typedarray.Uint8Array => FinderPatternInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findFinderPattern")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFindRowSkip(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findRowSkip")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFoundPatternCross(value: js.Tuple5[Double, Double, Double, Double, Double] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foundPatternCross")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHandlePossibleCenter(value: (js.Tuple5[Double, Double, Double, Double, Double], Double, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlePossibleCenter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withHasSkipped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasSkipped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHaveMultiplyConfirmedCenters(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("haveMultiplyConfirmedCenters")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withImage(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPossibleCenters(value: js.Array[FinderPattern]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("possibleCenters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultPointCallback(value: ResultPointCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultPointCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectBestPatterns(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectBestPatterns")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

