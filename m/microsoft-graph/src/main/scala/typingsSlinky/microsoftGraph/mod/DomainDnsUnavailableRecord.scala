package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainDnsUnavailableRecord extends DomainDnsRecord {
  // Provides the reason why the DomainDnsUnavailableRecord entity is returned.
  var description: js.UndefOr[String] = js.native
}

object DomainDnsUnavailableRecord {
  @scala.inline
  def apply(): DomainDnsUnavailableRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainDnsUnavailableRecord]
  }
  @scala.inline
  implicit class DomainDnsUnavailableRecordOps[Self <: DomainDnsUnavailableRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
  }
  
}

