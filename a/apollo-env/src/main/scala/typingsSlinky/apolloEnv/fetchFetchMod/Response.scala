package typingsSlinky.apolloEnv.fetchFetchMod

import typingsSlinky.nodeFetch.mod.BodyInit
import typingsSlinky.nodeFetch.mod.ResponseInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-env/lib/fetch/fetch", "Response")
@js.native
class Response ()
  extends typingsSlinky.nodeFetch.mod.Response {
  def this(body: BodyInit) = this()
  def this(body: BodyInit, init: ResponseInit) = this()
}

/* static members */
@JSImport("apollo-env/lib/fetch/fetch", "Response")
@js.native
object Response extends js.Object {
  def error(): typingsSlinky.nodeFetch.mod.Response = js.native
  def redirect(url: String, status: Double): typingsSlinky.nodeFetch.mod.Response = js.native
}

