package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDomainEntryRequest extends js.Object {
  /**
    * An array of key-value pairs containing information about your domain entries.
    */
  var domainEntry: DomainEntry = js.native
  /**
    * The name of the domain entry to delete.
    */
  var domainName: DomainName = js.native
}

object DeleteDomainEntryRequest {
  @scala.inline
  def apply(domainEntry: DomainEntry, domainName: DomainName): DeleteDomainEntryRequest = {
    val __obj = js.Dynamic.literal(domainEntry = domainEntry.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDomainEntryRequest]
  }
  @scala.inline
  implicit class DeleteDomainEntryRequestOps[Self <: DeleteDomainEntryRequest] (val x: Self) extends AnyVal {
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

