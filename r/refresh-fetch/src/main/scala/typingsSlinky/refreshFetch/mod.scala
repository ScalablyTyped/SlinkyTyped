package typingsSlinky.refreshFetch

import typingsSlinky.std.Request
import typingsSlinky.std.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("refresh-fetch", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def configureRefreshFetch[T](configuration: AnonFetch[T]): T = js.native
  def fetchJSON[ResponseBody](url: String): js.Promise[AnonBody[ResponseBody]] = js.native
  def fetchJSON[ResponseBody](url: String, options: js.Object): js.Promise[AnonBody[ResponseBody]] = js.native
  def fetchJSON[ResponseBody](url: Request): js.Promise[AnonBody[ResponseBody]] = js.native
  def fetchJSON[ResponseBody](url: Request, options: js.Object): js.Promise[AnonBody[ResponseBody]] = js.native
  def fetchJSON[ResponseBody](url: URL): js.Promise[AnonBody[ResponseBody]] = js.native
  def fetchJSON[ResponseBody](url: URL, options: js.Object): js.Promise[AnonBody[ResponseBody]] = js.native
}

