package typingsSlinky.leafletMarkercluster.mod

import typingsSlinky.leaflet.mod.DivIcon_
import typingsSlinky.leaflet.mod.IconOptions
import typingsSlinky.leaflet.mod.Icon_
import typingsSlinky.leaflet.mod.LayerOptions
import typingsSlinky.leaflet.mod.PolylineOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkerClusterGroupOptions extends LayerOptions {
  /*
    * Smoothly split / merge cluster children when zooming and spiderfying.
    * If L.DomUtil.TRANSITION is false, this option has no effect (no animation is possible).
    */
  var animate: js.UndefOr[Boolean] = js.native
  /*
    * If set to true (and animate option is also true) then adding individual markers to the
    * MarkerClusterGroup after it has been added to the map will add the marker and animate it
    * into the cluster. Defaults to false as this gives better performance when bulk adding markers.
    * addLayers does not support this, only addLayer with individual Markers.
    */
  var animateAddingMarkers: js.UndefOr[Boolean] = js.native
  /*
    * Time delay (in ms) between consecutive periods of processing for addLayers. Default to 50ms.
    */
  var chunkDelay: js.UndefOr[Double] = js.native
  /*
    * Time interval (in ms) during which addLayers works before pausing to let the rest of the page process.
    * In particular, this prevents the page from freezing while adding a lot of markers. Defaults to 200ms.
    */
  var chunkInterval: js.UndefOr[Double] = js.native
  /*
    * Callback function that is called at the end of each chunkInterval.
    * Typically used to implement a progress indicator. Defaults to null.
    */
  var chunkProgress: js.UndefOr[
    js.Function3[
      /* processedMarkers */ Double, 
      /* totalMarkers */ Double, 
      /* elapsedTime */ Double, 
      Unit
    ]
  ] = js.native
  /*
    * Boolean to split the addLayers processing in to small intervals so that the page does not freeze.
    */
  var chunkedLoading: js.UndefOr[Boolean] = js.native
  /*
    * If set, at this zoom level and below markers will not be clustered. This defaults to disabled.
    */
  var disableClusteringAtZoom: js.UndefOr[Double] = js.native
  /*
    * Function used to create the cluster icon
    */
  var iconCreateFunction: js.UndefOr[js.Function1[/* cluster */ MarkerCluster, Icon_[IconOptions] | DivIcon_]] = js.native
  /*
    * The maximum radius that a cluster will cover from the central marker (in pixels). Default 80.
    * Decreasing will make more, smaller clusters. You can also use a function that accepts
    * the current map zoom and returns the maximum cluster radius in pixels
    */
  var maxClusterRadius: js.UndefOr[Double | (js.Function1[/* zoom */ Double, Double])] = js.native
  /*
    * Options to pass when creating the L.Polygon(points, options) to show the bounds of a cluster.
    * Defaults to empty
    */
  var polygonOptions: js.UndefOr[PolylineOptions] = js.native
  /*
    * Clusters and markers too far from the viewport are removed from the map
    * for performance.
    */
  var removeOutsideVisibleBounds: js.UndefOr[Boolean] = js.native
  /*
    * When you mouse over a cluster it shows the bounds of its markers.
    */
  var showCoverageOnHover: js.UndefOr[Boolean] = js.native
  /*
    * If set to true, overrides the icon for all added markers to make them appear as a 1 size cluster.
    */
  var singleMarkerMode: js.UndefOr[Boolean] = js.native
  /*
    * Allows you to specify PolylineOptions to style spider legs.
    * By default, they are { weight: 1.5, color: '#222', opacity: 0.5 }.
    */
  var spiderLegPolylineOptions: js.UndefOr[PolylineOptions] = js.native
  /*
    * Increase from 1 to increase the distance away from the center that spiderfied markers are placed.
    * Use if you are using big marker icons (Default: 1).
    */
  var spiderfyDistanceMultiplier: js.UndefOr[Double] = js.native
  /*
    * When you click a cluster at the bottom zoom level we spiderfy it
    * so you can see all of its markers.
    */
  var spiderfyOnMaxZoom: js.UndefOr[Boolean] = js.native
  /*
    * When you click a cluster we zoom to its bounds.
    */
  var zoomToBoundsOnClick: js.UndefOr[Boolean] = js.native
}

object MarkerClusterGroupOptions {
  @scala.inline
  def apply(): MarkerClusterGroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkerClusterGroupOptions]
  }
  @scala.inline
  implicit class MarkerClusterGroupOptionsOps[Self <: MarkerClusterGroupOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimateAddingMarkers(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateAddingMarkers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimateAddingMarkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateAddingMarkers")(js.undefined)
        ret
    }
    @scala.inline
    def withChunkDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkDelay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunkDelay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkDelay")(js.undefined)
        ret
    }
    @scala.inline
    def withChunkInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunkInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withChunkProgress(
      value: (/* processedMarkers */ Double, /* totalMarkers */ Double, /* elapsedTime */ Double) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkProgress")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutChunkProgress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkProgress")(js.undefined)
        ret
    }
    @scala.inline
    def withChunkedLoading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkedLoading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunkedLoading: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkedLoading")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableClusteringAtZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableClusteringAtZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableClusteringAtZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableClusteringAtZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withIconCreateFunction(value: /* cluster */ MarkerCluster => Icon_[IconOptions] | DivIcon_): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconCreateFunction")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIconCreateFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconCreateFunction")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxClusterRadiusFunction1(value: /* zoom */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxClusterRadius")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMaxClusterRadius(value: Double | (js.Function1[/* zoom */ Double, Double])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxClusterRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxClusterRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxClusterRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withPolygonOptions(value: PolylineOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygonOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolygonOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("polygonOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveOutsideVisibleBounds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeOutsideVisibleBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveOutsideVisibleBounds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeOutsideVisibleBounds")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCoverageOnHover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCoverageOnHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCoverageOnHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCoverageOnHover")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleMarkerMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleMarkerMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleMarkerMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleMarkerMode")(js.undefined)
        ret
    }
    @scala.inline
    def withSpiderLegPolylineOptions(value: PolylineOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spiderLegPolylineOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpiderLegPolylineOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spiderLegPolylineOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withSpiderfyDistanceMultiplier(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spiderfyDistanceMultiplier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpiderfyDistanceMultiplier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spiderfyDistanceMultiplier")(js.undefined)
        ret
    }
    @scala.inline
    def withSpiderfyOnMaxZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spiderfyOnMaxZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpiderfyOnMaxZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spiderfyOnMaxZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withZoomToBoundsOnClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomToBoundsOnClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoomToBoundsOnClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoomToBoundsOnClick")(js.undefined)
        ret
    }
  }
  
}

