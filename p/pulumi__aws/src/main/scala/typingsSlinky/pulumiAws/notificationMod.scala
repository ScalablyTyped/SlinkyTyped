package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.enumsAutoscalingMod.NotificationType
import typingsSlinky.pulumiPulumi.mod.CustomResource
import typingsSlinky.pulumiPulumi.outputMod.Input
import typingsSlinky.pulumiPulumi.outputMod.Output_
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsSlinky.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationMod {
  
  @JSImport("@pulumi/aws/autoscaling/notification", "Notification")
  @js.native
  class Notification protected () extends CustomResource {
    /**
      * Create a Notification resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: NotificationArgs) = this()
    def this(name: String, args: NotificationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * A list of AutoScaling Group Names
      */
    val groupNames: Output_[js.Array[String]] = js.native
    
    /**
      * A list of Notification Types that trigger
      * notifications. Acceptable values are documented [in the AWS documentation here](https://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_NotificationConfiguration.html)
      */
    val notifications: Output_[js.Array[NotificationType]] = js.native
    
    /**
      * The Topic ARN for notifications to be sent through
      */
    val topicArn: Output_[String] = js.native
  }
  /* static members */
  object Notification {
    
    /**
      * Get an existing Notification resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/autoscaling/notification", "Notification.get")
    @js.native
    def get(name: String, id: Input[ID]): Notification = js.native
    @JSImport("@pulumi/aws/autoscaling/notification", "Notification.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Notification = js.native
    @JSImport("@pulumi/aws/autoscaling/notification", "Notification.get")
    @js.native
    def get(name: String, id: Input[ID], state: NotificationState): Notification = js.native
    @JSImport("@pulumi/aws/autoscaling/notification", "Notification.get")
    @js.native
    def get(name: String, id: Input[ID], state: NotificationState, opts: CustomResourceOptions): Notification = js.native
    
    /**
      * Returns true if the given object is an instance of Notification.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/autoscaling/notification", "Notification.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/autoscaling/notification.Notification */ Boolean = js.native
  }
  
  @js.native
  trait NotificationArgs extends StObject {
    
    /**
      * A list of AutoScaling Group Names
      */
    val groupNames: Input[js.Array[Input[String]]] = js.native
    
    /**
      * A list of Notification Types that trigger
      * notifications. Acceptable values are documented [in the AWS documentation here](https://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_NotificationConfiguration.html)
      */
    val notifications: Input[js.Array[Input[NotificationType]]] = js.native
    
    /**
      * The Topic ARN for notifications to be sent through
      */
    val topicArn: Input[String] = js.native
  }
  object NotificationArgs {
    
    @scala.inline
    def apply(
      groupNames: Input[js.Array[Input[String]]],
      notifications: Input[js.Array[Input[NotificationType]]],
      topicArn: Input[String]
    ): NotificationArgs = {
      val __obj = js.Dynamic.literal(groupNames = groupNames.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], topicArn = topicArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotificationArgs]
    }
    
    @scala.inline
    implicit class NotificationArgsMutableBuilder[Self <: NotificationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroupNames(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "groupNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupNamesVarargs(value: Input[String]*): Self = StObject.set(x, "groupNames", js.Array(value :_*))
      
      @scala.inline
      def setNotifications(value: Input[js.Array[Input[NotificationType]]]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationsVarargs(value: Input[NotificationType]*): Self = StObject.set(x, "notifications", js.Array(value :_*))
      
      @scala.inline
      def setTopicArn(value: Input[String]): Self = StObject.set(x, "topicArn", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NotificationState extends StObject {
    
    /**
      * A list of AutoScaling Group Names
      */
    val groupNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * A list of Notification Types that trigger
      * notifications. Acceptable values are documented [in the AWS documentation here](https://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_NotificationConfiguration.html)
      */
    val notifications: js.UndefOr[Input[js.Array[Input[NotificationType]]]] = js.native
    
    /**
      * The Topic ARN for notifications to be sent through
      */
    val topicArn: js.UndefOr[Input[String]] = js.native
  }
  object NotificationState {
    
    @scala.inline
    def apply(): NotificationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NotificationState]
    }
    
    @scala.inline
    implicit class NotificationStateMutableBuilder[Self <: NotificationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroupNames(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "groupNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupNamesUndefined: Self = StObject.set(x, "groupNames", js.undefined)
      
      @scala.inline
      def setGroupNamesVarargs(value: Input[String]*): Self = StObject.set(x, "groupNames", js.Array(value :_*))
      
      @scala.inline
      def setNotifications(value: Input[js.Array[Input[NotificationType]]]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationsUndefined: Self = StObject.set(x, "notifications", js.undefined)
      
      @scala.inline
      def setNotificationsVarargs(value: Input[NotificationType]*): Self = StObject.set(x, "notifications", js.Array(value :_*))
      
      @scala.inline
      def setTopicArn(value: Input[String]): Self = StObject.set(x, "topicArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicArnUndefined: Self = StObject.set(x, "topicArn", js.undefined)
    }
  }
}
