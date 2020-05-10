package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SupportingWidgetDefaultsSketch extends Object {
  /**
    * An object containing the `defaultUpdateOptions` for the [Sketch](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var defaultUpdateOptions: js.UndefOr[js.Any] = js.native
  /**
    * The marker symbol used to symbolize any point feature updates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var markerSymbol: js.UndefOr[SimpleMarkerSymbol] = js.native
  /**
    * The polygon symbol used to symbolize any polygon feature updates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var polygonSymbol: js.UndefOr[SimpleFillSymbol] = js.native
  /**
    * The line symbol used to symbolize any line feature updates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var polylineSymbol: js.UndefOr[SimpleLineSymbol] = js.native
}

object SupportingWidgetDefaultsSketch {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SupportingWidgetDefaultsSketch = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SupportingWidgetDefaultsSketch]
  }
  @scala.inline
  implicit class SupportingWidgetDefaultsSketchOps[Self <: SupportingWidgetDefaultsSketch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultUpdateOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultUpdateOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultUpdateOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultUpdateOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerSymbol(value: SimpleMarkerSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerSymbol")(js.undefined)
        ret
    }
    @scala.inline
    def withPolygonSymbol(value: SimpleFillSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygonSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolygonSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygonSymbol")(js.undefined)
        ret
    }
    @scala.inline
    def withPolylineSymbol(value: SimpleLineSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polylineSymbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolylineSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polylineSymbol")(js.undefined)
        ret
    }
  }
  
}

