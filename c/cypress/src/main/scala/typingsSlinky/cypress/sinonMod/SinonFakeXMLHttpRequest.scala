package typingsSlinky.cypress.sinonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SinonFakeXMLHttpRequest extends js.Object {
  /**
    * Whether or not the request is asynchronous.
    */
  var async: Boolean = js.native
  /**
    * The request method as a string.
    */
  var method: String = js.native
  /**
    * Password, if any.
    */
  var password: String = js.native
  /**
    * The request body
    */
  var requestBody: String = js.native
  /**
    * An object of all request headers, i.e.:
    */
  var requestHeaders: js.Any = js.native
  /**
    * When using respond, this property is populated with a parsed document if response headers indicate as much (see the spec)
    */
  var responseXML: Document = js.native
  /**
    * The request’s status code.
    * undefined if the request has not been handled (see respond below)
    */
  var status: Double = js.native
  /**
    * Only populated if the respond method is called (see below).
    */
  var statusText: String = js.native
  var upload: SinonFakeUploadProgress = js.native
  // Properties
  /**
    * The URL set on the request object.
    */
  var url: String = js.native
  /**
    * Username, if any.
    */
  var username: String = js.native
  var withCredentials: Boolean = js.native
  def autoRespond(ms: Double): Unit = js.native
  /**
    * Simulates a network error on the request. The onerror handler will be called and the status will be 0.
    */
  def error(): Unit = js.native
  /**
    * All response headers as an object.
    */
  def getAllResponseHeaders(): js.Any = js.native
  /**
    * The value of the given response header, if the request has been responded to (see respond).
    * @param header
    */
  def getResponseHeader(header: String): String = js.native
  def onerror(): Unit = js.native
  /**
    * Calls the above three methods.
    */
  def respond(status: Double, headers: js.Any, body: String): Unit = js.native
  /**
    * Sets the respond body, updates the readyState property and fires onreadystatechange.
    * Additionally, populates responseXML with a parsed document if response headers indicate as much.
    */
  def setResponseBody(body: String): Unit = js.native
  // Methods
  /**
    * Sets response headers (e.g. { "Content-Type": "text/html", ... }, updates the readyState property and fires onreadystatechange.
    * @param headers
    */
  def setResponseHeaders(headers: js.Any): Unit = js.native
}

object SinonFakeXMLHttpRequest {
  @scala.inline
  def apply(
    async: Boolean,
    autoRespond: Double => Unit,
    error: () => Unit,
    getAllResponseHeaders: () => js.Any,
    getResponseHeader: String => String,
    method: String,
    onerror: () => Unit,
    password: String,
    requestBody: String,
    requestHeaders: js.Any,
    respond: (Double, js.Any, String) => Unit,
    responseXML: Document,
    setResponseBody: String => Unit,
    setResponseHeaders: js.Any => Unit,
    status: Double,
    statusText: String,
    upload: SinonFakeUploadProgress,
    url: String,
    username: String,
    withCredentials: Boolean
  ): SinonFakeXMLHttpRequest = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], autoRespond = js.Any.fromFunction1(autoRespond), error = js.Any.fromFunction0(error), getAllResponseHeaders = js.Any.fromFunction0(getAllResponseHeaders), getResponseHeader = js.Any.fromFunction1(getResponseHeader), method = method.asInstanceOf[js.Any], onerror = js.Any.fromFunction0(onerror), password = password.asInstanceOf[js.Any], requestBody = requestBody.asInstanceOf[js.Any], requestHeaders = requestHeaders.asInstanceOf[js.Any], respond = js.Any.fromFunction3(respond), responseXML = responseXML.asInstanceOf[js.Any], setResponseBody = js.Any.fromFunction1(setResponseBody), setResponseHeaders = js.Any.fromFunction1(setResponseHeaders), status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any], upload = upload.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], withCredentials = withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[SinonFakeXMLHttpRequest]
  }
  @scala.inline
  implicit class SinonFakeXMLHttpRequestOps[Self <: SinonFakeXMLHttpRequest] (val x: Self) extends AnyVal {
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
    def withAutoRespond(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoRespond")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withError(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAllResponseHeaders(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllResponseHeaders")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetResponseHeader(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getResponseHeader")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnerror(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestBody(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequestHeaders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRespond(value: (Double, js.Any, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("respond")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withResponseXML(value: Document): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseXML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetResponseBody(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setResponseBody")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetResponseHeaders(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setResponseHeaders")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpload(value: SinonFakeUploadProgress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsername(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWithCredentials(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCredentials")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

