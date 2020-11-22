package typingsSlinky.awsSdkMiddlewareLogger

import typingsSlinky.awsSdkTypes.middlewareMod.AbsoluteLocation
import typingsSlinky.awsSdkTypes.middlewareMod.HandlerExecutionContext
import typingsSlinky.awsSdkTypes.middlewareMod.InitializeHandler
import typingsSlinky.awsSdkTypes.middlewareMod.InitializeHandlerOptions
import typingsSlinky.awsSdkTypes.middlewareMod.Pluggable
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/middleware-logger", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def getLoggerPlugin(options: js.Any): Pluggable[_, _] = js.native
  
  def loggerMiddleware(): js.Function2[
    /* next */ InitializeHandler[_, MetadataBearer], 
    /* context */ HandlerExecutionContext, 
    InitializeHandler[_, MetadataBearer]
  ] = js.native
  
  val loggerMiddlewareOptions: InitializeHandlerOptions with AbsoluteLocation = js.native
}
