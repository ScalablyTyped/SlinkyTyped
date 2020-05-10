package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HealthCheckObservation extends js.Object {
  /**
    * The IP address of the Amazon Route 53 health checker that provided the failure reason in StatusReport.
    */
  var IPAddress: js.UndefOr[typingsSlinky.awsSdk.route53Mod.IPAddress] = js.native
  /**
    * The region of the Amazon Route 53 health checker that provided the status in StatusReport.
    */
  var Region: js.UndefOr[HealthCheckRegion] = js.native
  /**
    * A complex type that contains the last failure reason as reported by one Amazon Route 53 health checker and the time of the failed health check.
    */
  var StatusReport: js.UndefOr[typingsSlinky.awsSdk.route53Mod.StatusReport] = js.native
}

object HealthCheckObservation {
  @scala.inline
  def apply(): HealthCheckObservation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HealthCheckObservation]
  }
  @scala.inline
  implicit class HealthCheckObservationOps[Self <: HealthCheckObservation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIPAddress(value: IPAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIPAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IPAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: HealthCheckRegion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Region")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusReport(value: StatusReport): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusReport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusReport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusReport")(js.undefined)
        ret
    }
  }
  
}

