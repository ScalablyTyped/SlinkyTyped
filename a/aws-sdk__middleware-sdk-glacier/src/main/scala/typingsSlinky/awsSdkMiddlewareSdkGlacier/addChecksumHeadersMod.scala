package typingsSlinky.awsSdkMiddlewareSdkGlacier

import typingsSlinky.awsSdkMiddlewareSdkGlacier.configurationsMod.ResolvedGlacierMiddlewareConfig
import typingsSlinky.awsSdkTypes.middlewareMod.BuildHandlerOptions
import typingsSlinky.awsSdkTypes.middlewareMod.BuildMiddleware
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addChecksumHeadersMod {
  
  @JSImport("@aws-sdk/middleware-sdk-glacier/dist/cjs/add-checksum-headers", "addChecksumHeadersMiddleware")
  @js.native
  def addChecksumHeadersMiddleware(options: ResolvedGlacierMiddlewareConfig): BuildMiddleware[_, _] = js.native
  
  @JSImport("@aws-sdk/middleware-sdk-glacier/dist/cjs/add-checksum-headers", "addChecksumHeadersMiddlewareOptions")
  @js.native
  val addChecksumHeadersMiddlewareOptions: BuildHandlerOptions = js.native
}
