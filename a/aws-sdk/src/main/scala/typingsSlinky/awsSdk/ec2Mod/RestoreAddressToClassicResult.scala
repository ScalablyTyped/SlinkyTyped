package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreAddressToClassicResult extends js.Object {
  /**
    * The Elastic IP address.
    */
  var PublicIp: js.UndefOr[String] = js.native
  /**
    * The move status for the IP address.
    */
  var Status: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.Status] = js.native
}

object RestoreAddressToClassicResult {
  @scala.inline
  def apply(): RestoreAddressToClassicResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreAddressToClassicResult]
  }
  @scala.inline
  implicit class RestoreAddressToClassicResultOps[Self <: RestoreAddressToClassicResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPublicIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicIp")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: Status): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

