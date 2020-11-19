package typingsSlinky.meteor.httpMod.HTTP

import typingsSlinky.meteor.anon.Auth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("meteor/http", "HTTP.call")
@js.native
object call extends js.Object {
  
  def apply(method: String, url: String): HTTPResponse = js.native
  def apply(method: String, url: String, options: js.UndefOr[scala.Nothing], asyncCallback: js.Function): HTTPResponse = js.native
  def apply(method: String, url: String, options: Auth): HTTPResponse = js.native
  def apply(method: String, url: String, options: Auth, asyncCallback: js.Function): HTTPResponse = js.native
  def apply(method: String, url: String, options: HTTPRequest): HTTPResponse = js.native
  def apply(method: String, url: String, options: HTTPRequest, asyncCallback: js.Function): HTTPResponse = js.native
}
