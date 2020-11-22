package typingsSlinky.awsSdkMiddlewareSerializer

import typingsSlinky.awsSdkTypes.middlewareMod.SerializeMiddleware
import typingsSlinky.awsSdkTypes.serdeMod.RequestSerializer
import typingsSlinky.awsSdkTypes.utilMod.Provider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/middleware-serializer", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def serializerMiddleware[Input /* <: js.Object */, Output /* <: js.Object */, Stream](requestSerializerProvider: Provider[RequestSerializer[Stream, _]]): SerializeMiddleware[Input, Output] = js.native
}
