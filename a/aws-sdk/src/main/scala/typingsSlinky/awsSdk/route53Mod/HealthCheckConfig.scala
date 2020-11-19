package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HealthCheckConfig extends js.Object {
  
  /**
    * A complex type that identifies the CloudWatch alarm that you want Amazon Route 53 health checkers to use to determine whether the specified health check is healthy.
    */
  var AlarmIdentifier: js.UndefOr[typingsSlinky.awsSdk.route53Mod.AlarmIdentifier] = js.native
  
  /**
    * (CALCULATED Health Checks Only) A complex type that contains one ChildHealthCheck element for each health check that you want to associate with a CALCULATED health check.
    */
  var ChildHealthChecks: js.UndefOr[ChildHealthCheckList] = js.native
  
  /**
    * Stops Route 53 from performing health checks. When you disable a health check, here's what happens:    Health checks that check the health of endpoints: Route 53 stops submitting requests to your application, server, or other resource.    Calculated health checks: Route 53 stops aggregating the status of the referenced health checks.    Health checks that monitor CloudWatch alarms: Route 53 stops monitoring the corresponding CloudWatch metrics.   After you disable a health check, Route 53 considers the status of the health check to always be healthy. If you configured DNS failover, Route 53 continues to route traffic to the corresponding resources. If you want to stop routing traffic to a resource, change the value of Inverted.  Charges for a health check still apply when the health check is disabled. For more information, see Amazon Route 53 Pricing.
    */
  var Disabled: js.UndefOr[typingsSlinky.awsSdk.route53Mod.Disabled] = js.native
  
  /**
    * Specify whether you want Amazon Route 53 to send the value of FullyQualifiedDomainName to the endpoint in the client_hello message during TLS negotiation. This allows the endpoint to respond to HTTPS health check requests with the applicable SSL/TLS certificate. Some endpoints require that HTTPS requests include the host name in the client_hello message. If you don't enable SNI, the status of the health check will be SSL alert handshake_failure. A health check can also have that status for other reasons. If SNI is enabled and you're still getting the error, check the SSL/TLS configuration on your endpoint and confirm that your certificate is valid. The SSL/TLS certificate on your endpoint includes a domain name in the Common Name field and possibly several more in the Subject Alternative Names field. One of the domain names in the certificate should match the value that you specify for FullyQualifiedDomainName. If the endpoint responds to the client_hello message with a certificate that does not include the domain name that you specified in FullyQualifiedDomainName, a health checker will retry the handshake. In the second attempt, the health checker will omit FullyQualifiedDomainName from the client_hello message.
    */
  var EnableSNI: js.UndefOr[typingsSlinky.awsSdk.route53Mod.EnableSNI] = js.native
  
  /**
    * The number of consecutive health checks that an endpoint must pass or fail for Amazon Route 53 to change the current status of the endpoint from unhealthy to healthy or vice versa. For more information, see How Amazon Route 53 Determines Whether an Endpoint Is Healthy in the Amazon Route 53 Developer Guide. If you don't specify a value for FailureThreshold, the default value is three health checks.
    */
  var FailureThreshold: js.UndefOr[typingsSlinky.awsSdk.route53Mod.FailureThreshold] = js.native
  
  /**
    * Amazon Route 53 behavior depends on whether you specify a value for IPAddress.  If you specify a value for IPAddress: Amazon Route 53 sends health check requests to the specified IPv4 or IPv6 address and passes the value of FullyQualifiedDomainName in the Host header for all health checks except TCP health checks. This is typically the fully qualified DNS name of the endpoint on which you want Route 53 to perform health checks. When Route 53 checks the health of an endpoint, here is how it constructs the Host header:   If you specify a value of 80 for Port and HTTP or HTTP_STR_MATCH for Type, Route 53 passes the value of FullyQualifiedDomainName to the endpoint in the Host header.    If you specify a value of 443 for Port and HTTPS or HTTPS_STR_MATCH for Type, Route 53 passes the value of FullyQualifiedDomainName to the endpoint in the Host header.   If you specify another value for Port and any value except TCP for Type, Route 53 passes FullyQualifiedDomainName:Port to the endpoint in the Host header.   If you don't specify a value for FullyQualifiedDomainName, Route 53 substitutes the value of IPAddress in the Host header in each of the preceding cases.  If you don't specify a value for IPAddress : Route 53 sends a DNS request to the domain that you specify for FullyQualifiedDomainName at the interval that you specify for RequestInterval. Using an IPv4 address that DNS returns, Route 53 then checks the health of the endpoint.  If you don't specify a value for IPAddress, Route 53 uses only IPv4 to send health checks to the endpoint. If there's no resource record set with a type of A for the name that you specify for FullyQualifiedDomainName, the health check fails with a "DNS resolution failed" error.  If you want to check the health of weighted, latency, or failover resource record sets and you choose to specify the endpoint only by FullyQualifiedDomainName, we recommend that you create a separate health check for each endpoint. For example, create a health check for each HTTP server that is serving content for www.example.com. For the value of FullyQualifiedDomainName, specify the domain name of the server (such as us-east-2-www.example.com), not the name of the resource record sets (www.example.com).  In this configuration, if you create a health check for which the value of FullyQualifiedDomainName matches the name of the resource record sets and you then associate the health check with those resource record sets, health check results will be unpredictable.  In addition, if the value that you specify for Type is HTTP, HTTPS, HTTP_STR_MATCH, or HTTPS_STR_MATCH, Route 53 passes the value of FullyQualifiedDomainName in the Host header, as it does when you specify a value for IPAddress. If the value of Type is TCP, Route 53 doesn't pass a Host header.
    */
  var FullyQualifiedDomainName: js.UndefOr[typingsSlinky.awsSdk.route53Mod.FullyQualifiedDomainName] = js.native
  
  /**
    * The number of child health checks that are associated with a CALCULATED health check that Amazon Route 53 must consider healthy for the CALCULATED health check to be considered healthy. To specify the child health checks that you want to associate with a CALCULATED health check, use the ChildHealthChecks element. Note the following:   If you specify a number greater than the number of child health checks, Route 53 always considers this health check to be unhealthy.   If you specify 0, Route 53 always considers this health check to be healthy.  
    */
  var HealthThreshold: js.UndefOr[typingsSlinky.awsSdk.route53Mod.HealthThreshold] = js.native
  
  /**
    * The IPv4 or IPv6 IP address of the endpoint that you want Amazon Route 53 to perform health checks on. If you don't specify a value for IPAddress, Route 53 sends a DNS request to resolve the domain name that you specify in FullyQualifiedDomainName at the interval that you specify in RequestInterval. Using an IP address returned by DNS, Route 53 then checks the health of the endpoint. Use one of the following formats for the value of IPAddress:     IPv4 address: four values between 0 and 255, separated by periods (.), for example, 192.0.2.44.    IPv6 address: eight groups of four hexadecimal values, separated by colons (:), for example, 2001:0db8:85a3:0000:0000:abcd:0001:2345. You can also shorten IPv6 addresses as described in RFC 5952, for example, 2001:db8:85a3::abcd:1:2345.   If the endpoint is an EC2 instance, we recommend that you create an Elastic IP address, associate it with your EC2 instance, and specify the Elastic IP address for IPAddress. This ensures that the IP address of your instance will never change. For more information, see FullyQualifiedDomainName.  Constraints: Route 53 can't check the health of endpoints for which the IP address is in local, private, non-routable, or multicast ranges. For more information about IP addresses for which you can't create health checks, see the following documents:    RFC 5735, Special Use IPv4 Addresses     RFC 6598, IANA-Reserved IPv4 Prefix for Shared Address Space     RFC 5156, Special-Use IPv6 Addresses    When the value of Type is CALCULATED or CLOUDWATCH_METRIC, omit IPAddress.
    */
  var IPAddress: js.UndefOr[typingsSlinky.awsSdk.route53Mod.IPAddress] = js.native
  
  /**
    * When CloudWatch has insufficient data about the metric to determine the alarm state, the status that you want Amazon Route 53 to assign to the health check:    Healthy: Route 53 considers the health check to be healthy.    Unhealthy: Route 53 considers the health check to be unhealthy.    LastKnownStatus: Route 53 uses the status of the health check from the last time that CloudWatch had sufficient data to determine the alarm state. For new health checks that have no last known status, the default status for the health check is healthy.  
    */
  var InsufficientDataHealthStatus: js.UndefOr[typingsSlinky.awsSdk.route53Mod.InsufficientDataHealthStatus] = js.native
  
  /**
    * Specify whether you want Amazon Route 53 to invert the status of a health check, for example, to consider a health check unhealthy when it otherwise would be considered healthy.
    */
  var Inverted: js.UndefOr[typingsSlinky.awsSdk.route53Mod.Inverted] = js.native
  
  /**
    * Specify whether you want Amazon Route 53 to measure the latency between health checkers in multiple AWS regions and your endpoint, and to display CloudWatch latency graphs on the Health Checks page in the Route 53 console.  You can't change the value of MeasureLatency after you create a health check. 
    */
  var MeasureLatency: js.UndefOr[typingsSlinky.awsSdk.route53Mod.MeasureLatency] = js.native
  
  /**
    * The port on the endpoint that you want Amazon Route 53 to perform health checks on.  Don't specify a value for Port when you specify a value for Type of CLOUDWATCH_METRIC or CALCULATED. 
    */
  var Port: js.UndefOr[typingsSlinky.awsSdk.route53Mod.Port] = js.native
  
  /**
    * A complex type that contains one Region element for each region from which you want Amazon Route 53 health checkers to check the specified endpoint. If you don't specify any regions, Route 53 health checkers automatically performs checks from all of the regions that are listed under Valid Values. If you update a health check to remove a region that has been performing health checks, Route 53 will briefly continue to perform checks from that region to ensure that some health checkers are always checking the endpoint (for example, if you replace three regions with four different regions). 
    */
  var Regions: js.UndefOr[HealthCheckRegionList] = js.native
  
  /**
    * The number of seconds between the time that Amazon Route 53 gets a response from your endpoint and the time that it sends the next health check request. Each Route 53 health checker makes requests at this interval.  You can't change the value of RequestInterval after you create a health check.  If you don't specify a value for RequestInterval, the default value is 30 seconds.
    */
  var RequestInterval: js.UndefOr[typingsSlinky.awsSdk.route53Mod.RequestInterval] = js.native
  
  /**
    * The path, if any, that you want Amazon Route 53 to request when performing health checks. The path can be any value for which your endpoint will return an HTTP status code of 2xx or 3xx when the endpoint is healthy, for example, the file /docs/route53-health-check.html. You can also include query string parameters, for example, /welcome.html?language=jp&amp;login=y. 
    */
  var ResourcePath: js.UndefOr[typingsSlinky.awsSdk.route53Mod.ResourcePath] = js.native
  
  /**
    * If the value of Type is HTTP_STR_MATCH or HTTPS_STR_MATCH, the string that you want Amazon Route 53 to search for in the response body from the specified resource. If the string appears in the response body, Route 53 considers the resource healthy. Route 53 considers case when searching for SearchString in the response body. 
    */
  var SearchString: js.UndefOr[typingsSlinky.awsSdk.route53Mod.SearchString] = js.native
  
  /**
    * The type of health check that you want to create, which indicates how Amazon Route 53 determines whether an endpoint is healthy.  You can't change the value of Type after you create a health check.  You can create the following types of health checks:    HTTP: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an HTTP request and waits for an HTTP status code of 200 or greater and less than 400.    HTTPS: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an HTTPS request and waits for an HTTP status code of 200 or greater and less than 400.  If you specify HTTPS for the value of Type, the endpoint must support TLS v1.0 or later.     HTTP_STR_MATCH: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an HTTP request and searches the first 5,120 bytes of the response body for the string that you specify in SearchString.    HTTPS_STR_MATCH: Route 53 tries to establish a TCP connection. If successful, Route 53 submits an HTTPS request and searches the first 5,120 bytes of the response body for the string that you specify in SearchString.    TCP: Route 53 tries to establish a TCP connection.    CLOUDWATCH_METRIC: The health check is associated with a CloudWatch alarm. If the state of the alarm is OK, the health check is considered healthy. If the state is ALARM, the health check is considered unhealthy. If CloudWatch doesn't have sufficient data to determine whether the state is OK or ALARM, the health check status depends on the setting for InsufficientDataHealthStatus: Healthy, Unhealthy, or LastKnownStatus.     CALCULATED: For health checks that monitor the status of other health checks, Route 53 adds up the number of health checks that Route 53 health checkers consider to be healthy and compares that number with the value of HealthThreshold.    For more information, see How Route 53 Determines Whether an Endpoint Is Healthy in the Amazon Route 53 Developer Guide.
    */
  var Type: HealthCheckType = js.native
}
object HealthCheckConfig {
  
