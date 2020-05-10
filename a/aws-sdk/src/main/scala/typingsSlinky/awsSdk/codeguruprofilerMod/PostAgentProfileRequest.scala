package typingsSlinky.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostAgentProfileRequest extends js.Object {
  /**
    * 
    */
  var agentProfile: AgentProfile = js.native
  /**
    * 
    */
  var contentType: String = js.native
  /**
    * 
    */
  var profileToken: js.UndefOr[ClientToken] = js.native
  /**
    * 
    */
  var profilingGroupName: ProfilingGroupName = js.native
}

object PostAgentProfileRequest {
  @scala.inline
  def apply(agentProfile: AgentProfile, contentType: String, profilingGroupName: ProfilingGroupName): PostAgentProfileRequest = {
    val __obj = js.Dynamic.literal(agentProfile = agentProfile.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], profilingGroupName = profilingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostAgentProfileRequest]
  }
  @scala.inline
  implicit class PostAgentProfileRequestOps[Self <: PostAgentProfileRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgentProfileUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAgentProfile(value: AgentProfile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentProfile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfilingGroupName(value: ProfilingGroupName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profilingGroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProfileToken(value: ClientToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileToken")(js.undefined)
        ret
    }
  }
  
}

