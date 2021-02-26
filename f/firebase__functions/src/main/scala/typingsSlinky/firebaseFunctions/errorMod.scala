package typingsSlinky.firebaseFunctions

import typingsSlinky.firebaseFunctions.serializerMod.Serializer
import typingsSlinky.firebaseFunctions.serviceMod.HttpResponseBody
import typingsSlinky.firebaseFunctionsTypes.mod.FunctionsErrorCode
import typingsSlinky.firebaseFunctionsTypes.mod.HttpsError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorMod {
  
  @JSImport("@firebase/functions/dist/src/api/error", "HttpsErrorImpl")
  @js.native
  class HttpsErrorImpl protected () extends HttpsError {
    def this(code: FunctionsErrorCode) = this()
    def this(code: FunctionsErrorCode, message: String) = this()
    def this(code: FunctionsErrorCode, message: js.UndefOr[scala.Nothing], details: js.Any) = this()
    def this(code: FunctionsErrorCode, message: String, details: js.Any) = this()
  }
  
  @JSImport("@firebase/functions/dist/src/api/error", "_errorForResponse")
  @js.native
  def errorForResponse(status: Double, bodyJSON: Null, serializer: Serializer): js.Error | Null = js.native
  @JSImport("@firebase/functions/dist/src/api/error", "_errorForResponse")
  @js.native
  def errorForResponse(status: Double, bodyJSON: HttpResponseBody, serializer: Serializer): js.Error | Null = js.native
}
