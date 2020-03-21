package typingsSlinky.firebaseFunctions

import typingsSlinky.firebaseFunctions.serializerMod.Serializer
import typingsSlinky.firebaseFunctions.serviceMod.HttpResponseBody
import typingsSlinky.firebaseFunctionsTypes.mod.FunctionsErrorCode
import typingsSlinky.firebaseFunctionsTypes.mod.HttpsError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/functions/dist/src/api/error", JSImport.Namespace)
@js.native
object errorMod extends js.Object {
  @js.native
  class HttpsErrorImpl protected () extends HttpsError {
    def this(code: FunctionsErrorCode) = this()
    def this(code: FunctionsErrorCode, message: String) = this()
    def this(code: FunctionsErrorCode, message: String, details: js.Any) = this()
    /**
      * A standard error code that will be returned to the client. This also
      * determines the HTTP status code of the response, as defined in code.proto.
      */
    /* CompleteClass */
    override val code: FunctionsErrorCode = js.native
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  @JSName("_errorForResponse")
  def errorForResponse(status: Double, bodyJSON: Null, serializer: Serializer): js.Error | Null = js.native
  @JSName("_errorForResponse")
  def errorForResponse(status: Double, bodyJSON: HttpResponseBody, serializer: Serializer): js.Error | Null = js.native
}

