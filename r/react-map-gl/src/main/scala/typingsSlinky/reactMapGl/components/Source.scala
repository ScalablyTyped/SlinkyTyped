package typingsSlinky.reactMapGl.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.geojson.mod.Feature
import typingsSlinky.geojson.mod.FeatureCollection
import typingsSlinky.geojson.mod.GeoJsonProperties
import typingsSlinky.geojson.mod.Geometry
import typingsSlinky.reactMapGl.mod.SourceProps
import typingsSlinky.reactMapGl.reactMapGlStrings.mapbox
import typingsSlinky.reactMapGl.reactMapGlStrings.terrarium
import typingsSlinky.reactMapGl.reactMapGlStrings.tms
import typingsSlinky.reactMapGl.reactMapGlStrings.xyz
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Source {
  @JSImport("react-map-gl", "Source")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactMapGl.mod.Source] {
    @scala.inline
    def attribution(value: String): this.type = set("attribution", value.asInstanceOf[js.Any])
    @scala.inline
    def boundsVarargs(value: Double*): this.type = set("bounds", js.Array(value :_*))
    @scala.inline
    def bounds(value: js.Array[Double]): this.type = set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def buffer(value: Double): this.type = set("buffer", value.asInstanceOf[js.Any])
    @scala.inline
    def cluster(value: Boolean): this.type = set("cluster", value.asInstanceOf[js.Any])
    @scala.inline
    def clusterMaxZoom(value: Double): this.type = set("clusterMaxZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def clusterProperties(value: js.Object): this.type = set("clusterProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def clusterRadius(value: Double): this.type = set("clusterRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def coordinatesVarargs(value: js.Array[Double]*): this.type = set("coordinates", js.Array(value :_*))
    @scala.inline
    def coordinates(value: js.Array[js.Array[Double]]): this.type = set("coordinates", value.asInstanceOf[js.Any])
    @scala.inline
    def data(
      value: (Feature[Geometry, GeoJsonProperties]) | (FeatureCollection[Geometry, GeoJsonProperties]) | String
    ): this.type = set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def encoding(value: terrarium | mapbox): this.type = set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def generateId(value: Boolean): this.type = set("generateId", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def lineMetrics(value: Boolean): this.type = set("lineMetrics", value.asInstanceOf[js.Any])
    @scala.inline
    def maxzoom(value: Double): this.type = set("maxzoom", value.asInstanceOf[js.Any])
    @scala.inline
    def minzoom(value: Double): this.type = set("minzoom", value.asInstanceOf[js.Any])
    @scala.inline
    def scheme(value: xyz | tms): this.type = set("scheme", value.asInstanceOf[js.Any])
    @scala.inline
    def tileSize(value: Double): this.type = set("tileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def tilesVarargs(value: String*): this.type = set("tiles", js.Array(value :_*))
    @scala.inline
    def tiles(value: js.Array[String]): this.type = set("tiles", value.asInstanceOf[js.Any])
    @scala.inline
    def tolerance(value: Double): this.type = set("tolerance", value.asInstanceOf[js.Any])
    @scala.inline
    def url(value: String): this.type = set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def urlsVarargs(value: String*): this.type = set("urls", js.Array(value :_*))
    @scala.inline
    def urls(value: js.Array[String]): this.type = set("urls", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SourceProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(`type`: String): Builder = {
    val __props = js.Dynamic.literal()
    __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SourceProps]))
  }
}

