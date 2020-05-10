package typingsSlinky.globalAgent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxyAgentConfigurationInputType extends js.Object {
  var environmentVariableNamespace: js.UndefOr[String] = js.native
  var forceGlobalAgent: js.UndefOr[Boolean] = js.native
  var socketConnectionTimeout: js.UndefOr[Double] = js.native
}

object ProxyAgentConfigurationInputType {
  @scala.inline
  def apply(): ProxyAgentConfigurationInputType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxyAgentConfigurationInputType]
  }
  @scala.inline
  implicit class ProxyAgentConfigurationInputTypeOps[Self <: ProxyAgentConfigurationInputType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnvironmentVariableNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentVariableNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironmentVariableNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentVariableNamespace")(js.undefined)
        ret
    }
    @scala.inline
    def withForceGlobalAgent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceGlobalAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceGlobalAgent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceGlobalAgent")(js.undefined)
        ret
    }
    @scala.inline
    def withSocketConnectionTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketConnectionTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocketConnectionTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socketConnectionTimeout")(js.undefined)
        ret
    }
  }
  
}

