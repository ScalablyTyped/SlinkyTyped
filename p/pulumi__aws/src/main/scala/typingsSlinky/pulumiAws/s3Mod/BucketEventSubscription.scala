package typingsSlinky.pulumiAws.s3Mod

import typingsSlinky.pulumiAws.s3MixinsMod.BucketEventHandler
import typingsSlinky.pulumiAws.s3MixinsMod.BucketEventSubscriptionArgs
import typingsSlinky.pulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/s3", "BucketEventSubscription")
@js.native
class BucketEventSubscription protected ()
  extends typingsSlinky.pulumiAws.s3MixinsMod.BucketEventSubscription {
  def this(
    name: String,
    bucket: typingsSlinky.pulumiAws.bucketMod.Bucket,
    handler: BucketEventHandler,
    args: BucketEventSubscriptionArgs
  ) = this()
  def this(
    name: String,
    bucket: typingsSlinky.pulumiAws.bucketMod.Bucket,
    handler: BucketEventHandler,
    args: BucketEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ) = this()
}
