package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TravelMode extends Object {
  /**
    * The description explaining the selected travel mode. A listing of these descriptions can be found in the [ArcGIS Online documentation](https://doc.arcgis.com/en/arcgis-online/reference/travel-modes.htm#GUID-96DF7F50-E0B2-4BF3-8271-EB515D3F0107).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#TravelMode)
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The unique identifier specific for this travel mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#TravelMode)
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The cost attribute on which to optimize the analysis. For example `Miles`, `Minutes`, `Travel Time`, `Kilometers`, `TimeAt1KPH`, `WalkTime`, and `TruckTravelTime`. Take note that attribute names are specific to the network dataset. They may be different if using another Network Analysis service besides the one hosted via ArcGIS Online.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#TravelMode)
    */
  var impedanceAttributeName: js.UndefOr[String] = js.native
  /**
    * Name of the travel mode. Users of ArcGIS Online or ArcGIS Enterprise can define custom travel modes inside their Organization settings. Authors of stand alone Network Analysis Services can define their own travel modes inside a network dataset.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#TravelMode)
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The time-based cost attribute for reporting directions. For example, `Minutes`, `Travel Time`, `TimeAt1KPH`, `WalkTime`, and `TruckTravelTime`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#TravelMode)
    */
  var timeAttributeName: js.UndefOr[String] = js.native
}

object TravelMode {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): TravelMode = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[TravelMode]
  }
  @scala.inline
  implicit class TravelModeOps[Self <: TravelMode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withImpedanceAttributeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impedanceAttributeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImpedanceAttributeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("impedanceAttributeName")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeAttributeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeAttributeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeAttributeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeAttributeName")(js.undefined)
        ret
    }
  }
  
}

