package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkAccessConfiguration extends js.Object {
  /**
    * The resource identifier of the elastic network interface that is attached to instances in your VPC. All network interfaces have the eni-xxxxxxxx resource identifier.
    */
  var EniId: js.UndefOr[String] = js.native
  /**
    * The private IP address of the elastic network interface that is attached to instances in your VPC.
    */
  var EniPrivateIpAddress: js.UndefOr[String] = js.native
}

object NetworkAccessConfiguration {
  @scala.inline
  def apply(): NetworkAccessConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkAccessConfiguration]
  }
  @scala.inline
  implicit class NetworkAccessConfigurationOps[Self <: NetworkAccessConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEniId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EniId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEniId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EniId")(js.undefined)
        ret
    }
    @scala.inline
    def withEniPrivateIpAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EniPrivateIpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEniPrivateIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EniPrivateIpAddress")(js.undefined)
        ret
    }
  }
  
}

