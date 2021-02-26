package typingsSlinky.pulumiAws

import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object networkAssociationMod {
  
  @JSImport("@pulumi/aws/ec2clientvpn/networkAssociation", "NetworkAssociation")
  @js.native
  class NetworkAssociation protected () extends CustomResource {
    /**
      * Create a NetworkAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: NetworkAssociationArgs) = this()
    def this(name: String, args: NetworkAssociationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The unique ID of the target network association.
      */
    val associationId: Output_[String] = js.native
    
    /**
      * The ID of the Client VPN endpoint.
      */
    val clientVpnEndpointId: Output_[String] = js.native
    
    /**
      * A list of up to five custom security groups to apply to the target network. If not specified, the VPC's default security group is assigned.
      */
    val securityGroups: Output_[js.Array[String]] = js.native
    
    /**
      * The current state of the target network association.
      */
    val status: Output_[String] = js.native
    
    /**
      * The ID of the subnet to associate with the Client VPN endpoint.
      */
    val subnetId: Output_[String] = js.native
    
    /**
      * The ID of the VPC in which the target subnet is located.
      */
    val vpcId: Output_[String] = js.native
  }
  /* static members */
  object NetworkAssociation {
    
    /**
      * Get an existing NetworkAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2clientvpn/networkAssociation", "NetworkAssociation.get")
    @js.native
    def get(name: String, id: Input[ID]): NetworkAssociation = js.native
    @JSImport("@pulumi/aws/ec2clientvpn/networkAssociation", "NetworkAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): NetworkAssociation = js.native
    @JSImport("@pulumi/aws/ec2clientvpn/networkAssociation", "NetworkAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: NetworkAssociationState): NetworkAssociation = js.native
    @JSImport("@pulumi/aws/ec2clientvpn/networkAssociation", "NetworkAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: NetworkAssociationState, opts: CustomResourceOptions): NetworkAssociation = js.native
    
    /**
      * Returns true if the given object is an instance of NetworkAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2clientvpn/networkAssociation", "NetworkAssociation.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2clientvpn/networkAssociation.NetworkAssociation */ Boolean = js.native
  }
  
  @js.native
  trait NetworkAssociationArgs extends StObject {
    
    /**
      * The ID of the Client VPN endpoint.
      */
    val clientVpnEndpointId: Input[String] = js.native
    
    /**
      * A list of up to five custom security groups to apply to the target network. If not specified, the VPC's default security group is assigned.
      */
    val securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The ID of the subnet to associate with the Client VPN endpoint.
      */
    val subnetId: Input[String] = js.native
  }
  object NetworkAssociationArgs {
    
    @scala.inline
    def apply(clientVpnEndpointId: Input[String], subnetId: Input[String]): NetworkAssociationArgs = {
      val __obj = js.Dynamic.literal(clientVpnEndpointId = clientVpnEndpointId.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any])
      __obj.asInstanceOf[NetworkAssociationArgs]
    }
    
    @scala.inline
    implicit class NetworkAssociationArgsMutableBuilder[Self <: NetworkAssociationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientVpnEndpointId(value: Input[String]): Self = StObject.set(x, "clientVpnEndpointId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupsUndefined: Self = StObject.set(x, "securityGroups", js.undefined)
      
      @scala.inline
      def setSecurityGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroups", js.Array(value :_*))
      
      @scala.inline
      def setSubnetId(value: Input[String]): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NetworkAssociationState extends StObject {
    
    /**
      * The unique ID of the target network association.
      */
    val associationId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the Client VPN endpoint.
      */
    val clientVpnEndpointId: js.UndefOr[Input[String]] = js.native
    
    /**
      * A list of up to five custom security groups to apply to the target network. If not specified, the VPC's default security group is assigned.
      */
    val securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The current state of the target network association.
      */
    val status: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the subnet to associate with the Client VPN endpoint.
      */
    val subnetId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the VPC in which the target subnet is located.
      */
    val vpcId: js.UndefOr[Input[String]] = js.native
  }
  object NetworkAssociationState {
    
    @scala.inline
    def apply(): NetworkAssociationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NetworkAssociationState]
    }
    
    @scala.inline
    implicit class NetworkAssociationStateMutableBuilder[Self <: NetworkAssociationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssociationId(value: Input[String]): Self = StObject.set(x, "associationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssociationIdUndefined: Self = StObject.set(x, "associationId", js.undefined)
      
      @scala.inline
      def setClientVpnEndpointId(value: Input[String]): Self = StObject.set(x, "clientVpnEndpointId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientVpnEndpointIdUndefined: Self = StObject.set(x, "clientVpnEndpointId", js.undefined)
      
      @scala.inline
      def setSecurityGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupsUndefined: Self = StObject.set(x, "securityGroups", js.undefined)
      
      @scala.inline
      def setSecurityGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroups", js.Array(value :_*))
      
      @scala.inline
      def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setSubnetId(value: Input[String]): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
      
      @scala.inline
      def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
}
