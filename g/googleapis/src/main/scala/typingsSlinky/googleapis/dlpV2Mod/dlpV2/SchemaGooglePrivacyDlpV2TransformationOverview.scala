package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Overview of the modifications that occurred.
  */
@js.native
trait SchemaGooglePrivacyDlpV2TransformationOverview extends js.Object {
  /**
    * Transformations applied to the dataset.
    */
  var transformationSummaries: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2TransformationSummary]] = js.native
  /**
    * Total size in bytes that were transformed in some way.
    */
  var transformedBytes: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2TransformationOverview {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2TransformationOverview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2TransformationOverview]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2TransformationOverviewOps[Self <: SchemaGooglePrivacyDlpV2TransformationOverview] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransformationSummaries(value: js.Array[SchemaGooglePrivacyDlpV2TransformationSummary]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformationSummaries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformationSummaries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformationSummaries")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformedBytes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformedBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformedBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformedBytes")(js.undefined)
        ret
    }
  }
  
}

