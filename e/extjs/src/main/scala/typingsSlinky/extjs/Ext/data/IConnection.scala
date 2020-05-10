package typingsSlinky.extjs.Ext.data

import typingsSlinky.extjs.Ext.util.IObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConnection extends IObservable {
  /** [Method] Aborts an active request
  		* @param request Object Defaults to the last request
  		*/
  var abort: js.UndefOr[js.Function1[/* request */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Aborts all active requests */
  var abortAll: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean) */
  var autoAbort: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var binary: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var cors: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Object) */
  var defaultHeaders: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var disableCaching: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var disableCachingParam: js.UndefOr[String] = js.native
  /** [Config Option] (Object) */
  var extraParams: js.UndefOr[js.Any] = js.native
  /** [Method] Determines whether this object has a request outstanding
  		* @param request Object Defaults to the last transaction
  		* @returns Boolean True if there is an outstanding request.
  		*/
  var isLoading: js.UndefOr[js.Function1[/* request */ js.UndefOr[js.Any], Boolean]] = js.native
  /** [Config Option] (String) */
  var method: js.UndefOr[String] = js.native
  /** [Method] Checks if the response status was successful
  		* @param status Number The status code
  		* @returns Object An object containing success/status state
  		*/
  var parseStatus: js.UndefOr[js.Function1[/* status */ js.UndefOr[Double], _]] = js.native
  /** [Method] Sends an HTTP request to a remote server
  		* @param options Object An object which may contain the following properties: (The options object may also contain any other property which might be needed to perform postprocessing in a callback because it is passed to callback functions.)
  		* @returns Object The request object. This may be used to cancel the request.
  		*/
  var request: js.UndefOr[js.Function1[/* options */ js.UndefOr[js.Any], _]] = js.native
  /** [Method] Sets various options such as the url params for the request
  		* @param options Object The initial options
  		* @param scope Object The scope to execute in
  		* @returns Object The params for the request
  		*/
  var setOptions: js.UndefOr[
    js.Function2[/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], _]
  ] = js.native
  /** [Config Option] (Number) */
  var timeout: js.UndefOr[Double] = js.native
  /** [Method] Uploads a form using a hidden iframe
  		* @param form String/HTMLElement/Ext.Element The form to upload
  		* @param url String The url to post to
  		* @param params String Any extra parameters to pass
  		* @param options Object The initial options
  		*/
  var upload: js.UndefOr[
    js.Function4[
      /* form */ js.UndefOr[js.Any], 
      /* url */ js.UndefOr[String], 
      /* params */ js.UndefOr[String], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Config Option] (Boolean) */
  var withCredentials: js.UndefOr[Boolean] = js.native
}

object IConnection {
  @scala.inline
  def apply(): IConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConnection]
  }
  @scala.inline
  implicit class IConnectionOps[Self <: IConnection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAbort(value: /* request */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAbort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abort")(js.undefined)
        ret
    }
    @scala.inline
    def withAbortAll(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abortAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAbortAll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("abortAll")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoAbort(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAbort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoAbort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAbort")(js.undefined)
        ret
    }
    @scala.inline
    def withBinary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binary")(js.undefined)
        ret
    }
    @scala.inline
    def withCors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cors")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultHeaders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableCaching(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCaching")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableCaching: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCaching")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableCachingParam(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCachingParam")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableCachingParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCachingParam")(js.undefined)
        ret
    }
    @scala.inline
    def withExtraParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraParams")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLoading(value: /* request */ js.UndefOr[js.Any] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoading")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoading")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withParseStatus(value: /* status */ js.UndefOr[Double] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseStatus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutParseStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withRequest(value: /* options */ js.UndefOr[js.Any] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.undefined)
        ret
    }
    @scala.inline
    def withSetOptions(value: (/* options */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOptions")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withUpload(
      value: (/* form */ js.UndefOr[js.Any], /* url */ js.UndefOr[String], /* params */ js.UndefOr[String], /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutUpload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload")(js.undefined)
        ret
    }
    @scala.inline
    def withWithCredentials(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCredentials")(js.undefined)
        ret
    }
  }
  
}

