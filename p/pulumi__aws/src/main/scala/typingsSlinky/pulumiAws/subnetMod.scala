package typingsSlinky.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subnetMod {
  
  @JSImport("@pulumi/aws/ec2/subnet", "Subnet")
  @js.native
  class Subnet protected () extends CustomResource {
    /**
      * Create a Subnet resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SubnetArgs) = this()
    def this(name: String, args: SubnetArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the subnet.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Specify true to indicate
      * that network interfaces created in the specified subnet should be
      * assigned an IPv6 address. Default is `false`
      */
    val assignIpv6AddressOnCreation: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The AZ for the subnet.
      */
    val availabilityZone: Output_[String] = js.native
    
    /**
      * The AZ ID of the subnet.
      */
    val availabilityZoneId: Output_[String] = js.native
    
    /**
      * The CIDR block for the subnet.
      */
    val cidrBlock: Output_[String] = js.native
    
    /**
      * The IPv6 network range for the subnet,
      * in CIDR notation. The subnet size must use a /64 prefix length.
      */
    val ipv6CidrBlock: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The association ID for the IPv6 CIDR block.
      */
    val ipv6CidrBlockAssociationId: Output_[String] = js.native
    
    /**
      * Specify true to indicate
      * that instances launched into the subnet should be assigned
      * a public IP address. Default is `false`.
      */
    val mapPublicIpOnLaunch: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the Outpost.
      */
    val outpostArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The ID of the AWS account that owns the subnet.
      */
    val ownerId: Output_[String] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The VPC ID.
      */
    val vpcId: Output_[String] = js.native
  }
  /* static members */
  object Subnet {
    
    /**
      * Get an existing Subnet resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2/subnet", "Subnet.get")
    @js.native
    def get(name: String, id: Input[ID]): Subnet = js.native
    @JSImport("@pulumi/aws/ec2/subnet", "Subnet.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Subnet = js.native
    @JSImport("@pulumi/aws/ec2/subnet", "Subnet.get")
    @js.native
    def get(name: String, id: Input[ID], state: SubnetState): Subnet = js.native
    @JSImport("@pulumi/aws/ec2/subnet", "Subnet.get")
    @js.native
    def get(name: String, id: Input[ID], state: SubnetState, opts: CustomResourceOptions): Subnet = js.native
    
    /**
      * Returns true if the given object is an instance of Subnet.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2/subnet", "Subnet.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/subnet.Subnet */ Boolean = js.native
  }
  
  @js.native
  trait SubnetArgs extends StObject {
    
    /**
      * Specify true to indicate
      * that network interfaces created in the specified subnet should be
      * assigned an IPv6 address. Default is `false`
      */
    val assignIpv6AddressOnCreation: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The AZ for the subnet.
      */
    val availabilityZone: js.UndefOr[Input[String]] = js.native
    
    /**
      * The AZ ID of the subnet.
      */
    val availabilityZoneId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The CIDR block for the subnet.
      */
    val cidrBlock: Input[String] = js.native
    
    /**
      * The IPv6 network range for the subnet,
      * in CIDR notation. The subnet size must use a /64 prefix length.
      */
    val ipv6CidrBlock: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specify true to indicate
      * that instances launched into the subnet should be assigned
      * a public IP address. Default is `false`.
      */
    val mapPublicIpOnLaunch: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the Outpost.
      */
    val outpostArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The VPC ID.
      */
    val vpcId: Input[String] = js.native
  }
  object SubnetArgs {
    
    @scala.inline
    def apply(cidrBlock: Input[String], vpcId: Input[String]): SubnetArgs = {
      val __obj = js.Dynamic.literal(cidrBlock = cidrBlock.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubnetArgs]
    }
    
    @scala.inline
    implicit class SubnetArgsMutableBuilder[Self <: SubnetArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssignIpv6AddressOnCreation(value: Input[Boolean]): Self = StObject.set(x, "assignIpv6AddressOnCreation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssignIpv6AddressOnCreationUndefined: Self = StObject.set(x, "assignIpv6AddressOnCreation", js.undefined)
      
      @scala.inline
      def setAvailabilityZone(value: Input[String]): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZoneId(value: Input[String]): Self = StObject.set(x, "availabilityZoneId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZoneIdUndefined: Self = StObject.set(x, "availabilityZoneId", js.undefined)
      
      @scala.inline
      def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
      
      @scala.inline
      def setCidrBlock(value: Input[String]): Self = StObject.set(x, "cidrBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpv6CidrBlock(value: Input[String]): Self = StObject.set(x, "ipv6CidrBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpv6CidrBlockUndefined: Self = StObject.set(x, "ipv6CidrBlock", js.undefined)
      
      @scala.inline
      def setMapPublicIpOnLaunch(value: Input[Boolean]): Self = StObject.set(x, "mapPublicIpOnLaunch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapPublicIpOnLaunchUndefined: Self = StObject.set(x, "mapPublicIpOnLaunch", js.undefined)
      
      @scala.inline
      def setOutpostArn(value: Input[String]): Self = StObject.set(x, "outpostArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutpostArnUndefined: Self = StObject.set(x, "outpostArn", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SubnetState extends StObject {
    
    /**
      * The ARN of the subnet.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specify true to indicate
      * that network interfaces created in the specified subnet should be
      * assigned an IPv6 address. Default is `false`
      */
    val assignIpv6AddressOnCreation: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The AZ for the subnet.
      */
    val availabilityZone: js.UndefOr[Input[String]] = js.native
    
    /**
      * The AZ ID of the subnet.
      */
    val availabilityZoneId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The CIDR block for the subnet.
      */
    val cidrBlock: js.UndefOr[Input[String]] = js.native
    
    /**
      * The IPv6 network range for the subnet,
      * in CIDR notation. The subnet size must use a /64 prefix length.
      */
    val ipv6CidrBlock: js.UndefOr[Input[String]] = js.native
    
    /**
      * The association ID for the IPv6 CIDR block.
      */
    val ipv6CidrBlockAssociationId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Specify true to indicate
      * that instances launched into the subnet should be assigned
      * a public IP address. Default is `false`.
      */
    val mapPublicIpOnLaunch: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the Outpost.
      */
    val outpostArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the AWS account that owns the subnet.
      */
    val ownerId: js.UndefOr[Input[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The VPC ID.
      */
    val vpcId: js.UndefOr[Input[String]] = js.native
  }
  object SubnetState {
    
    @scala.inline
    def apply(): SubnetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubnetState]
    }
    
    @scala.inline
    implicit class SubnetStateMutableBuilder[Self <: SubnetState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setAssignIpv6AddressOnCreation(value: Input[Boolean]): Self = StObject.set(x, "assignIpv6AddressOnCreation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssignIpv6AddressOnCreationUndefined: Self = StObject.set(x, "assignIpv6AddressOnCreation", js.undefined)
      
      @scala.inline
      def setAvailabilityZone(value: Input[String]): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZoneId(value: Input[String]): Self = StObject.set(x, "availabilityZoneId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZoneIdUndefined: Self = StObject.set(x, "availabilityZoneId", js.undefined)
      
      @scala.inline
      def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
      
      @scala.inline
      def setCidrBlock(value: Input[String]): Self = StObject.set(x, "cidrBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCidrBlockUndefined: Self = StObject.set(x, "cidrBlock", js.undefined)
      
      @scala.inline
      def setIpv6CidrBlock(value: Input[String]): Self = StObject.set(x, "ipv6CidrBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpv6CidrBlockAssociationId(value: Input[String]): Self = StObject.set(x, "ipv6CidrBlockAssociationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpv6CidrBlockAssociationIdUndefined: Self = StObject.set(x, "ipv6CidrBlockAssociationId", js.undefined)
      
      @scala.inline
      def setIpv6CidrBlockUndefined: Self = StObject.set(x, "ipv6CidrBlock", js.undefined)
      
      @scala.inline
      def setMapPublicIpOnLaunch(value: Input[Boolean]): Self = StObject.set(x, "mapPublicIpOnLaunch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMapPublicIpOnLaunchUndefined: Self = StObject.set(x, "mapPublicIpOnLaunch", js.undefined)
      
      @scala.inline
      def setOutpostArn(value: Input[String]): Self = StObject.set(x, "outpostArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutpostArnUndefined: Self = StObject.set(x, "outpostArn", js.undefined)
      
      @scala.inline
      def setOwnerId(value: Input[String]): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerIdUndefined: Self = StObject.set(x, "ownerId", js.undefined)
      
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
