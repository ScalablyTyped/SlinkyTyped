package typingsSlinky.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Flow extends StObject {
  
  /**
    * The Availability Zone that you want to create the flow in. These options are limited to the Availability Zones within the current AWS.
    */
  var AvailabilityZone: string = js.native
  
  /**
    * A description of the flow. This value is not used or seen outside of the current AWS Elemental MediaConnect account.
    */
  var Description: js.UndefOr[string] = js.native
  
  /**
    * The IP address from which video will be sent to output destinations.
    */
  var EgressIp: js.UndefOr[string] = js.native
  
  /**
    * The entitlements in this flow.
    */
  var Entitlements: listOfEntitlement = js.native
  
  /**
    * The Amazon Resource Name (ARN), a unique identifier for any AWS resource, of the flow.
    */
  var FlowArn: string = js.native
  
  /**
    * The name of the flow.
    */
  var Name: string = js.native
  
  /**
    * The outputs in this flow.
    */
  var Outputs: listOfOutput = js.native
  
  var Source: typingsSlinky.awsSdk.mediaconnectMod.Source = js.native
  
  var SourceFailoverConfig: js.UndefOr[FailoverConfig] = js.native
  
  var Sources: js.UndefOr[listOfSource] = js.native
  
  /**
    * The current status of the flow.
    */
  var Status: typingsSlinky.awsSdk.mediaconnectMod.Status = js.native
  
  /**
    * The VPC Interfaces for this flow.
    */
  var VpcInterfaces: js.UndefOr[listOfVpcInterface] = js.native
}
object Flow {
  
  @scala.inline
  def apply(
    AvailabilityZone: string,
    Entitlements: listOfEntitlement,
    FlowArn: string,
    Name: string,
    Outputs: listOfOutput,
    Source: Source,
    Status: Status
  ): Flow = {
    val __obj = js.Dynamic.literal(AvailabilityZone = AvailabilityZone.asInstanceOf[js.Any], Entitlements = Entitlements.asInstanceOf[js.Any], FlowArn = FlowArn.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Outputs = Outputs.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Flow]
  }
  
  @scala.inline
  implicit class FlowMutableBuilder[Self <: Flow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZone(value: string): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setEgressIp(value: string): Self = StObject.set(x, "EgressIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEgressIpUndefined: Self = StObject.set(x, "EgressIp", js.undefined)
    
    @scala.inline
    def setEntitlements(value: listOfEntitlement): Self = StObject.set(x, "Entitlements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitlementsVarargs(value: Entitlement*): Self = StObject.set(x, "Entitlements", js.Array(value :_*))
    
    @scala.inline
    def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputs(value: listOfOutput): Self = StObject.set(x, "Outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputsVarargs(value: Output*): Self = StObject.set(x, "Outputs", js.Array(value :_*))
    
    @scala.inline
    def setSource(value: Source): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceFailoverConfig(value: FailoverConfig): Self = StObject.set(x, "SourceFailoverConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceFailoverConfigUndefined: Self = StObject.set(x, "SourceFailoverConfig", js.undefined)
    
    @scala.inline
    def setSources(value: listOfSource): Self = StObject.set(x, "Sources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourcesUndefined: Self = StObject.set(x, "Sources", js.undefined)
    
    @scala.inline
    def setSourcesVarargs(value: Source*): Self = StObject.set(x, "Sources", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcInterfaces(value: listOfVpcInterface): Self = StObject.set(x, "VpcInterfaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcInterfacesUndefined: Self = StObject.set(x, "VpcInterfaces", js.undefined)
    
    @scala.inline
    def setVpcInterfacesVarargs(value: VpcInterface*): Self = StObject.set(x, "VpcInterfaces", js.Array(value :_*))
  }
}
