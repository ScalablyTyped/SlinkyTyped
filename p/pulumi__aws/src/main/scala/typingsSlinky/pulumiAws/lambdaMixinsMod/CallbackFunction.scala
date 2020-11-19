package typingsSlinky.pulumiAws.lambdaMixinsMod

import typingsSlinky.pulumiAws.lambdaFunctionMod.Function
import typingsSlinky.pulumiPulumi.resourceMod.CustomResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/lambda/lambdaMixins", "CallbackFunction")
@js.native
class CallbackFunction[E, R] protected () extends Function {
  def this(name: String, args: CallbackFunctionArgs[E, R]) = this()
  def this(name: String, args: CallbackFunctionArgs[E, R], opts: CustomResourceOptions) = this()
}
