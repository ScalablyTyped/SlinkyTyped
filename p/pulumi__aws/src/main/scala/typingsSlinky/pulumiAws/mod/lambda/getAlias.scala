package typingsSlinky.pulumiAws.mod.lambda

import typingsSlinky.pulumiAws.lambdaGetAliasMod.GetAliasArgs
import typingsSlinky.pulumiAws.lambdaGetAliasMod.GetAliasResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "lambda.getAlias")
@js.native
object getAlias extends js.Object {
  def apply(args: GetAliasArgs): js.Promise[GetAliasResult] with GetAliasResult = js.native
  def apply(args: GetAliasArgs, opts: InvokeOptions): js.Promise[GetAliasResult] with GetAliasResult = js.native
}

