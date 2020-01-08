package typingsSlinky.atAwsDashSdkHttpDashSerialization

import typingsSlinky.atAwsDashSdkTypes.buildHttpMod.HttpMessage
import typingsSlinky.atAwsDashSdkTypes.buildHttpMod.HttpRequest
import typingsSlinky.atAwsDashSdkTypes.buildHttpMod.HttpResponse
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/http-serialization", JSImport.Namespace)
@js.native
object atAwsDashSdkHttpDashSerializationMod extends js.Object {
  def parseRequest(serialized: String): DerivedHttpRequest = js.native
  def parseResponse(serialized: String): HttpResponse[String] = js.native
  def serializeRequest(request: HttpRequest[_]): String = js.native
  def serializeResponse(response: HttpResponse[_]): String = js.native
  type DerivedHttpRequest = Partial[HttpRequest[String]] with HttpMessage[String] with Anon_Method
}

