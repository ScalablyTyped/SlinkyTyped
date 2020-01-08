package typingsSlinky.atPulumiAws.atPulumiAwsMod

import typingsSlinky.atPulumiAws.serverlessFunctionMod.FunctionOptions
import typingsSlinky.atPulumiAws.serverlessFunctionMod.Handler
import typingsSlinky.atPulumiPulumi.resourceMod.ResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "serverless")
@js.native
object serverless extends js.Object {
  @js.native
  class Function protected ()
    extends typingsSlinky.atPulumiAws.serverlessMod.Function {
    /**
      * @param func Deprecated.  Pass the function as [options.func] or [options.factoryFunc] instead.
      */
    def this(name: String, options: FunctionOptions) = this()
    def this(name: String, options: FunctionOptions, func: Handler) = this()
    def this(name: String, options: FunctionOptions, func: Handler, opts: ResourceOptions) = this()
  }
  
}

