package typingsSlinky.pulumiAws.lambdaMod

import typingsSlinky.pulumiAws.lambdaMixinsMod.EventHandler
import typingsSlinky.pulumiPulumi.resourceMod.ResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/lambda", "createFunctionFromEventHandler")
@js.native
object createFunctionFromEventHandler extends js.Object {
  
  def apply[E, R](name: String, handler: EventHandler[E, R]): typingsSlinky.pulumiAws.lambdaFunctionMod.Function = js.native
  def apply[E, R](name: String, handler: EventHandler[E, R], opts: ResourceOptions): typingsSlinky.pulumiAws.lambdaFunctionMod.Function = js.native
}
