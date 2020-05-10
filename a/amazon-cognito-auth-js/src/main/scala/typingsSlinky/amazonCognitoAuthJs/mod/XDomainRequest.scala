package typingsSlinky.amazonCognitoAuthJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XDomainRequest extends js.Object {
  val responseText: String = js.native
  var timeout: Double = js.native
  def abort(): Unit = js.native
  def onerror(): Unit = js.native
  def onload(): Unit = js.native
  def onprogress(): Unit = js.native
  def ontimeout(): Unit = js.native
  def open(method: String, url: String): Unit = js.native
  def send(data: String): Unit = js.native
}

object XDomainRequest {
  @scala.inline
  def apply(
    abort: () => Unit,
    onerror: () => Unit,
    onload: () => Unit,
    onprogress: () => Unit,
    ontimeout: () => Unit,
    open: (String, String) => Unit,
    responseText: String,
    send: String => Unit,
    timeout: Double
  ): XDomainRequest = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), onerror = js.Any.fromFunction0(onerror), onload = js.Any.fromFunction0(onload), onprogress = js.Any.fromFunction0(onprogress), ontimeout = js.Any.fromFunction0(ontimeout), open = js.Any.fromFunction2(open), responseText = responseText.asInstanceOf[js.Any], send = js.Any.fromFunction1(send), timeout = timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[XDomainRequest]
  }
  @scala.inline
  implicit class XDomainRequestOps[Self <: XDomainRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbort(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnerror(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnload(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onload")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOnprogress(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onprogress")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOntimeout(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontimeout")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOpen(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withResponseText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSend(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

