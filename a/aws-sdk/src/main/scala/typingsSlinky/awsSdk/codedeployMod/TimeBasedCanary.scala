package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeBasedCanary extends js.Object {
  /**
    * The number of minutes between the first and second traffic shifts of a TimeBasedCanary deployment.
    */
  var canaryInterval: js.UndefOr[WaitTimeInMins] = js.native
  /**
    * The percentage of traffic to shift in the first increment of a TimeBasedCanary deployment.
    */
  var canaryPercentage: js.UndefOr[Percentage] = js.native
}

object TimeBasedCanary {
  @scala.inline
  def apply(): TimeBasedCanary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeBasedCanary]
  }
  @scala.inline
  implicit class TimeBasedCanaryOps[Self <: TimeBasedCanary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCanaryInterval(value: WaitTimeInMins): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canaryInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanaryInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canaryInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withCanaryPercentage(value: Percentage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canaryPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanaryPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canaryPercentage")(js.undefined)
        ret
    }
  }
  
}

