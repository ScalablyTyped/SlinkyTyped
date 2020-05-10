package typingsSlinky.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerGroupLaunchConfiguration extends js.Object {
  /**
    * Launch order of servers in the server group.
    */
  var launchOrder: js.UndefOr[LaunchOrder] = js.native
  /**
    * Identifier of the server group the launch configuration is associated with.
    */
  var serverGroupId: js.UndefOr[ServerGroupId] = js.native
  /**
    * Launch configuration for servers in the server group.
    */
  var serverLaunchConfigurations: js.UndefOr[ServerLaunchConfigurations] = js.native
}

object ServerGroupLaunchConfiguration {
  @scala.inline
  def apply(): ServerGroupLaunchConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerGroupLaunchConfiguration]
  }
  @scala.inline
  implicit class ServerGroupLaunchConfigurationOps[Self <: ServerGroupLaunchConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLaunchOrder(value: LaunchOrder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLaunchOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("launchOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withServerGroupId(value: ServerGroupId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withServerLaunchConfigurations(value: ServerLaunchConfigurations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverLaunchConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerLaunchConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverLaunchConfigurations")(js.undefined)
        ret
    }
  }
  
}

