package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This message defines settings for a consistent hash style load balancer.
  */
@js.native
trait SchemaConsistentHashLoadBalancerSettings extends js.Object {
  /**
    * Hash is based on HTTP Cookie. This field describes a HTTP cookie that
    * will be used as the hash key for the consistent hash load balancer. If
    * the cookie is not present, it will be generated. This field is applicable
    * if the sessionAffinity is set to HTTP_COOKIE.
    */
  var httpCookie: js.UndefOr[SchemaConsistentHashLoadBalancerSettingsHttpCookie] = js.native
  /**
    * The hash based on the value of the specified header field. This field is
    * applicable if the sessionAffinity is set to HEADER_FIELD.
    */
  var httpHeaderName: js.UndefOr[String] = js.native
  /**
    * The minimum number of virtual nodes to use for the hash ring. Defaults to
    * 1024. Larger ring sizes result in more granular load distributions. If
    * the number of hosts in the load balancing pool is larger than the ring
    * size, each host will be assigned a single virtual node.
    */
  var minimumRingSize: js.UndefOr[String] = js.native
}

object SchemaConsistentHashLoadBalancerSettings {
  @scala.inline
  def apply(): SchemaConsistentHashLoadBalancerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConsistentHashLoadBalancerSettings]
  }
  @scala.inline
  implicit class SchemaConsistentHashLoadBalancerSettingsOps[Self <: SchemaConsistentHashLoadBalancerSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHttpCookie(value: SchemaConsistentHashLoadBalancerSettingsHttpCookie): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpCookie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpCookie: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpCookie")(js.undefined)
        ret
    }
    @scala.inline
    def withHttpHeaderName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpHeaderName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHttpHeaderName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpHeaderName")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumRingSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumRingSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumRingSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumRingSize")(js.undefined)
        ret
    }
  }
  
}

