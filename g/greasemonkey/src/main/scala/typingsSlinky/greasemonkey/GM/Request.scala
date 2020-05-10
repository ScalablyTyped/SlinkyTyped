package typingsSlinky.greasemonkey.GM

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.greasemonkey.AnonOnabort
import typingsSlinky.greasemonkey.greasemonkeyStrings.CONNECT
import typingsSlinky.greasemonkey.greasemonkeyStrings.DELETE
import typingsSlinky.greasemonkey.greasemonkeyStrings.GET
import typingsSlinky.greasemonkey.greasemonkeyStrings.HEAD
import typingsSlinky.greasemonkey.greasemonkeyStrings.OPTIONS
import typingsSlinky.greasemonkey.greasemonkeyStrings.PATCH
import typingsSlinky.greasemonkey.greasemonkeyStrings.POST
import typingsSlinky.greasemonkey.greasemonkeyStrings.PUT
import typingsSlinky.greasemonkey.greasemonkeyStrings.TRACE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request[TContext] extends js.Object {
  /**
    * When true, the data is sent as a Blob
    * @default false
    */
  var binary: js.UndefOr[Boolean] = js.native
  /**
    * Any object (Compatibility: 1.10+). This object will also be the
    * context property of the Response Object.
    */
  var context: js.UndefOr[TContext] = js.native
  /**
    * Data to send in the request body. Usually for POST method requests.
    * If the data field contains form-encoded data, you usually must also
    * set the header `'Content-Type': 'application/x-www-form-urlencoded'`
    * in the `headers` field.
    */
  var data: js.UndefOr[String] = js.native
  /** A set of headers to include in the request */
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  /** String type of HTTP request to make (E.G. "GET", "POST") */
  var method: GET | POST | PUT | DELETE | PATCH | HEAD | TRACE | OPTIONS | CONNECT = js.native
  // Event handlers
  /** Will be called when the request is aborted */
  var onabort: js.UndefOr[js.Function1[/* response */ Response[TContext], Unit]] = js.native
  /** Will be called if an error occurs while processing the request */
  var onerror: js.UndefOr[js.Function1[/* response */ Response[TContext], Unit]] = js.native
  /** Will be called when the request has completed successfully */
  var onload: js.UndefOr[js.Function1[/* response */ Response[TContext], Unit]] = js.native
  /** Will be called when the request progress changes */
  var onprogress: js.UndefOr[js.Function1[/* response */ ProgressResponse[TContext], Unit]] = js.native
  /** Will be called repeatedly while the request is in progress */
  var onreadystatechange: js.UndefOr[js.Function1[/* response */ Response[TContext], Unit]] = js.native
  /** Will be called if/when the request times out */
  var ontimeout: js.UndefOr[js.Function1[/* response */ Response[TContext], Unit]] = js.native
  /**
    * A MIME type to specify with the request (e.g.
    * "text/html; charset=ISO-8859-1")
    */
  var overrideMimeType: js.UndefOr[String] = js.native
  /** Password to use for authentication purposes */
  var password: js.UndefOr[String] = js.native
  /**
    * When `true`, this is a synchronous request.
    * Be careful: The entire Firefox UI will be locked and frozen until the
    * request completes.In this mode, more data will be available in the
    * return value.
    */
  var synchronous: js.UndefOr[Boolean] = js.native
  /**
    * The number of milliseconds to wait before terminating the call. Zero
    * (the default) means wait forever.
    */
  var timeout: js.UndefOr[Double] = js.native
  /**
    * Object containing optional function callbacks to monitor the upload
    * of data.
    */
  var upload: js.UndefOr[AnonOnabort[TContext]] = js.native
  // Fields
  /**
    * The URL to make the request to. Must be an absolute URL, beginning
    * with the scheme. May be relative to the current page.
    */
  var url: String = js.native
  /** User name to use for authentication purposes. */
  var user: js.UndefOr[String] = js.native
}

object Request {
  @scala.inline
  def apply[TContext](method: GET | POST | PUT | DELETE | PATCH | HEAD | TRACE | OPTIONS | CONNECT, url: String): Request[TContext] = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request[TContext]]
  }
  @scala.inline
  implicit class RequestOps[Self[tcontext] <: Request[tcontext], TContext] (val x: Self[TContext]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TContext] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TContext]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TContext] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TContext] with Other]
    @scala.inline
    def withMethod(value: GET | POST | PUT | DELETE | PATCH | HEAD | TRACE | OPTIONS | CONNECT): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBinary(value: Boolean): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinary: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binary")(js.undefined)
        ret
    }
    @scala.inline
    def withContext(value: TContext): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContext: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("context")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: String): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: StringDictionary[String]): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withOnabort(value: /* response */ Response[TContext] => Unit): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onabort")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnabort: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onabort")(js.undefined)
        ret
    }
    @scala.inline
    def withOnerror(value: /* response */ Response[TContext] => Unit): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnerror: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(js.undefined)
        ret
    }
    @scala.inline
    def withOnload(value: /* response */ Response[TContext] => Unit): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onload")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnload: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onload")(js.undefined)
        ret
    }
    @scala.inline
    def withOnprogress(value: /* response */ ProgressResponse[TContext] => Unit): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onprogress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnprogress: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onprogress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnreadystatechange(value: /* response */ Response[TContext] => Unit): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onreadystatechange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnreadystatechange: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onreadystatechange")(js.undefined)
        ret
    }
    @scala.inline
    def withOntimeout(value: /* response */ Response[TContext] => Unit): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontimeout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOntimeout: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrideMimeType(value: String): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideMimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrideMimeType: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideMimeType")(js.undefined)
        ret
    }
    @scala.inline
    def withPassword(value: String): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassword: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(js.undefined)
        ret
    }
    @scala.inline
    def withSynchronous(value: Boolean): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synchronous")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSynchronous: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synchronous")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withUpload(value: AnonOnabort[TContext]): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpload: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload")(js.undefined)
        ret
    }
    @scala.inline
    def withUser(value: String): Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUser: Self[TContext] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(js.undefined)
        ret
    }
  }
  
}

