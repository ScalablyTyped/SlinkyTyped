package typingsSlinky.awsSdkMiddlewareSdkGlacier

import typingsSlinky.awsSdkMiddlewareSdkGlacier.configurationsMod.GlacierMiddlewareInputConfig
import typingsSlinky.awsSdkMiddlewareSdkGlacier.configurationsMod.PreviouslyResolved
import typingsSlinky.awsSdkMiddlewareSdkGlacier.configurationsMod.ResolvedGlacierMiddlewareConfig
import typingsSlinky.awsSdkTypes.middlewareMod.BuildHandlerOptions
import typingsSlinky.awsSdkTypes.middlewareMod.BuildMiddleware
import typingsSlinky.awsSdkTypes.middlewareMod.InitializeHandlerOptions
import typingsSlinky.awsSdkTypes.middlewareMod.InitializeMiddleware
import typingsSlinky.awsSdkTypes.middlewareMod.Pluggable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/middleware-sdk-glacier", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def accountIdDefaultMiddleware(): InitializeMiddleware[_, _] = js.native
  
  val accountIdDefaultMiddlewareOptions: InitializeHandlerOptions = js.native
  
  def addChecksumHeadersMiddleware(options: ResolvedGlacierMiddlewareConfig): BuildMiddleware[_, _] = js.native
  
  val addChecksumHeadersMiddlewareOptions: BuildHandlerOptions = js.native
  
  def addGlacierApiVersionMiddleware(options: ResolvedGlacierMiddlewareConfig): BuildMiddleware[_, _] = js.native
  
  val addGlacierApiVersionMiddlewareOptions: BuildHandlerOptions = js.native
  
  def getGlacierPlugin(config: PreviouslyResolved): Pluggable[_, _] = js.native
  
  def resolveGlacierMiddlewareConfig[T](input: T with PreviouslyResolved with GlacierMiddlewareInputConfig): T with ResolvedGlacierMiddlewareConfig = js.native
}
