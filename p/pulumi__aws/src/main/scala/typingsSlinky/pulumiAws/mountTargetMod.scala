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

object mountTargetMod {
  
  @JSImport("@pulumi/aws/efs/mountTarget", "MountTarget")
  @js.native
  class MountTarget protected () extends CustomResource {
    /**
      * Create a MountTarget resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: MountTargetArgs) = this()
    def this(name: String, args: MountTargetArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The unique and consistent identifier of the Availability Zone (AZ) that the mount target resides in.
      */
    val availabilityZoneId: Output_[String] = js.native
    
    /**
      * The name of the Availability Zone (AZ) that the mount target resides in.
      */
    val availabilityZoneName: Output_[String] = js.native
    
    /**
      * The DNS name for the EFS file system.
      */
    val dnsName: Output_[String] = js.native
    
    /**
      * Amazon Resource Name of the file system.
      */
    val fileSystemArn: Output_[String] = js.native
    
    /**
      * The ID of the file system for which the mount target is intended.
      */
    val fileSystemId: Output_[String] = js.native
    
    /**
      * The address (within the address range of the specified subnet) at
      * which the file system may be mounted via the mount target.
      */
    val ipAddress: Output_[String] = js.native
    
    /**
      * The DNS name for the given subnet/AZ per [documented convention](http://docs.aws.amazon.com/efs/latest/ug/mounting-fs-mount-cmd-dns-name.html).
      */
    val mountTargetDnsName: Output_[String] = js.native
    
    /**
      * The ID of the network interface that Amazon EFS created when it created the mount target.
      */
    val networkInterfaceId: Output_[String] = js.native
    
    /**
      * AWS account ID that owns the resource.
      */
    val ownerId: Output_[String] = js.native
    
    /**
      * A list of up to 5 VPC security group IDs (that must
      * be for the same VPC as subnet specified) in effect for the mount target.
      */
    val securityGroups: Output_[js.Array[String]] = js.native
    
    /**
      * The ID of the subnet to add the mount target in.
      */
    val subnetId: Output_[String] = js.native
  }
  /* static members */
  object MountTarget {
    
    /**
      * Get an existing MountTarget resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/efs/mountTarget", "MountTarget.get")
    @js.native
    def get(name: String, id: Input[ID]): MountTarget = js.native
    @JSImport("@pulumi/aws/efs/mountTarget", "MountTarget.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): MountTarget = js.native
    @JSImport("@pulumi/aws/efs/mountTarget", "MountTarget.get")
    @js.native
    def get(name: String, id: Input[ID], state: MountTargetState): MountTarget = js.native
    @JSImport("@pulumi/aws/efs/mountTarget", "MountTarget.get")
    @js.native
    def get(name: String, id: Input[ID], state: MountTargetState, opts: CustomResourceOptions): MountTarget = js.native
    
    /**
      * Returns true if the given object is an instance of MountTarget.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/efs/mountTarget", "MountTarget.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/efs/mountTarget.MountTarget */ Boolean = js.native
  }
  
  @js.native
  trait MountTargetArgs extends StObject {
    
    /**
      * The ID of the file system for which the mount target is intended.
      */
    val fileSystemId: Input[String] = js.native
    
    /**
      * The address (within the address range of the specified subnet) at
      * which the file system may be mounted via the mount target.
      */
    val ipAddress: js.UndefOr[Input[String]] = js.native
    
    /**
      * A list of up to 5 VPC security group IDs (that must
      * be for the same VPC as subnet specified) in effect for the mount target.
      */
    val securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The ID of the subnet to add the mount target in.
      */
    val subnetId: Input[String] = js.native
  }
  object MountTargetArgs {
    
