package typingsSlinky.googleapis.translateV2Mod.translateV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDetectionsListResponse extends js.Object {
  /**
    * A detections contains detection results of several text
    */
  var detections: js.UndefOr[js.Array[SchemaDetectionsResource]] = js.native
}

object SchemaDetectionsListResponse {
  @scala.inline
  def apply(): SchemaDetectionsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDetectionsListResponse]
  }
  @scala.inline
  implicit class SchemaDetectionsListResponseOps[Self <: SchemaDetectionsListResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetections(value: js.Array[SchemaDetectionsResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detections")(js.undefined)
        ret
    }
  }
  
}

