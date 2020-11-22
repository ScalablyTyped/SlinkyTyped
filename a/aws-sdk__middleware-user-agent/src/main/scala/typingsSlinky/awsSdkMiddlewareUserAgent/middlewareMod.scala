package typingsSlinky.awsSdkMiddlewareUserAgent

import typingsSlinky.awsSdkMiddlewareUserAgent.configurationsMod.UserAgentResolvedConfig
import typingsSlinky.awsSdkTypes.middlewareMod.BuildHandler
import typingsSlinky.awsSdkTypes.middlewareMod.BuildHandlerOptions
import typingsSlinky.awsSdkTypes.middlewareMod.Pluggable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/middleware-user-agent/dist/cjs/middleware", JSImport.Namespace)
@js.native
object middlewareMod extends js.Object {
  
  val getUserAgentMiddlewareOptions: BuildHandlerOptions = js.native
  
  def getUserAgentPlugin(config: UserAgentResolvedConfig): Pluggable[_, _] = js.native
  
  def userAgentMiddleware(options: UserAgentResolvedConfig): js.Function1[/* next */ BuildHandler[_, _], BuildHandler[_, _]] = js.native
}
