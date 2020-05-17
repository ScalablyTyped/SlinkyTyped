package typingsSlinky.refreshFetch

import org.scalajs.dom.experimental.Request
import org.scalajs.dom.experimental.RequestInit
import org.scalajs.dom.experimental.URL
import typingsSlinky.refreshFetch.anon.Body
import typingsSlinky.refreshFetch.anon.Fetch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("refresh-fetch", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def configureRefreshFetch[T](configuration: Fetch[T]): T = js.native
  def fetchJSON[ResponseBody](url: String): js.Promise[Body[ResponseBody]] = js.native
  def fetchJSON[ResponseBody](url: String, options: RequestInit): js.Promise[Body[ResponseBody]] = js.native
  def fetchJSON[ResponseBody](url: Request): js.Promise[Body[ResponseBody]] = js.native
  def fetchJSON[ResponseBody](url: Request, options: RequestInit): js.Promise[Body[ResponseBody]] = js.native
  def fetchJSON[ResponseBody](url: URL): js.Promise[Body[ResponseBody]] = js.native
  def fetchJSON[ResponseBody](url: URL, options: RequestInit): js.Promise[Body[ResponseBody]] = js.native
}

