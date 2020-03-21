package typingsSlinky.pulumiAws.mod.apigateway

import typingsSlinky.pulumiAws.getRestApiMod.GetRestApiArgs
import typingsSlinky.pulumiAws.getRestApiMod.GetRestApiResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "apigateway.getRestApi")
@js.native
object getRestApi extends js.Object {
  def apply(args: GetRestApiArgs): js.Promise[GetRestApiResult] with GetRestApiResult = js.native
  def apply(args: GetRestApiArgs, opts: InvokeOptions): js.Promise[GetRestApiResult] with GetRestApiResult = js.native
}

