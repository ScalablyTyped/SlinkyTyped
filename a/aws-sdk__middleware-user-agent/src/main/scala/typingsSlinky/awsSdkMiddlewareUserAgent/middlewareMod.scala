package typingsSlinky.awsSdkMiddlewareUserAgent

import typingsSlinky.awsSdkMiddlewareUserAgent.configurationsMod.UserAgentResolvedConfig
import typingsSlinky.awsSdkTypes.middlewareMod.BuildHandler
import typingsSlinky.awsSdkTypes.middlewareMod.BuildHandlerOptions
import typingsSlinky.awsSdkTypes.middlewareMod.Pluggable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object middlewareMod {
  
  @JSImport("@aws-sdk/middleware-user-agent/dist/cjs/middleware", "getUserAgentMiddlewareOptions")
  @js.native
  val getUserAgentMiddlewareOptions: BuildHandlerOptions = js.native
  
  @JSImport("@aws-sdk/middleware-user-agent/dist/cjs/middleware", "getUserAgentPlugin")
  @js.native
  def getUserAgentPlugin(config: UserAgentResolvedConfig): Pluggable[_, _] = js.native
  
  @JSImport("@aws-sdk/middleware-user-agent/dist/cjs/middleware", "userAgentMiddleware")
  @js.native
  def userAgentMiddleware(options: UserAgentResolvedConfig): js.Function1[/* next */ BuildHandler[_, _], BuildHandler[_, _]] = js.native
}
