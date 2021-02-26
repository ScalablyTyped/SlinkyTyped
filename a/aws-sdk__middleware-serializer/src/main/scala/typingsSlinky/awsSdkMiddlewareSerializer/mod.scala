package typingsSlinky.awsSdkMiddlewareSerializer

import typingsSlinky.awsSdkTypes.middlewareMod.SerializeMiddleware
import typingsSlinky.awsSdkTypes.serdeMod.RequestSerializer
import typingsSlinky.awsSdkTypes.utilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/middleware-serializer", "serializerMiddleware")
  @js.native
  def serializerMiddleware[Input /* <: js.Object */, Output /* <: js.Object */, Stream](requestSerializerProvider: Provider[RequestSerializer[Stream, _]]): SerializeMiddleware[Input, Output] = js.native
}
