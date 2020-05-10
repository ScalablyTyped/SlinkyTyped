package typingsSlinky.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainTransferability extends js.Object {
  var Transferable: js.UndefOr[typingsSlinky.awsSdk.route53domainsMod.Transferable] = js.native
}

object DomainTransferability {
  @scala.inline
  def apply(): DomainTransferability = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainTransferability]
  }
  @scala.inline
  implicit class DomainTransferabilityOps[Self <: DomainTransferability] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransferable(value: Transferable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Transferable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransferable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Transferable")(js.undefined)
        ret
    }
  }
  
}

