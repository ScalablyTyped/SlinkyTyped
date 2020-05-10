package typingsSlinky.expoLocation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeadingData extends js.Object {
  var accuracy: Double = js.native
  var magHeading: Double = js.native
  var trueHeading: Double = js.native
}

object HeadingData {
  @scala.inline
  def apply(accuracy: Double, magHeading: Double, trueHeading: Double): HeadingData = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], magHeading = magHeading.asInstanceOf[js.Any], trueHeading = trueHeading.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadingData]
  }
  @scala.inline
  implicit class HeadingDataOps[Self <: HeadingData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccuracy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accuracy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMagHeading(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("magHeading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrueHeading(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trueHeading")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

