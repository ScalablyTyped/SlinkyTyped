package typingsSlinky.awsSdkMiddlewareSdkGlacier

import typingsSlinky.awsSdkMiddlewareSdkGlacier.configurationsMod.ResolvedGlacierMiddlewareConfig
import typingsSlinky.awsSdkTypes.middlewareMod.BuildHandlerOptions
import typingsSlinky.awsSdkTypes.middlewareMod.BuildMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addGlacierApiVersionMod {
  
  @JSImport("@aws-sdk/middleware-sdk-glacier/dist/cjs/add-glacier-api-version", "addGlacierApiVersionMiddleware")
  @js.native
  def addGlacierApiVersionMiddleware(options: ResolvedGlacierMiddlewareConfig): BuildMiddleware[_, _] = js.native
  
  @JSImport("@aws-sdk/middleware-sdk-glacier/dist/cjs/add-glacier-api-version", "addGlacierApiVersionMiddlewareOptions")
  @js.native
  val addGlacierApiVersionMiddlewareOptions: BuildHandlerOptions = js.native
}
