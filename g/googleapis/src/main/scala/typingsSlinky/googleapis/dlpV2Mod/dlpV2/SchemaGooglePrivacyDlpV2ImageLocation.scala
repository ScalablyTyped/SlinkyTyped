package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Location of the finding within an image.
  */
@js.native
trait SchemaGooglePrivacyDlpV2ImageLocation extends js.Object {
  /**
    * Bounding boxes locating the pixels within the image containing the
    * finding.
    */
  var boundingBoxes: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2BoundingBox]] = js.native
}

object SchemaGooglePrivacyDlpV2ImageLocation {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2ImageLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ImageLocation]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ImageLocationOps[Self <: SchemaGooglePrivacyDlpV2ImageLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoundingBoxes(value: js.Array[SchemaGooglePrivacyDlpV2BoundingBox]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundingBoxes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundingBoxes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundingBoxes")(js.undefined)
        ret
    }
  }
  
}

