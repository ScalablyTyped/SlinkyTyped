package typingsSlinky.atPulumiAws.lambdaMod

import typingsSlinky.atPulumiAws.lambdaLambdaMixinsMod.EventHandler
import typingsSlinky.atPulumiPulumi.resourceMod.ResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/lambda", "createFunctionFromEventHandler")
@js.native
object createFunctionFromEventHandler extends js.Object {
  def apply[E, R](name: String, handler: EventHandler[E, R]): typingsSlinky.atPulumiAws.lambdaFunctionMod.Function = js.native
  def apply[E, R](name: String, handler: EventHandler[E, R], opts: ResourceOptions): typingsSlinky.atPulumiAws.lambdaFunctionMod.Function = js.native
}

