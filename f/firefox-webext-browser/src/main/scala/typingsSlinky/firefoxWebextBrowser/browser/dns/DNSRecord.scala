package typingsSlinky.firefoxWebextBrowser.browser.dns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* dns types */
/** An object encapsulating a DNS Record. */
@js.native
trait DNSRecord extends js.Object {
  var addresses: js.Array[String] = js.native
  /**
    * The canonical hostname for this record. this value is empty if the record was not fetched with the
    * 'canonical_name' flag.
    */
  var canonicalName: js.UndefOr[String] = js.native
  /** Record retreived with TRR. */
  var isTRR: String = js.native
}

object DNSRecord {
  @scala.inline
  def apply(addresses: js.Array[String], isTRR: String): DNSRecord = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], isTRR = isTRR.asInstanceOf[js.Any])
    __obj.asInstanceOf[DNSRecord]
  }
  @scala.inline
  implicit class DNSRecordOps[Self <: DNSRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddresses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addresses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsTRR(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTRR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCanonicalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canonicalName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCanonicalName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("canonicalName")(js.undefined)
        ret
    }
  }
  
}

