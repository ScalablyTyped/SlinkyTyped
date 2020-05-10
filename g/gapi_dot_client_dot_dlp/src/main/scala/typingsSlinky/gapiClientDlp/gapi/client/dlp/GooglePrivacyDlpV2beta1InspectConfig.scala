package typingsSlinky.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1InspectConfig extends js.Object {
  /** When true, excludes type information of the findings. */
  var excludeTypes: js.UndefOr[Boolean] = js.native
  /**
    * When true, a contextual quote from the data that triggered a finding is
    * included in the response; see Finding.quote.
    */
  var includeQuote: js.UndefOr[Boolean] = js.native
  /** Configuration of findings limit given for specified info types. */
  var infoTypeLimits: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1InfoTypeLimit]] = js.native
  /**
    * Restricts what info_types to look for. The values must correspond to
    * InfoType values returned by ListInfoTypes or found in documentation.
    * Empty info_types runs all enabled detectors.
    */
  var infoTypes: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1InfoType]] = js.native
  /** Limits the number of findings per content item or long running operation. */
  var maxFindings: js.UndefOr[Double] = js.native
  /** Only returns findings equal or above this threshold. */
  var minLikelihood: js.UndefOr[String] = js.native
}

object GooglePrivacyDlpV2beta1InspectConfig {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1InspectConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1InspectConfig]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1InspectConfigOps[Self <: GooglePrivacyDlpV2beta1InspectConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExcludeTypes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeTypes")(js.undefined)
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
    def withInfoTypeLimits(value: js.Array[GooglePrivacyDlpV2beta1InfoTypeLimit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoTypeLimits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfoTypeLimits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoTypeLimits")(js.undefined)
        ret
    }
    @scala.inline
    def withInfoTypes(value: js.Array[GooglePrivacyDlpV2beta1InfoType]): Self = {
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
    def withMaxFindings(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFindings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFindings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFindings")(js.undefined)
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
  }
  
}