  @scala.inline
  def apply(Type: HealthCheckType): HealthCheckConfig = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[HealthCheckConfig]
  }
  
  @scala.inline
  implicit class HealthCheckConfigOps[Self <: HealthCheckConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: HealthCheckType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlarmIdentifier(value: AlarmIdentifier): Self = this.set("AlarmIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlarmIdentifier: Self = this.set("AlarmIdentifier", js.undefined)
    
    @scala.inline
    def setChildHealthChecksVarargs(value: HealthCheckId*): Self = this.set("ChildHealthChecks", js.Array(value :_*))
    
    @scala.inline
    def setChildHealthChecks(value: ChildHealthCheckList): Self = this.set("ChildHealthChecks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildHealthChecks: Self = this.set("ChildHealthChecks", js.undefined)
    
    @scala.inline
    def setDisabled(value: Disabled): Self = this.set("Disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("Disabled", js.undefined)
    
    @scala.inline
    def setEnableSNI(value: EnableSNI): Self = this.set("EnableSNI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSNI: Self = this.set("EnableSNI", js.undefined)
    
    @scala.inline
    def setFailureThreshold(value: FailureThreshold): Self = this.set("FailureThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureThreshold: Self = this.set("FailureThreshold", js.undefined)
    
    @scala.inline
    def setFullyQualifiedDomainName(value: FullyQualifiedDomainName): Self = this.set("FullyQualifiedDomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullyQualifiedDomainName: Self = this.set("FullyQualifiedDomainName", js.undefined)
    
    @scala.inline
    def setHealthThreshold(value: HealthThreshold): Self = this.set("HealthThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthThreshold: Self = this.set("HealthThreshold", js.undefined)
    
    @scala.inline
    def setIPAddress(value: IPAddress): Self = this.set("IPAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIPAddress: Self = this.set("IPAddress", js.undefined)
    
    @scala.inline
    def setInsufficientDataHealthStatus(value: InsufficientDataHealthStatus): Self = this.set("InsufficientDataHealthStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsufficientDataHealthStatus: Self = this.set("InsufficientDataHealthStatus", js.undefined)
    
    @scala.inline
    def setInverted(value: Inverted): Self = this.set("Inverted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInverted: Self = this.set("Inverted", js.undefined)
    
    @scala.inline
    def setMeasureLatency(value: MeasureLatency): Self = this.set("MeasureLatency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeasureLatency: Self = this.set("MeasureLatency", js.undefined)
    
    @scala.inline
    def setPort(value: Port): Self = this.set("Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("Port", js.undefined)
    
    @scala.inline
    def setRegionsVarargs(value: HealthCheckRegion*): Self = this.set("Regions", js.Array(value :_*))
    
    @scala.inline
    def setRegions(value: HealthCheckRegionList): Self = this.set("Regions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegions: Self = this.set("Regions", js.undefined)
    
    @scala.inline
    def setRequestInterval(value: RequestInterval): Self = this.set("RequestInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestInterval: Self = this.set("RequestInterval", js.undefined)
    
    @scala.inline
    def setResourcePath(value: ResourcePath): Self = this.set("ResourcePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourcePath: Self = this.set("ResourcePath", js.undefined)
    
    @scala.inline
    def setSearchString(value: SearchString): Self = this.set("SearchString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchString: Self = this.set("SearchString", js.undefined)
  }
}
