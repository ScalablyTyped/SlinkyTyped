package typingsSlinky.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupVersion extends StObject {
  
  /**
    * The ARN of the connector definition version for this group.
    */
  var ConnectorDefinitionVersionArn: js.UndefOr[string] = js.native
  
  /**
    * The ARN of the core definition version for this group.
    */
  var CoreDefinitionVersionArn: js.UndefOr[string] = js.native
  
  /**
    * The ARN of the device definition version for this group.
    */
  var DeviceDefinitionVersionArn: js.UndefOr[string] = js.native
  
  /**
    * The ARN of the function definition version for this group.
    */
  var FunctionDefinitionVersionArn: js.UndefOr[string] = js.native
  
  /**
    * The ARN of the logger definition version for this group.
    */
  var LoggerDefinitionVersionArn: js.UndefOr[string] = js.native
  
  /**
    * The ARN of the resource definition version for this group.
    */
  var ResourceDefinitionVersionArn: js.UndefOr[string] = js.native
  
  /**
    * The ARN of the subscription definition version for this group.
    */
  var SubscriptionDefinitionVersionArn: js.UndefOr[string] = js.native
}
object GroupVersion {
  
  @scala.inline
  def apply(): GroupVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupVersion]
  }
  
  @scala.inline
  implicit class GroupVersionMutableBuilder[Self <: GroupVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectorDefinitionVersionArn(value: string): Self = StObject.set(x, "ConnectorDefinitionVersionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectorDefinitionVersionArnUndefined: Self = StObject.set(x, "ConnectorDefinitionVersionArn", js.undefined)
    
    @scala.inline
    def setCoreDefinitionVersionArn(value: string): Self = StObject.set(x, "CoreDefinitionVersionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoreDefinitionVersionArnUndefined: Self = StObject.set(x, "CoreDefinitionVersionArn", js.undefined)
    
    @scala.inline
    def setDeviceDefinitionVersionArn(value: string): Self = StObject.set(x, "DeviceDefinitionVersionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceDefinitionVersionArnUndefined: Self = StObject.set(x, "DeviceDefinitionVersionArn", js.undefined)
    
    @scala.inline
    def setFunctionDefinitionVersionArn(value: string): Self = StObject.set(x, "FunctionDefinitionVersionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunctionDefinitionVersionArnUndefined: Self = StObject.set(x, "FunctionDefinitionVersionArn", js.undefined)
    
    @scala.inline
    def setLoggerDefinitionVersionArn(value: string): Self = StObject.set(x, "LoggerDefinitionVersionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggerDefinitionVersionArnUndefined: Self = StObject.set(x, "LoggerDefinitionVersionArn", js.undefined)
    
    @scala.inline
    def setResourceDefinitionVersionArn(value: string): Self = StObject.set(x, "ResourceDefinitionVersionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceDefinitionVersionArnUndefined: Self = StObject.set(x, "ResourceDefinitionVersionArn", js.undefined)
    
    @scala.inline
    def setSubscriptionDefinitionVersionArn(value: string): Self = StObject.set(x, "SubscriptionDefinitionVersionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionDefinitionVersionArnUndefined: Self = StObject.set(x, "SubscriptionDefinitionVersionArn", js.undefined)
  }
}
