package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Custom information type provided by the user. Used to find domain-specific
  * sensitive information configurable to the data in question.
  */
@js.native
trait SchemaGooglePrivacyDlpV2CustomInfoType extends js.Object {
  /**
    * Set of detection rules to apply to all findings of this CustomInfoType.
    * Rules are applied in order that they are specified. Not supported for the
    * `surrogate_type` CustomInfoType.
    */
  var detectionRules: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2DetectionRule]] = js.native
  /**
    * A list of phrases to detect as a CustomInfoType.
    */
  var dictionary: js.UndefOr[SchemaGooglePrivacyDlpV2Dictionary] = js.native
  /**
    * If set to EXCLUSION_TYPE_EXCLUDE this infoType will not cause a finding
    * to be returned. It still can be used for rules matching.
    */
  var exclusionType: js.UndefOr[String] = js.native
  /**
    * CustomInfoType can either be a new infoType, or an extension of built-in
    * infoType, when the name matches one of existing infoTypes and that
    * infoType is specified in `InspectContent.info_types` field. Specifying
    * the latter adds findings to the one detected by the system. If built-in
    * info type is not specified in `InspectContent.info_types` list then the
    * name is treated as a custom info type.
    */
  var infoType: js.UndefOr[SchemaGooglePrivacyDlpV2InfoType] = js.native
  /**
    * Likelihood to return for this CustomInfoType. This base value can be
    * altered by a detection rule if the finding meets the criteria specified
    * by the rule. Defaults to `VERY_LIKELY` if not specified.
    */
  var likelihood: js.UndefOr[String] = js.native
  /**
    * Regular expression based CustomInfoType.
    */
  var regex: js.UndefOr[SchemaGooglePrivacyDlpV2Regex] = js.native
  /**
    * Load an existing `StoredInfoType` resource for use in
    * `InspectDataSource`. Not currently supported in `InspectContent`.
    */
  var storedType: js.UndefOr[SchemaGooglePrivacyDlpV2StoredType] = js.native
  /**
    * Message for detecting output from deidentification transformations that
    * support reversing.
    */
  var surrogateType: js.UndefOr[SchemaGooglePrivacyDlpV2SurrogateType] = js.native
}

object SchemaGooglePrivacyDlpV2CustomInfoType {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2CustomInfoType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CustomInfoType]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2CustomInfoTypeOps[Self <: SchemaGooglePrivacyDlpV2CustomInfoType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetectionRules(value: js.Array[SchemaGooglePrivacyDlpV2DetectionRule]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectionRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetectionRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detectionRules")(js.undefined)
        ret
    }
    @scala.inline
    def withDictionary(value: SchemaGooglePrivacyDlpV2Dictionary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDictionary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dictionary")(js.undefined)
        ret
    }
    @scala.inline
    def withExclusionType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclusionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusionType")(js.undefined)
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
    @scala.inline
    def withLikelihood(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("likelihood")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLikelihood: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("likelihood")(js.undefined)
        ret
    }
    @scala.inline
    def withRegex(value: SchemaGooglePrivacyDlpV2Regex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regex")(js.undefined)
        ret
    }
    @scala.inline
    def withStoredType(value: SchemaGooglePrivacyDlpV2StoredType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storedType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoredType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storedType")(js.undefined)
        ret
    }
    @scala.inline
    def withSurrogateType(value: SchemaGooglePrivacyDlpV2SurrogateType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("surrogateType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSurrogateType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("surrogateType")(js.undefined)
        ret
    }
  }
  
}

