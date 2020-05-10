package typingsSlinky.reactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAverageItemLength extends js.Object {
  var averageItemLength: Double = js.native
  var highestMeasuredFrameIndex: Double = js.native
  var index: Double = js.native
}

object AnonAverageItemLength {
  @scala.inline
  def apply(averageItemLength: Double, highestMeasuredFrameIndex: Double, index: Double): AnonAverageItemLength = {
    val __obj = js.Dynamic.literal(averageItemLength = averageItemLength.asInstanceOf[js.Any], highestMeasuredFrameIndex = highestMeasuredFrameIndex.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAverageItemLength]
  }
  @scala.inline
  implicit class AnonAverageItemLengthOps[Self <: AnonAverageItemLength] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAverageItemLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("averageItemLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHighestMeasuredFrameIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highestMeasuredFrameIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

