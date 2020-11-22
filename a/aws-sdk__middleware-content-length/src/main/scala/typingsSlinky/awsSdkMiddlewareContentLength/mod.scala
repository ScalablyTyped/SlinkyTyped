package typingsSlinky.awsSdkMiddlewareContentLength

import typingsSlinky.awsSdkMiddlewareContentLength.anon.BodyLengthChecker
import typingsSlinky.awsSdkTypes.middlewareMod.BuildHandlerOptions
import typingsSlinky.awsSdkTypes.middlewareMod.BuildMiddleware
import typingsSlinky.awsSdkTypes.middlewareMod.Pluggable
import typingsSlinky.awsSdkTypes.utilMod.BodyLengthCalculator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/middleware-content-length", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def contentLengthMiddleware(bodyLengthChecker: BodyLengthCalculator): BuildMiddleware[_, _] = js.native
  
  val contentLengthMiddlewareOptions: BuildHandlerOptions = js.native
  
  def getContentLengthPlugin(options: BodyLengthChecker): Pluggable[_, _] = js.native
}
