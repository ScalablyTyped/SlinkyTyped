package typingsSlinky.atPulumiAws.s3Mod

import typingsSlinky.atPulumiAws.s3S3MixinsMod.BucketEventHandler
import typingsSlinky.atPulumiAws.s3S3MixinsMod.BucketEventSubscriptionArgs
import typingsSlinky.atPulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/s3", "BucketEventSubscription")
@js.native
class BucketEventSubscription protected ()
  extends typingsSlinky.atPulumiAws.s3S3MixinsMod.BucketEventSubscription {
  def this(
    name: String,
    bucket: typingsSlinky.atPulumiAws.s3BucketMod.Bucket,
    handler: BucketEventHandler,
    args: BucketEventSubscriptionArgs
  ) = this()
  def this(
    name: String,
    bucket: typingsSlinky.atPulumiAws.s3BucketMod.Bucket,
    handler: BucketEventHandler,
    args: BucketEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ) = this()
}

