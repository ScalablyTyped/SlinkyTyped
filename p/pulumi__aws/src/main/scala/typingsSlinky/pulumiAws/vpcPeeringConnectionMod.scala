package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.ec2.VpcPeeringConnectionAccepter
import typingsSlinky.pulumiAws.outputMod.ec2.VpcPeeringConnectionRequester
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vpcPeeringConnectionMod {
  
  @JSImport("@pulumi/aws/ec2/vpcPeeringConnection", "VpcPeeringConnection")
  @js.native
  class VpcPeeringConnection protected () extends CustomResource {
    /**
      * Create a VpcPeeringConnection resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VpcPeeringConnectionArgs) = this()
    def this(name: String, args: VpcPeeringConnectionArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The status of the VPC Peering Connection request.
      */
    val acceptStatus: Output_[String] = js.native
    
    /**
      * An optional configuration block that allows for [VPC Peering Connection]
      * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to be set for the VPC that accepts
      * the peering connection (a maximum of one).
      */
    val accepter: Output_[VpcPeeringConnectionAccepter] = js.native
    
    /**
      * Accept the peering (both VPCs need to be in the same AWS account).
      */
    val autoAccept: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The AWS account ID of the owner of the peer VPC.
      * Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
      */
    val peerOwnerId: Output_[String] = js.native
    
    /**
      * The region of the accepter VPC of the [VPC Peering Connection]. `autoAccept` must be `false`,
      * and use the `aws.ec2.VpcPeeringConnectionAccepter` to manage the accepter side.
      */
    val peerRegion: Output_[String] = js.native
    
    /**
      * The ID of the VPC with which you are creating the VPC Peering Connection.
      */
    val peerVpcId: Output_[String] = js.native
    
    /**
      * A optional configuration block that allows for [VPC Peering Connection]
      * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to be set for the VPC that requests
      * the peering connection (a maximum of one).
      */
    val requester: Output_[VpcPeeringConnectionRequester] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The ID of the requester VPC.
      */
    val vpcId: Output_[String] = js.native
  }
  /* static members */
  object VpcPeeringConnection {
    
    /**
      * Get an existing VpcPeeringConnection resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2/vpcPeeringConnection", "VpcPeeringConnection.get")
    @js.native
    def get(name: String, id: Input[ID]): VpcPeeringConnection = js.native
    @JSImport("@pulumi/aws/ec2/vpcPeeringConnection", "VpcPeeringConnection.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): VpcPeeringConnection = js.native
    @JSImport("@pulumi/aws/ec2/vpcPeeringConnection", "VpcPeeringConnection.get")
    @js.native
    def get(name: String, id: Input[ID], state: VpcPeeringConnectionState): VpcPeeringConnection = js.native
    @JSImport("@pulumi/aws/ec2/vpcPeeringConnection", "VpcPeeringConnection.get")
    @js.native
    def get(name: String, id: Input[ID], state: VpcPeeringConnectionState, opts: CustomResourceOptions): VpcPeeringConnection = js.native
    
    /**
      * Returns true if the given object is an instance of VpcPeeringConnection.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2/vpcPeeringConnection", "VpcPeeringConnection.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpcPeeringConnection.VpcPeeringConnection */ Boolean = js.native
  }
  
  @js.native
  trait VpcPeeringConnectionArgs extends StObject {
    
    /**
      * An optional configuration block that allows for [VPC Peering Connection]
      * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to be set for the VPC that accepts
      * the peering connection (a maximum of one).
      */
    val accepter: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.ec2.VpcPeeringConnectionAccepter]] = js.native
    
    /**
      * Accept the peering (both VPCs need to be in the same AWS account).
      */
    val autoAccept: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The AWS account ID of the owner of the peer VPC.
      * Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
      */
    val peerOwnerId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The region of the accepter VPC of the [VPC Peering Connection]. `autoAccept` must be `false`,
      * and use the `aws.ec2.VpcPeeringConnectionAccepter` to manage the accepter side.
      */
    val peerRegion: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the VPC with which you are creating the VPC Peering Connection.
      */
    val peerVpcId: Input[String] = js.native
    
    /**
      * A optional configuration block that allows for [VPC Peering Connection]
      * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to be set for the VPC that requests
      * the peering connection (a maximum of one).
      */
    val requester: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.ec2.VpcPeeringConnectionRequester]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The ID of the requester VPC.
      */
    val vpcId: Input[String] = js.native
  }
  object VpcPeeringConnectionArgs {
    
    @scala.inline
    def apply(peerVpcId: Input[String], vpcId: Input[String]): VpcPeeringConnectionArgs = {
      val __obj = js.Dynamic.literal(peerVpcId = peerVpcId.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
      __obj.asInstanceOf[VpcPeeringConnectionArgs]
    }
    
    @scala.inline
    implicit class VpcPeeringConnectionArgsMutableBuilder[Self <: VpcPeeringConnectionArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccepter(value: Input[typingsSlinky.pulumiAws.inputMod.ec2.VpcPeeringConnectionAccepter]): Self = StObject.set(x, "accepter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccepterUndefined: Self = StObject.set(x, "accepter", js.undefined)
      
      @scala.inline
      def setAutoAccept(value: Input[Boolean]): Self = StObject.set(x, "autoAccept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoAcceptUndefined: Self = StObject.set(x, "autoAccept", js.undefined)
      
      @scala.inline
      def setPeerOwnerId(value: Input[String]): Self = StObject.set(x, "peerOwnerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeerOwnerIdUndefined: Self = StObject.set(x, "peerOwnerId", js.undefined)
      
      @scala.inline
      def setPeerRegion(value: Input[String]): Self = StObject.set(x, "peerRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeerRegionUndefined: Self = StObject.set(x, "peerRegion", js.undefined)
      
      @scala.inline
      def setPeerVpcId(value: Input[String]): Self = StObject.set(x, "peerVpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequester(value: Input[typingsSlinky.pulumiAws.inputMod.ec2.VpcPeeringConnectionRequester]): Self = StObject.set(x, "requester", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequesterUndefined: Self = StObject.set(x, "requester", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VpcPeeringConnectionState extends StObject {
    
    /**
      * The status of the VPC Peering Connection request.
      */
    val acceptStatus: js.UndefOr[Input[String]] = js.native
    
    /**
      * An optional configuration block that allows for [VPC Peering Connection]
      * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to be set for the VPC that accepts
      * the peering connection (a maximum of one).
      */
    val accepter: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.ec2.VpcPeeringConnectionAccepter]] = js.native
    
    /**
      * Accept the peering (both VPCs need to be in the same AWS account).
      */
    val autoAccept: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The AWS account ID of the owner of the peer VPC.
      * Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
      */
    val peerOwnerId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The region of the accepter VPC of the [VPC Peering Connection]. `autoAccept` must be `false`,
      * and use the `aws.ec2.VpcPeeringConnectionAccepter` to manage the accepter side.
      */
    val peerRegion: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the VPC with which you are creating the VPC Peering Connection.
      */
    val peerVpcId: js.UndefOr[Input[String]] = js.native
    
    /**
      * A optional configuration block that allows for [VPC Peering Connection]
      * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to be set for the VPC that requests
      * the peering connection (a maximum of one).
      */
    val requester: js.UndefOr[Input[typingsSlinky.pulumiAws.inputMod.ec2.VpcPeeringConnectionRequester]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The ID of the requester VPC.
      */
    val vpcId: js.UndefOr[Input[String]] = js.native
  }
  object VpcPeeringConnectionState {
    
    @scala.inline
    def apply(): VpcPeeringConnectionState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VpcPeeringConnectionState]
    }
    
    @scala.inline
    implicit class VpcPeeringConnectionStateMutableBuilder[Self <: VpcPeeringConnectionState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcceptStatus(value: Input[String]): Self = StObject.set(x, "acceptStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptStatusUndefined: Self = StObject.set(x, "acceptStatus", js.undefined)
      
      @scala.inline
      def setAccepter(value: Input[typingsSlinky.pulumiAws.inputMod.ec2.VpcPeeringConnectionAccepter]): Self = StObject.set(x, "accepter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccepterUndefined: Self = StObject.set(x, "accepter", js.undefined)
      
      @scala.inline
      def setAutoAccept(value: Input[Boolean]): Self = StObject.set(x, "autoAccept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoAcceptUndefined: Self = StObject.set(x, "autoAccept", js.undefined)
      
      @scala.inline
      def setPeerOwnerId(value: Input[String]): Self = StObject.set(x, "peerOwnerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeerOwnerIdUndefined: Self = StObject.set(x, "peerOwnerId", js.undefined)
      
      @scala.inline
      def setPeerRegion(value: Input[String]): Self = StObject.set(x, "peerRegion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeerRegionUndefined: Self = StObject.set(x, "peerRegion", js.undefined)
      
      @scala.inline
      def setPeerVpcId(value: Input[String]): Self = StObject.set(x, "peerVpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeerVpcIdUndefined: Self = StObject.set(x, "peerVpcId", js.undefined)
      
      @scala.inline
      def setRequester(value: Input[typingsSlinky.pulumiAws.inputMod.ec2.VpcPeeringConnectionRequester]): Self = StObject.set(x, "requester", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequesterUndefined: Self = StObject.set(x, "requester", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
}
