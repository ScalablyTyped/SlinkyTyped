package typingsSlinky.openapiFactory.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpMethodOptions extends js.Object {
  var rawBody: js.UndefOr[Boolean] = js.native
}

object HttpMethodOptions {
  @scala.inline
  def apply(): HttpMethodOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpMethodOptions]
  }
  @scala.inline
  implicit class HttpMethodOptionsOps[Self <: HttpMethodOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRawBody(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRawBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawBody")(js.undefined)
        ret
    }
  }
  
}

