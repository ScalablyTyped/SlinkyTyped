package typingsSlinky.atmosphereJs.Atmosphere

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  var async: js.UndefOr[Boolean] = js.native
  var attachHeadersAsQueryString: js.UndefOr[Boolean] = js.native
  var callback: js.UndefOr[js.Function] = js.native
  var close: js.UndefOr[js.Function0[Unit]] = js.native
  var connectTimeout: js.UndefOr[Double] = js.native
  var contentType: js.UndefOr[String] = js.native
  var data: js.UndefOr[String] = js.native
  var disableDisconnect: js.UndefOr[Boolean] = js.native
  var disconnect: js.UndefOr[js.Function0[Unit]] = js.native
  var dispatchUrl: js.UndefOr[String] = js.native
  var dropHeaders: js.UndefOr[Boolean] = js.native
  var enableProtocol: js.UndefOr[Boolean] = js.native
  var enableXDR: js.UndefOr[Boolean] = js.native
  var execute: js.UndefOr[js.Function0[Unit]] = js.native
  var executeCallbackBeforeReconnect: js.UndefOr[Boolean] = js.native
  var fallbackMethod: js.UndefOr[String] = js.native
  var fallbackTransport: js.UndefOr[String] = js.native
  var getUUID: js.UndefOr[js.Function0[Unit]] = js.native
  var getUrl: js.UndefOr[js.Function0[String]] = js.native
  var headers: js.UndefOr[js.Any] = js.native
  var lastIndex: js.UndefOr[Double] = js.native
  var lastTimestamp: js.UndefOr[Double] = js.native
  var logLevel: js.UndefOr[String] = js.native
  var maxReconnectOnClose: js.UndefOr[Double] = js.native
  var maxRequest: js.UndefOr[Double] = js.native
  var maxStreamingLength: js.UndefOr[Double] = js.native
  var messageDelimiter: js.UndefOr[String] = js.native
  var method: js.UndefOr[String] = js.native
  var onClientTimeout: js.UndefOr[js.Function1[/* request */ js.UndefOr[Request], Unit]] = js.native
  var onClose: js.UndefOr[js.Function1[/* response */ js.UndefOr[Response], Unit]] = js.native
  var onError: js.UndefOr[js.Function1[/* response */ js.UndefOr[Response], Unit]] = js.native
  var onFailureToReconnect: js.UndefOr[
    js.Function2[/* request */ js.UndefOr[Request], /* response */ js.UndefOr[Response], Unit]
  ] = js.native
  var onLocalMessage: js.UndefOr[js.Function1[/* request */ js.UndefOr[Request], Unit]] = js.native
  var onMessage: js.UndefOr[js.Function1[/* response */ Response, Unit]] = js.native
  var onMessagePublished: js.UndefOr[js.Function1[/* response */ js.UndefOr[Response], Unit]] = js.native
  var onOpen: js.UndefOr[js.Function1[/* response */ js.UndefOr[Response], Unit]] = js.native
  var onReconnect: js.UndefOr[
    js.Function2[/* request */ js.UndefOr[Request], /* response */ js.UndefOr[Response], Unit]
  ] = js.native
  var onReopen: js.UndefOr[
    js.Function2[/* request */ js.UndefOr[Request], /* response */ js.UndefOr[Response], Unit]
  ] = js.native
  var onTransportFailure: js.UndefOr[
    js.Function2[/* reason */ js.UndefOr[String], /* response */ js.UndefOr[Response], Unit]
  ] = js.native
  var pollingInterval: js.UndefOr[Double] = js.native
  var push: js.UndefOr[js.Function2[/* message */ String, /* dispatchUrl */ js.UndefOr[String], Unit]] = js.native
  var pushLocal: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.native
  var readResponsesHeaders: js.UndefOr[Boolean] = js.native
  var readyState: js.UndefOr[Double] = js.native
  var reconnect: js.UndefOr[Boolean] = js.native
  var reconnectInterval: js.UndefOr[Double] = js.native
  var requestCount: js.UndefOr[Double] = js.native
  var rewriteURL: js.UndefOr[Boolean] = js.native
  var shared: js.UndefOr[Boolean] = js.native
  var subscribe: js.UndefOr[js.Function1[/* options */ Request, Unit]] = js.native
  var suspend: js.UndefOr[Boolean] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var trackMessageLength: js.UndefOr[Boolean] = js.native
  var transport: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
  var uuid: js.UndefOr[String] = js.native
  var webSocketBinaryType: js.UndefOr[js.Any] = js.native
  var webSocketImpl: js.UndefOr[js.Any] = js.native
  var webSocketPathDelimiter: js.UndefOr[String] = js.native
  var webSocketUrl: js.UndefOr[String] = js.native
  var withCredentials: js.UndefOr[Boolean] = js.native
}

