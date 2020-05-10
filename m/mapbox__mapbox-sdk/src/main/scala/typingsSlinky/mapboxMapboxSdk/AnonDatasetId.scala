package typingsSlinky.mapboxMapboxSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDatasetId extends js.Object {
  var datasetId: String = js.native
}

object AnonDatasetId {
  @scala.inline
  def apply(datasetId: String): AnonDatasetId = {
    val __obj = js.Dynamic.literal(datasetId = datasetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDatasetId]
  }
  @scala.inline
  implicit class AnonDatasetIdOps[Self <: AnonDatasetId] (val x: Self) extends AnyVal {
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
  }
  
}

