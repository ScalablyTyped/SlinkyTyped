package typingsSlinky.kiiDashCloudDashSdk.KiiCloud

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KiiACLAction extends js.Object

@JSGlobal("KiiCloud.KiiACLAction")
@js.native
object KiiACLAction extends js.Object {
  @js.native
  sealed trait KiiACLBucketActionCreateObjects extends KiiACLAction
  
  @js.native
  sealed trait KiiACLBucketActionDropBucket extends KiiACLAction
  
  @js.native
  sealed trait KiiACLBucketActionQueryObjects extends KiiACLAction
  
  @js.native
  sealed trait KiiACLBucketActionReadObjects extends KiiACLAction
  
  @js.native
  sealed trait KiiACLObjectActionRead extends KiiACLAction
  
  @js.native
  sealed trait KiiACLObjectActionWrite extends KiiACLAction
  
  @js.native
  sealed trait KiiACLSendMessageToTopic extends KiiACLAction
  
  @js.native
  sealed trait KiiACLSubscribeToTopic extends KiiACLAction
  
  /* 0 */ val KiiACLBucketActionCreateObjects: typingsSlinky.kiiDashCloudDashSdk.KiiCloud.KiiACLAction.KiiACLBucketActionCreateObjects with Double = js.native
  /* 2 */ val KiiACLBucketActionDropBucket: typingsSlinky.kiiDashCloudDashSdk.KiiCloud.KiiACLAction.KiiACLBucketActionDropBucket with Double = js.native
  /* 1 */ val KiiACLBucketActionQueryObjects: typingsSlinky.kiiDashCloudDashSdk.KiiCloud.KiiACLAction.KiiACLBucketActionQueryObjects with Double = js.native
  /* 5 */ val KiiACLBucketActionReadObjects: typingsSlinky.kiiDashCloudDashSdk.KiiCloud.KiiACLAction.KiiACLBucketActionReadObjects with Double = js.native
  /* 3 */ val KiiACLObjectActionRead: typingsSlinky.kiiDashCloudDashSdk.KiiCloud.KiiACLAction.KiiACLObjectActionRead with Double = js.native
  /* 4 */ val KiiACLObjectActionWrite: typingsSlinky.kiiDashCloudDashSdk.KiiCloud.KiiACLAction.KiiACLObjectActionWrite with Double = js.native
  /* 7 */ val KiiACLSendMessageToTopic: typingsSlinky.kiiDashCloudDashSdk.KiiCloud.KiiACLAction.KiiACLSendMessageToTopic with Double = js.native
  /* 6 */ val KiiACLSubscribeToTopic: typingsSlinky.kiiDashCloudDashSdk.KiiCloud.KiiACLAction.KiiACLSubscribeToTopic with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[KiiACLAction with Double] = js.native
}

