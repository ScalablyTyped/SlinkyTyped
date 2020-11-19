package typingsSlinky.pulumiAws.s3Mod

import typingsSlinky.pulumiAws.getBucketObjectsMod.GetBucketObjectsArgs
import typingsSlinky.pulumiAws.getBucketObjectsMod.GetBucketObjectsResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/s3", "getBucketObjects")
@js.native
object getBucketObjects extends js.Object {
  
  def apply(args: GetBucketObjectsArgs): js.Promise[GetBucketObjectsResult] = js.native
  def apply(args: GetBucketObjectsArgs, opts: InvokeOptions): js.Promise[GetBucketObjectsResult] = js.native
}