    @scala.inline
    def apply(fileSystemId: Input[String], subnetId: Input[String]): MountTargetArgs = {
      val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any])
      __obj.asInstanceOf[MountTargetArgs]
    }
    
    @scala.inline
    implicit class MountTargetArgsMutableBuilder[Self <: MountTargetArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFileSystemId(value: Input[String]): Self = StObject.set(x, "fileSystemId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpAddress(value: Input[String]): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
      
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
  trait MountTargetState extends StObject {
    
    /**
      * The unique and consistent identifier of the Availability Zone (AZ) that the mount target resides in.
      */
    val availabilityZoneId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the Availability Zone (AZ) that the mount target resides in.
      */
    val availabilityZoneName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The DNS name for the EFS file system.
      */
    val dnsName: js.UndefOr[Input[String]] = js.native
    
    /**
      * Amazon Resource Name of the file system.
      */
    val fileSystemArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the file system for which the mount target is intended.
      */
    val fileSystemId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The address (within the address range of the specified subnet) at
      * which the file system may be mounted via the mount target.
      */
    val ipAddress: js.UndefOr[Input[String]] = js.native
    
    /**
      * The DNS name for the given subnet/AZ per [documented convention](http://docs.aws.amazon.com/efs/latest/ug/mounting-fs-mount-cmd-dns-name.html).
      */
    val mountTargetDnsName: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the network interface that Amazon EFS created when it created the mount target.
      */
    val networkInterfaceId: js.UndefOr[Input[String]] = js.native
    
    /**
      * AWS account ID that owns the resource.
      */
    val ownerId: js.UndefOr[Input[String]] = js.native
    
    /**
      * A list of up to 5 VPC security group IDs (that must
      * be for the same VPC as subnet specified) in effect for the mount target.
      */
    val securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The ID of the subnet to add the mount target in.
      */
    val subnetId: js.UndefOr[Input[String]] = js.native
  }
  object MountTargetState {
    
    @scala.inline
    def apply(): MountTargetState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MountTargetState]
    }
    
    @scala.inline
    implicit class MountTargetStateMutableBuilder[Self <: MountTargetState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvailabilityZoneId(value: Input[String]): Self = StObject.set(x, "availabilityZoneId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZoneIdUndefined: Self = StObject.set(x, "availabilityZoneId", js.undefined)
      
      @scala.inline
      def setAvailabilityZoneName(value: Input[String]): Self = StObject.set(x, "availabilityZoneName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZoneNameUndefined: Self = StObject.set(x, "availabilityZoneName", js.undefined)
      
      @scala.inline
      def setDnsName(value: Input[String]): Self = StObject.set(x, "dnsName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDnsNameUndefined: Self = StObject.set(x, "dnsName", js.undefined)
      
      @scala.inline
      def setFileSystemArn(value: Input[String]): Self = StObject.set(x, "fileSystemArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileSystemArnUndefined: Self = StObject.set(x, "fileSystemArn", js.undefined)
      
      @scala.inline
      def setFileSystemId(value: Input[String]): Self = StObject.set(x, "fileSystemId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileSystemIdUndefined: Self = StObject.set(x, "fileSystemId", js.undefined)
      
      @scala.inline
      def setIpAddress(value: Input[String]): Self = StObject.set(x, "ipAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpAddressUndefined: Self = StObject.set(x, "ipAddress", js.undefined)
      
      @scala.inline
      def setMountTargetDnsName(value: Input[String]): Self = StObject.set(x, "mountTargetDnsName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMountTargetDnsNameUndefined: Self = StObject.set(x, "mountTargetDnsName", js.undefined)
      
      @scala.inline
      def setNetworkInterfaceId(value: Input[String]): Self = StObject.set(x, "networkInterfaceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "networkInterfaceId", js.undefined)
      
      @scala.inline
      def setOwnerId(value: Input[String]): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerIdUndefined: Self = StObject.set(x, "ownerId", js.undefined)
      
      @scala.inline
      def setSecurityGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupsUndefined: Self = StObject.set(x, "securityGroups", js.undefined)
      
      @scala.inline
      def setSecurityGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroups", js.Array(value :_*))
      
      @scala.inline
      def setSubnetId(value: Input[String]): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
    }
  }
}
