package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCommandInvocationRequest extends js.Object {
  /**
    * (Required) The parent command ID of the invocation plugin.
    */
  var CommandId: typingsSlinky.awsSdk.ssmMod.CommandId = js.native
  /**
    * (Required) The ID of the managed instance targeted by the command. A managed instance can be an Amazon EC2 instance or an instance in your hybrid environment that is configured for Systems Manager.
    */
  var InstanceId: typingsSlinky.awsSdk.ssmMod.InstanceId = js.native
  /**
    * (Optional) The name of the plugin for which you want detailed results. If the document contains only one plugin, the name can be omitted and the details will be returned.
    */
  var PluginName: js.UndefOr[CommandPluginName] = js.native
}

object GetCommandInvocationRequest {
  @scala.inline
  def apply(CommandId: CommandId, InstanceId: InstanceId): GetCommandInvocationRequest = {
    val __obj = js.Dynamic.literal(CommandId = CommandId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCommandInvocationRequest]
  }
  @scala.inline
  implicit class GetCommandInvocationRequestOps[Self <: GetCommandInvocationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCommandId(value: CommandId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CommandId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceId(value: InstanceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPluginName(value: CommandPluginName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PluginName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPluginName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PluginName")(js.undefined)
        ret
    }
  }
  
}

