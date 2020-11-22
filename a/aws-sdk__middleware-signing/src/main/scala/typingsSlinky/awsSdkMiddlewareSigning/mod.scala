package typingsSlinky.awsSdkMiddlewareSigning

import typingsSlinky.awsSdkMiddlewareSigning.configurationsMod.AwsAuthInputConfig
import typingsSlinky.awsSdkMiddlewareSigning.configurationsMod.AwsAuthResolvedConfig
import typingsSlinky.awsSdkMiddlewareSigning.configurationsMod.PreviouslyResolved
import typingsSlinky.awsSdkTypes.middlewareMod.FinalizeRequestMiddleware
import typingsSlinky.awsSdkTypes.middlewareMod.Pluggable
import typingsSlinky.awsSdkTypes.middlewareMod.RelativeMiddlewareOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/middleware-signing", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def awsAuthMiddleware[Input /* <: js.Object */, Output /* <: js.Object */](options: AwsAuthResolvedConfig): FinalizeRequestMiddleware[Input, Output] = js.native
  
  val awsAuthMiddlewareOptions: RelativeMiddlewareOptions = js.native
  
  def getAwsAuthPlugin(options: AwsAuthResolvedConfig): Pluggable[_, _] = js.native
  
  def resolveAwsAuthConfig[T](input: T with AwsAuthInputConfig with PreviouslyResolved): T with AwsAuthResolvedConfig = js.native
}
