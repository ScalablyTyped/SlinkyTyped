package typingsSlinky.mapboxMapboxSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureId extends js.Object {
  var datasetId: String = js.native
  var featureId: String = js.native
}

object FeatureId {
  @scala.inline
  def apply(datasetId: String, featureId: String): FeatureId = {
    val __obj = js.Dynamic.literal(datasetId = datasetId.asInstanceOf[js.Any], featureId = featureId.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureId]
  }
  @scala.inline
  implicit class FeatureIdOps[Self <: FeatureId] (val x: Self) extends AnyVal {
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
    def withFeatureId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

