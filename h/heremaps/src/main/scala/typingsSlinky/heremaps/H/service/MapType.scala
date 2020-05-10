package typingsSlinky.heremaps.H.service

import typingsSlinky.heremaps.H.map.layer.MarkerTileLayer
import typingsSlinky.heremaps.H.map.layer.TileLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A map type is an object holding tile layers corresponding to a map type (e.g. 'normal', 'satellite' or 'terrain'). A map type contains at least a map property which defines the basic
  * map layer for a given map type. In addition it can hold other map layers with the given style, e.g. base, xbase, traffic etc.
  * {@link https://developer.here.com/documentation/maps/content/api_reference/H.service.html#.MapType}
  * @property map {H.map.layer.TileLayer} - the basic map tiles with all features and labels
  * @property mapnight {H.map.layer.TileLayer} - the basic map tiles with all features and labels (night mode)
  * @property xbase {H.map.layer.TileLayer=} - map tiles without features and labels
  * @property xbasenight {H.map.layer.TileLayer=} - map tiles without features and labels (night mode)
  * @property base {H.map.layer.TileLayer=} - map tiles without labels
  * @property basenight {H.map.layer.TileLayer=} - map tiles without labels (night mode)
  * @property trafficincidents {H.map.layer.TileLayer=} - map tiles with traffic flow highlighting
  * @property transit {H.map.layer.TileLayer=} - map tiles with public transit lines highlighted
  * @property labels {H.map.layer.TileLayer=} - transparent map tiles with labels only
  */
@js.native
trait MapType extends js.Object {
  var base: TileLayer = js.native
  var basenight: js.UndefOr[TileLayer | Null] = js.native
  var labels: TileLayer = js.native
  var map: TileLayer = js.native
  var mapnight: js.UndefOr[TileLayer | Null] = js.native
  var trafficincidents: js.UndefOr[MarkerTileLayer | Null] = js.native
  var transit: js.UndefOr[TileLayer] = js.native
  var xbase: TileLayer = js.native
  var xbasenight: js.UndefOr[TileLayer | Null] = js.native
}

object MapType {
  @scala.inline
  def apply(base: TileLayer, labels: TileLayer, map: TileLayer, xbase: TileLayer): MapType = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], xbase = xbase.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapType]
  }
  @scala.inline
  implicit class MapTypeOps[Self <: MapType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase(value: TileLayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabels(value: TileLayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMap(value: TileLayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXbase(value: TileLayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xbase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBasenight(value: TileLayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basenight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBasenight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basenight")(js.undefined)
        ret
    }
    @scala.inline
    def withBasenightNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basenight")(null)
        ret
    }
    @scala.inline
    def withMapnight(value: TileLayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapnight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapnight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapnight")(js.undefined)
        ret
    }
    @scala.inline
    def withMapnightNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapnight")(null)
        ret
    }
    @scala.inline
    def withTrafficincidents(value: MarkerTileLayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trafficincidents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrafficincidents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trafficincidents")(js.undefined)
        ret
    }
    @scala.inline
    def withTrafficincidentsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trafficincidents")(null)
        ret
    }
    @scala.inline
    def withTransit(value: TileLayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transit")(js.undefined)
        ret
    }
    @scala.inline
    def withXbasenight(value: TileLayer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xbasenight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXbasenight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xbasenight")(js.undefined)
        ret
    }
    @scala.inline
    def withXbasenightNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xbasenight")(null)
        ret
    }
  }
  
}

