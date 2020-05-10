package typingsSlinky.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeBasedLinear extends js.Object {
  /**
    * The number of minutes between each incremental traffic shift of a TimeBasedLinear deployment.
    */
  var linearInterval: js.UndefOr[WaitTimeInMins] = js.native
  /**
    * The percentage of traffic that is shifted at the start of each increment of a TimeBasedLinear deployment.
    */
  var linearPercentage: js.UndefOr[Percentage] = js.native
}

object TimeBasedLinear {
  @scala.inline
  def apply(): TimeBasedLinear = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeBasedLinear]
  }
  @scala.inline
  implicit class TimeBasedLinearOps[Self <: TimeBasedLinear] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLinearInterval(value: WaitTimeInMins): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linearInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinearInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linearInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withLinearPercentage(value: Percentage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linearPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinearPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linearPercentage")(js.undefined)
        ret
    }
  }
  
}

