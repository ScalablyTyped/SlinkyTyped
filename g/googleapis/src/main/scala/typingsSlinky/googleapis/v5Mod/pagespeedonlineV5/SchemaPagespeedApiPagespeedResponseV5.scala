package typingsSlinky.googleapis.v5Mod.pagespeedonlineV5

import typingsSlinky.googleapis.AnonMajor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPagespeedApiPagespeedResponseV5 extends js.Object {
  /**
    * The UTC timestamp of this analysis.
    */
  var analysisUTCTimestamp: js.UndefOr[String] = js.native
  /**
    * The captcha verify result
    */
  var captchaResult: js.UndefOr[String] = js.native
  /**
    * Canonicalized and final URL for the document, after following page
    * redirects (if any).
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Kind of result.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Lighthouse response for the audit url as an object.
    */
  var lighthouseResult: js.UndefOr[SchemaLighthouseResultV5] = js.native
  /**
    * Metrics of end users&#39; page loading experience.
    */
  var loadingExperience: js.UndefOr[SchemaPagespeedApiLoadingExperienceV5] = js.native
  /**
    * Metrics of the aggregated page loading experience of the origin
    */
  var originLoadingExperience: js.UndefOr[SchemaPagespeedApiLoadingExperienceV5] = js.native
  /**
    * The version of PageSpeed used to generate these results.
    */
  var version: js.UndefOr[AnonMajor] = js.native
}

object SchemaPagespeedApiPagespeedResponseV5 {
  @scala.inline
  def apply(): SchemaPagespeedApiPagespeedResponseV5 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPagespeedApiPagespeedResponseV5]
  }
  @scala.inline
  implicit class SchemaPagespeedApiPagespeedResponseV5Ops[Self <: SchemaPagespeedApiPagespeedResponseV5] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnalysisUTCTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analysisUTCTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnalysisUTCTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analysisUTCTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptchaResult(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captchaResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptchaResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captchaResult")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withLighthouseResult(value: SchemaLighthouseResultV5): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lighthouseResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLighthouseResult: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lighthouseResult")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadingExperience(value: SchemaPagespeedApiLoadingExperienceV5): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingExperience")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoadingExperience: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadingExperience")(js.undefined)
        ret
    }
    @scala.inline
    def withOriginLoadingExperience(value: SchemaPagespeedApiLoadingExperienceV5): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originLoadingExperience")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginLoadingExperience: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("originLoadingExperience")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: AnonMajor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

