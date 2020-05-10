package typingsSlinky.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetServiceResponse extends js.Object {
  /**
    * A complex type that contains information about the service.
    */
  var Service: js.UndefOr[typingsSlinky.awsSdk.servicediscoveryMod.Service] = js.native
}

object GetServiceResponse {
  @scala.inline
  def apply(): GetServiceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetServiceResponse]
  }
  @scala.inline
  implicit class GetServiceResponseOps[Self <: GetServiceResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withService(value: Service): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Service")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Service")(js.undefined)
        ret
    }
  }
  
}

