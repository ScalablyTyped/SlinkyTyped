package typingsSlinky.node.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InformationEvent extends js.Object {
  var headers: IncomingHttpHeaders
  var httpVersion: String
  var httpVersionMajor: Double
  var httpVersionMinor: Double
  var rawHeaders: js.Array[String]
  var statusCode: Double
  var statusMessage: String
}

object InformationEvent {
  @scala.inline
  def apply(
    headers: IncomingHttpHeaders,
    httpVersion: String,
    httpVersionMajor: Double,
    httpVersionMinor: Double,
    rawHeaders: js.Array[String],
    statusCode: Double,
    statusMessage: String
  ): InformationEvent = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], httpVersion = httpVersion.asInstanceOf[js.Any], httpVersionMajor = httpVersionMajor.asInstanceOf[js.Any], httpVersionMinor = httpVersionMinor.asInstanceOf[js.Any], rawHeaders = rawHeaders.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[InformationEvent]
  }
  @scala.inline
  implicit class InformationEventOps[Self <: InformationEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHeaders(value: IncomingHttpHeaders): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setHttpVersion(value: String): Self = this.set("httpVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setHttpVersionMajor(value: Double): Self = this.set("httpVersionMajor", value.asInstanceOf[js.Any])
    @scala.inline
    def setHttpVersionMinor(value: Double): Self = this.set("httpVersionMinor", value.asInstanceOf[js.Any])
    @scala.inline
    def setRawHeaders(value: js.Array[String]): Self = this.set("rawHeaders", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusMessage(value: String): Self = this.set("statusMessage", value.asInstanceOf[js.Any])
  }
  
}

