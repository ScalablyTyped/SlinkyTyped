package typingsSlinky.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDomainResponse extends js.Object {
  var DomainStatus: js.UndefOr[typingsSlinky.awsSdk.cloudsearchMod.DomainStatus] = js.native
}

object DeleteDomainResponse {
  @scala.inline
  def apply(): DeleteDomainResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDomainResponse]
  }
  @scala.inline
  implicit class DeleteDomainResponseOps[Self <: DeleteDomainResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainStatus(value: DomainStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DomainStatus")(js.undefined)
        ret
    }
  }
  
}

