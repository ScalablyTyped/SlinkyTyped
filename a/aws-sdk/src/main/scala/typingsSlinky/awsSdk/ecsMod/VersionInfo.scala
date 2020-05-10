package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VersionInfo extends js.Object {
  /**
    * The Git commit hash for the Amazon ECS container agent build on the amazon-ecs-agent  GitHub repository.
    */
  var agentHash: js.UndefOr[String] = js.native
  /**
    * The version number of the Amazon ECS container agent.
    */
  var agentVersion: js.UndefOr[String] = js.native
  /**
    * The Docker version running on the container instance.
    */
  var dockerVersion: js.UndefOr[String] = js.native
}

object VersionInfo {
  @scala.inline
  def apply(): VersionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VersionInfo]
  }
  @scala.inline
  implicit class VersionInfoOps[Self <: VersionInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgentHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgentHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentHash")(js.undefined)
        ret
    }
    @scala.inline
    def withAgentVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgentVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withDockerVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockerVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDockerVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockerVersion")(js.undefined)
        ret
    }
  }
  
}

