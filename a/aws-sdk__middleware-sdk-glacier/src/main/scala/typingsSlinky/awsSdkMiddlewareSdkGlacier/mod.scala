package typingsSlinky.awsSdkMiddlewareSdkGlacier

import typingsSlinky.awsSdkMiddlewareSdkGlacier.configurationsMod.GlacierMiddlewareInputConfig
import typingsSlinky.awsSdkMiddlewareSdkGlacier.configurationsMod.PreviouslyResolved
import typingsSlinky.awsSdkMiddlewareSdkGlacier.configurationsMod.ResolvedGlacierMiddlewareConfig
import typingsSlinky.awsSdkTypes.middlewareMod.BuildHandlerOptions
import typingsSlinky.awsSdkTypes.middlewareMod.BuildMiddleware
import typingsSlinky.awsSdkTypes.middlewareMod.InitializeHandlerOptions
import typingsSlinky.awsSdkTypes.middlewareMod.InitializeMiddleware
import typingsSlinky.awsSdkTypes.middlewareMod.Pluggable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/middleware-sdk-glacier", "accountIdDefaultMiddleware")
  @js.native
  def accountIdDefaultMiddleware(): InitializeMiddleware[_, _] = js.native
  
  @JSImport("@aws-sdk/middleware-sdk-glacier", "accountIdDefaultMiddlewareOptions")
  @js.native
  val accountIdDefaultMiddlewareOptions: InitializeHandlerOptions = js.native
  
  @JSImport("@aws-sdk/middleware-sdk-glacier", "addChecksumHeadersMiddleware")
  @js.native
  def addChecksumHeadersMiddleware(options: ResolvedGlacierMiddlewareConfig): BuildMiddleware[_, _] = js.native
  
  @JSImport("@aws-sdk/middleware-sdk-glacier", "addChecksumHeadersMiddlewareOptions")
  @js.native
  val addChecksumHeadersMiddlewareOptions: BuildHandlerOptions = js.native
  
  @JSImport("@aws-sdk/middleware-sdk-glacier", "addGlacierApiVersionMiddleware")
  @js.native
  def addGlacierApiVersionMiddleware(options: ResolvedGlacierMiddlewareConfig): BuildMiddleware[_, _] = js.native
  
  @JSImport("@aws-sdk/middleware-sdk-glacier", "addGlacierApiVersionMiddlewareOptions")
  @js.native
  val addGlacierApiVersionMiddlewareOptions: BuildHandlerOptions = js.native
  
  @JSImport("@aws-sdk/middleware-sdk-glacier", "getGlacierPlugin")
  @js.native
  def getGlacierPlugin(config: PreviouslyResolved): Pluggable[_, _] = js.native
  
  @JSImport("@aws-sdk/middleware-sdk-glacier", "resolveGlacierMiddlewareConfig")
  @js.native
  def resolveGlacierMiddlewareConfig[T](input: T with PreviouslyResolved with GlacierMiddlewareInputConfig): T with ResolvedGlacierMiddlewareConfig = js.native
}
