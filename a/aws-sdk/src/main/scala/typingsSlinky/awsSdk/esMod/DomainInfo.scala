package typingsSlinky.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainInfo extends js.Object {
  /**
    *  Specifies the DomainName.
    */
  var DomainName: js.UndefOr[typingsSlinky.awsSdk.esMod.DomainName] = js.native
}

object DomainInfo {
  @scala.inline
  def apply(): DomainInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainInfo]
  }
  @scala.inline
  implicit class DomainInfoOps[Self <: DomainInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainName(value: DomainName): Self = {
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
  }
  
}

