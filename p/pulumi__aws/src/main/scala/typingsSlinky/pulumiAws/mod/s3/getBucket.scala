package typingsSlinky.pulumiAws.mod.s3

import typingsSlinky.pulumiAws.getBucketMod.GetBucketArgs
import typingsSlinky.pulumiAws.getBucketMod.GetBucketResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "s3.getBucket")
@js.native
object getBucket extends js.Object {
  
  def apply(args: GetBucketArgs): js.Promise[GetBucketResult] = js.native
  def apply(args: GetBucketArgs, opts: InvokeOptions): js.Promise[GetBucketResult] = js.native
}
