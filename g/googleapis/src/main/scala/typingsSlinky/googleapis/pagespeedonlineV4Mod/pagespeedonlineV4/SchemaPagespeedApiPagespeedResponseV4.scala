package typingsSlinky.googleapis.pagespeedonlineV4Mod.pagespeedonlineV4

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleapis.AnonCms
import typingsSlinky.googleapis.AnonInitialurl
import typingsSlinky.googleapis.AnonLocaleRuleResults
import typingsSlinky.googleapis.AnonMajor
import typingsSlinky.googleapis.AnonPass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPagespeedApiPagespeedResponseV4 extends js.Object {
  /**
    * The captcha verify result
    */
  var captchaResult: js.UndefOr[String] = js.native
  /**
    * Localized PageSpeed results. Contains a ruleResults entry for each
    * PageSpeed rule instantiated and run by the server.
    */
  var formattedResults: js.UndefOr[AnonLocaleRuleResults] = js.native
  /**
    * Canonicalized and final URL for the document, after following page
    * redirects (if any).
    */
  var id: js.UndefOr[String] = js.native
  /**
    * List of rules that were specified in the request, but which the server
    * did not know how to instantiate.
    */
  var invalidRules: js.UndefOr[js.Array[String]] = js.native
  /**
    * Kind of result.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Metrics of end users&#39; page loading experience.
    */
  var loadingExperience: js.UndefOr[AnonInitialurl] = js.native
  /**
    * Summary statistics for the page, such as number of JavaScript bytes,
    * number of HTML bytes, etc.
    */
  var pageStats: js.UndefOr[AnonCms] = js.native
  /**
    * Response code for the document. 200 indicates a normal page load. 4xx/5xx
    * indicates an error.
    */
  var responseCode: js.UndefOr[Double] = js.native
  /**
    * A map with one entry for each rule group in these results.
    */
  var ruleGroups: js.UndefOr[StringDictionary[AnonPass]] = js.native
  /**
    * Base64-encoded screenshot of the page that was analyzed.
    */
  var screenshot: js.UndefOr[SchemaPagespeedApiImageV4] = js.native
  /**
    * Additional base64-encoded screenshots of the page, in various partial
    * render states.
    */
  var snapshots: js.UndefOr[js.Array[SchemaPagespeedApiImageV4]] = js.native
  /**
    * Title of the page, as displayed in the browser&#39;s title bar.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The version of PageSpeed used to generate these results.
    */
  var version: js.UndefOr[AnonMajor] = js.native
}

object SchemaPagespeedApiPagespeedResponseV4 {
  @scala.inline
  def apply(): SchemaPagespeedApiPagespeedResponseV4 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPagespeedApiPagespeedResponseV4]
  }
  @scala.inline
  implicit class SchemaPagespeedApiPagespeedResponseV4Ops[Self <: SchemaPagespeedApiPagespeedResponseV4] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withFormattedResults(value: AnonLocaleRuleResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormattedResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedResults")(js.undefined)
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
    def withInvalidRules(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidRules")(js.undefined)
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
    def withLoadingExperience(value: AnonInitialurl): Self = {
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
    def withPageStats(value: AnonCms): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageStats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageStats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageStats")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseCode")(js.undefined)
        ret
    }
    @scala.inline
    def withRuleGroups(value: StringDictionary[AnonPass]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ruleGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenshot(value: SchemaPagespeedApiImageV4): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenshot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenshot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenshot")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshots(value: js.Array[SchemaPagespeedApiImageV4]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshots")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
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

