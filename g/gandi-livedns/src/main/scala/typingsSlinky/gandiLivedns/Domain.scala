package typingsSlinky.gandiLivedns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Domain extends js.Object {
  var fqdn: String = js.native
  var zone_uuid: String = js.native
}

object Domain {
  @scala.inline
  def apply(fqdn: String, zone_uuid: String): Domain = {
    val __obj = js.Dynamic.literal(fqdn = fqdn.asInstanceOf[js.Any], zone_uuid = zone_uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Domain]
  }
  @scala.inline
  implicit class DomainOps[Self <: Domain] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFqdn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fqdn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withZone_uuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zone_uuid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

