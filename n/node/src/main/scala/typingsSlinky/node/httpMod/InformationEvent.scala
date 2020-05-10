package typingsSlinky.node.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InformationEvent extends js.Object {
  var headers: IncomingHttpHeaders = js.native
  var httpVersion: String = js.native
  var httpVersionMajor: Double = js.native
  var httpVersionMinor: Double = js.native
  var rawHeaders: js.Array[String] = js.native
  var statusCode: Double = js.native
  var statusMessage: String = js.native
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
    def withHeaders(value: IncomingHttpHeaders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttpVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttpVersionMajor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpVersionMajor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttpVersionMinor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpVersionMinor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRawHeaders(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusMessage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

