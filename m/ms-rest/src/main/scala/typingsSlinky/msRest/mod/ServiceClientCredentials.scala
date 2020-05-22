package typingsSlinky.msRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceClientCredentials extends js.Object {
  /**
    * Signs a request with the Authentication header.
    *
    * @param {WebResource} The WebResource to be signed.
    * @param {function(error)}  callback  The callback function.
    */
  def signRequest(webResource: WebResource, callback: js.Function1[/* err */ js.Error, Unit]): Unit
}

object ServiceClientCredentials {
  @scala.inline
  def apply(signRequest: (WebResource, js.Function1[/* err */ js.Error, Unit]) => Unit): ServiceClientCredentials = {
    val __obj = js.Dynamic.literal(signRequest = js.Any.fromFunction2(signRequest))
    __obj.asInstanceOf[ServiceClientCredentials]
  }
}

