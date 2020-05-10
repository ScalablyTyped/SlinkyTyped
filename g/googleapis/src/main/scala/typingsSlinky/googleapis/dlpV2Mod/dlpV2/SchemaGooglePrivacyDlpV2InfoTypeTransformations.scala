package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type of transformation that will scan unstructured text and apply various
  * `PrimitiveTransformation`s to each finding, where the transformation is
  * applied to only values that were identified as a specific info_type.
  */
@js.native
trait SchemaGooglePrivacyDlpV2InfoTypeTransformations extends js.Object {
  /**
    * Transformation for each infoType. Cannot specify more than one for a
    * given infoType. [required]
    */
  var transformations: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2InfoTypeTransformation]] = js.native
}

object SchemaGooglePrivacyDlpV2InfoTypeTransformations {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2InfoTypeTransformations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InfoTypeTransformations]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2InfoTypeTransformationsOps[Self <: SchemaGooglePrivacyDlpV2InfoTypeTransformations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransformations(value: js.Array[SchemaGooglePrivacyDlpV2InfoTypeTransformation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformations")(js.undefined)
        ret
    }
  }
  
}

