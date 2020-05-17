package typingsSlinky.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlignmentPatternFinder extends js.Object {
  var crossCheckStateCount: js.Tuple3[Double, Double, Double] = js.native
  var height: Double = js.native
  var image: js.typedarray.Uint8Array = js.native
  var moduleSize: Double = js.native
  var possibleCenters: js.Array[AlignmentPattern] = js.native
  var resultPointCallback: ResultPointCallback = js.native
  var startX: Double = js.native
  var startY: Double = js.native
  var width: Double = js.native
  /* private */ def centerFromEnd(stateCount: Double, end: Double): Double = js.native
  def find(): AlignmentPattern = js.native
  /* private */ def foundPatternCross(stateCount: Double): Boolean = js.native
  /* private */ def handlePossibleCenter(stateCount: Double, i: Double, j: Double): AlignmentPattern = js.native
}

object AlignmentPatternFinder {
  @scala.inline
  def apply(
    centerFromEnd: (Double, Double) => Double,
    crossCheckStateCount: js.Tuple3[Double, Double, Double],
    find: () => AlignmentPattern,
    foundPatternCross: Double => Boolean,
    handlePossibleCenter: (Double, Double, Double) => AlignmentPattern,
    height: Double,
    image: js.typedarray.Uint8Array,
    moduleSize: Double,
    possibleCenters: js.Array[AlignmentPattern],
    resultPointCallback: ResultPointCallback,
    startX: Double,
    startY: Double,
    width: Double
  ): AlignmentPatternFinder = {
    val __obj = js.Dynamic.literal(centerFromEnd = js.Any.fromFunction2(centerFromEnd), crossCheckStateCount = crossCheckStateCount.asInstanceOf[js.Any], find = js.Any.fromFunction0(find), foundPatternCross = js.Any.fromFunction1(foundPatternCross), handlePossibleCenter = js.Any.fromFunction3(handlePossibleCenter), height = height.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], moduleSize = moduleSize.asInstanceOf[js.Any], possibleCenters = possibleCenters.asInstanceOf[js.Any], resultPointCallback = resultPointCallback.asInstanceOf[js.Any], startX = startX.asInstanceOf[js.Any], startY = startY.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignmentPatternFinder]
  }
  @scala.inline
  implicit class AlignmentPatternFinderOps[Self <: AlignmentPatternFinder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCenterFromEnd(value: (Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centerFromEnd")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCrossCheckStateCount(value: js.Tuple3[Double, Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossCheckStateCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFind(value: () => AlignmentPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("find")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFoundPatternCross(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("foundPatternCross")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHandlePossibleCenter(value: (Double, Double, Double) => AlignmentPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handlePossibleCenter")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withModuleSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moduleSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPossibleCenters(value: js.Array[AlignmentPattern]): Self = {
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
    def withStartX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

