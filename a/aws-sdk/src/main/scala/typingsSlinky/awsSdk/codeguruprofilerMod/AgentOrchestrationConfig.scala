package typingsSlinky.awsSdk.codeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentOrchestrationConfig extends js.Object {
  /**
    * 
    */
  var profilingEnabled: Boolean = js.native
}

object AgentOrchestrationConfig {
  @scala.inline
  def apply(profilingEnabled: Boolean): AgentOrchestrationConfig = {
    val __obj = js.Dynamic.literal(profilingEnabled = profilingEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentOrchestrationConfig]
  }
  @scala.inline
  implicit class AgentOrchestrationConfigOps[Self <: AgentOrchestrationConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProfilingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profilingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

