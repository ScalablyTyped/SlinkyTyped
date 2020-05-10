package typingsSlinky.requestIp.mod

import typingsSlinky.node.httpMod.IncomingHttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestHeaders extends IncomingHttpHeaders {
  var `forwarded-for`: js.UndefOr[String] = js.native
  var `x-client-ip`: js.UndefOr[String] = js.native
  var `x-cluster-client-ip`: js.UndefOr[String] = js.native
  var `x-forwarded`: js.UndefOr[String] = js.native
  var `x-forwarded-for`: js.UndefOr[String] = js.native
  var `x-real-ip`: js.UndefOr[String] = js.native
}

object RequestHeaders {
  @scala.inline
  def apply(): RequestHeaders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestHeaders]
  }
  @scala.inline
  implicit class RequestHeadersOps[Self <: RequestHeaders] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withForwarded-for`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwarded-for")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutForwarded-for`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwarded-for")(js.undefined)
        ret
    }
    @scala.inline
    def `withX-client-ip`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-client-ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutX-client-ip`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-client-ip")(js.undefined)
        ret
    }
    @scala.inline
    def `withX-cluster-client-ip`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-cluster-client-ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutX-cluster-client-ip`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-cluster-client-ip")(js.undefined)
        ret
    }
    @scala.inline
    def `withX-forwarded`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-forwarded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutX-forwarded`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-forwarded")(js.undefined)
        ret
    }
    @scala.inline
    def `withX-forwarded-for`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-forwarded-for")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutX-forwarded-for`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-forwarded-for")(js.undefined)
        ret
    }
    @scala.inline
    def `withX-real-ip`(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-real-ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutX-real-ip`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x-real-ip")(js.undefined)
        ret
    }
  }
  
}

