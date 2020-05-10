package typingsSlinky.reactNativeFirebase.mod.RNFirebase.perf

import typingsSlinky.reactNativeFirebase.reactNativeFirebaseBooleans.`false`
import typingsSlinky.reactNativeFirebase.reactNativeFirebaseBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpMetric extends js.Object {
  /**
    * Return an attribute by name, or null if it does not exist.
    */
  def getAttribute(attribute: String): js.Promise[String | Null] = js.native
  /**
    * Return an object of key-value attributes.
    */
  def getAttributes(): js.Promise[js.Object] = js.native
  /**
    * Set an attribute. Returns true if it was set, false if it was not.
    */
  def putAttribute(attribute: String, value: String): js.Promise[`true` | `false`] = js.native
  /**
    * Remove an attribute by name.
    */
  def removeAttribute(attribute: String): js.Promise[Null] = js.native
  /**
    * Set the request HTTP response code.
    */
  def setHttpResponseCode(code: Double): js.Promise[Null] = js.native
  /**
    * Set the request payload size, in bytes.
    */
  def setRequestPayloadSize(bytes: Double): js.Promise[Null] = js.native
  /**
    * Set the response content type.
    */
  def setResponseContentType(`type`: String): js.Promise[Null] = js.native
  /**
    * Set the response payload size, in bytes.
    */
  def setResponsePayloadSize(bytes: Double): js.Promise[Null] = js.native
  /**
    * Start a HttpMetric instance.
    */
  def start(): js.Promise[Null] = js.native
  /**
    * Stop a HttpMetric instance.
    */
  def stop(): js.Promise[Null] = js.native
}

object HttpMetric {
  @scala.inline
  def apply(
    getAttribute: String => js.Promise[String | Null],
    getAttributes: () => js.Promise[js.Object],
    putAttribute: (String, String) => js.Promise[`true` | `false`],
    removeAttribute: String => js.Promise[Null],
    setHttpResponseCode: Double => js.Promise[Null],
    setRequestPayloadSize: Double => js.Promise[Null],
    setResponseContentType: String => js.Promise[Null],
    setResponsePayloadSize: Double => js.Promise[Null],
    start: () => js.Promise[Null],
    stop: () => js.Promise[Null]
  ): HttpMetric = {
    val __obj = js.Dynamic.literal(getAttribute = js.Any.fromFunction1(getAttribute), getAttributes = js.Any.fromFunction0(getAttributes), putAttribute = js.Any.fromFunction2(putAttribute), removeAttribute = js.Any.fromFunction1(removeAttribute), setHttpResponseCode = js.Any.fromFunction1(setHttpResponseCode), setRequestPayloadSize = js.Any.fromFunction1(setRequestPayloadSize), setResponseContentType = js.Any.fromFunction1(setResponseContentType), setResponsePayloadSize = js.Any.fromFunction1(setResponsePayloadSize), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[HttpMetric]
  }
  @scala.inline
  implicit class HttpMetricOps[Self <: HttpMetric] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAttribute(value: String => js.Promise[String | Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttribute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetAttributes(value: () => js.Promise[js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAttributes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPutAttribute(value: (String, String) => js.Promise[`true` | `false`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("putAttribute")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveAttribute(value: String => js.Promise[Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeAttribute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetHttpResponseCode(value: Double => js.Promise[Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHttpResponseCode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetRequestPayloadSize(value: Double => js.Promise[Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setRequestPayloadSize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetResponseContentType(value: String => js.Promise[Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setResponseContentType")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetResponsePayloadSize(value: Double => js.Promise[Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setResponsePayloadSize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStart(value: () => js.Promise[Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withStop(value: () => js.Promise[Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stop")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

