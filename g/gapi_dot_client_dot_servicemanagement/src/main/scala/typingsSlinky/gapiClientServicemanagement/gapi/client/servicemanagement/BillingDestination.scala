package typingsSlinky.gapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BillingDestination extends js.Object {
  /**
    * Names of the metrics to report to this billing destination.
    * Each name must be defined in Service.metrics section.
    */
  var metrics: js.UndefOr[js.Array[String]] = js.native
  /**
    * The monitored resource type. The type must be defined in
    * Service.monitored_resources section.
    */
  var monitoredResource: js.UndefOr[String] = js.native
}

object BillingDestination {
  @scala.inline
  def apply(): BillingDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingDestination]
  }
  @scala.inline
  implicit class BillingDestinationOps[Self <: BillingDestination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMetrics(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metrics")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMetrics: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metrics")(js.undefined)
        ret
    }
    @scala.inline
    def withMonitoredResource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitoredResource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonitoredResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monitoredResource")(js.undefined)
        ret
    }
  }
  
}

