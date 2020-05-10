package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A column with a semantic tag attached.
  */
@js.native
trait SchemaGooglePrivacyDlpV2QuasiId extends js.Object {
  /**
    * A column can be tagged with a custom tag. In this case, the user must
    * indicate an auxiliary table that contains statistical information on the
    * possible values of this column (below).
    */
  var customTag: js.UndefOr[String] = js.native
  /**
    * Identifies the column. [required]
    */
  var field: js.UndefOr[SchemaGooglePrivacyDlpV2FieldId] = js.native
  /**
    * If no semantic tag is indicated, we infer the statistical model from the
    * distribution of values in the input data
    */
  var inferred: js.UndefOr[SchemaGoogleProtobufEmpty] = js.native
  /**
    * A column can be tagged with a InfoType to use the relevant public dataset
    * as a statistical model of population, if available. We currently support
    * US ZIP codes, region codes, ages and genders. To programmatically obtain
    * the list of supported InfoTypes, use ListInfoTypes with the
    * supported_by=RISK_ANALYSIS filter.
    */
  var infoType: js.UndefOr[SchemaGooglePrivacyDlpV2InfoType] = js.native
}

object SchemaGooglePrivacyDlpV2QuasiId {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2QuasiId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2QuasiId]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2QuasiIdOps[Self <: SchemaGooglePrivacyDlpV2QuasiId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomTag(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customTag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomTag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customTag")(js.undefined)
        ret
    }
    @scala.inline
    def withField(value: SchemaGooglePrivacyDlpV2FieldId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(js.undefined)
        ret
    }
    @scala.inline
    def withInferred(value: SchemaGoogleProtobufEmpty): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inferred")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInferred: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inferred")(js.undefined)
        ret
    }
    @scala.inline
    def withInfoType(value: SchemaGooglePrivacyDlpV2InfoType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfoType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoType")(js.undefined)
        ret
    }
  }
  
}

