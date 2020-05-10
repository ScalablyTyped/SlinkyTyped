package typingsSlinky.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchConfigurationsType extends js.Object {
  /**
    * The launch configurations.
    */
  var LaunchConfigurations: typingsSlinky.awsSdk.autoscalingMod.LaunchConfigurations = js.native
  /**
    * A string that indicates that the response contains more items than can be returned in a single response. To receive additional items, specify this string for the NextToken value when requesting the next set of items. This value is null when there are no more items to return.
    */
  var NextToken: js.UndefOr[XmlString] = js.native
}

object LaunchConfigurationsType {
  @scala.inline
  def apply(LaunchConfigurations: LaunchConfigurations): LaunchConfigurationsType = {
    val __obj = js.Dynamic.literal(LaunchConfigurations = LaunchConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchConfigurationsType]
  }
  @scala.inline
  implicit class LaunchConfigurationsTypeOps[Self <: LaunchConfigurationsType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLaunchConfigurations(value: LaunchConfigurations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LaunchConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextToken(value: XmlString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

