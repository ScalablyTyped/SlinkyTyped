package typingsSlinky.reactNativeChartsWrapper.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Phase extends js.Object {
  var lineLength: Double = js.native
  var phase: js.UndefOr[Double] = js.native
  var spaceLength: Double = js.native
}

object Phase {
  @scala.inline
  def apply(lineLength: Double, spaceLength: Double): Phase = {
    val __obj = js.Dynamic.literal(lineLength = lineLength.asInstanceOf[js.Any], spaceLength = spaceLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[Phase]
  }
  @scala.inline
  implicit class PhaseOps[Self <: Phase] (val x: Self) extends AnyVal {
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
    def withSpaceLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spaceLength")(value.asInstanceOf[js.Any])
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
  }
  
}

