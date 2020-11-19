package typingsSlinky.cacheableRequest.mod

import typingsSlinky.node.httpMod.ClientRequest
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.RequestOptions
import typingsSlinky.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestFn extends js.Object {
  
  def apply(options: String): ClientRequest = js.native
  def apply(options: String, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  def apply(options: RequestOptions): ClientRequest = js.native
  def apply(options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  def apply(options: URL_): ClientRequest = js.native
  def apply(options: URL_, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  def apply(url: String, options: RequestOptions): ClientRequest = js.native
  def apply(url: String, options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
  def apply(url: URL_, options: RequestOptions): ClientRequest = js.native
  def apply(url: URL_, options: RequestOptions, callback: js.Function1[/* res */ IncomingMessage, Unit]): ClientRequest = js.native
}
