package typingsSlinky.hapi.mod

import typingsSlinky.hapi.AnonIsOriginMatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestInfo extends js.Object {
  /** the request preferred encoding. */
  var acceptEncoding: String = js.native
  /** request processing completion timestamp (0 is still processing). */
  var completed: Double = js.native
  /** if CORS is enabled for the route, contains the following: */
  var cors: AnonIsOriginMatch = js.native
  /** content of the HTTP 'Host' header (e.g. 'example.com:8080'). */
  var host: String = js.native
  /** the hostname part of the 'Host' header (e.g. 'example.com'). */
  var hostname: String = js.native
  /** a unique request identifier (using the format '{now}:{connection.info.id}:{5 digits counter}') */
  var id: String = js.native
  /** request reception timestamp. */
  var received: Double = js.native
  /** content of the HTTP 'Referrer' (or 'Referer') header. */
  var referrer: String = js.native
  /** remote client IP address. */
  var remoteAddress: String = js.native
  /** remote client port. */
  var remotePort: String = js.native
  /** request response timestamp (0 is not responded yet). */
  var responded: Double = js.native
}

object RequestInfo {
  @scala.inline
  def apply(
    acceptEncoding: String,
    completed: Double,
    cors: AnonIsOriginMatch,
    host: String,
    hostname: String,
    id: String,
    received: Double,
    referrer: String,
    remoteAddress: String,
    remotePort: String,
    responded: Double
  ): RequestInfo = {
    val __obj = js.Dynamic.literal(acceptEncoding = acceptEncoding.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], cors = cors.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], received = received.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], remoteAddress = remoteAddress.asInstanceOf[js.Any], remotePort = remotePort.asInstanceOf[js.Any], responded = responded.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestInfo]
  }
  @scala.inline
  implicit class RequestInfoOps[Self <: RequestInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptEncoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCompleted(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCors(value: AnonIsOriginMatch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHostname(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostname")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReceived(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("received")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferrer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemoteAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remoteAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemotePort(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remotePort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponded(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responded")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

