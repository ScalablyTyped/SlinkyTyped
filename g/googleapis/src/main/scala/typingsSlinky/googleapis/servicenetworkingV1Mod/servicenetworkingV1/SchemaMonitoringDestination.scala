package typingsSlinky.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration of a specific monitoring destination (the producer project or
  * the consumer project).
  */
@js.native
trait SchemaMonitoringDestination extends js.Object {
  /**
    * Types of the metrics to report to this monitoring destination. Each type
    * must be defined in Service.metrics section.
    */
  var metrics: js.UndefOr[js.Array[String]] = js.native
  /**
    * The monitored resource type. The type must be defined in
    * Service.monitored_resources section.
    */
  var monitoredResource: js.UndefOr[String] = js.native
}

object SchemaMonitoringDestination {
  @scala.inline
  def apply(): SchemaMonitoringDestination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMonitoringDestination]
  }
  @scala.inline
  implicit class SchemaMonitoringDestinationOps[Self <: SchemaMonitoringDestination] (val x: Self) extends AnyVal {
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

