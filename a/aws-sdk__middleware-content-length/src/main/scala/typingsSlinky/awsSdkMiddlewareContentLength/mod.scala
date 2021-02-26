package typingsSlinky.awsSdkMiddlewareContentLength

import typingsSlinky.awsSdkMiddlewareContentLength.anon.BodyLengthChecker
import typingsSlinky.awsSdkTypes.middlewareMod.BuildHandlerOptions
import typingsSlinky.awsSdkTypes.middlewareMod.BuildMiddleware
import typingsSlinky.awsSdkTypes.middlewareMod.Pluggable
import typingsSlinky.awsSdkTypes.utilMod.BodyLengthCalculator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/middleware-content-length", "contentLengthMiddleware")
  @js.native
  def contentLengthMiddleware(bodyLengthChecker: BodyLengthCalculator): BuildMiddleware[_, _] = js.native
  
  @JSImport("@aws-sdk/middleware-content-length", "contentLengthMiddlewareOptions")
  @js.native
  val contentLengthMiddlewareOptions: BuildHandlerOptions = js.native
  
  @JSImport("@aws-sdk/middleware-content-length", "getContentLengthPlugin")
  @js.native
  def getContentLengthPlugin(options: BodyLengthChecker): Pluggable[_, _] = js.native
}
