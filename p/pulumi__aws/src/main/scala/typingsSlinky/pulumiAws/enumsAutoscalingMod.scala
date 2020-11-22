package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.pulumiAwsStrings.`1Minute`
import typingsSlinky.pulumiAws.pulumiAwsStrings.autoscalingColonEC2_INSTANCE_LAUNCH
import typingsSlinky.pulumiAws.pulumiAwsStrings.autoscalingColonEC2_INSTANCE_LAUNCH_ERROR
import typingsSlinky.pulumiAws.pulumiAwsStrings.autoscalingColonEC2_INSTANCE_TERMINATE
import typingsSlinky.pulumiAws.pulumiAwsStrings.autoscalingColonEC2_INSTANCE_TERMINATE_ERROR
import typingsSlinky.pulumiAws.pulumiAwsStrings.autoscalingColonTEST_NOTIFICATION
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/types/enums/autoscaling", JSImport.Namespace)
@js.native
object enumsAutoscalingMod extends js.Object {
  
  /* Inlined { readonly GroupMinSize :'GroupMinSize',  readonly GroupMaxSize :'GroupMaxSize',  readonly GroupDesiredCapacity :'GroupDesiredCapacity',  readonly GroupInServiceInstances :'GroupInServiceInstances',  readonly GroupInServiceCapacity :'GroupInServiceCapacity',  readonly GroupPendingInstances :'GroupPendingInstances',  readonly GroupPendingCapacity :'GroupPendingCapacity',  readonly GroupStandbyInstances :'GroupStandbyInstances',  readonly GroupStandbyCapacity :'GroupStandbyCapacity',  readonly GroupTerminatingInstances :'GroupTerminatingInstances',  readonly GroupTerminatingCapacity :'GroupTerminatingCapacity',  readonly GroupTotalInstances :'GroupTotalInstances',  readonly GroupTotalCapacity :'GroupTotalCapacity'}[keyof { readonly GroupMinSize :'GroupMinSize',  readonly GroupMaxSize :'GroupMaxSize',  readonly GroupDesiredCapacity :'GroupDesiredCapacity',  readonly GroupInServiceInstances :'GroupInServiceInstances',  readonly GroupInServiceCapacity :'GroupInServiceCapacity',  readonly GroupPendingInstances :'GroupPendingInstances',  readonly GroupPendingCapacity :'GroupPendingCapacity',  readonly GroupStandbyInstances :'GroupStandbyInstances',  readonly GroupStandbyCapacity :'GroupStandbyCapacity',  readonly GroupTerminatingInstances :'GroupTerminatingInstances',  readonly GroupTerminatingCapacity :'GroupTerminatingCapacity',  readonly GroupTotalInstances :'GroupTotalInstances',  readonly GroupTotalCapacity :'GroupTotalCapacity'}] */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.pulumiAws.pulumiAwsStrings.GroupStandbyInstances
    - typingsSlinky.pulumiAws.pulumiAwsStrings.GroupInServiceCapacity
    - typingsSlinky.pulumiAws.pulumiAwsStrings.GroupTerminatingInstances
    - typingsSlinky.pulumiAws.pulumiAwsStrings.GroupTotalCapacity
    - typingsSlinky.pulumiAws.pulumiAwsStrings.GroupMinSize
    - typingsSlinky.pulumiAws.pulumiAwsStrings.GroupMaxSize
    - typingsSlinky.pulumiAws.pulumiAwsStrings.GroupPendingInstances
    - typingsSlinky.pulumiAws.pulumiAwsStrings.GroupStandbyCapacity
    - typingsSlinky.pulumiAws.pulumiAwsStrings.GroupTerminatingCapacity
    - typingsSlinky.pulumiAws.pulumiAwsStrings.GroupPendingCapacity
    - typingsSlinky.pulumiAws.pulumiAwsStrings.GroupTotalInstances
    - typingsSlinky.pulumiAws.pulumiAwsStrings.GroupDesiredCapacity
    - typingsSlinky.pulumiAws.pulumiAwsStrings.GroupInServiceInstances
  */
  trait Metric extends js.Object
  @js.native
  object Metric extends js.Object {
    
    val GroupDesiredCapacity: typingsSlinky.pulumiAws.pulumiAwsStrings.GroupDesiredCapacity = js.native
    
