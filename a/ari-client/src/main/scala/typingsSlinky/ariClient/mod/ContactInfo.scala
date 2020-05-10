package typingsSlinky.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContactInfo extends js.Object {
  var aor: String = js.native
  var contact_status: String = js.native
  var roundtrip_usec: js.UndefOr[String] = js.native
  /* Properties */
  var uri: String = js.native
}

object ContactInfo {
  @scala.inline
  def apply(aor: String, contact_status: String, uri: String): ContactInfo = {
    val __obj = js.Dynamic.literal(aor = aor.asInstanceOf[js.Any], contact_status = contact_status.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactInfo]
  }
  @scala.inline
  implicit class ContactInfoOps[Self <: ContactInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContact_status(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contact_status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoundtrip_usec(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundtrip_usec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoundtrip_usec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundtrip_usec")(js.undefined)
        ret
    }
  }
  
}

