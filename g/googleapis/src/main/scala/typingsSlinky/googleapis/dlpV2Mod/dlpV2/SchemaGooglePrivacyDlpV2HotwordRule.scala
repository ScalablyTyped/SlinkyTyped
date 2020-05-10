package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The rule that adjusts the likelihood of findings within a certain proximity
  * of hotwords.
  */
@js.native
trait SchemaGooglePrivacyDlpV2HotwordRule extends js.Object {
  /**
    * Regular expression pattern defining what qualifies as a hotword.
    */
  var hotwordRegex: js.UndefOr[SchemaGooglePrivacyDlpV2Regex] = js.native
  /**
    * Likelihood adjustment to apply to all matching findings.
    */
  var likelihoodAdjustment: js.UndefOr[SchemaGooglePrivacyDlpV2LikelihoodAdjustment] = js.native
  /**
    * Proximity of the finding within which the entire hotword must reside. The
    * total length of the window cannot exceed 1000 characters. Note that the
    * finding itself will be included in the window, so that hotwords may be
    * used to match substrings of the finding itself. For example, the
    * certainty of a phone number regex &quot;\(\d{3}\) \d{3}-\d{4}&quot; could
    * be adjusted upwards if the area code is known to be the local area code
    * of a company office using the hotword regex &quot;\(xxx\)&quot;, where
    * &quot;xxx&quot; is the area code in question.
    */
  var proximity: js.UndefOr[SchemaGooglePrivacyDlpV2Proximity] = js.native
}

object SchemaGooglePrivacyDlpV2HotwordRule {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2HotwordRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2HotwordRule]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2HotwordRuleOps[Self <: SchemaGooglePrivacyDlpV2HotwordRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHotwordRegex(value: SchemaGooglePrivacyDlpV2Regex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hotwordRegex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHotwordRegex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hotwordRegex")(js.undefined)
        ret
    }
    @scala.inline
    def withLikelihoodAdjustment(value: SchemaGooglePrivacyDlpV2LikelihoodAdjustment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("likelihoodAdjustment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLikelihoodAdjustment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("likelihoodAdjustment")(js.undefined)
        ret
    }
    @scala.inline
    def withProximity(value: SchemaGooglePrivacyDlpV2Proximity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proximity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProximity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("proximity")(js.undefined)
        ret
    }
  }
  
}

