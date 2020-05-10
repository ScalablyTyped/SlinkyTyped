package typingsSlinky.reactNativeMauron85BackgroundGeolocation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceStatus extends js.Object {
  /**
    * Authorization status.
    *
    * Posible values:
    *  NOT_AUTHORIZED, AUTHORIZED, AUTHORIZED_FOREGROUND
    *
    * @example
    * if (authorization == BackgroundGeolocation.NOT_AUTHORIZED) {...}
    */
  var authorization: AuthorizationStatus = js.native
  /** TRUE if service is running. */
  var isRunning: Boolean = js.native
  /** TRUE if location services are enabled */
  var locationServicesEnabled: Boolean = js.native
}

object ServiceStatus {
  @scala.inline
  def apply(authorization: AuthorizationStatus, isRunning: Boolean, locationServicesEnabled: Boolean): ServiceStatus = {
    val __obj = js.Dynamic.literal(authorization = authorization.asInstanceOf[js.Any], isRunning = isRunning.asInstanceOf[js.Any], locationServicesEnabled = locationServicesEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceStatus]
  }
  @scala.inline
  implicit class ServiceStatusOps[Self <: ServiceStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthorization(value: AuthorizationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRunning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRunning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocationServicesEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locationServicesEnabled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

