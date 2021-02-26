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

object eipAssociationMod {
  
  @JSImport("@pulumi/aws/ec2/eipAssociation", "EipAssociation")
  @js.native
  class EipAssociation protected () extends CustomResource {
    /**
      * Create a EipAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: EipAssociationArgs) = this()
    def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
    def this(name: String, args: EipAssociationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The allocation ID. This is required for EC2-VPC.
      */
    val allocationId: Output_[String] = js.native
    
    /**
      * Whether to allow an Elastic IP to
      * be re-associated. Defaults to `true` in VPC.
      */
    val allowReassociation: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The ID of the instance. This is required for
      * EC2-Classic. For EC2-VPC, you can specify either the instance ID or the
      * network interface ID, but not both. The operation fails if you specify an
      * instance ID unless exactly one network interface is attached.
      */
    val instanceId: Output_[String] = js.native
    
    /**
      * The ID of the network interface. If the
      * instance has more than one network interface, you must specify a network
      * interface ID.
      */
    val networkInterfaceId: Output_[String] = js.native
    
    /**
      * The primary or secondary private IP address
      * to associate with the Elastic IP address. If no private IP address is
      * specified, the Elastic IP address is associated with the primary private IP
      * address.
      */
    val privateIpAddress: Output_[String] = js.native
    
    /**
      * The Elastic IP address. This is required for EC2-Classic.
      */
    val publicIp: Output_[String] = js.native
  }
  /* static members */
  object EipAssociation {
    
    /**
      * Get an existing EipAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2/eipAssociation", "EipAssociation.get")
    @js.native
    def get(name: String, id: Input[ID]): EipAssociation = js.native
    @JSImport("@pulumi/aws/ec2/eipAssociation", "EipAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): EipAssociation = js.native
    @JSImport("@pulumi/aws/ec2/eipAssociation", "EipAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: EipAssociationState): EipAssociation = js.native
    @JSImport("@pulumi/aws/ec2/eipAssociation", "EipAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: EipAssociationState, opts: CustomResourceOptions): EipAssociation = js.native
    
    /**
      * Returns true if the given object is an instance of EipAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2/eipAssociation", "EipAssociation.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/eipAssociation.EipAssociation */ Boolean = js.native
  }
  
  @js.native
  trait EipAssociationArgs extends StObject {
    
    /**
      * The allocation ID. This is required for EC2-VPC.
      */
    val allocationId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Whether to allow an Elastic IP to
      * be re-associated. Defaults to `true` in VPC.
      */
    val allowReassociation: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The ID of the instance. This is required for
      * EC2-Classic. For EC2-VPC, you can specify either the instance ID or the
      * network interface ID, but not both. The operation fails if you specify an
      * instance ID unless exactly one network interface is attached.
      */
    val instanceId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the network interface. If the
      * instance has more than one network interface, you must specify a network
      * interface ID.
      */
    val networkInterfaceId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The primary or secondary private IP address
      * to associate with the Elastic IP address. If no private IP address is
      * specified, the Elastic IP address is associated with the primary private IP
      * address.
      */
    val privateIpAddress: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Elastic IP address. This is required for EC2-Classic.
      */
    val publicIp: js.UndefOr[Input[String]] = js.native
  }
  object EipAssociationArgs {
    
    @scala.inline
    def apply(): EipAssociationArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EipAssociationArgs]
    }
    
    @scala.inline
    implicit class EipAssociationArgsMutableBuilder[Self <: EipAssociationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllocationId(value: Input[String]): Self = StObject.set(x, "allocationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllocationIdUndefined: Self = StObject.set(x, "allocationId", js.undefined)
      
      @scala.inline
      def setAllowReassociation(value: Input[Boolean]): Self = StObject.set(x, "allowReassociation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowReassociationUndefined: Self = StObject.set(x, "allowReassociation", js.undefined)
      
      @scala.inline
      def setInstanceId(value: Input[String]): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
      
      @scala.inline
      def setNetworkInterfaceId(value: Input[String]): Self = StObject.set(x, "networkInterfaceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "networkInterfaceId", js.undefined)
      
      @scala.inline
      def setPrivateIpAddress(value: Input[String]): Self = StObject.set(x, "privateIpAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateIpAddressUndefined: Self = StObject.set(x, "privateIpAddress", js.undefined)
      
      @scala.inline
      def setPublicIp(value: Input[String]): Self = StObject.set(x, "publicIp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicIpUndefined: Self = StObject.set(x, "publicIp", js.undefined)
    }
  }
  
  @js.native
  trait EipAssociationState extends StObject {
    
    /**
      * The allocation ID. This is required for EC2-VPC.
      */
    val allocationId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Whether to allow an Elastic IP to
      * be re-associated. Defaults to `true` in VPC.
      */
    val allowReassociation: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The ID of the instance. This is required for
      * EC2-Classic. For EC2-VPC, you can specify either the instance ID or the
      * network interface ID, but not both. The operation fails if you specify an
      * instance ID unless exactly one network interface is attached.
      */
    val instanceId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the network interface. If the
      * instance has more than one network interface, you must specify a network
      * interface ID.
      */
    val networkInterfaceId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The primary or secondary private IP address
      * to associate with the Elastic IP address. If no private IP address is
      * specified, the Elastic IP address is associated with the primary private IP
      * address.
      */
    val privateIpAddress: js.UndefOr[Input[String]] = js.native
    
    /**
      * The Elastic IP address. This is required for EC2-Classic.
      */
    val publicIp: js.UndefOr[Input[String]] = js.native
  }
  object EipAssociationState {
    
    @scala.inline
    def apply(): EipAssociationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EipAssociationState]
    }
    
    @scala.inline
    implicit class EipAssociationStateMutableBuilder[Self <: EipAssociationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllocationId(value: Input[String]): Self = StObject.set(x, "allocationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllocationIdUndefined: Self = StObject.set(x, "allocationId", js.undefined)
      
      @scala.inline
      def setAllowReassociation(value: Input[Boolean]): Self = StObject.set(x, "allowReassociation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowReassociationUndefined: Self = StObject.set(x, "allowReassociation", js.undefined)
      
      @scala.inline
      def setInstanceId(value: Input[String]): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
      
      @scala.inline
      def setNetworkInterfaceId(value: Input[String]): Self = StObject.set(x, "networkInterfaceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "networkInterfaceId", js.undefined)
      
      @scala.inline
      def setPrivateIpAddress(value: Input[String]): Self = StObject.set(x, "privateIpAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateIpAddressUndefined: Self = StObject.set(x, "privateIpAddress", js.undefined)
      
      @scala.inline
      def setPublicIp(value: Input[String]): Self = StObject.set(x, "publicIp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublicIpUndefined: Self = StObject.set(x, "publicIp", js.undefined)
    }
  }
}
