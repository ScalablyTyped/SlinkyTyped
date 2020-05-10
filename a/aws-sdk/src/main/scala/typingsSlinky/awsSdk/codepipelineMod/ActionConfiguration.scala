package typingsSlinky.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionConfiguration extends js.Object {
  /**
    * The configuration data for the action.
    */
  var configuration: js.UndefOr[ActionConfigurationMap] = js.native
}

object ActionConfiguration {
  @scala.inline
  def apply(): ActionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionConfiguration]
  }
  @scala.inline
  implicit class ActionConfigurationOps[Self <: ActionConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfiguration(value: ActionConfigurationMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configuration")(js.undefined)
        ret
    }
  }
  
}

