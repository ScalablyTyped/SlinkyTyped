package typingsSlinky.awsSdkMiddlewareSerde

import typingsSlinky.awsSdkTypes.middlewareMod.DeserializeMiddleware
import typingsSlinky.awsSdkTypes.serdeMod.ResponseDeserializer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/middleware-serde/dist/cjs/deserializerMiddleware", JSImport.Namespace)
@js.native
object deserializerMiddlewareMod extends js.Object {
  
  def deserializerMiddleware[Input /* <: js.Object */, Output /* <: js.Object */, RuntimeUtils](options: RuntimeUtils, deserializer: ResponseDeserializer[_, _, RuntimeUtils]): DeserializeMiddleware[Input, Output] = js.native
}
