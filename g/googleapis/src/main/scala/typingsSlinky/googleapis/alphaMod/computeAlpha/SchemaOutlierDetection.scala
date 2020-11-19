package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Settings controlling eviction of unhealthy hosts from the load balancing
  * pool.
  */
@js.native
trait SchemaOutlierDetection extends js.Object {
  
  /**
    * The base time that a host is ejected for. The real time is equal to the
    * base time multiplied by the number of times the host has been ejected.
    * Defaults to 30000ms or 30s.
    */
  var baseEjectionTime: js.UndefOr[SchemaDuration] = js.native
  
  /**
    * Number of errors before a host is ejected from the connection pool. When
    * the backend host is accessed over HTTP, a 5xx return code qualifies as an
    * error. Defaults to 5.
    */
  var consecutiveErrors: js.UndefOr[Double] = js.native
  
  /**
    * The number of consecutive gateway failures (502, 503, 504 status or
    * connection errors that are mapped to one of those status codes) before a
    * consecutive gateway failure ejection occurs. Defaults to 5.
    */
  var consecutiveGatewayFailure: js.UndefOr[Double] = js.native
  
  /**
    * The percentage chance that a host will be actually ejected when an
    * outlier status is detected through consecutive 5xx. This setting can be
    * used to disable ejection or to ramp it up slowly. Defaults to 100.
    */
  var enforcingConsecutiveErrors: js.UndefOr[Double] = js.native
  
  /**
    * The percentage chance that a host will be actually ejected when an
    * outlier status is detected through consecutive gateway failures. This
    * setting can be used to disable ejection or to ramp it up slowly. Defaults
    * to 0.
    */
  var enforcingConsecutiveGatewayFailure: js.UndefOr[Double] = js.native
  
  /**
    * The percentage chance that a host will be actually ejected when an
    * outlier status is detected through success rate statistics. This setting
    * can be used to disable ejection or to ramp it up slowly. Defaults to 100.
    */
  var enforcingSuccessRate: js.UndefOr[Double] = js.native
  
  /**
    * Time interval between ejection sweep analysis. This can result in both
    * new ejections as well as hosts being returned to service. Defaults to 10
    * seconds.
    */
  var interval: js.UndefOr[SchemaDuration] = js.native
  
  /**
    * Maximum percentage of hosts in the load balancing pool for the backend
    * service that can be ejected. Defaults to 10%.
    */
  var maxEjectionPercent: js.UndefOr[Double] = js.native
  
  /**
    * The number of hosts in a cluster that must have enough request volume to
    * detect success rate outliers. If the number of hosts is less than this
    * setting, outlier detection via success rate statistics is not performed
    * for any host in the cluster. Defaults to 5.
    */
  var successRateMinimumHosts: js.UndefOr[Double] = js.native
  
  /**
    * The minimum number of total requests that must be collected in one
    * interval (as defined by the interval duration above) to include this host
    * in success rate based outlier detection. If the volume is lower than this
    * setting, outlier detection via success rate statistics is not performed
    * for that host. Defaults to 100.
    */
  var successRateRequestVolume: js.UndefOr[Double] = js.native
  
  /**
    * This factor is used to determine the ejection threshold for success rate
    * outlier ejection. The ejection threshold is the difference between the
    * mean success rate, and the product of this factor and the standard
    * deviation of the mean success rate: mean - (stdev *
    * success_rate_stdev_factor). This factor is divided by a thousand to get a
    * double. That is, if the desired factor is 1.9, the runtime value should
    * be 1900. Defaults to 1900.
    */
  var successRateStdevFactor: js.UndefOr[Double] = js.native
}
object SchemaOutlierDetection {
  
  @scala.inline
  def apply(): SchemaOutlierDetection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOutlierDetection]
  }
  
  @scala.inline
  implicit class SchemaOutlierDetectionOps[Self <: SchemaOutlierDetection] (val x: Self) extends AnyVal {
    
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
    def setBaseEjectionTime(value: SchemaDuration): Self = this.set("baseEjectionTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseEjectionTime: Self = this.set("baseEjectionTime", js.undefined)
    
    @scala.inline
    def setConsecutiveErrors(value: Double): Self = this.set("consecutiveErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsecutiveErrors: Self = this.set("consecutiveErrors", js.undefined)
    
    @scala.inline
    def setConsecutiveGatewayFailure(value: Double): Self = this.set("consecutiveGatewayFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsecutiveGatewayFailure: Self = this.set("consecutiveGatewayFailure", js.undefined)
    
    @scala.inline
    def setEnforcingConsecutiveErrors(value: Double): Self = this.set("enforcingConsecutiveErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnforcingConsecutiveErrors: Self = this.set("enforcingConsecutiveErrors", js.undefined)
    
    @scala.inline
    def setEnforcingConsecutiveGatewayFailure(value: Double): Self = this.set("enforcingConsecutiveGatewayFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnforcingConsecutiveGatewayFailure: Self = this.set("enforcingConsecutiveGatewayFailure", js.undefined)
    
    @scala.inline
    def setEnforcingSuccessRate(value: Double): Self = this.set("enforcingSuccessRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnforcingSuccessRate: Self = this.set("enforcingSuccessRate", js.undefined)
    
    @scala.inline
    def setInterval(value: SchemaDuration): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setMaxEjectionPercent(value: Double): Self = this.set("maxEjectionPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxEjectionPercent: Self = this.set("maxEjectionPercent", js.undefined)
    
    @scala.inline
    def setSuccessRateMinimumHosts(value: Double): Self = this.set("successRateMinimumHosts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessRateMinimumHosts: Self = this.set("successRateMinimumHosts", js.undefined)
    
    @scala.inline
    def setSuccessRateRequestVolume(value: Double): Self = this.set("successRateRequestVolume", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessRateRequestVolume: Self = this.set("successRateRequestVolume", js.undefined)
    
    @scala.inline
    def setSuccessRateStdevFactor(value: Double): Self = this.set("successRateStdevFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessRateStdevFactor: Self = this.set("successRateStdevFactor", js.undefined)
  }
}
