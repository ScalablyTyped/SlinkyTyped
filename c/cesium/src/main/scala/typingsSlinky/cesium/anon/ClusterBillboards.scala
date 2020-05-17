package typingsSlinky.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterBillboards extends js.Object {
  var clusterBillboards: js.UndefOr[Boolean] = js.native
  var clusterLabels: js.UndefOr[Boolean] = js.native
  var clusterPoints: js.UndefOr[Boolean] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var minimumClusterSize: js.UndefOr[Double] = js.native
  var pixelRange: js.UndefOr[Double] = js.native
}

object ClusterBillboards {
  @scala.inline
  def apply(): ClusterBillboards = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterBillboards]
  }
  @scala.inline
  implicit class ClusterBillboardsOps[Self <: ClusterBillboards] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterBillboards(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterBillboards")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterBillboards: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterBillboards")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withClusterPoints(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clusterPoints")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumClusterSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumClusterSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumClusterSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumClusterSize")(js.undefined)
        ret
    }
    @scala.inline
    def withPixelRange(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPixelRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelRange")(js.undefined)
        ret
    }
  }
  
}

