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

object availabilityZoneGroupMod {
  
  @JSImport("@pulumi/aws/ec2/availabilityZoneGroup", "AvailabilityZoneGroup")
  @js.native
  class AvailabilityZoneGroup protected () extends CustomResource {
    /**
      * Create a AvailabilityZoneGroup resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: AvailabilityZoneGroupArgs) = this()
    def this(name: String, args: AvailabilityZoneGroupArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Name of the Availability Zone Group.
      */
    val groupName: Output_[String] = js.native
    
    /**
      * Indicates whether to enable or disable Availability Zone Group. Valid values: `opted-in` or `not-opted-in`.
      */
    val optInStatus: Output_[String] = js.native
  }
  /* static members */
  object AvailabilityZoneGroup {
    
    /**
      * Get an existing AvailabilityZoneGroup resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2/availabilityZoneGroup", "AvailabilityZoneGroup.get")
    @js.native
    def get(name: String, id: Input[ID]): AvailabilityZoneGroup = js.native
    @JSImport("@pulumi/aws/ec2/availabilityZoneGroup", "AvailabilityZoneGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): AvailabilityZoneGroup = js.native
    @JSImport("@pulumi/aws/ec2/availabilityZoneGroup", "AvailabilityZoneGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: AvailabilityZoneGroupState): AvailabilityZoneGroup = js.native
    @JSImport("@pulumi/aws/ec2/availabilityZoneGroup", "AvailabilityZoneGroup.get")
    @js.native
    def get(name: String, id: Input[ID], state: AvailabilityZoneGroupState, opts: CustomResourceOptions): AvailabilityZoneGroup = js.native
    
    /**
      * Returns true if the given object is an instance of AvailabilityZoneGroup.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2/availabilityZoneGroup", "AvailabilityZoneGroup.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/availabilityZoneGroup.AvailabilityZoneGroup */ Boolean = js.native
  }
  
  @js.native
  trait AvailabilityZoneGroupArgs extends StObject {
    
    /**
      * Name of the Availability Zone Group.
      */
    val groupName: Input[String] = js.native
    
    /**
      * Indicates whether to enable or disable Availability Zone Group. Valid values: `opted-in` or `not-opted-in`.
      */
    val optInStatus: Input[String] = js.native
  }
  object AvailabilityZoneGroupArgs {
    
    @scala.inline
    def apply(groupName: Input[String], optInStatus: Input[String]): AvailabilityZoneGroupArgs = {
      val __obj = js.Dynamic.literal(groupName = groupName.asInstanceOf[js.Any], optInStatus = optInStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvailabilityZoneGroupArgs]
    }
    
    @scala.inline
    implicit class AvailabilityZoneGroupArgsMutableBuilder[Self <: AvailabilityZoneGroupArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroupName(value: Input[String]): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptInStatus(value: Input[String]): Self = StObject.set(x, "optInStatus", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AvailabilityZoneGroupState extends StObject {
    
    /**
      * Name of the Availability Zone Group.
      */
    val groupName: js.UndefOr[Input[String]] = js.native
    
    /**
      * Indicates whether to enable or disable Availability Zone Group. Valid values: `opted-in` or `not-opted-in`.
      */
    val optInStatus: js.UndefOr[Input[String]] = js.native
  }
  object AvailabilityZoneGroupState {
    
    @scala.inline
    def apply(): AvailabilityZoneGroupState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvailabilityZoneGroupState]
    }
    
    @scala.inline
    implicit class AvailabilityZoneGroupStateMutableBuilder[Self <: AvailabilityZoneGroupState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroupName(value: Input[String]): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupNameUndefined: Self = StObject.set(x, "groupName", js.undefined)
      
      @scala.inline
      def setOptInStatus(value: Input[String]): Self = StObject.set(x, "optInStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptInStatusUndefined: Self = StObject.set(x, "optInStatus", js.undefined)
    }
  }
}
