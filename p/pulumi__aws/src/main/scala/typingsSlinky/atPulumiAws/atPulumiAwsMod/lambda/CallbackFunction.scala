package typingsSlinky.atPulumiAws.atPulumiAwsMod.lambda

import typingsSlinky.atPulumiAws.lambdaLambdaMixinsMod.CallbackFunctionArgs
import typingsSlinky.atPulumiPulumi.resourceMod.CustomResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "lambda.CallbackFunction")
@js.native
class CallbackFunction[E, R] protected ()
  extends typingsSlinky.atPulumiAws.lambdaMod.CallbackFunction[E, R] {
  def this(name: String, args: CallbackFunctionArgs[E, R]) = this()
  def this(name: String, args: CallbackFunctionArgs[E, R], opts: CustomResourceOptions) = this()
}

