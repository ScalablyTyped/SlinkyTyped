package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceTypeDetail extends js.Object {
  /**
    * The type of service.
    */
  var ServiceType: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.ServiceType] = js.native
}

object ServiceTypeDetail {
  @scala.inline
  def apply(): ServiceTypeDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceTypeDetail]
  }
  @scala.inline
  implicit class ServiceTypeDetailOps[Self <: ServiceTypeDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withServiceType(value: ServiceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceType")(js.undefined)
        ret
    }
  }
  
}

