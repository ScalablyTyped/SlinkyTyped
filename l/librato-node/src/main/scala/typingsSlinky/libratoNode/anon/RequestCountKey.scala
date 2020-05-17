package typingsSlinky.libratoNode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestCountKey extends js.Object {
  var requestCountKey: js.UndefOr[String] = js.native
  var responseTimeKey: js.UndefOr[String] = js.native
  var statusCodeKey: js.UndefOr[String] = js.native
}

object RequestCountKey {
  @scala.inline
  def apply(): RequestCountKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestCountKey]
  }
  @scala.inline
  implicit class RequestCountKeyOps[Self <: RequestCountKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRequestCountKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestCountKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestCountKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestCountKey")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseTimeKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseTimeKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseTimeKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseTimeKey")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusCodeKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCodeKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusCodeKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statusCodeKey")(js.undefined)
        ret
    }
  }
  
}

