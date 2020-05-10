package typingsSlinky.reactNativeChartsWrapper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonLineLength extends js.Object {
  var lineLength: js.UndefOr[Double] = js.native
  var phase: js.UndefOr[Double] = js.native
  var spaceLength: js.UndefOr[Double] = js.native
}

object AnonLineLength {
  @scala.inline
  def apply(): AnonLineLength = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonLineLength]
  }
  @scala.inline
  implicit class AnonLineLengthOps[Self <: AnonLineLength] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLineLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineLength")(js.undefined)
        ret
    }
    @scala.inline
    def withPhase(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("phase")(js.undefined)
        ret
    }
    @scala.inline
    def withSpaceLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpaceLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceLength")(js.undefined)
        ret
    }
  }
  
}

