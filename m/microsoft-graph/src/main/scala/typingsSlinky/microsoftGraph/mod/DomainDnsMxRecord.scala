package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainDnsMxRecord extends DomainDnsRecord {
  // Value used when configuring the answer/destination/value of the MX record at the DNS host.
  var mailExchange: js.UndefOr[String] = js.native
  // Value used when configuring the Preference/Priority property of the MX record at the DNS host.
  var preference: js.UndefOr[Double] = js.native
}

object DomainDnsMxRecord {
  @scala.inline
  def apply(): DomainDnsMxRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainDnsMxRecord]
  }
  @scala.inline
  implicit class DomainDnsMxRecordOps[Self <: DomainDnsMxRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMailExchange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mailExchange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMailExchange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mailExchange")(js.undefined)
        ret
    }
    @scala.inline
    def withPreference(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preference")(js.undefined)
        ret
    }
  }
  
}

