package typingsSlinky.kendoUi.kendo.dataviz.ui

import typingsSlinky.kendoUi.kendo.dataviz.map.Location
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapOptions extends js.Object {
  var beforeReset: js.UndefOr[js.Function1[/* e */ MapBeforeResetEvent, Unit]] = js.native
  var center: js.UndefOr[js.Any | Location] = js.native
  var click: js.UndefOr[js.Function1[/* e */ MapClickEvent, Unit]] = js.native
  var controls: js.UndefOr[MapControls] = js.native
  var layerDefaults: js.UndefOr[MapLayerDefaults] = js.native
  var layers: js.UndefOr[js.Array[MapLayer]] = js.native
  var markerActivate: js.UndefOr[js.Function1[/* e */ MapMarkerActivateEvent, Unit]] = js.native
  var markerClick: js.UndefOr[js.Function1[/* e */ MapMarkerClickEvent, Unit]] = js.native
  var markerCreated: js.UndefOr[js.Function1[/* e */ MapMarkerCreatedEvent, Unit]] = js.native
  var markerDefaults: js.UndefOr[MapMarkerDefaults] = js.native
  var markers: js.UndefOr[js.Array[MapMarker]] = js.native
  var maxZoom: js.UndefOr[Double] = js.native
  var minSize: js.UndefOr[Double] = js.native
  var minZoom: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var pan: js.UndefOr[js.Function1[/* e */ MapPanEvent, Unit]] = js.native
  var panEnd: js.UndefOr[js.Function1[/* e */ MapPanEndEvent, Unit]] = js.native
  var pannable: js.UndefOr[Boolean] = js.native
  var reset: js.UndefOr[js.Function1[/* e */ MapResetEvent, Unit]] = js.native
  var shapeClick: js.UndefOr[js.Function1[/* e */ MapShapeClickEvent, Unit]] = js.native
  var shapeCreated: js.UndefOr[js.Function1[/* e */ MapShapeCreatedEvent, Unit]] = js.native
  var shapeFeatureCreated: js.UndefOr[js.Function1[/* e */ MapShapeFeatureCreatedEvent, Unit]] = js.native
  var shapeMouseEnter: js.UndefOr[js.Function1[/* e */ MapShapeMouseEnterEvent, Unit]] = js.native
  var shapeMouseLeave: js.UndefOr[js.Function1[/* e */ MapShapeMouseLeaveEvent, Unit]] = js.native
  var wraparound: js.UndefOr[Boolean] = js.native
  var zoom: js.UndefOr[Double] = js.native
  var zoomEnd: js.UndefOr[js.Function1[/* e */ MapZoomEndEvent, Unit]] = js.native
  var zoomStart: js.UndefOr[js.Function1[/* e */ MapZoomStartEvent, Unit]] = js.native
  var zoomable: js.UndefOr[Boolean] = js.native
}

object MapOptions {
  @scala.inline
  def apply(): MapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapOptions]
  }
  @scala.inline
  implicit class MapOptionsOps[Self <: MapOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeforeReset(value: /* e */ MapBeforeResetEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeReset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeReset")(js.undefined)
        ret
    }
    @scala.inline
    def withCenter(value: js.Any | Location): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(js.undefined)
        ret
    }
    @scala.inline
    def withClick(value: /* e */ MapClickEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("click")(js.undefined)
        ret
    }
    @scala.inline
    def withControls(value: MapControls): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controls")(js.undefined)
        ret
    }
    @scala.inline
    def withLayerDefaults(value: MapLayerDefaults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayerDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerDefaults")(js.undefined)
        ret
    }
    @scala.inline
    def withLayers(value: js.Array[MapLayer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layers")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerActivate(value: /* e */ MapMarkerActivateEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerActivate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMarkerActivate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerActivate")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerClick(value: /* e */ MapMarkerClickEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMarkerClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerClick")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerCreated(value: /* e */ MapMarkerCreatedEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerCreated")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMarkerCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerCreated")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkerDefaults(value: MapMarkerDefaults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkerDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markerDefaults")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkers(value: js.Array[MapMarker]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markers")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withMinSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMinZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoom")(js.undefined)
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
    def withPan(value: /* e */ MapPanEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pan")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pan")(js.undefined)
        ret
    }
    @scala.inline
    def withPanEnd(value: /* e */ MapPanEndEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPanEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withPannable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pannable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPannable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pannable")(js.undefined)
        ret
    }
    @scala.inline
    def withReset(value: /* e */ MapResetEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(js.undefined)
        ret
    }
    @scala.inline
    def withShapeClick(value: /* e */ MapShapeClickEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeClick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutShapeClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeClick")(js.undefined)
        ret
    }
    @scala.inline
    def withShapeCreated(value: /* e */ MapShapeCreatedEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeCreated")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutShapeCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeCreated")(js.undefined)
        ret
    }
    @scala.inline
    def withShapeFeatureCreated(value: /* e */ MapShapeFeatureCreatedEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeFeatureCreated")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutShapeFeatureCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeFeatureCreated")(js.undefined)
        ret
    }
    @scala.inline
    def withShapeMouseEnter(value: /* e */ MapShapeMouseEnterEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeMouseEnter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutShapeMouseEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeMouseEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withShapeMouseLeave(value: /* e */ MapShapeMouseLeaveEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeMouseLeave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutShapeMouseLeave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shapeMouseLeave")(js.undefined)
        ret
    }
    @scala.inline
    def withWraparound(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wraparound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWraparound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wraparound")(js.undefined)
        ret
    }
    @scala.inline
    def withZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomEnd(value: /* e */ MapZoomEndEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomEnd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutZoomEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomStart(value: /* e */ MapZoomStartEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomStart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutZoomStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomStart")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomable")(js.undefined)
        ret
    }
  }
  
}

