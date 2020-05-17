package typingsSlinky.gapiClientPagespeedonline.gapi.client.pagespeedonline

import typingsSlinky.gapiClientPagespeedonline.anon.CssResponseBytes
import typingsSlinky.gapiClientPagespeedonline.anon.Locale
import typingsSlinky.gapiClientPagespeedonline.anon.Major
import typingsSlinky.gapiClientPagespeedonline.anon.Score
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result extends js.Object {
  /** Localized PageSpeed results. Contains a ruleResults entry for each PageSpeed rule instantiated and run by the server. */
  var formattedResults: js.UndefOr[Locale] = js.native
  /** Canonicalized and final URL for the document, after following page redirects (if any). */
  var id: js.UndefOr[String] = js.native
  /** List of rules that were specified in the request, but which the server did not know how to instantiate. */
  var invalidRules: js.UndefOr[js.Array[String]] = js.native
  /** Kind of result. */
  var kind: js.UndefOr[String] = js.native
  /** Summary statistics for the page, such as number of JavaScript bytes, number of HTML bytes, etc. */
  var pageStats: js.UndefOr[CssResponseBytes] = js.native
  /** Response code for the document. 200 indicates a normal page load. 4xx/5xx indicates an error. */
  var responseCode: js.UndefOr[Double] = js.native
  /** A map with one entry for each rule group in these results. */
  var ruleGroups: js.UndefOr[Record[String, Score]] = js.native
  /** Base64-encoded screenshot of the page that was analyzed. */
  var screenshot: js.UndefOr[PagespeedApiImageV2] = js.native
  /** Title of the page, as displayed in the browser's title bar. */
  var title: js.UndefOr[String] = js.native
  /** The version of PageSpeed used to generate these results. */
  var version: js.UndefOr[Major] = js.native
}

object Result {
  @scala.inline
  def apply(): Result = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormattedResults(value: Locale): Self = {
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
    def withPageStats(value: CssResponseBytes): Self = {
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
    def withRuleGroups(value: Record[String, Score]): Self = {
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
    def withScreenshot(value: PagespeedApiImageV2): Self = {
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
    def withVersion(value: Major): Self = {
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

