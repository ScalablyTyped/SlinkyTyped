package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AgentVersion extends js.Object {
  /**
    * The configuration manager.
    */
  var ConfigurationManager: js.UndefOr[StackConfigurationManager] = js.native
  /**
    * The agent version.
    */
  var Version: js.UndefOr[String] = js.native
}

object AgentVersion {
  @scala.inline
  def apply(): AgentVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgentVersion]
  }
  @scala.inline
  implicit class AgentVersionOps[Self <: AgentVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigurationManager(value: StackConfigurationManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigurationManager: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationManager")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(js.undefined)
        ret
    }
  }
  
}

