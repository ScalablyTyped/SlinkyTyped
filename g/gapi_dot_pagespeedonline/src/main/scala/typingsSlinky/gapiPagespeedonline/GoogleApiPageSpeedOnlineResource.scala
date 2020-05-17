package typingsSlinky.gapiPagespeedonline

import typingsSlinky.gapiPagespeedonline.anon.CssResponsebytes
import typingsSlinky.gapiPagespeedonline.anon.Locale
import typingsSlinky.gapiPagespeedonline.anon.Major
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleApiPageSpeedOnlineResource extends js.Object {
  /**
    * Localized PageSpeed results. Contains a ruleResults entry for each PageSpeed rule instantiated and run by the server.
    */
  var formattedResults: Locale = js.native
  /**
    * Canonicalized and final URL for the document, after following page redirects (if any).
    */
  var id: String = js.native
  /**
    * List of rules that were specified in the request, but which the server did not know how to instantiate.
    */
  var invalidRules: js.Array[String] = js.native
  /**
    * Kind of result.
    */
  var kind: String = js.native
  /**
    * Summary statistics for the page, such as number of JavaScript bytes, number of HTML bytes, etc.
    */
  var pageStats: CssResponsebytes = js.native
  /**
    * Response code for the document. 200 indicates a normal page load. 4xx/5xx indicates an error.
    */
  var responseCode: Double = js.native
  /**
    * The PageSpeed Score (0-100), which indicates how much faster a page could be. A high score indicates little room for improvement, while a lower score indicates more room for improvement.
    */
  var score: Double = js.native
  /**
    * Title of the page, as displayed in the browser's title bar.
    */
  var title: String = js.native
  /**
    * The version of the PageSpeed SDK used to generate these results.
    */
  var version: Major = js.native
}

object GoogleApiPageSpeedOnlineResource {
  @scala.inline
  def apply(
    formattedResults: Locale,
    id: String,
    invalidRules: js.Array[String],
    kind: String,
    pageStats: CssResponsebytes,
    responseCode: Double,
    score: Double,
    title: String,
    version: Major
  ): GoogleApiPageSpeedOnlineResource = {
    val __obj = js.Dynamic.literal(formattedResults = formattedResults.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invalidRules = invalidRules.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], pageStats = pageStats.asInstanceOf[js.Any], responseCode = responseCode.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiPageSpeedOnlineResource]
  }
  @scala.inline
  implicit class GoogleApiPageSpeedOnlineResourceOps[Self <: GoogleApiPageSpeedOnlineResource] (val x: Self) extends AnyVal {
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
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInvalidRules(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPageStats(value: CssResponsebytes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageStats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponseCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScore(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("score")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: Major): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

