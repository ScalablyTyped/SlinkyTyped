package typingsSlinky.apolloDashUploadDashClient.apolloDashUploadDashClientMod

import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.Response
import typingsSlinky.apolloDashUploadDashClient.Fn_Init
import typingsSlinky.std.RequestInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object _Global_ extends js.Object {
  @js.native
  trait GlobalFetch extends js.Object {
    @JSName("fetch")
    var fetch_Original: Fn_Init = js.native
    def fetch(input: RequestInfo): js.Promise[Response] = js.native
    def fetch(input: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
  }
  
}

