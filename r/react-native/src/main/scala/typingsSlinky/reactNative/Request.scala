package typingsSlinky.reactNative

import org.scalajs.dom.raw.Blob
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request
  extends Object
     with Body
     with RequestInfo {
  val credentials: RequestCredentials = js.native
  val headers: Headers = js.native
  val method: String = js.native
  val mode: RequestMode = js.native
  val referrer: String = js.native
  val url: String = js.native
}

object Request {
  @scala.inline
  def apply(
    arrayBuffer: () => js.Promise[js.typedarray.ArrayBuffer],
    blob: () => js.Promise[Blob],
    bodyUsed: Boolean,
    constructor: js.Function,
    credentials: RequestCredentials,
    formData: () => js.Promise[FormData],
    hasOwnProperty: PropertyKey => Boolean,
    headers: Headers,
    json: () => js.Promise[_],
    method: String,
    mode: RequestMode,
    propertyIsEnumerable: PropertyKey => Boolean,
    referrer: String,
    text: () => js.Promise[String],
    url: String
  ): Request = {
    val __obj = js.Dynamic.literal(arrayBuffer = js.Any.fromFunction0(arrayBuffer), blob = js.Any.fromFunction0(blob), bodyUsed = bodyUsed.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], credentials = credentials.asInstanceOf[js.Any], formData = js.Any.fromFunction0(formData), hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), headers = headers.asInstanceOf[js.Any], json = js.Any.fromFunction0(json), method = method.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), referrer = referrer.asInstanceOf[js.Any], text = js.Any.fromFunction0(text), url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  @scala.inline
  implicit class RequestOps[Self <: Request] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCredentials(value: RequestCredentials): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: Headers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMode(value: RequestMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferrer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrer")(value.asInstanceOf[js.Any])
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

