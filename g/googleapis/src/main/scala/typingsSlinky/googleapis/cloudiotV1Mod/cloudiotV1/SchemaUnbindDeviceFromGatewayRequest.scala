package typingsSlinky.googleapis.cloudiotV1Mod.cloudiotV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for `UnbindDeviceFromGateway`.
  */
@js.native
trait SchemaUnbindDeviceFromGatewayRequest extends js.Object {
  /**
    * The device to disassociate from the specified gateway. The value of
    * `device_id` can be either the device numeric ID or the user-defined
    * device identifier.
    */
  var deviceId: js.UndefOr[String] = js.native
  /**
    * The value of `gateway_id` can be either the device numeric ID or the
    * user-defined device identifier.
    */
  var gatewayId: js.UndefOr[String] = js.native
}

object SchemaUnbindDeviceFromGatewayRequest {
  @scala.inline
  def apply(): SchemaUnbindDeviceFromGatewayRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUnbindDeviceFromGatewayRequest]
  }
  @scala.inline
  implicit class SchemaUnbindDeviceFromGatewayRequestOps[Self <: SchemaUnbindDeviceFromGatewayRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeviceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeviceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deviceId")(js.undefined)
        ret
    }
    @scala.inline
    def withGatewayId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGatewayId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gatewayId")(js.undefined)
        ret
    }
  }
  
}

