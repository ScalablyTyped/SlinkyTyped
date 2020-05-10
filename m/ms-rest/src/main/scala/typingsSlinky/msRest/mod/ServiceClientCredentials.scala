package typingsSlinky.msRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceClientCredentials extends js.Object {
  /**
    * Signs a request with the Authentication header.
    *
    * @param {WebResource} The WebResource to be signed.
    * @param {function(error)}  callback  The callback function.
    */
  def signRequest(webResource: WebResource, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}

object ServiceClientCredentials {
  @scala.inline
  def apply(signRequest: (WebResource, js.Function1[/* err */ js.Error, Unit]) => Unit): ServiceClientCredentials = {
    val __obj = js.Dynamic.literal(signRequest = js.Any.fromFunction2(signRequest))
    __obj.asInstanceOf[ServiceClientCredentials]
  }
  @scala.inline
  implicit class ServiceClientCredentialsOps[Self <: ServiceClientCredentials] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSignRequest(value: (WebResource, js.Function1[/* err */ js.Error, Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signRequest")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

