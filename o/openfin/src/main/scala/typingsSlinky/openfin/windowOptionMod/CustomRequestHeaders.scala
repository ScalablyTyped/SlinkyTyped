package typingsSlinky.openfin.windowOptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomRequestHeaders extends js.Object {
  var headers: js.Array[_] = js.native
  var urlPatterns: js.Array[String] = js.native
}

object CustomRequestHeaders {
  @scala.inline
  def apply(headers: js.Array[_], urlPatterns: js.Array[String]): CustomRequestHeaders = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], urlPatterns = urlPatterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomRequestHeaders]
  }
  @scala.inline
  implicit class CustomRequestHeadersOps[Self <: CustomRequestHeaders] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeaders(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrlPatterns(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlPatterns")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

