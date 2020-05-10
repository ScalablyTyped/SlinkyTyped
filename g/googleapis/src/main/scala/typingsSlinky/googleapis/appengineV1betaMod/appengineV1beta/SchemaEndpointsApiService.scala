package typingsSlinky.googleapis.appengineV1betaMod.appengineV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cloud Endpoints (https://cloud.google.com/endpoints) configuration. The
  * Endpoints API Service provides tooling for serving Open API and gRPC
  * endpoints via an NGINX proxy. Only valid for App Engine Flexible
  * environment deployments.The fields here refer to the name and configuration
  * ID of a &quot;service&quot; resource in the Service Management API
  * (https://cloud.google.com/service-management/overview).
  */
@js.native
trait SchemaEndpointsApiService extends js.Object {
  /**
    * Endpoints service configuration ID as specified by the Service Management
    * API. For example &quot;2016-09-19r1&quot;.By default, the rollout
    * strategy for Endpoints is RolloutStrategy.FIXED. This means that
    * Endpoints starts up with a particular configuration ID. When a new
    * configuration is rolled out, Endpoints must be given the new
    * configuration ID. The config_id field is used to give the configuration
    * ID and is required in this case.Endpoints also has a rollout strategy
    * called RolloutStrategy.MANAGED. When using this, Endpoints fetches the
    * latest configuration and does not need the configuration ID. In this
    * case, config_id must be omitted.
    */
  var configId: js.UndefOr[String] = js.native
  /**
    * Enable or disable trace sampling. By default, this is set to false for
    * enabled.
    */
  var disableTraceSampling: js.UndefOr[Boolean] = js.native
  /**
    * Endpoints service name which is the name of the &quot;service&quot;
    * resource in the Service Management API. For example
    * &quot;myapi.endpoints.myproject.cloud.goog&quot;
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Endpoints rollout strategy. If FIXED, config_id must be specified. If
    * MANAGED, config_id must be omitted.
    */
  var rolloutStrategy: js.UndefOr[String] = js.native
}

object SchemaEndpointsApiService {
  @scala.inline
  def apply(): SchemaEndpointsApiService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEndpointsApiService]
  }
  @scala.inline
  implicit class SchemaEndpointsApiServiceOps[Self <: SchemaEndpointsApiService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configId")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableTraceSampling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableTraceSampling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableTraceSampling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableTraceSampling")(js.undefined)
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
    def withRolloutStrategy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rolloutStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRolloutStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rolloutStrategy")(js.undefined)
        ret
    }
  }
  
}

