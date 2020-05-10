package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAgentVersionsResult extends js.Object {
  /**
    * The agent versions for the specified stack or configuration manager. Note that this value is the complete version number, not the abbreviated number used by the console.
    */
  var AgentVersions: js.UndefOr[typingsSlinky.awsSdk.opsworksMod.AgentVersions] = js.native
}

object DescribeAgentVersionsResult {
  @scala.inline
  def apply(): DescribeAgentVersionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAgentVersionsResult]
  }
  @scala.inline
  implicit class DescribeAgentVersionsResultOps[Self <: DescribeAgentVersionsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgentVersions(value: AgentVersions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AgentVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgentVersions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AgentVersions")(js.undefined)
        ret
    }
  }
  
}

