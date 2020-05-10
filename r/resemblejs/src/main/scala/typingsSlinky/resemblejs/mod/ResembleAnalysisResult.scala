package typingsSlinky.resemblejs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResembleAnalysisResult extends js.Object {
  var blue: Double = js.native
  var brightness: Double = js.native
  var green: Double = js.native
  var red: Double = js.native
}

object ResembleAnalysisResult {
  @scala.inline
  def apply(blue: Double, brightness: Double, green: Double, red: Double): ResembleAnalysisResult = {
    val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], brightness = brightness.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResembleAnalysisResult]
  }
  @scala.inline
  implicit class ResembleAnalysisResultOps[Self <: ResembleAnalysisResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBrightness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brightness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGreen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("green")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("red")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

