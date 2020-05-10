package typingsSlinky.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentConfiguration extends js.Object {
  /**
    * 
    */
  var periodInSeconds: Integer = js.native
  /**
    * 
    */
  var shouldProfile: Boolean = js.native
}

object AgentConfiguration {
  @scala.inline
  def apply(periodInSeconds: Integer, shouldProfile: Boolean): AgentConfiguration = {
    val __obj = js.Dynamic.literal(periodInSeconds = periodInSeconds.asInstanceOf[js.Any], shouldProfile = shouldProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentConfiguration]
  }
  @scala.inline
  implicit class AgentConfigurationOps[Self <: AgentConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPeriodInSeconds(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("periodInSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShouldProfile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldProfile")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

