package typingsSlinky.logfmt.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Contentlength extends js.Object {
  var content_length: js.UndefOr[String] = js.native
  var content_type: js.UndefOr[String] = js.native
  var ip: String = js.native
  var method: String = js.native
  var path: String = js.native
  var request_id: js.UndefOr[String] = js.native
  var status: Double = js.native
  var time: String = js.native
}

object Contentlength {
  @scala.inline
  def apply(ip: String, method: String, path: String, status: Double, time: String): Contentlength = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Contentlength]
  }
  @scala.inline
  implicit class ContentlengthOps[Self <: Contentlength] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent_length(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent_length: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_length")(js.undefined)
        ret
    }
    @scala.inline
    def withContent_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content_type")(js.undefined)
        ret
    }
    @scala.inline
    def withRequest_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequest_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request_id")(js.undefined)
        ret
    }
  }
  
}

