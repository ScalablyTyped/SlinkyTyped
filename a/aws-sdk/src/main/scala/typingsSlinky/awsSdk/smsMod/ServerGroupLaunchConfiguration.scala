package typingsSlinky.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerGroupLaunchConfiguration extends StObject {
  
  /**
    * The launch order of servers in the server group.
    */
  var launchOrder: js.UndefOr[LaunchOrder] = js.native
  
  /**
    * The ID of the server group with which the launch configuration is associated.
    */
  var serverGroupId: js.UndefOr[ServerGroupId] = js.native
  
  /**
    * The launch configuration for servers in the server group.
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
  implicit class ServerGroupLaunchConfigurationMutableBuilder[Self <: ServerGroupLaunchConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLaunchOrder(value: LaunchOrder): Self = StObject.set(x, "launchOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchOrderUndefined: Self = StObject.set(x, "launchOrder", js.undefined)
    
    @scala.inline
    def setServerGroupId(value: ServerGroupId): Self = StObject.set(x, "serverGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerGroupIdUndefined: Self = StObject.set(x, "serverGroupId", js.undefined)
    
    @scala.inline
    def setServerLaunchConfigurations(value: ServerLaunchConfigurations): Self = StObject.set(x, "serverLaunchConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerLaunchConfigurationsUndefined: Self = StObject.set(x, "serverLaunchConfigurations", js.undefined)
    
    @scala.inline
    def setServerLaunchConfigurationsVarargs(value: ServerLaunchConfiguration*): Self = StObject.set(x, "serverLaunchConfigurations", js.Array(value :_*))
  }
}
