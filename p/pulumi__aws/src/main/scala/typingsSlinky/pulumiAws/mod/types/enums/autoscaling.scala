package typingsSlinky.pulumiAws.mod.types.enums

import typingsSlinky.pulumiAws.pulumiAwsStrings.`1Minute`
import typingsSlinky.pulumiAws.pulumiAwsStrings.autoscalingColonEC2_INSTANCE_LAUNCH
import typingsSlinky.pulumiAws.pulumiAwsStrings.autoscalingColonEC2_INSTANCE_LAUNCH_ERROR
import typingsSlinky.pulumiAws.pulumiAwsStrings.autoscalingColonEC2_INSTANCE_TERMINATE
import typingsSlinky.pulumiAws.pulumiAwsStrings.autoscalingColonEC2_INSTANCE_TERMINATE_ERROR
import typingsSlinky.pulumiAws.pulumiAwsStrings.autoscalingColonTEST_NOTIFICATION
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "types.enums.autoscaling")
@js.native
object autoscaling extends js.Object {
  
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
  
  @js.native
  object NotificationType extends js.Object {
    
    val InstanceLaunch: autoscalingColonEC2_INSTANCE_LAUNCH = js.native
    
    val InstanceLaunchError: autoscalingColonEC2_INSTANCE_LAUNCH_ERROR = js.native
    
    val InstanceTerminate: autoscalingColonEC2_INSTANCE_TERMINATE = js.native
    
    val InstanceTerminateError: autoscalingColonEC2_INSTANCE_TERMINATE_ERROR = js.native
    
    val TestNotification: autoscalingColonTEST_NOTIFICATION = js.native
  }
}
