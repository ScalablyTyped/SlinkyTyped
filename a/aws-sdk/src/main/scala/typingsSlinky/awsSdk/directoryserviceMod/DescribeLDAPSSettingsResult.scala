package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLDAPSSettingsResult extends js.Object {
  /**
    * Information about LDAP security for the specified directory, including status of enablement, state last updated date time, and the reason for the state.
    */
  var LDAPSSettingsInfo: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.LDAPSSettingsInfo] = js.native
  /**
    * The next token used to retrieve the LDAPS settings if the number of setting types exceeds page limit and there is another page.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.NextToken] = js.native
}

object DescribeLDAPSSettingsResult {
  @scala.inline
  def apply(): DescribeLDAPSSettingsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLDAPSSettingsResult]
  }
  @scala.inline
  implicit class DescribeLDAPSSettingsResultOps[Self <: DescribeLDAPSSettingsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLDAPSSettingsInfo(value: LDAPSSettingsInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LDAPSSettingsInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLDAPSSettingsInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LDAPSSettingsInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

