package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeInfoProperties extends js.Object {
  /**
    * The name of the field containing the end time information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#endField)
    */
  var endField: js.UndefOr[String] = js.native
  /**
    * The time extent defines the start time and end time for all data in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#fullTimeExtent)
    *
    * @default null
    */
  var fullTimeExtent: js.UndefOr[TimeExtentProperties] = js.native
  /**
    * The time interval defines the granularity of the temporal data and allows you to visualize the data at specified intervals using the [time slider widget](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html). Usually temporal data is collected at regular intervals such as every hour or every day.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#interval)
    */
  var interval: js.UndefOr[TimeIntervalProperties] = js.native
  /**
    * The name of the field containing the start time information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#startField)
    */
  var startField: js.UndefOr[String] = js.native
  /**
    * The name of the field used to join or group discrete locations. For example, for hurricane tracks, trackIdField can be the hurricane name field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#trackIdField)
    */
  var trackIdField: js.UndefOr[String] = js.native
}

object TimeInfoProperties {
  @scala.inline
  def apply(): TimeInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeInfoProperties]
  }
  @scala.inline
  implicit class TimeInfoPropertiesOps[Self <: TimeInfoProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endField")(js.undefined)
        ret
    }
    @scala.inline
    def withFullTimeExtent(value: TimeExtentProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullTimeExtent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullTimeExtent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullTimeExtent")(js.undefined)
        ret
    }
    @scala.inline
    def withInterval(value: TimeIntervalProperties): Self = {
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
    def withStartField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startField")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackIdField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackIdField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackIdField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackIdField")(js.undefined)
        ret
    }
  }
  
}

