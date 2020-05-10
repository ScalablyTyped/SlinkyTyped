package typingsSlinky.gapiClientMonitoring.gapi.client.monitoring

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCollectdTimeSeriesRequest extends js.Object {
  /**
    * The collectd payloads representing the time series data. You must not include more than a single point for each time series, so no two payloads can
    * have the same values for all of the fields plugin, plugin_instance, type, and type_instance.
    */
  var collectdPayloads: js.UndefOr[js.Array[CollectdPayload]] = js.native
  /** The version of collectd that collected the data. Example: "5.3.0-192.el6". */
  var collectdVersion: js.UndefOr[String] = js.native
  /** The monitored resource associated with the time series. */
  var resource: js.UndefOr[MonitoredResource] = js.native
}

object CreateCollectdTimeSeriesRequest {
  @scala.inline
  def apply(): CreateCollectdTimeSeriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCollectdTimeSeriesRequest]
  }
  @scala.inline
  implicit class CreateCollectdTimeSeriesRequestOps[Self <: CreateCollectdTimeSeriesRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollectdPayloads(value: js.Array[CollectdPayload]): Self = {
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
    def withResource(value: MonitoredResource): Self = {
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

