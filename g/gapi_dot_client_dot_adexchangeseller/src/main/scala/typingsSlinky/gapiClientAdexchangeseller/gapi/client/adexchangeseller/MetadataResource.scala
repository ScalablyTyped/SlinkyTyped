package typingsSlinky.gapiClientAdexchangeseller.gapi.client.adexchangeseller

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetadataResource extends js.Object {
  var dimensions: DimensionsResource = js.native
  var metrics: MetricsResource = js.native
}

object MetadataResource {
  @scala.inline
  def apply(dimensions: DimensionsResource, metrics: MetricsResource): MetadataResource = {
    val __obj = js.Dynamic.literal(dimensions = dimensions.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataResource]
  }
  @scala.inline
  implicit class MetadataResourceOps[Self <: MetadataResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDimensions(value: DimensionsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMetrics(value: MetricsResource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("metrics")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

