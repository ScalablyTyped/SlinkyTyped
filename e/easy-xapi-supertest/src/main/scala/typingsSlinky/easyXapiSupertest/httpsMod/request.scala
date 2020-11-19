package typingsSlinky.easyXapiSupertest.httpsMod

import typingsSlinky.easyXapiSupertest.httpMod.ClientRequest
import typingsSlinky.easyXapiSupertest.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("https", "request")
@js.native
object request extends js.Object {
  
  def apply(options: RequestOptions): ClientRequest = js.native
  def apply(options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
}
