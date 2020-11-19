package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlotScatterClusterOptions extends js.Object {
  
  /**
    * (Highcharts, Highmaps) When set to `false` prevent cluster overlapping -
    * this option works only when `layoutAlgorithm.type = "grid"`.
    */
  var allowOverlap: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highmaps) Options for the cluster marker animation.
    */
  var animation: js.UndefOr[Boolean | AnimationOptionsObject] = js.native
  
  /**
    * (Highcharts, Highmaps) Options for the cluster data labels.
    */
  var dataLabels: js.UndefOr[DataLabelsOptions] = js.native
  
  /**
    * (Highcharts, Highmaps) Zoom the plot area to the cluster points range
    * when a cluster is clicked.
    */
  var drillToCluster: js.UndefOr[Boolean] = js.native
  
  /**
    * (Highcharts, Highmaps) Whether to enable the marker-clusters module.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  var events: js.UndefOr[PlotScatterClusterEventsOptions] = js.native
  
  /**
    * (Highcharts, Highmaps) Options for layout algorithm. Inside there are
    * options to change the type of the algorithm, gridSize, distance or
    * iterations.
    */
  var layoutAlgorithm: js.UndefOr[PlotScatterClusterLayoutAlgorithmOptions] = js.native
  
  /**
    * (Highcharts, Highmaps) Options for the cluster marker.
    */
  var marker: js.UndefOr[PointMarkerOptionsObject] = js.native
  
  /**
    * (Highcharts, Highmaps) The minimum amount of points to be combined into a
    * cluster. This value has to be greater or equal to 2.
    */
  var minimumClusterSize: js.UndefOr[Double] = js.native
  
  var states: js.UndefOr[PlotScatterClusterStatesOptions] = js.native
  
  /**
    * (Highcharts, Highmaps) An array defining zones within marker clusters.
    *
    * In styled mode, the color zones are styled with the
    * `.highcharts-cluster-zone-{n}` class, or custom classed from the
    * `className` option.
    */
  var zones: js.UndefOr[js.Array[PlotScatterClusterZonesOptions]] = js.native
}
object PlotScatterClusterOptions {
  
  @scala.inline
  def apply(): PlotScatterClusterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotScatterClusterOptions]
  }
  
  @scala.inline
  implicit class PlotScatterClusterOptionsOps[Self <: PlotScatterClusterOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowOverlap(value: Boolean): Self = this.set("allowOverlap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowOverlap: Self = this.set("allowOverlap", js.undefined)
    
    @scala.inline
    def setAnimation(value: Boolean | AnimationOptionsObject): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setDataLabels(value: DataLabelsOptions): Self = this.set("dataLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataLabels: Self = this.set("dataLabels", js.undefined)
    
    @scala.inline
    def setDrillToCluster(value: Boolean): Self = this.set("drillToCluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrillToCluster: Self = this.set("drillToCluster", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setEvents(value: PlotScatterClusterEventsOptions): Self = this.set("events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    
    @scala.inline
    def setLayoutAlgorithm(value: PlotScatterClusterLayoutAlgorithmOptions): Self = this.set("layoutAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayoutAlgorithm: Self = this.set("layoutAlgorithm", js.undefined)
    
    @scala.inline
    def setMarker(value: PointMarkerOptionsObject): Self = this.set("marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    
    @scala.inline
    def setMinimumClusterSize(value: Double): Self = this.set("minimumClusterSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumClusterSize: Self = this.set("minimumClusterSize", js.undefined)
    
    @scala.inline
    def setStates(value: PlotScatterClusterStatesOptions): Self = this.set("states", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStates: Self = this.set("states", js.undefined)
    
    @scala.inline
    def setZonesVarargs(value: PlotScatterClusterZonesOptions*): Self = this.set("zones", js.Array(value :_*))
    
    @scala.inline
    def setZones(value: js.Array[PlotScatterClusterZonesOptions]): Self = this.set("zones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZones: Self = this.set("zones", js.undefined)
  }
}
