package typingsSlinky.atPulumiAws.lambdaMod

import typingsSlinky.atPulumiAws.lambdaGetLayerVersionMod.GetLayerVersionArgs
import typingsSlinky.atPulumiAws.lambdaGetLayerVersionMod.GetLayerVersionResult
import typingsSlinky.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/lambda", "getLayerVersion")
@js.native
object getLayerVersion extends js.Object {
  def apply(args: GetLayerVersionArgs): js.Promise[GetLayerVersionResult] with GetLayerVersionResult = js.native
  def apply(args: GetLayerVersionArgs, opts: InvokeOptions): js.Promise[GetLayerVersionResult] with GetLayerVersionResult = js.native
}

