package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event generated when an app installation failed on a device
  */
@js.native
trait SchemaInstallFailureEvent extends js.Object {
  /**
    * The Android ID of the device. This field will always be present.
    */
  var deviceId: js.UndefOr[String] = js.native
  /**
    * Additional details on the failure if applicable.
    */
  var failureDetails: js.UndefOr[String] = js.native
  /**
    * The reason for the installation failure. This field will always be
    * present.
    */
  var failureReason: js.UndefOr[String] = js.native
  /**
    * The id of the product (e.g. &quot;app:com.google.android.gm&quot;) for
    * which the install failure event occured. This field will always be
    * present.
    */
  var productId: js.UndefOr[String] = js.native
  /**
    * The ID of the user. This field will always be present.
    */
  var userId: js.UndefOr[String] = js.native
}

object SchemaInstallFailureEvent {
  @scala.inline
  def apply(): SchemaInstallFailureEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstallFailureEvent]
  }
  @scala.inline
  implicit class SchemaInstallFailureEventOps[Self <: SchemaInstallFailureEvent] (val x: Self) extends AnyVal {
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
    def withFailureDetails(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withFailureReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailureReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failureReason")(js.undefined)
        ret
    }
    @scala.inline
    def withProductId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(js.undefined)
        ret
    }
    @scala.inline
    def withUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userId")(js.undefined)
        ret
    }
  }
  
}

