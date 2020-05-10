package typingsSlinky.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for the `EnableService` method. This response message is
  * assigned to the `response` field of the returned Operation when that
  * operation is done.
  */
@js.native
trait SchemaEnableServiceResponse extends js.Object {
  /**
    * The new state of the service after enabling.
    */
  var service: js.UndefOr[SchemaGoogleApiServiceusageV1Service] = js.native
}

object SchemaEnableServiceResponse {
  @scala.inline
  def apply(): SchemaEnableServiceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnableServiceResponse]
  }
  @scala.inline
  implicit class SchemaEnableServiceResponseOps[Self <: SchemaEnableServiceResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withService(value: SchemaGoogleApiServiceusageV1Service): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(js.undefined)
        ret
    }
  }
  
}

