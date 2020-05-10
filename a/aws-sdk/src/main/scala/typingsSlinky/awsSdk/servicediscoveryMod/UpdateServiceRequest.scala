package typingsSlinky.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateServiceRequest extends js.Object {
  /**
    * The ID of the service that you want to update.
    */
  var Id: ResourceId = js.native
  /**
    * A complex type that contains the new settings for the service.
    */
  var Service: ServiceChange = js.native
}

object UpdateServiceRequest {
  @scala.inline
  def apply(Id: ResourceId, Service: ServiceChange): UpdateServiceRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], Service = Service.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServiceRequest]
  }
  @scala.inline
  implicit class UpdateServiceRequestOps[Self <: UpdateServiceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withService(value: ServiceChange): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Service")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

