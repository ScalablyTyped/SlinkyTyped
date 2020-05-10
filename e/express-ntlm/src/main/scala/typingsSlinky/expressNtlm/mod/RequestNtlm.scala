package typingsSlinky.expressNtlm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestNtlm extends js.Object {
  var DomainName: js.UndefOr[String] = js.native
  var UserName: js.UndefOr[String] = js.native
  var Workstation: js.UndefOr[String] = js.native
}

object RequestNtlm {
  @scala.inline
  def apply(): RequestNtlm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestNtlm]
  }
  @scala.inline
  implicit class RequestNtlmOps[Self <: RequestNtlm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainName")(js.undefined)
        ret
    }
    @scala.inline
    def withUserName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserName")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkstation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Workstation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkstation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Workstation")(js.undefined)
        ret
    }
  }
  
}

