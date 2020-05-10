package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLoadBalancerRequest extends js.Object {
  /**
    * The optional alternative domains and subdomains to use with your SSL/TLS certificate (e.g., www.example.com, example.com, m.example.com, blog.example.com).
    */
  var certificateAlternativeNames: js.UndefOr[DomainNameList] = js.native
  /**
    * The domain name with which your certificate is associated (e.g., example.com). If you specify certificateDomainName, then certificateName is required (and vice-versa).
    */
  var certificateDomainName: js.UndefOr[DomainName] = js.native
  /**
    * The name of the SSL/TLS certificate. If you specify certificateName, then certificateDomainName is required (and vice-versa).
    */
  var certificateName: js.UndefOr[ResourceName] = js.native
  /**
    * The path you provided to perform the load balancer health check. If you didn't specify a health check path, Lightsail uses the root path of your website (e.g., "/"). You may want to specify a custom health check path other than the root of your application if your home page loads slowly or has a lot of media or scripting on it.
    */
  var healthCheckPath: js.UndefOr[String] = js.native
  /**
    * The instance port where you're creating your load balancer.
    */
  var instancePort: Port = js.native
  /**
    * The name of your load balancer.
    */
  var loadBalancerName: ResourceName = js.native
  /**
    * The tag keys and optional values to add to the resource during create. To tag a resource after it has been created, see the tag resource operation.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object CreateLoadBalancerRequest {
  @scala.inline
  def apply(instancePort: Port, loadBalancerName: ResourceName): CreateLoadBalancerRequest = {
    val __obj = js.Dynamic.literal(instancePort = instancePort.asInstanceOf[js.Any], loadBalancerName = loadBalancerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLoadBalancerRequest]
  }
  @scala.inline
  implicit class CreateLoadBalancerRequestOps[Self <: CreateLoadBalancerRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstancePort(value: Port): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instancePort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadBalancerName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadBalancerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCertificateAlternativeNames(value: DomainNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateAlternativeNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateAlternativeNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateAlternativeNames")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificateDomainName(value: DomainName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateDomainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateDomainName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateDomainName")(js.undefined)
        ret
    }
    @scala.inline
    def withCertificateName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCertificateName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("certificateName")(js.undefined)
        ret
    }
    @scala.inline
    def withHealthCheckPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthCheckPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHealthCheckPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("healthCheckPath")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

