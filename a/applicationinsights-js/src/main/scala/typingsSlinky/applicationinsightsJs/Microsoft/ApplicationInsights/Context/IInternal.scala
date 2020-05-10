package typingsSlinky.applicationinsightsJs.Microsoft.ApplicationInsights.Context

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IInternal extends js.Object {
  /**
    * The SDK agent version.
    */
  var agentVersion: String = js.native
  /**
    * The SDK version used to create this telemetry item.
    */
  var sdkVersion: String = js.native
}

object IInternal {
  @scala.inline
  def apply(agentVersion: String, sdkVersion: String): IInternal = {
    val __obj = js.Dynamic.literal(agentVersion = agentVersion.asInstanceOf[js.Any], sdkVersion = sdkVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInternal]
  }
  @scala.inline
  implicit class IInternalOps[Self <: IInternal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgentVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agentVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSdkVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sdkVersion")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

