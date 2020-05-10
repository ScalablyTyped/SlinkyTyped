package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDomainEntryRequest extends js.Object {
  /**
    * An array of key-value pairs containing information about the domain entry.
    */
  var domainEntry: DomainEntry = js.native
  /**
    * The name of the domain recordset to update.
    */
  var domainName: DomainName = js.native
}

object UpdateDomainEntryRequest {
  @scala.inline
  def apply(domainEntry: DomainEntry, domainName: DomainName): UpdateDomainEntryRequest = {
    val __obj = js.Dynamic.literal(domainEntry = domainEntry.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDomainEntryRequest]
  }
  @scala.inline
  implicit class UpdateDomainEntryRequestOps[Self <: UpdateDomainEntryRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainEntry(value: DomainEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainEntry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomainName(value: DomainName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

