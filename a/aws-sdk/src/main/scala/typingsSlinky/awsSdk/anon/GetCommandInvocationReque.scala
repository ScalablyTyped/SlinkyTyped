package typingsSlinky.awsSdk.anon

import typingsSlinky.awsSdk.serviceMod.WaiterConfiguration
import typingsSlinky.awsSdk.ssmMod.CommandId
import typingsSlinky.awsSdk.ssmMod.CommandPluginName
import typingsSlinky.awsSdk.ssmMod.InstanceId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/ssm.GetCommandInvocationRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
@js.native
trait GetCommandInvocationReque extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  
  /**
    * (Required) The parent command ID of the invocation plugin.
    */
  var CommandId: typingsSlinky.awsSdk.ssmMod.CommandId = js.native
  
  /**
    * (Required) The ID of the managed instance targeted by the command. A managed instance can be an EC2 instance or an instance in your hybrid environment that is configured for Systems Manager.
    */
  var InstanceId: typingsSlinky.awsSdk.ssmMod.InstanceId = js.native
  
  /**
    * (Optional) The name of the plugin for which you want detailed results. If the document contains only one plugin, the name can be omitted and the details will be returned. Plugin names are also referred to as step names in Systems Manager documents.
    */
  var PluginName: js.UndefOr[CommandPluginName] = js.native
}
object GetCommandInvocationReque {
  
  @scala.inline
  def apply(CommandId: CommandId, InstanceId: InstanceId): GetCommandInvocationReque = {
    val __obj = js.Dynamic.literal(CommandId = CommandId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCommandInvocationReque]
  }
  
  @scala.inline
  implicit class GetCommandInvocationRequeMutableBuilder[Self <: GetCommandInvocationReque] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    @scala.inline
    def setCommandId(value: CommandId): Self = StObject.set(x, "CommandId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginName(value: CommandPluginName): Self = StObject.set(x, "PluginName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPluginNameUndefined: Self = StObject.set(x, "PluginName", js.undefined)
  }
}
