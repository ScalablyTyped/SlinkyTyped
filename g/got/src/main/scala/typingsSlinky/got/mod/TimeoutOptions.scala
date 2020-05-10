package typingsSlinky.got.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains properties to constrain the duration of each phase of the request lifecycle.
  *
  * @see https://github.com/sindresorhus/got#timeout
  */
@js.native
trait TimeoutOptions extends js.Object {
  /**
    * Starts when `lookup` completes (or when the socket is assigned if lookup does not apply
    * to the request) and ends when the socket is connected.
    */
  var connect: js.UndefOr[Double] = js.native
  /**
    * Starts when a socket is assigned and ends when the hostname has been resolved. Does not
    * apply when using a Unix domain socket.
    */
  var lookup: js.UndefOr[Double] = js.native
  /**
    * Starts when the request is initiated and ends when the response's end event fires.
    */
  var request: js.UndefOr[Double] = js.native
  /**
    * Starts when the request has been written to the socket and ends when the response headers
    * are received.
    */
  var response: js.UndefOr[Double] = js.native
  /**
    * Starts when `connect` completes and ends when the handshaking process completes (HTTPS
    * only).
    */
  var secureConnect: js.UndefOr[Double] = js.native
  /**
    * Starts when the socket is connected and ends with the request has been written to the
    * socket.
    */
  var send: js.UndefOr[Double] = js.native
  /**
    * Starts when the socket is connected. See [request.setTimeout](https://nodejs.org/api/http.html#http_request_settimeout_timeout_callback).
    */
  var socket: js.UndefOr[Double] = js.native
}

object TimeoutOptions {
  @scala.inline
  def apply(): TimeoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeoutOptions]
  }
  @scala.inline
  implicit class TimeoutOptionsOps[Self <: TimeoutOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnect(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connect")(js.undefined)
        ret
    }
    @scala.inline
    def withLookup(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLookup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookup")(js.undefined)
        ret
    }
    @scala.inline
    def withRequest(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request")(js.undefined)
        ret
    }
    @scala.inline
    def withResponse(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response")(js.undefined)
        ret
    }
    @scala.inline
    def withSecureConnect(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureConnect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecureConnect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secureConnect")(js.undefined)
        ret
    }
    @scala.inline
    def withSend(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send")(js.undefined)
        ret
    }
    @scala.inline
    def withSocket(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSocket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socket")(js.undefined)
        ret
    }
  }
  
}

