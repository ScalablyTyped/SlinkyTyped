package typingsSlinky.ravenJs.mod

import typingsSlinky.ravenJs.anon.ErrorrequestXMLHttpReques
import typingsSlinky.ravenJs.anon.Sentryclient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RavenTransportOptions extends js.Object {
  var auth: Sentryclient = js.native
  var data: js.Any = js.native
  var url: String = js.native
  def onError(error: ErrorrequestXMLHttpReques): Unit = js.native
  def onSuccess(): Unit = js.native
}

object RavenTransportOptions {
  @scala.inline
  def apply(
    auth: Sentryclient,
    data: js.Any,
    onError: ErrorrequestXMLHttpReques => Unit,
    onSuccess: () => Unit,
    url: String
  ): RavenTransportOptions = {
    val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], onError = js.Any.fromFunction1(onError), onSuccess = js.Any.fromFunction0(onSuccess), url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RavenTransportOptions]
  }
  @scala.inline
  implicit class RavenTransportOptionsOps[Self <: RavenTransportOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: Sentryclient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnError(value: ErrorrequestXMLHttpReques => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnSuccess(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSuccess")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

