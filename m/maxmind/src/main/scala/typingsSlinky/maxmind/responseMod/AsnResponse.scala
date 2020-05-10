package typingsSlinky.maxmind.responseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsnResponse extends Response {
  val autonomous_system_number: Double = js.native
  val autonomous_system_organization: String = js.native
  var ip_address: js.UndefOr[String] = js.native
}

object AsnResponse {
  @scala.inline
  def apply(autonomous_system_number: Double, autonomous_system_organization: String): AsnResponse = {
    val __obj = js.Dynamic.literal(autonomous_system_number = autonomous_system_number.asInstanceOf[js.Any], autonomous_system_organization = autonomous_system_organization.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsnResponse]
  }
  @scala.inline
  implicit class AsnResponseOps[Self <: AsnResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutonomous_system_number(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autonomous_system_number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutonomous_system_organization(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autonomous_system_organization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIp_address(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip_address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIp_address: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip_address")(js.undefined)
        ret
    }
  }
  
}

