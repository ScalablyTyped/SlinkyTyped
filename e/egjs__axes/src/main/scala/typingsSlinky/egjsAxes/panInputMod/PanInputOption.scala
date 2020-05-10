package typingsSlinky.egjsAxes.panInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PanInputOption extends js.Object {
  var inputType: js.UndefOr[js.Array[String]] = js.native
  var scale: js.UndefOr[js.Array[Double]] = js.native
  var threshold: js.UndefOr[Double] = js.native
  var thresholdAngle: js.UndefOr[Double] = js.native
}

object PanInputOption {
  @scala.inline
  def apply(): PanInputOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PanInputOption]
  }
  @scala.inline
  implicit class PanInputOptionOps[Self <: PanInputOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputType(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputType")(js.undefined)
        ret
    }
    @scala.inline
    def withScale(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.undefined)
        ret
    }
    @scala.inline
    def withThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(js.undefined)
        ret
    }
    @scala.inline
    def withThresholdAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thresholdAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThresholdAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thresholdAngle")(js.undefined)
        ret
    }
  }
  
}

