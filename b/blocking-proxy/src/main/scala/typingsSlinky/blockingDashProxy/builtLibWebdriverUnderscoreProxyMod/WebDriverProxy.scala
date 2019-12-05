package typingsSlinky.blockingDashProxy.builtLibWebdriverUnderscoreProxyMod

import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blocking-proxy/built/lib/webdriver_proxy", "WebDriverProxy")
@js.native
class WebDriverProxy protected () extends js.Object {
  def this(seleniumAddress: String) = this()
  var barriers: js.Array[WebDriverBarrier] = js.native
  var seleniumAddress: String = js.native
  def addBarrier(barrier: WebDriverBarrier): Unit = js.native
  def handleRequest(originalRequest: IncomingMessage, response: ServerResponse): js.Promise[Unit] = js.native
}