    val GroupInServiceCapacity: typingsSlinky.pulumiAws.pulumiAwsStrings.GroupInServiceCapacity = js.native
    
    val GroupInServiceInstances: typingsSlinky.pulumiAws.pulumiAwsStrings.GroupInServiceInstances = js.native
    
    val GroupMaxSize: typingsSlinky.pulumiAws.pulumiAwsStrings.GroupMaxSize = js.native
    
    val GroupMinSize: typingsSlinky.pulumiAws.pulumiAwsStrings.GroupMinSize = js.native
    
    val GroupPendingCapacity: typingsSlinky.pulumiAws.pulumiAwsStrings.GroupPendingCapacity = js.native
    
    val GroupPendingInstances: typingsSlinky.pulumiAws.pulumiAwsStrings.GroupPendingInstances = js.native
    
    val GroupStandbyCapacity: typingsSlinky.pulumiAws.pulumiAwsStrings.GroupStandbyCapacity = js.native
    
    val GroupStandbyInstances: typingsSlinky.pulumiAws.pulumiAwsStrings.GroupStandbyInstances = js.native
    
    val GroupTerminatingCapacity: typingsSlinky.pulumiAws.pulumiAwsStrings.GroupTerminatingCapacity = js.native
    
    val GroupTerminatingInstances: typingsSlinky.pulumiAws.pulumiAwsStrings.GroupTerminatingInstances = js.native
    
    val GroupTotalCapacity: typingsSlinky.pulumiAws.pulumiAwsStrings.GroupTotalCapacity = js.native
    
    val GroupTotalInstances: typingsSlinky.pulumiAws.pulumiAwsStrings.GroupTotalInstances = js.native
  }
  
  @js.native
  object MetricsGranularity extends js.Object {
    
    val OneMinute: `1Minute` = js.native
  }
  
  /* Inlined { readonly InstanceLaunch :'autoscaling:EC2_INSTANCE_LAUNCH',  readonly InstanceTerminate :'autoscaling:EC2_INSTANCE_TERMINATE',  readonly InstanceLaunchError :'autoscaling:EC2_INSTANCE_LAUNCH_ERROR',  readonly InstanceTerminateError :'autoscaling:EC2_INSTANCE_TERMINATE_ERROR',  readonly TestNotification :'autoscaling:TEST_NOTIFICATION'}[keyof { readonly InstanceLaunch :'autoscaling:EC2_INSTANCE_LAUNCH',  readonly InstanceTerminate :'autoscaling:EC2_INSTANCE_TERMINATE',  readonly InstanceLaunchError :'autoscaling:EC2_INSTANCE_LAUNCH_ERROR',  readonly InstanceTerminateError :'autoscaling:EC2_INSTANCE_TERMINATE_ERROR',  readonly TestNotification :'autoscaling:TEST_NOTIFICATION'}] */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.pulumiAws.pulumiAwsStrings.autoscalingColonEC2_INSTANCE_LAUNCH_ERROR
    - typingsSlinky.pulumiAws.pulumiAwsStrings.autoscalingColonEC2_INSTANCE_TERMINATE
    - typingsSlinky.pulumiAws.pulumiAwsStrings.autoscalingColonTEST_NOTIFICATION
    - typingsSlinky.pulumiAws.pulumiAwsStrings.autoscalingColonEC2_INSTANCE_LAUNCH
    - typingsSlinky.pulumiAws.pulumiAwsStrings.autoscalingColonEC2_INSTANCE_TERMINATE_ERROR
  */
  trait NotificationType extends js.Object
  @js.native
  object NotificationType extends js.Object {
    
    val InstanceLaunch: autoscalingColonEC2_INSTANCE_LAUNCH = js.native
    
    val InstanceLaunchError: autoscalingColonEC2_INSTANCE_LAUNCH_ERROR = js.native
    
    val InstanceTerminate: autoscalingColonEC2_INSTANCE_TERMINATE = js.native
    
    val InstanceTerminateError: autoscalingColonEC2_INSTANCE_TERMINATE_ERROR = js.native
    
    val TestNotification: autoscalingColonTEST_NOTIFICATION = js.native
  }
  
  /* Inlined { readonly OneMinute :'1Minute'}[keyof { readonly OneMinute :'1Minute'}] */
  type MetricsGranularity = `1Minute`
}
