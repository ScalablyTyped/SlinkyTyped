package typingsSlinky.googleapis.serviceusageV1beta1Mod.serviceusageV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A service that is available for use by the consumer.
  */
@js.native
trait SchemaGoogleApiServiceusageV1Service extends js.Object {
  /**
    * The service configuration of the available service. Some fields may be
    * filtered out of the configuration in responses to the `ListServices`
    * method. These fields are present only in responses to the `GetService`
    * method.
    */
  var config: js.UndefOr[SchemaGoogleApiServiceusageV1ServiceConfig] = js.native
  /**
    * The resource name of the consumer and service.  A valid name would be: -
    * projects/123/services/serviceusage.googleapis.com
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The resource name of the consumer.  A valid name would be: - projects/123
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * Whether or not the service has been enabled for use by the consumer.
    */
  var state: js.UndefOr[String] = js.native
}

object SchemaGoogleApiServiceusageV1Service {
  @scala.inline
  def apply(): SchemaGoogleApiServiceusageV1Service = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleApiServiceusageV1Service]
  }
  @scala.inline
  implicit class SchemaGoogleApiServiceusageV1ServiceOps[Self <: SchemaGoogleApiServiceusageV1Service] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: SchemaGoogleApiServiceusageV1ServiceConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withParent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parent")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

