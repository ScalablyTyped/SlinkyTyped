package typingsSlinky.pulumiAws.mod.lambda

import typingsSlinky.pulumiAws.lambdaMixinsMod.CallbackFunctionArgs
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "lambda.CallbackFunction")
@js.native
class CallbackFunction[E, R] protected ()
  extends typingsSlinky.pulumiAws.lambdaMod.CallbackFunction[E, R] {
  def this(name: String, args: CallbackFunctionArgs[E, R]) = this()
  def this(name: String, args: CallbackFunctionArgs[E, R], opts: CustomResourceOptions) = this()
}
