package typingsSlinky.enhancedResolve.mod

import typingsSlinky.enhancedResolve.commonTypesMod.LoggingCallbackWrapper
import typingsSlinky.enhancedResolve.commonTypesMod.ResolveContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("enhanced-resolve", "context")
@js.native
object context extends js.Object {
  
  def apply(context: ResolveContext, path: String, request: String, callback: LoggingCallbackWrapper): Unit = js.native
  def apply(path: String, request: String, callback: LoggingCallbackWrapper): Unit = js.native
  
  def sync(context: ResolveContext, path: String, request: String): String = js.native
  def sync(path: String, request: String): String = js.native
}
