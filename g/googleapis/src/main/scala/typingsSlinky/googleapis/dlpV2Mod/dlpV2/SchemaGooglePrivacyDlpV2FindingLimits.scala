package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGooglePrivacyDlpV2FindingLimits extends js.Object {
  /**
    * Configuration of findings limit given for specified infoTypes.
    */
  var maxFindingsPerInfoType: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2InfoTypeLimit]] = js.native
  /**
    * Max number of findings that will be returned for each item scanned. When
    * set within `InspectDataSourceRequest`, the maximum returned is 2000
    * regardless if this is set higher. When set within
    * `InspectContentRequest`, this field is ignored.
    */
  var maxFindingsPerItem: js.UndefOr[Double] = js.native
  /**
    * Max number of findings that will be returned per request/job. When set
    * within `InspectContentRequest`, the maximum returned is 2000 regardless
    * if this is set higher.
    */
  var maxFindingsPerRequest: js.UndefOr[Double] = js.native
}

object SchemaGooglePrivacyDlpV2FindingLimits {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2FindingLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2FindingLimits]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2FindingLimitsOps[Self <: SchemaGooglePrivacyDlpV2FindingLimits] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxFindingsPerInfoType(value: js.Array[SchemaGooglePrivacyDlpV2InfoTypeLimit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFindingsPerInfoType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFindingsPerInfoType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFindingsPerInfoType")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFindingsPerItem(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFindingsPerItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFindingsPerItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFindingsPerItem")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFindingsPerRequest(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFindingsPerRequest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFindingsPerRequest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFindingsPerRequest")(js.undefined)
        ret
    }
  }
  
}

