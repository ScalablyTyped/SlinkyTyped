package typingsSlinky.dojo.dojox.geo.openlayers.base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/geo/openlayers/_base.__WidgetFeatureArgs.html
  *
  * The keyword arguments that can be passed in a WidgetFeature constructor.
  * You must define a least one widget retrieval parameter and the geo-localization parameters.
  *
  */
@js.native
trait WidgetFeatureArgs extends js.Object {
  /**
    * Function for widget creation. Must return a `dijit._Widget.
    *
    */
  var createWidget: js.Function = js.native
  /**
    * The digitId of an existing widget.
    *
    */
  var dijitId: String = js.native
  /**
    * The class of a widget to create.
    *
    */
  var dojoType: String = js.native
  /**
    * The height of the widget.
    *
    */
  var height: Double = js.native
  /**
    * The latitude, in decimal degrees where to place the widget.
    *
    */
  var latitude: Double = js.native
  /**
    * The longitude, in decimal degrees where to place the widget.
    *
    */
  var longitude: Double = js.native
  /**
    * An already created widget.
    *
    */
  var widget: js.Object = js.native
  /**
    * The width of the widget.
    *
    */
  var width: Double = js.native
}

object WidgetFeatureArgs {
  @scala.inline
  def apply(
    createWidget: js.Function,
    dijitId: String,
    dojoType: String,
    height: Double,
    latitude: Double,
    longitude: Double,
    widget: js.Object,
    width: Double
  ): WidgetFeatureArgs = {
    val __obj = js.Dynamic.literal(createWidget = createWidget.asInstanceOf[js.Any], dijitId = dijitId.asInstanceOf[js.Any], dojoType = dojoType.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], widget = widget.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidgetFeatureArgs]
  }
  @scala.inline
  implicit class WidgetFeatureArgsOps[Self <: WidgetFeatureArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateWidget(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createWidget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDijitId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dijitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDojoType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dojoType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("latitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongitude(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longitude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidget(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

