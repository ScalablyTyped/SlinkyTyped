package typingsSlinky.awsSdkMiddlewareLogger

import typingsSlinky.awsSdkTypes.middlewareMod.AbsoluteLocation
import typingsSlinky.awsSdkTypes.middlewareMod.HandlerExecutionContext
import typingsSlinky.awsSdkTypes.middlewareMod.InitializeHandler
import typingsSlinky.awsSdkTypes.middlewareMod.InitializeHandlerOptions
import typingsSlinky.awsSdkTypes.middlewareMod.Pluggable
import typingsSlinky.awsSdkTypes.responseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/middleware-logger", "getLoggerPlugin")
  @js.native
  def getLoggerPlugin(options: js.Any): Pluggable[_, _] = js.native
  
  @JSImport("@aws-sdk/middleware-logger", "loggerMiddleware")
  @js.native
  def loggerMiddleware(): js.Function2[
    /* next */ InitializeHandler[_, MetadataBearer], 
    /* context */ HandlerExecutionContext, 
    InitializeHandler[_, MetadataBearer]
  ] = js.native
  
  @JSImport("@aws-sdk/middleware-logger", "loggerMiddlewareOptions")
  @js.native
  val loggerMiddlewareOptions: InitializeHandlerOptions with AbsoluteLocation = js.native
}
