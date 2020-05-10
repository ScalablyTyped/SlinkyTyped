package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaHttpRouteAction extends js.Object {
  /**
    * The specification for allowing client side cross-origin requests. Please
    * see W3C Recommendation for Cross Origin Resource Sharing
    */
  var corsPolicy: js.UndefOr[SchemaCorsPolicy] = js.native
  /**
    * The specification for fault injection introduced into traffic to test the
    * resiliency of clients to backend service failure. As part of fault
    * injection, when clients send requests to a backend service, delays can be
    * introduced by Loadbalancer on a percentage of requests before sending
    * those request to the backend service. Similarly requests from clients can
    * be aborted by the Loadbalancer for a percentage of requests. timeout and
    * retry_policy will be ignored by clients that are configured with a
    * fault_injection_policy.
    */
  var faultInjectionPolicy: js.UndefOr[SchemaHttpFaultInjection] = js.native
  /**
    * Specifies the policy on how requests intended for the route&#39;s
    * backends are shadowed to a separate mirrored backend service.
    * Loadbalancer does not wait for responses from the shadow service. Prior
    * to sending traffic to the shadow service, the host / authority header is
    * suffixed with -shadow.
    */
  var requestMirrorPolicy: js.UndefOr[SchemaRequestMirrorPolicy] = js.native
  /**
    * Specifies the retry policy associated with this route.
    */
  var retryPolicy: js.UndefOr[SchemaHttpRetryPolicy] = js.native
  /**
    * Specifies the timeout for the selected route. Timeout is computed from
    * the time the request is has been fully processed (i.e. end-of-stream) up
    * until the response has been completely processed. Timeout includes all
    * retries. If not specified, the default value is 15 seconds.
    */
  var timeout: js.UndefOr[SchemaDuration] = js.native
  /**
    * The spec to modify the URL of the request, prior to forwarding the
    * request to the matched service
    */
  var urlRewrite: js.UndefOr[SchemaUrlRewrite] = js.native
  /**
    * A list of weighted backend services to send traffic to when a route match
    * occurs. The weights determine the fraction of traffic that flows to their
    * corresponding backend service. If all traffic needs to go to a single
    * backend service, there must be one  weightedBackendService with weight
    * set to a non 0 number. Once a backendService is identified and before
    * forwarding the request to the backend service, advanced routing actions
    * like Url rewrites and header transformations are applied depending on
    * additional settings specified in this HttpRouteAction.
    */
  var weightedBackendServices: js.UndefOr[js.Array[SchemaWeightedBackendService]] = js.native
}

object SchemaHttpRouteAction {
  @scala.inline
  def apply(): SchemaHttpRouteAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHttpRouteAction]
  }
  @scala.inline
  implicit class SchemaHttpRouteActionOps[Self <: SchemaHttpRouteAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCorsPolicy(value: SchemaCorsPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("corsPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCorsPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("corsPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withFaultInjectionPolicy(value: SchemaHttpFaultInjection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faultInjectionPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFaultInjectionPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("faultInjectionPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestMirrorPolicy(value: SchemaRequestMirrorPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMirrorPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestMirrorPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestMirrorPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withRetryPolicy(value: SchemaHttpRetryPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetryPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retryPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: SchemaDuration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withUrlRewrite(value: SchemaUrlRewrite): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlRewrite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrlRewrite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("urlRewrite")(js.undefined)
        ret
    }
    @scala.inline
    def withWeightedBackendServices(value: js.Array[SchemaWeightedBackendService]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weightedBackendServices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeightedBackendServices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weightedBackendServices")(js.undefined)
        ret
    }
  }
  
}

