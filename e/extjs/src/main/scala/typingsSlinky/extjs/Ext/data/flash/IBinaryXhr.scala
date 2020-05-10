package typingsSlinky.extjs.Ext.data.flash

import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBinaryXhr extends IBase {
  /** [Method] Abort this connection  */
  var abort: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] As in XMLHttpRequest  */
  var getAllResponseHeaders: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] As in XMLHttpRequest
  		* @param header Object
  		*/
  var getResponseHeader: js.UndefOr[js.Function1[/* header */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] As in XMLHttpRequest  */
  var onreadystatechange: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] As in XMLHttpRequest
  		* @param method Object
  		* @param url Object
  		* @param async Object
  		* @param user Object
  		* @param password Object
  		*/
  var open: js.UndefOr[
    js.Function5[
      /* method */ js.UndefOr[js.Any], 
      /* url */ js.UndefOr[js.Any], 
      /* async */ js.UndefOr[js.Any], 
      /* user */ js.UndefOr[js.Any], 
      /* password */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Method] As in XMLHttpRequest
  		* @param mimeType Object
  		*/
  var overrideMimeType: js.UndefOr[js.Function1[/* mimeType */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Property] (number) */
  var readyState: js.UndefOr[Double] = js.native
  /** [Property] (Array) */
  var responseBytes: js.UndefOr[Array] = js.native
  /** [Method] Initiate the request
  		* @param body Array an array of byte values to send.
  		*/
  var send: js.UndefOr[js.Function1[/* body */ js.UndefOr[Array], Unit]] = js.native
  /** [Method] As in XMLHttpRequest
  		* @param header Object
  		* @param value Object
  		*/
  var setRequestHeader: js.UndefOr[
    js.Function2[/* header */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Property] (number) */
  var status: js.UndefOr[Double] = js.native
  /** [Property] (String) */
  var statusText: js.UndefOr[String] = js.native
}

object IBinaryXhr {
  @scala.inline
  def apply(): IBinaryXhr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBinaryXhr]
  }
  @scala.inline
  implicit class IBinaryXhrOps[Self <: IBinaryXhr] (val x: Self) extends AnyVal {
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
    def withoutAbort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(js.undefined)
        ret
    }
    @scala.inline
    def withGetAllResponseHeaders(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllResponseHeaders")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetAllResponseHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllResponseHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withGetResponseHeader(value: /* header */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getResponseHeader")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetResponseHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getResponseHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withOnreadystatechange(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onreadystatechange")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnreadystatechange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onreadystatechange")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen(
      value: (/* method */ js.UndefOr[js.Any], /* url */ js.UndefOr[js.Any], /* async */ js.UndefOr[js.Any], /* user */ js.UndefOr[js.Any], /* password */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrideMimeType(value: /* mimeType */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideMimeType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOverrideMimeType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideMimeType")(js.undefined)
        ret
    }
    @scala.inline
    def withReadyState(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readyState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadyState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readyState")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseBytes(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withSend(value: /* body */ js.UndefOr[Array] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send")(js.undefined)
        ret
    }
    @scala.inline
    def withSetRequestHeader(value: (/* header */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRequestHeader")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetRequestHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRequestHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusText")(js.undefined)
        ret
    }
  }
  
}

