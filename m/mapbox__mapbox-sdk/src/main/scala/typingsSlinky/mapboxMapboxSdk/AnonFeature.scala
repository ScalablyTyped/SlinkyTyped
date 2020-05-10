package typingsSlinky.mapboxMapboxSdk

import typingsSlinky.mapboxMapboxSdk.datasetsMod.DataSetsFeature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFeature extends js.Object {
  var datasetId: String = js.native
  var feature: DataSetsFeature = js.native
  var featureId: String = js.native
}

object AnonFeature {
  @scala.inline
  def apply(datasetId: String, feature: DataSetsFeature, featureId: String): AnonFeature = {
    val __obj = js.Dynamic.literal(datasetId = datasetId.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], featureId = featureId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFeature]
  }
  @scala.inline
  implicit class AnonFeatureOps[Self <: AnonFeature] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatasetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datasetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeature(value: DataSetsFeature): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("feature")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeatureId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

