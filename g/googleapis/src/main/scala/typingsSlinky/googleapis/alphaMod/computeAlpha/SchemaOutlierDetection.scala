package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    def withBaseEjectionTime(value: SchemaDuration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseEjectionTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBaseEjectionTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("baseEjectionTime")(js.undefined)
        ret
    }
    @scala.inline
    def withConsecutiveErrors(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consecutiveErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsecutiveErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consecutiveErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withConsecutiveGatewayFailure(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consecutiveGatewayFailure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsecutiveGatewayFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consecutiveGatewayFailure")(js.undefined)
        ret
    }
    @scala.inline
    def withEnforcingConsecutiveErrors(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforcingConsecutiveErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnforcingConsecutiveErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforcingConsecutiveErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withEnforcingConsecutiveGatewayFailure(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforcingConsecutiveGatewayFailure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnforcingConsecutiveGatewayFailure: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforcingConsecutiveGatewayFailure")(js.undefined)
        ret
    }
    @scala.inline
    def withEnforcingSuccessRate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforcingSuccessRate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnforcingSuccessRate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforcingSuccessRate")(js.undefined)
        ret
    }
    @scala.inline
    def withInterval(value: SchemaDuration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxEjectionPercent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxEjectionPercent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxEjectionPercent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxEjectionPercent")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessRateMinimumHosts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successRateMinimumHosts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessRateMinimumHosts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successRateMinimumHosts")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessRateRequestVolume(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successRateRequestVolume")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessRateRequestVolume: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successRateRequestVolume")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccessRateStdevFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successRateStdevFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessRateStdevFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successRateStdevFactor")(js.undefined)
        ret
    }
  }
  
}

