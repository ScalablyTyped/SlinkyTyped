package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Compute numerical stats over an individual column, including number of
  * distinct values and value count distribution.
  */
@js.native
trait SchemaGooglePrivacyDlpV2CategoricalStatsConfig extends js.Object {
  /**
    * Field to compute categorical stats on. All column types are supported
    * except for arrays and structs. However, it may be more informative to use
    * NumericalStats when the field type is supported, depending on the data.
    */
  var field: js.UndefOr[SchemaGooglePrivacyDlpV2FieldId] = js.native
}

object SchemaGooglePrivacyDlpV2CategoricalStatsConfig {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2CategoricalStatsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CategoricalStatsConfig]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2CategoricalStatsConfigOps[Self <: SchemaGooglePrivacyDlpV2CategoricalStatsConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

