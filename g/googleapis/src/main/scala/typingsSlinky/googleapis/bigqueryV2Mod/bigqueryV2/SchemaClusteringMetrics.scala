package typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Evaluation metrics for clustering models.
  */
@js.native
trait SchemaClusteringMetrics extends js.Object {
  /**
    * Davies-Bouldin index.
    */
  var daviesBouldinIndex: js.UndefOr[Double] = js.native
  /**
    * Mean of squared distances between each sample to its cluster centroid.
    */
  var meanSquaredDistance: js.UndefOr[Double] = js.native
}

object SchemaClusteringMetrics {
  @scala.inline
  def apply(): SchemaClusteringMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClusteringMetrics]
  }
  @scala.inline
  implicit class SchemaClusteringMetricsOps[Self <: SchemaClusteringMetrics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDaviesBouldinIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daviesBouldinIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDaviesBouldinIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daviesBouldinIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withMeanSquaredDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meanSquaredDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeanSquaredDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meanSquaredDistance")(js.undefined)
        ret
    }
  }
  
}

