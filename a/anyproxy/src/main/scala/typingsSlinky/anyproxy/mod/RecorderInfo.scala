package typingsSlinky.anyproxy.mod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecorderInfo extends js.Object {
  var _id: Double = js.native
  var duration: Double | String = js.native
  var endTime: Double | String = js.native
  var host: String = js.native
  var id: Double = js.native
  var length: Double | String = js.native
  var method: String = js.native
  var mime: String = js.native
  var path: String = js.native
  var protocol: String = js.native
  var reqBody: js.Any = js.native
  // req
  var reqHeader: Record[String, String] = js.native
  var resHeader: (Record[String, String]) | String = js.native
  var startTime: Double = js.native
  // res
  var statusCode: Double | String = js.native
  var url: String = js.native
}

object RecorderInfo {
  @scala.inline
  def apply(
    _id: Double,
    duration: Double | String,
    endTime: Double | String,
    host: String,
    id: Double,
    length: Double | String,
    method: String,
    mime: String,
    path: String,
    protocol: String,
    reqBody: js.Any,
    reqHeader: Record[String, String],
    resHeader: (Record[String, String]) | String,
    startTime: Double,
    statusCode: Double | String,
    url: String
  ): RecorderInfo = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], endTime = endTime.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], reqBody = reqBody.asInstanceOf[js.Any], reqHeader = reqHeader.asInstanceOf[js.Any], resHeader = resHeader.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecorderInfo]
  }
  @scala.inline
  implicit class RecorderInfoOps[Self <: RecorderInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_id(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDuration(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndTime(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLength(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReqBody(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reqBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReqHeader(value: Record[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reqHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResHeader(value: (Record[String, String]) | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatusCode(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCode")(value.asInstanceOf[js.Any])
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

