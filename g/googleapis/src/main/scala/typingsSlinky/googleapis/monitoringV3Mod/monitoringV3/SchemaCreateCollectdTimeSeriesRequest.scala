package typingsSlinky.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The CreateCollectdTimeSeries request.
  */
@js.native
trait SchemaCreateCollectdTimeSeriesRequest extends js.Object {
  /**
    * The collectd payloads representing the time series data. You must not
    * include more than a single point for each time series, so no two payloads
    * can have the same values for all of the fields plugin, plugin_instance,
    * type, and type_instance.
    */
  var collectdPayloads: js.UndefOr[js.Array[SchemaCollectdPayload]] = js.native
  /**
    * The version of collectd that collected the data. Example:
    * &quot;5.3.0-192.el6&quot;.
    */
  var collectdVersion: js.UndefOr[String] = js.native
  /**
    * The monitored resource associated with the time series.
    */
  var resource: js.UndefOr[SchemaMonitoredResource] = js.native
}

object SchemaCreateCollectdTimeSeriesRequest {
  @scala.inline
  def apply(): SchemaCreateCollectdTimeSeriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateCollectdTimeSeriesRequest]
  }
  @scala.inline
  implicit class SchemaCreateCollectdTimeSeriesRequestOps[Self <: SchemaCreateCollectdTimeSeriesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollectdPayloads(value: js.Array[SchemaCollectdPayload]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectdPayloads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollectdPayloads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectdPayloads")(js.undefined)
        ret
    }
    @scala.inline
    def withCollectdVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectdVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollectdVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectdVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withResource(value: SchemaMonitoredResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resource")(js.undefined)
        ret
    }
  }
  
}

