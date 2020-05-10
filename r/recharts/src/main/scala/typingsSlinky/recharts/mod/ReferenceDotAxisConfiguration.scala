package typingsSlinky.recharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReferenceDotAxisConfiguration extends js.Object {
  var scale: ScaleCalculator = js.native
}

object ReferenceDotAxisConfiguration {
  @scala.inline
  def apply(scale: /* x */ Double | String => Double): ReferenceDotAxisConfiguration = {
    val __obj = js.Dynamic.literal(scale = js.Any.fromFunction1(scale))
    __obj.asInstanceOf[ReferenceDotAxisConfiguration]
  }
  @scala.inline
  implicit class ReferenceDotAxisConfigurationOps[Self <: ReferenceDotAxisConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScale(value: /* x */ Double | String => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scale")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

