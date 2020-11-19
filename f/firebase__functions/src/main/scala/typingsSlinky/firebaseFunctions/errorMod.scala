package typingsSlinky.firebaseFunctions

import typingsSlinky.firebaseFunctions.serializerMod.Serializer
import typingsSlinky.firebaseFunctions.serviceMod.HttpResponseBody
import typingsSlinky.firebaseFunctionsTypes.mod.FunctionsErrorCode
import typingsSlinky.firebaseFunctionsTypes.mod.HttpsError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/functions/dist/src/api/error", JSImport.Namespace)
@js.native
object errorMod extends js.Object {
  
  @JSName("_errorForResponse")
  def errorForResponse(status: Double, bodyJSON: Null, serializer: Serializer): js.Error | Null = js.native
  @JSName("_errorForResponse")
  def errorForResponse(status: Double, bodyJSON: HttpResponseBody, serializer: Serializer): js.Error | Null = js.native
  
  @js.native
  class HttpsErrorImpl protected () extends HttpsError {
    def this(code: FunctionsErrorCode) = this()
    def this(code: FunctionsErrorCode, message: String) = this()
    def this(code: FunctionsErrorCode, message: js.UndefOr[scala.Nothing], details: js.Any) = this()
    def this(code: FunctionsErrorCode, message: String, details: js.Any) = this()
  }
}
