package typingsSlinky.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IClusterLayerOptions extends js.Object {
  /**
    * A callback function that is fired after the clustering for a map view has completed. This is useful if you want to generate a list of locations based on what is in the current view.
    */
  var callback: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Defines how clusters are positioned on the map. Default: MeanAverage
    */
  var clusterPlacementType: js.UndefOr[ClusterPlacementType] = js.native
  /**
    * A callback function that allows you to process a clustered pushpin before it is added to a layer. This is useful if you want to add events or set style options on the clustered pushpin.
    */
  var clusteredPinCallback: js.UndefOr[js.Function1[/* pin */ ClusterPushpin, Unit]] = js.native
  /**
    * Indicates if the layer should cluster the locations or not. Default: true
    */
  var clusteringEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The width and height of the gird cells used for clustering in pixels. Default: 45
    */
  var gridSize: js.UndefOr[Double] = js.native
  /**
    * Offsets the placement of clustered pushpins by a set number of pixels. This option is only available when the placement type is set to GridCenter.
    * This is useful if you have multiple cluster layers on the map and you want to offset the clustered pushpins between the layers so that they are visible,
    * otherwise the clusters from the different layers would overlap completely.
    */
  var layerOffset: js.UndefOr[Point] = js.native
  /**
    * A boolean indicating if the layer is visible or not.
    */
  var visible: js.UndefOr[Boolean] = js.native
  /**
    * The z-index of the layer.
    */
  var zIndex: js.UndefOr[Double] = js.native
}

object IClusterLayerOptions {
  @scala.inline
  def apply(): IClusterLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClusterLayerOptions]
  }
  @scala.inline
  implicit class IClusterLayerOptionsOps[Self <: IClusterLayerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callback")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterPlacementType(value: ClusterPlacementType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterPlacementType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterPlacementType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterPlacementType")(js.undefined)
        ret
    }
    @scala.inline
    def withClusteredPinCallback(value: /* pin */ ClusterPushpin => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusteredPinCallback")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutClusteredPinCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusteredPinCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withClusteringEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusteringEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusteringEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusteringEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withGridSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGridSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridSize")(js.undefined)
        ret
    }
    @scala.inline
    def withLayerOffset(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayerOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layerOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
  }
  
}