object Request {
  @scala.inline
  def apply(): Request = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Request]
  }
  @scala.inline
  implicit class RequestOps[Self <: Request] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAsync(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(js.undefined)
        ret
    }
    @scala.inline
    def withAttachHeadersAsQueryString(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachHeadersAsQueryString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachHeadersAsQueryString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachHeadersAsQueryString")(js.undefined)
        ret
    }
    @scala.inline
    def withCallback(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableDisconnect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDisconnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableDisconnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDisconnect")(js.undefined)
        ret
    }
    @scala.inline
    def withDisconnect(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disconnect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDisconnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disconnect")(js.undefined)
        ret
    }
    @scala.inline
    def withDispatchUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatchUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDispatchUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dispatchUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withDropHeaders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableProtocol(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableProtocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableProtocol")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableXDR(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableXDR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableXDR: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableXDR")(js.undefined)
        ret
    }
    @scala.inline
    def withExecute(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutExecute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(js.undefined)
        ret
    }
    @scala.inline
    def withExecuteCallbackBeforeReconnect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executeCallbackBeforeReconnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExecuteCallbackBeforeReconnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executeCallbackBeforeReconnect")(js.undefined)
        ret
    }
    @scala.inline
    def withFallbackMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallbackMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withFallbackTransport(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackTransport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallbackTransport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackTransport")(js.undefined)
        ret
    }
    @scala.inline
    def withGetUUID(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUUID")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetUUID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUUID")(js.undefined)
        ret
    }
    @scala.inline
    def withGetUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withLastIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withLastTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withLogLevel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxReconnectOnClose(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxReconnectOnClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxReconnectOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxReconnectOnClose")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRequest(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRequest")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxStreamingLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxStreamingLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxStreamingLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxStreamingLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageDelimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageDelimiter")(js.undefined)
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
    def withOnClientTimeout(value: /* request */ js.UndefOr[Request] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClientTimeout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClientTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClientTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClose(value: /* response */ js.UndefOr[Response] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnError(value: /* response */ js.UndefOr[Response] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onError")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFailureToReconnect(value: (/* request */ js.UndefOr[Request], /* response */ js.UndefOr[Response]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFailureToReconnect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnFailureToReconnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFailureToReconnect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnLocalMessage(value: /* request */ js.UndefOr[Request] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLocalMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnLocalMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLocalMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMessage(value: /* response */ Response => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMessagePublished(value: /* response */ js.UndefOr[Response] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMessagePublished")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMessagePublished: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMessagePublished")(js.undefined)
        ret
    }
    @scala.inline
    def withOnOpen(value: /* response */ js.UndefOr[Response] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReconnect(value: (/* request */ js.UndefOr[Request], /* response */ js.UndefOr[Response]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReconnect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnReconnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReconnect")(js.undefined)
        ret
    }
    @scala.inline
    def withOnReopen(value: (/* request */ js.UndefOr[Request], /* response */ js.UndefOr[Response]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReopen")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnReopen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onReopen")(js.undefined)
        ret
    }
    @scala.inline
    def withOnTransportFailure(value: (/* reason */ js.UndefOr[String], /* response */ js.UndefOr[Response]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransportFailure")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnTransportFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTransportFailure")(js.undefined)
        ret
    }
    @scala.inline
    def withPollingInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollingInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPollingInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pollingInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withPush(value: (/* message */ String, /* dispatchUrl */ js.UndefOr[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.undefined)
        ret
    }
    @scala.inline
    def withPushLocal(value: /* message */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushLocal")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPushLocal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pushLocal")(js.undefined)
        ret
    }
    @scala.inline
    def withReadResponsesHeaders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readResponsesHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadResponsesHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readResponsesHeaders")(js.undefined)
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
    def withReconnect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReconnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnect")(js.undefined)
        ret
    }
    @scala.inline
    def withReconnectInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReconnectInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reconnectInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestCount")(js.undefined)
        ret
    }
    @scala.inline
    def withRewriteURL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewriteURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRewriteURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewriteURL")(js.undefined)
        ret
    }
    @scala.inline
    def withShared(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shared")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShared: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shared")(js.undefined)
        ret
    }
    @scala.inline
    def withSubscribe(value: /* options */ Request => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribe")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSubscribe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscribe")(js.undefined)
        ret
    }
    @scala.inline
    def withSuspend(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuspend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suspend")(js.undefined)
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
    def withTrackMessageLength(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackMessageLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackMessageLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackMessageLength")(js.undefined)
        ret
    }
    @scala.inline
    def withTransport(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transport")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
    @scala.inline
    def withUuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uuid")(js.undefined)
        ret
    }
    @scala.inline
    def withWebSocketBinaryType(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webSocketBinaryType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebSocketBinaryType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webSocketBinaryType")(js.undefined)
        ret
    }
    @scala.inline
    def withWebSocketImpl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webSocketImpl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebSocketImpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webSocketImpl")(js.undefined)
        ret
    }
    @scala.inline
    def withWebSocketPathDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webSocketPathDelimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebSocketPathDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webSocketPathDelimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withWebSocketUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webSocketUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebSocketUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webSocketUrl")(js.undefined)
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

