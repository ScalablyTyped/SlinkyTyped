package typingsSlinky.reactLeaflet.mod

import slinky.core.facade.ReactElement
import typingsSlinky.geojson.mod.Feature
import typingsSlinky.geojson.mod.GeoJsonObject
import typingsSlinky.geojson.mod.GeometryObject
import typingsSlinky.leaflet.mod.LatLng_
import typingsSlinky.leaflet.mod.Layer
import typingsSlinky.leaflet.mod.LayerEvent
import typingsSlinky.leaflet.mod.PathOptions
import typingsSlinky.leaflet.mod.StyleFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.leaflet.mod.LayerOptions because Already inherited
- typingsSlinky.reactLeaflet.mod.MapComponentProps because var conflicts: pane. Inlined leaflet
- typingsSlinky.leaflet.mod.GeoJSONOptions because var conflicts: attribution, pane. Inlined coordsToLatLng, filter, onEachFeature, pointToLayer, style
- typingsSlinky.reactLeaflet.mod.FeatureGroupEvents because var conflicts: onclick, oncontextmenu, ondblclick, onmouseout, onmouseover. Inlined onlayeradd, onlayerremove
- typingsSlinky.reactLeaflet.mod.MapLayerProps because var conflicts: attribution, pane. Inlined children */ @js.native
trait GeoJSONProps
  extends PathOptions
     with PathEvents {
  var children: js.UndefOr[Children] = js.native
  /**
    * A Function that will be used for converting GeoJSON coordinates to LatLngs.
    * The default is the coordsToLatLng static method.
    */
  var coordsToLatLng: js.UndefOr[
    js.Function1[
      /* coords */ (js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double]), 
      LatLng_
    ]
  ] = js.native
  var data: GeoJsonObject | js.Array[GeoJsonObject] = js.native
  /**
    * A Function that will be used to decide whether to show a feature or not.
    *
    * The default is to show all features:
    *
    * ```
    * function (geoJsonFeature) {
    *     return true;
    * }
    * ```
    */
  var filter: js.UndefOr[js.Function1[/* geoJsonFeature */ Feature[GeometryObject, js.Any], Boolean]] = js.native
  var leaflet: js.UndefOr[LeafletContext] = js.native
  /**
    * A Function that will be called once for each created Feature, after it
    * has been created and styled. Useful for attaching events and popups to features.
    *
    * The default is to do nothing with the newly created layers:
    *
    * ```
    * function (feature, layer) {}
    * ```
    */
  var onEachFeature: js.UndefOr[
    js.Function2[/* feature */ Feature[GeometryObject, js.Any], /* layer */ Layer, Unit]
  ] = js.native
  var onlayeradd: js.UndefOr[js.Function1[/* event */ LayerEvent, Unit]] = js.native
  var onlayerremove: js.UndefOr[js.Function1[/* event */ LayerEvent, Unit]] = js.native
  /**
    * A Function defining how GeoJSON points spawn Leaflet layers.
    * It is internally called when data is added, passing the GeoJSON point
    * feature and its LatLng.
    *
    * The default is to spawn a default Marker:
    *
    * ```
    * function(geoJsonPoint, latlng) {
    *     return L.marker(latlng);
    * }
    * ```
    */
  var pointToLayer: js.UndefOr[
    js.Function2[
      /* geoJsonPoint */ Feature[typingsSlinky.geojson.mod.Point, js.Any], 
      /* latlng */ LatLng_, 
      Layer
    ]
  ] = js.native
   // should import GeoJSON typings
  /**
    * PathOptions or a Function defining the Path options for styling GeoJSON lines and polygons,
    * called internally when data is added.
    *
    * The default value is to not override any defaults:
    *
    * ```
    * function (geoJsonFeature) {
    *     return {}
    * }
    * ```
    */
  var style: js.UndefOr[PathOptions | StyleFunction[js.Any]] = js.native
}

object GeoJSONProps {
  @scala.inline
  def apply(data: GeoJsonObject | js.Array[GeoJsonObject]): GeoJSONProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoJSONProps]
  }
  @scala.inline
  implicit class GeoJSONPropsOps[Self <: GeoJSONProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withData(value: GeoJsonObject | js.Array[GeoJsonObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: Children): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withCoordsToLatLng(value: /* coords */ (js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double]) => LatLng_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordsToLatLng")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCoordsToLatLng: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordsToLatLng")(js.undefined)
        ret
    }
    @scala.inline
    def withFilter(value: /* geoJsonFeature */ Feature[GeometryObject, js.Any] => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filter")(js.undefined)
        ret
    }
    @scala.inline
    def withLeaflet(value: LeafletContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaflet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeaflet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaflet")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEachFeature(value: (/* feature */ Feature[GeometryObject, js.Any], /* layer */ Layer) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEachFeature")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnEachFeature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEachFeature")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlayeradd(value: /* event */ LayerEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlayeradd")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnlayeradd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlayeradd")(js.undefined)
        ret
    }
    @scala.inline
    def withOnlayerremove(value: /* event */ LayerEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlayerremove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnlayerremove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onlayerremove")(js.undefined)
        ret
    }
    @scala.inline
    def withPointToLayer(
      value: (/* geoJsonPoint */ Feature[typingsSlinky.geojson.mod.Point, js.Any], /* latlng */ LatLng_) => Layer
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointToLayer")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPointToLayer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pointToLayer")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleFunction1(value: /* feature */ js.UndefOr[Feature[GeometryObject, js.Any]] => PathOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyle(value: PathOptions | StyleFunction[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
  }
  
}

