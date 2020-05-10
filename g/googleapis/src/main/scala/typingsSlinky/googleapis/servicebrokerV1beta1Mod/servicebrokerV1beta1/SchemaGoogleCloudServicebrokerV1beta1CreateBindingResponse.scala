package typingsSlinky.googleapis.servicebrokerV1beta1Mod.servicebrokerV1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the `CreateBinding()` method.
  */
@js.native
trait SchemaGoogleCloudServicebrokerV1beta1CreateBindingResponse extends js.Object {
  /**
    * Credentials to use the binding.
    */
  var credentials: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Used to communicate description of the response. Usually for non-standard
    * error codes.
    * https://github.com/openservicebrokerapi/servicebroker/blob/master/spec.md#service-broker-errors
    */
  var description: js.UndefOr[String] = js.native
  /**
    * If broker executes operation asynchronously, this is the operation ID
    * that can be polled to check the completion status of said operation. This
    * broker always executes all create/delete operations asynchronously.
    */
  var operation: js.UndefOr[String] = js.native
  /**
    * A URL to which the platform may proxy requests for the address sent with
    * bind_resource.route
    */
  var route_service_url: js.UndefOr[String] = js.native
  /**
    * From where to read system logs.
    */
  var syslog_drain_url: js.UndefOr[String] = js.native
  /**
    * An array of configuration for mounting volumes.
    */
  var volume_mounts: js.UndefOr[js.Array[StringDictionary[_]]] = js.native
}

object SchemaGoogleCloudServicebrokerV1beta1CreateBindingResponse {
  @scala.inline
  def apply(): SchemaGoogleCloudServicebrokerV1beta1CreateBindingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudServicebrokerV1beta1CreateBindingResponse]
  }
  @scala.inline
  implicit class SchemaGoogleCloudServicebrokerV1beta1CreateBindingResponseOps[Self <: SchemaGoogleCloudServicebrokerV1beta1CreateBindingResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCredentials(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("credentials")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withOperation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOperation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("operation")(js.undefined)
        ret
    }
    @scala.inline
    def withRoute_service_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("route_service_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoute_service_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("route_service_url")(js.undefined)
        ret
    }
    @scala.inline
    def withSyslog_drain_url(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syslog_drain_url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyslog_drain_url: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syslog_drain_url")(js.undefined)
        ret
    }
    @scala.inline
    def withVolume_mounts(value: js.Array[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volume_mounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolume_mounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volume_mounts")(js.undefined)
        ret
    }
  }
  
}

