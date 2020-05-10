package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration description of the scanning process. When used with
  * redactContent only info_types and min_likelihood are currently used.
  */
@js.native
trait SchemaGooglePrivacyDlpV2InspectConfig extends js.Object {
  /**
    * List of options defining data content to scan. If empty, text, images,
    * and other content will be included.
    */
  var contentOptions: js.UndefOr[js.Array[String]] = js.native
  /**
    * CustomInfoTypes provided by the user. See
    * https://cloud.google.com/dlp/docs/creating-custom-infotypes to learn
    * more.
    */
  var customInfoTypes: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2CustomInfoType]] = js.native
  /**
    * When true, excludes type information of the findings.
    */
  var excludeInfoTypes: js.UndefOr[Boolean] = js.native
  /**
    * When true, a contextual quote from the data that triggered a finding is
    * included in the response; see Finding.quote.
    */
  var includeQuote: js.UndefOr[Boolean] = js.native
  /**
    * Restricts what info_types to look for. The values must correspond to
    * InfoType values returned by ListInfoTypes or listed at
    * https://cloud.google.com/dlp/docs/infotypes-reference.  When no InfoTypes
    * or CustomInfoTypes are specified in a request, the system may
    * automatically choose what detectors to run. By default this may be all
    * types, but may change over time as detectors are updated.  The special
    * InfoType name &quot;ALL_BASIC&quot; can be used to trigger all detectors,
    * but may change over time as new InfoTypes are added. If you need precise
    * control and predictability as to what detectors are run you should
    * specify specific InfoTypes listed in the reference.
    */
  var infoTypes: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2InfoType]] = js.native
  var limits: js.UndefOr[SchemaGooglePrivacyDlpV2FindingLimits] = js.native
  /**
    * Only returns findings equal or above this threshold. The default is
    * POSSIBLE. See https://cloud.google.com/dlp/docs/likelihood to learn more.
    */
  var minLikelihood: js.UndefOr[String] = js.native
  /**
    * Set of rules to apply to the findings for this InspectConfig. Exclusion
    * rules, contained in the set are executed in the end, other rules are
    * executed in the order they are specified for each info type.
    */
  var ruleSet: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2InspectionRuleSet]] = js.native
}

object SchemaGooglePrivacyDlpV2InspectConfig {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2InspectConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InspectConfig]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2InspectConfigOps[Self <: SchemaGooglePrivacyDlpV2InspectConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentOptions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomInfoTypes(value: js.Array[SchemaGooglePrivacyDlpV2CustomInfoType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customInfoTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomInfoTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customInfoTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeInfoTypes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeInfoTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeInfoTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeInfoTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeQuote(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeQuote")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeQuote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeQuote")(js.undefined)
        ret
    }
    @scala.inline
    def withInfoTypes(value: js.Array[SchemaGooglePrivacyDlpV2InfoType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfoTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withLimits(value: SchemaGooglePrivacyDlpV2FindingLimits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limits")(js.undefined)
        ret
    }
    @scala.inline
    def withMinLikelihood(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLikelihood")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinLikelihood: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minLikelihood")(js.undefined)
        ret
    }
    @scala.inline
    def withRuleSet(value: js.Array[SchemaGooglePrivacyDlpV2InspectionRuleSet]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleSet")(js.undefined)
        ret
    }
  }
  
}

