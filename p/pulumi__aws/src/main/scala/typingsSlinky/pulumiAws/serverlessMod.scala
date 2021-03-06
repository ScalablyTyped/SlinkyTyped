package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.serverlessFunctionMod.FunctionOptions
import typingsSlinky.pulumiAws.serverlessFunctionMod.Handler
import typingsSlinky.pulumiPulumi.resourceMod.ResourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverlessMod {
  
  @JSImport("@pulumi/aws/serverless", "Function")
  @js.native
  class Function protected ()
    extends typingsSlinky.pulumiAws.serverlessFunctionMod.Function {
    /**
      * @param func Deprecated.  Pass the function as [options.func] or [options.factoryFunc] instead.
      */
    def this(name: String, options: FunctionOptions) = this()
    def this(name: String, options: FunctionOptions, func: Handler) = this()
    def this(name: String, options: FunctionOptions, func: js.UndefOr[scala.Nothing], opts: ResourceOptions) = this()
    def this(name: String, options: FunctionOptions, func: Handler, opts: ResourceOptions) = this()
  }
}
