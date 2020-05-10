package typingsSlinky.googleapis.cloudiotV1Mod.cloudiotV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Gateway-related configuration and state.
  */
@js.native
trait SchemaGatewayConfig extends js.Object {
  /**
    * Indicates how to authorize and/or authenticate devices to access the
    * gateway.
    */
  var gatewayAuthMethod: js.UndefOr[String] = js.native
  /**
    * Indicates whether the device is a gateway.
    */
  var gatewayType: js.UndefOr[String] = js.native
  /**
    * [Output only] The ID of the gateway the device accessed most recently.
    */
  var lastAccessedGatewayId: js.UndefOr[String] = js.native
  /**
    * [Output only] The most recent time at which the device accessed the
    * gateway specified in `last_accessed_gateway`.
    */
  var lastAccessedGatewayTime: js.UndefOr[String] = js.native
}

object SchemaGatewayConfig {
  @scala.inline
  def apply(): SchemaGatewayConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGatewayConfig]
  }
  @scala.inline
  implicit class SchemaGatewayConfigOps[Self <: SchemaGatewayConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGatewayAuthMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gatewayAuthMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGatewayAuthMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gatewayAuthMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withGatewayType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gatewayType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGatewayType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gatewayType")(js.undefined)
        ret
    }
    @scala.inline
    def withLastAccessedGatewayId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastAccessedGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastAccessedGatewayId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastAccessedGatewayId")(js.undefined)
        ret
    }
    @scala.inline
    def withLastAccessedGatewayTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastAccessedGatewayTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastAccessedGatewayTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastAccessedGatewayTime")(js.undefined)
        ret
    }
  }
  
}

