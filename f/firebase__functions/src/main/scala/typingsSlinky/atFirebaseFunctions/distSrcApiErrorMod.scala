package typingsSlinky.atFirebaseFunctions

import typingsSlinky.atFirebaseFunctions.distSrcApiServiceMod.HttpResponseBody
import typingsSlinky.atFirebaseFunctions.distSrcSerializerMod.Serializer
import typingsSlinky.atFirebaseFunctionsDashTypes.atFirebaseFunctionsDashTypesMod.FunctionsErrorCode
import typingsSlinky.atFirebaseFunctionsDashTypes.atFirebaseFunctionsDashTypesMod.HttpsError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/functions/dist/src/api/error", JSImport.Namespace)
@js.native
object distSrcApiErrorMod extends js.Object {
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
  
  def _errorForResponse(status: Double, bodyJSON: Null, serializer: Serializer): js.Error | Null = js.native
  def _errorForResponse(status: Double, bodyJSON: HttpResponseBody, serializer: Serializer): js.Error | Null = js.native
}

