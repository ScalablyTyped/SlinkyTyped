package typingsSlinky.awsSdk.codestarconnectionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Host extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the host.
    */
  var HostArn: js.UndefOr[typingsSlinky.awsSdk.codestarconnectionsMod.HostArn] = js.native
  
  /**
    * The name of the host.
    */
  var Name: js.UndefOr[HostName] = js.native
  
  /**
    * The endpoint of the infrastructure where your provider type is installed.
    */
  var ProviderEndpoint: js.UndefOr[Url] = js.native
  
  /**
    * The name of the installed provider to be associated with your connection. The host resource represents the infrastructure where your provider type is installed. The valid provider type is GitHub Enterprise Server.
    */
  var ProviderType: js.UndefOr[typingsSlinky.awsSdk.codestarconnectionsMod.ProviderType] = js.native
  
  /**
    * The status of the host, such as PENDING, AVAILABLE, VPC_CONFIG_DELETING, VPC_CONFIG_INITIALIZING, and VPC_CONFIG_FAILED_INITIALIZATION.
    */
  var Status: js.UndefOr[HostStatus] = js.native
  
  /**
    * The status description for the host.
    */
  var StatusMessage: js.UndefOr[HostStatusMessage] = js.native
  
  /**
    * The VPC configuration provisioned for the host.
    */
  var VpcConfiguration: js.UndefOr[typingsSlinky.awsSdk.codestarconnectionsMod.VpcConfiguration] = js.native
}
object Host {
  
  @scala.inline
  def apply(): Host = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Host]
  }
  
  @scala.inline
  implicit class HostMutableBuilder[Self <: Host] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHostArn(value: HostArn): Self = StObject.set(x, "HostArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostArnUndefined: Self = StObject.set(x, "HostArn", js.undefined)
    
    @scala.inline
    def setName(value: HostName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setProviderEndpoint(value: Url): Self = StObject.set(x, "ProviderEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderEndpointUndefined: Self = StObject.set(x, "ProviderEndpoint", js.undefined)
    
    @scala.inline
    def setProviderType(value: ProviderType): Self = StObject.set(x, "ProviderType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderTypeUndefined: Self = StObject.set(x, "ProviderType", js.undefined)
    
    @scala.inline
    def setStatus(value: HostStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessage(value: HostStatusMessage): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setVpcConfiguration(value: VpcConfiguration): Self = StObject.set(x, "VpcConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcConfigurationUndefined: Self = StObject.set(x, "VpcConfiguration", js.undefined)
  }
}
