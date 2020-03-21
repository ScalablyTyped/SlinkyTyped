package typingsSlinky.pulumiAws.s3Mod

import typingsSlinky.pulumiAws.getBucketMod.GetBucketArgs
import typingsSlinky.pulumiAws.getBucketMod.GetBucketResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/s3", "getBucket")
@js.native
object getBucket extends js.Object {
  def apply(args: GetBucketArgs): js.Promise[GetBucketResult] with GetBucketResult = js.native
  def apply(args: GetBucketArgs, opts: InvokeOptions): js.Promise[GetBucketResult] with GetBucketResult = js.native
}

