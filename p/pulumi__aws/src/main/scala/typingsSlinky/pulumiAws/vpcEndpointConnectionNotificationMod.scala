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

object vpcEndpointConnectionNotificationMod {
  
  @JSImport("@pulumi/aws/ec2/vpcEndpointConnectionNotification", "VpcEndpointConnectionNotification")
  @js.native
  class VpcEndpointConnectionNotification protected () extends CustomResource {
    /**
      * Create a VpcEndpointConnectionNotification resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VpcEndpointConnectionNotificationArgs) = this()
    def this(name: String, args: VpcEndpointConnectionNotificationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * One or more endpoint [events](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVpcEndpointConnectionNotification.html#API_CreateVpcEndpointConnectionNotification_RequestParameters) for which to receive notifications.
      */
    val connectionEvents: Output_[js.Array[String]] = js.native
    
    /**
      * The ARN of the SNS topic for the notifications.
      */
    val connectionNotificationArn: Output_[String] = js.native
    
    /**
      * The type of notification.
      */
    val notificationType: Output_[String] = js.native
    
    /**
      * The state of the notification.
      */
    val state: Output_[String] = js.native
    
    /**
      * The ID of the VPC Endpoint to receive notifications for.
      */
    val vpcEndpointId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The ID of the VPC Endpoint Service to receive notifications for.
      */
    val vpcEndpointServiceId: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object VpcEndpointConnectionNotification {
    
    /**
      * Get an existing VpcEndpointConnectionNotification resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2/vpcEndpointConnectionNotification", "VpcEndpointConnectionNotification.get")
    @js.native
    def get(name: String, id: Input[ID]): VpcEndpointConnectionNotification = js.native
    @JSImport("@pulumi/aws/ec2/vpcEndpointConnectionNotification", "VpcEndpointConnectionNotification.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): VpcEndpointConnectionNotification = js.native
    @JSImport("@pulumi/aws/ec2/vpcEndpointConnectionNotification", "VpcEndpointConnectionNotification.get")
    @js.native
    def get(name: String, id: Input[ID], state: VpcEndpointConnectionNotificationState): VpcEndpointConnectionNotification = js.native
    @JSImport("@pulumi/aws/ec2/vpcEndpointConnectionNotification", "VpcEndpointConnectionNotification.get")
    @js.native
    def get(
      name: String,
      id: Input[ID],
      state: VpcEndpointConnectionNotificationState,
      opts: CustomResourceOptions
    ): VpcEndpointConnectionNotification = js.native
    
    /**
      * Returns true if the given object is an instance of VpcEndpointConnectionNotification.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2/vpcEndpointConnectionNotification", "VpcEndpointConnectionNotification.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpcEndpointConnectionNotification.VpcEndpointConnectionNotification */ Boolean = js.native
  }
  
  @js.native
  trait VpcEndpointConnectionNotificationArgs extends StObject {
    
    /**
      * One or more endpoint [events](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVpcEndpointConnectionNotification.html#API_CreateVpcEndpointConnectionNotification_RequestParameters) for which to receive notifications.
      */
    val connectionEvents: Input[js.Array[Input[String]]] = js.native
    
    /**
      * The ARN of the SNS topic for the notifications.
      */
    val connectionNotificationArn: Input[String] = js.native
    
    /**
      * The ID of the VPC Endpoint to receive notifications for.
      */
    val vpcEndpointId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the VPC Endpoint Service to receive notifications for.
      */
    val vpcEndpointServiceId: js.UndefOr[Input[String]] = js.native
  }
  object VpcEndpointConnectionNotificationArgs {
    
    @scala.inline
    def apply(connectionEvents: Input[js.Array[Input[String]]], connectionNotificationArn: Input[String]): VpcEndpointConnectionNotificationArgs = {
      val __obj = js.Dynamic.literal(connectionEvents = connectionEvents.asInstanceOf[js.Any], connectionNotificationArn = connectionNotificationArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[VpcEndpointConnectionNotificationArgs]
    }
    
    @scala.inline
    implicit class VpcEndpointConnectionNotificationArgsMutableBuilder[Self <: VpcEndpointConnectionNotificationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnectionEvents(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "connectionEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionEventsVarargs(value: Input[String]*): Self = StObject.set(x, "connectionEvents", js.Array(value :_*))
      
      @scala.inline
      def setConnectionNotificationArn(value: Input[String]): Self = StObject.set(x, "connectionNotificationArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcEndpointId(value: Input[String]): Self = StObject.set(x, "vpcEndpointId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcEndpointIdUndefined: Self = StObject.set(x, "vpcEndpointId", js.undefined)
      
      @scala.inline
      def setVpcEndpointServiceId(value: Input[String]): Self = StObject.set(x, "vpcEndpointServiceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcEndpointServiceIdUndefined: Self = StObject.set(x, "vpcEndpointServiceId", js.undefined)
    }
  }
  
  @js.native
  trait VpcEndpointConnectionNotificationState extends StObject {
    
    /**
      * One or more endpoint [events](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVpcEndpointConnectionNotification.html#API_CreateVpcEndpointConnectionNotification_RequestParameters) for which to receive notifications.
      */
    val connectionEvents: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The ARN of the SNS topic for the notifications.
      */
    val connectionNotificationArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The type of notification.
      */
    val notificationType: js.UndefOr[Input[String]] = js.native
    
    /**
      * The state of the notification.
      */
    val state: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the VPC Endpoint to receive notifications for.
      */
    val vpcEndpointId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the VPC Endpoint Service to receive notifications for.
      */
    val vpcEndpointServiceId: js.UndefOr[Input[String]] = js.native
  }
  object VpcEndpointConnectionNotificationState {
    
    @scala.inline
    def apply(): VpcEndpointConnectionNotificationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VpcEndpointConnectionNotificationState]
    }
    
    @scala.inline
    implicit class VpcEndpointConnectionNotificationStateMutableBuilder[Self <: VpcEndpointConnectionNotificationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnectionEvents(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "connectionEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionEventsUndefined: Self = StObject.set(x, "connectionEvents", js.undefined)
      
      @scala.inline
      def setConnectionEventsVarargs(value: Input[String]*): Self = StObject.set(x, "connectionEvents", js.Array(value :_*))
      
      @scala.inline
      def setConnectionNotificationArn(value: Input[String]): Self = StObject.set(x, "connectionNotificationArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionNotificationArnUndefined: Self = StObject.set(x, "connectionNotificationArn", js.undefined)
      
      @scala.inline
      def setNotificationType(value: Input[String]): Self = StObject.set(x, "notificationType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationTypeUndefined: Self = StObject.set(x, "notificationType", js.undefined)
      
      @scala.inline
      def setState(value: Input[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setVpcEndpointId(value: Input[String]): Self = StObject.set(x, "vpcEndpointId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcEndpointIdUndefined: Self = StObject.set(x, "vpcEndpointId", js.undefined)
      
      @scala.inline
      def setVpcEndpointServiceId(value: Input[String]): Self = StObject.set(x, "vpcEndpointServiceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcEndpointServiceIdUndefined: Self = StObject.set(x, "vpcEndpointServiceId", js.undefined)
    }
  }
}
