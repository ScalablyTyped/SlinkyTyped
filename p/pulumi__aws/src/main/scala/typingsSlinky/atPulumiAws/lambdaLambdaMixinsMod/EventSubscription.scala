package typingsSlinky.atPulumiAws.lambdaLambdaMixinsMod

import typingsSlinky.atPulumiAws.lambdaFunctionMod.Function
import typingsSlinky.atPulumiAws.lambdaPermissionMod.Permission
import typingsSlinky.atPulumiPulumi.atPulumiPulumiMod.ComponentResource
import typingsSlinky.atPulumiPulumi.resourceMod.ComponentResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/lambda/lambdaMixins", "EventSubscription")
@js.native
class EventSubscription protected ()
  extends ComponentResource[js.Any] {
  def this(`type`: String, name: String) = this()
  def this(`type`: String, name: String, opts: ComponentResourceOptions) = this()
  var func: Function = js.native
  var permission: Permission = js.native
}

