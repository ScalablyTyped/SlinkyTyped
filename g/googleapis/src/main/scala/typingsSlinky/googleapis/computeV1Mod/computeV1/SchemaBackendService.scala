package typingsSlinky.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A BackendService resource. This resource defines a group of backend virtual
  * machines and their serving capacity. (== resource_for v1.backendService ==)
  * (== resource_for beta.backendService ==)
  */
@js.native
trait SchemaBackendService extends js.Object {
  /**
    * Lifetime of cookies in seconds if session_affinity is GENERATED_COOKIE.
    * If set to 0, the cookie is non-persistent and lasts only until the end of
    * the browser session (or equivalent). The maximum allowed value for TTL is
    * one day.  When the load balancing scheme is INTERNAL, this field is not
    * used.
    */
  var affinityCookieTtlSec: js.UndefOr[Double] = js.native
  /**
    * The list of backends that serve this BackendService.
    */
  var backends: js.UndefOr[js.Array[SchemaBackend]] = js.native
  /**
    * Cloud CDN configuration for this BackendService.
    */
  var cdnPolicy: js.UndefOr[SchemaBackendServiceCdnPolicy] = js.native
  var connectionDraining: js.UndefOr[SchemaConnectionDraining] = js.native
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * Headers that the HTTP/S load balancer should add to proxied requests.
    */
  var customRequestHeaders: js.UndefOr[js.Array[String]] = js.native
  /**
    * An optional description of this resource. Provide this property when you
    * create the resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * If true, enable Cloud CDN for this BackendService.  When the load
    * balancing scheme is INTERNAL, this field is not used.
    */
  var enableCDN: js.UndefOr[Boolean] = js.native
  /**
    * Fingerprint of this resource. A hash of the contents stored in this
    * object. This field is used in optimistic locking. This field will be
    * ignored when inserting a BackendService. An up-to-date fingerprint must
    * be provided in order to update the BackendService, otherwise the request
    * will fail with error 412 conditionNotMet.  To see the latest fingerprint,
    * make a get() request to retrieve a BackendService.
    */
  var fingerprint: js.UndefOr[String] = js.native
  /**
    * The list of URLs to the HttpHealthCheck or HttpsHealthCheck resource for
    * health checking this BackendService. Currently at most one health check
    * can be specified, and a health check is required for Compute Engine
    * backend services. A health check must not be specified for App Engine
    * backend and Cloud Function backend.  For internal load balancing, a URL
    * to a HealthCheck resource must be specified instead.
    */
  var healthChecks: js.UndefOr[js.Array[String]] = js.native
  var iap: js.UndefOr[SchemaBackendServiceIAP] = js.native
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * [Output Only] Type of resource. Always compute#backendService for backend
    * services.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Indicates whether the backend service will be used with internal or
    * external load balancing. A backend service created for one type of load
    * balancing cannot be used with the other. Possible values are INTERNAL and
    * EXTERNAL.
    */
  var loadBalancingScheme: js.UndefOr[String] = js.native
  /**
    * Name of the resource. Provided by the client when the resource is
    * created. The name must be 1-63 characters long, and comply with RFC1035.
    * Specifically, the name must be 1-63 characters long and match the regular
    * expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character
    * must be a lowercase letter, and all following characters must be a dash,
    * lowercase letter, or digit, except the last character, which cannot be a
    * dash.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Deprecated in favor of portName. The TCP port to connect on the backend.
    * The default value is 80.  This cannot be used for internal load
    * balancing.
    */
  var port: js.UndefOr[Double] = js.native
  /**
    * Name of backend port. The same name should appear in the instance groups
    * referenced by this service. Required when the load balancing scheme is
    * EXTERNAL.  When the load balancing scheme is INTERNAL, this field is not
    * used.
    */
  var portName: js.UndefOr[String] = js.native
  /**
    * The protocol this BackendService uses to communicate with backends.
    * Possible values are HTTP, HTTPS, TCP, and SSL. The default is HTTP.  For
    * internal load balancing, the possible values are TCP and UDP, and the
    * default is TCP.
    */
  var protocol: js.UndefOr[String] = js.native
  /**
    * [Output Only] URL of the region where the regional backend service
    * resides. This field is not applicable to global backend services. You
    * must specify this field as part of the HTTP request URL. It is not
    * settable as a field in the request body.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * [Output Only] The resource URL for the security policy associated with
    * this backend service.
    */
  var securityPolicy: js.UndefOr[String] = js.native
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * Type of session affinity to use. The default is NONE.  When the load
    * balancing scheme is EXTERNAL, can be NONE, CLIENT_IP, or
    * GENERATED_COOKIE.  When the load balancing scheme is INTERNAL, can be
    * NONE, CLIENT_IP, CLIENT_IP_PROTO, or CLIENT_IP_PORT_PROTO.  When the
    * protocol is UDP, this field is not used.
    */
  var sessionAffinity: js.UndefOr[String] = js.native
  /**
    * How many seconds to wait for the backend before considering it a failed
    * request. Default is 30 seconds.
    */
  var timeoutSec: js.UndefOr[Double] = js.native
}

object SchemaBackendService {
  @scala.inline
  def apply(): SchemaBackendService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackendService]
  }
  @scala.inline
  implicit class SchemaBackendServiceOps[Self <: SchemaBackendService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAffinityCookieTtlSec(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affinityCookieTtlSec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAffinityCookieTtlSec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affinityCookieTtlSec")(js.undefined)
        ret
    }
    @scala.inline
    def withBackends(value: js.Array[SchemaBackend]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backends")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackends: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backends")(js.undefined)
        ret
    }
    @scala.inline
    def withCdnPolicy(value: SchemaBackendServiceCdnPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdnPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCdnPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdnPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionDraining(value: SchemaConnectionDraining): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionDraining")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionDraining: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionDraining")(js.undefined)
        ret
    }
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
    def withCustomRequestHeaders(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customRequestHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomRequestHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customRequestHeaders")(js.undefined)
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
    def withEnableCDN(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCDN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableCDN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableCDN")(js.undefined)
        ret
    }
    @scala.inline
    def withFingerprint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFingerprint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(js.undefined)
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
    def withIap(value: SchemaBackendServiceIAP): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iap")(js.undefined)
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
    def withLoadBalancingScheme(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadBalancingScheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadBalancingScheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadBalancingScheme")(js.undefined)
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
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
        ret
    }
    @scala.inline
    def withPortName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portName")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(js.undefined)
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
    def withSecurityPolicy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityPolicy")(js.undefined)
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
    def withSessionAffinity(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionAffinity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionAffinity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionAffinity")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeoutSec(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutSec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeoutSec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeoutSec")(js.undefined)
        ret
    }
  }
  
}

