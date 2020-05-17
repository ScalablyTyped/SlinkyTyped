package typingsSlinky.plotlyJs.mod

import typingsSlinky.plotlyJs.anon.PartialGaugeLine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Threshold extends js.Object {
  var line: PartialGaugeLine = js.native
  var thickness: Double = js.native
  var value: Double = js.native
}

object Threshold {
  @scala.inline
  def apply(line: PartialGaugeLine, thickness: Double, value: Double): Threshold = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Threshold]
  }
  @scala.inline
  implicit class ThresholdOps[Self <: Threshold] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLine(value: PartialGaugeLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

