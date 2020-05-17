package typingsSlinky.activexMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IXMLHTTPRequest2Callback Interface */
@js.native
trait IXMLHTTPRequest2Callback extends js.Object {
  @JSName("MSXML2.IXMLHTTPRequest2Callback_typekey")
  var MSXML2DotIXMLHTTPRequest2Callback_typekey: IXMLHTTPRequest2Callback = js.native
  def OnError(pXHR: FreeThreadedXMLHTTP60): Unit = js.native
  def OnHeadersAvailable(pXHR: FreeThreadedXMLHTTP60, dwStatus: Double, pwszStatus: String): Unit = js.native
  def OnRedirect(pXHR: FreeThreadedXMLHTTP60, pwszRedirectUrl: String): Unit = js.native
  def OnResponseReceived(pXHR: FreeThreadedXMLHTTP60, pResponseStream: ISequentialStream): Unit = js.native
  def ondataavailable(pXHR: FreeThreadedXMLHTTP60, pResponseStream: ISequentialStream): Unit = js.native
}

object IXMLHTTPRequest2Callback {
  @scala.inline
  def apply(
    MSXML2DotIXMLHTTPRequest2Callback_typekey: IXMLHTTPRequest2Callback,
    OnError: FreeThreadedXMLHTTP60 => Unit,
    OnHeadersAvailable: (FreeThreadedXMLHTTP60, Double, String) => Unit,
    OnRedirect: (FreeThreadedXMLHTTP60, String) => Unit,
    OnResponseReceived: (FreeThreadedXMLHTTP60, ISequentialStream) => Unit,
    ondataavailable: (FreeThreadedXMLHTTP60, ISequentialStream) => Unit
  ): IXMLHTTPRequest2Callback = {
    val __obj = js.Dynamic.literal(OnError = js.Any.fromFunction1(OnError), OnHeadersAvailable = js.Any.fromFunction3(OnHeadersAvailable), OnRedirect = js.Any.fromFunction2(OnRedirect), OnResponseReceived = js.Any.fromFunction2(OnResponseReceived), ondataavailable = js.Any.fromFunction2(ondataavailable))
    __obj.updateDynamic("MSXML2.IXMLHTTPRequest2Callback_typekey")(MSXML2DotIXMLHTTPRequest2Callback_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXMLHTTPRequest2Callback]
  }
  @scala.inline
  implicit class IXMLHTTPRequest2CallbackOps[Self <: IXMLHTTPRequest2Callback] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSXML2DotIXMLHTTPRequest2Callback_typekey(value: IXMLHTTPRequest2Callback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSXML2.IXMLHTTPRequest2Callback_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnError(value: FreeThreadedXMLHTTP60 => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOnHeadersAvailable(value: (FreeThreadedXMLHTTP60, Double, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnHeadersAvailable")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withOnRedirect(value: (FreeThreadedXMLHTTP60, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnRedirect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOnResponseReceived(value: (FreeThreadedXMLHTTP60, ISequentialStream) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnResponseReceived")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOndataavailable(value: (FreeThreadedXMLHTTP60, ISequentialStream) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondataavailable")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

