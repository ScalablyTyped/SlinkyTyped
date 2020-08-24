package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.anon.ExcludePackages
import typingsSlinky.pulumiAws.iamMod.Role
import typingsSlinky.pulumiAws.lambdaMixinsMod.Callback
import typingsSlinky.pulumiAws.lambdaMixinsMod.CallbackFunctionArgs
import typingsSlinky.pulumiAws.utilsMod.Overwrite
import typingsSlinky.pulumiPulumi.mod.ComponentResource
import typingsSlinky.pulumiPulumi.resourceMod.ResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/serverless/function", JSImport.Namespace)
@js.native
object serverlessFunctionMod extends js.Object {
  @js.native
  class Function protected ()
    extends ComponentResource[js.Any] {
    /**
      * @param func Deprecated.  Pass the function as [options.func] or [options.factoryFunc] instead.
      */
    def this(name: String, options: FunctionOptions) = this()
    def this(name: String, options: FunctionOptions, func: Handler) = this()
    def this(name: String, options: FunctionOptions, func: js.UndefOr[scala.Nothing], opts: ResourceOptions) = this()
    def this(name: String, options: FunctionOptions, func: Handler, opts: ResourceOptions) = this()
    val lambda: typingsSlinky.pulumiAws.lambdaMod.Function = js.native
    val options: FunctionOptions = js.native
    val role: js.UndefOr[Role] = js.native
  }
  
  type Context = typingsSlinky.pulumiAws.lambdaMixinsMod.Context
  type FunctionOptions = Overwrite[CallbackFunctionArgs[js.Any, js.Any], ExcludePackages]
  type Handler = Callback[js.Any, js.Any]
  type HandlerFactory = js.Function0[Handler]
}

