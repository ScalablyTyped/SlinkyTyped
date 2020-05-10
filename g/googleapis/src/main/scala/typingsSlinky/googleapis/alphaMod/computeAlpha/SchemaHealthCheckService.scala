package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A HealthCheckService defines a set of backends on which to perform periodic
  * health checks and an endpoint to which to send notification of changes in
  * the health status of the backends.
  */
@js.native
trait SchemaHealthCheckService extends js.Object {
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * List of URLs to the HealthCheck resources. Must have at least one
    * HealthCheck, and not more than 10. HealthCheck resources must have
    * portSpecification=USE_SERVING_PORT. For regional HealthCheckService, the
    * HealthCheck must be regional and in the same region. For global
    * HealthCheckService, HealthCheck must be global. Mix of regional and
    * global HealthChecks is not supported. Multiple regional HealthChecks must
    * belong to the same region. Regional HealthChecks&lt;/code? must belong to
    * the same region as zones of NEGs.
    */
  var healthChecks: js.UndefOr[js.Array[String]] = js.native
  /**
    * Policy for how the results from multiple health checks for the same
    * endpoint are aggregated.   - NO_AGGREGATION. An EndpointHealth message is
    * returned for each backend in the health check service.  - AND. If any
    * backend&#39;s health check reports UNHEALTHY, then UNHEALTHY is the
    * HealthState of the entire health check service. If all backend&#39;s are
    * healthy, the HealthState of the health check service is HEALTHY. .
    */
  var healthStatusAggregationStrategy: js.UndefOr[String] = js.native
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * [Output only] Type of the resource. Always compute#healthCheckServicefor
    * health check services.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of the resource. The name must be 1-63 characters long, and comply
    * with RFC1035. Specifically, the name must be 1-63 characters long and
    * match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the
    * first character must be a lowercase letter, and all following characters
    * must be a dash, lowercase letter, or digit, except the last character,
    * which cannot be a dash.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * List of URLs to the NetworkEndpointGroup resources. Must not have more
    * than 100. For regional HealthCheckService, NEGs must be in zones in the
    * region of the HealthCheckService.
    */
  var networkEndpointGroups: js.UndefOr[js.Array[String]] = js.native
  /**
    * List of URLs to the NotificationEndpoint resources. Must not have more
    * than 10. A list of endpoints for receiving notifications of change in
    * health status. For regional HealthCheckService, NotificationEndpoint must
    * be regional and in the same region. For global HealthCheckService,
    * NotificationEndpoint must be global.
    */
  var notificationEndpoints: js.UndefOr[js.Array[String]] = js.native
  /**
    * [Output Only] URL of the region where the health check service resides.
    * This field is not applicable to global health check services. You must
    * specify this field as part of the HTTP request URL. It is not settable as
    * a field in the request body.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL with id for the resource.
    */
  var selfLinkWithId: js.UndefOr[String] = js.native
}

object SchemaHealthCheckService {
  @scala.inline
  def apply(): SchemaHealthCheckService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHealthCheckService]
  }
  @scala.inline
  implicit class SchemaHealthCheckServiceOps[Self <: SchemaHealthCheckService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("creationTimestamp")(js.undefined)
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
    def withHealthChecks(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthChecks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthChecks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthChecks")(js.undefined)
        ret
    }
    @scala.inline
    def withHealthStatusAggregationStrategy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthStatusAggregationStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthStatusAggregationStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthStatusAggregationStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
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
    def withNetworkEndpointGroups(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkEndpointGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkEndpointGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkEndpointGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withNotificationEndpoints(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationEndpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationEndpoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationEndpoints")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLink")(js.undefined)
        ret
    }
    @scala.inline
    def withSelfLinkWithId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLinkWithId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelfLinkWithId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selfLinkWithId")(js.undefined)
        ret
    }
  }
  
}

