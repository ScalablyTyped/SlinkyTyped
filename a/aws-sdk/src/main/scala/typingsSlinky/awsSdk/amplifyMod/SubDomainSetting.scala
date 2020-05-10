package typingsSlinky.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubDomainSetting extends js.Object {
  /**
    *  Branch name setting for the Subdomain. 
    */
  var branchName: BranchName = js.native
  /**
    *  Prefix setting for the Subdomain. 
    */
  var prefix: DomainPrefix = js.native
}

object SubDomainSetting {
  @scala.inline
  def apply(branchName: BranchName, prefix: DomainPrefix): SubDomainSetting = {
    val __obj = js.Dynamic.literal(branchName = branchName.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubDomainSetting]
  }
  @scala.inline
  implicit class SubDomainSettingOps[Self <: SubDomainSetting] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBranchName(value: BranchName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branchName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefix(value: DomainPrefix): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

