package typingsSlinky.googleapis.webmastersV3Mod.webmastersV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Number of errors per day for a specific error type (defined by platform and
  * category).
  */
@js.native
trait SchemaUrlCrawlErrorCountsPerType extends js.Object {
  /**
    * The crawl error type.
    */
  var category: js.UndefOr[String] = js.native
  /**
    * The error count entries time series.
    */
  var entries: js.UndefOr[js.Array[SchemaUrlCrawlErrorCount]] = js.native
  /**
    * The general type of Googlebot that made the request (see list of
    * Googlebot user-agents for the user-agents used).
    */
  var platform: js.UndefOr[String] = js.native
}

object SchemaUrlCrawlErrorCountsPerType {
  @scala.inline
  def apply(): SchemaUrlCrawlErrorCountsPerType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlCrawlErrorCountsPerType]
  }
  @scala.inline
  implicit class SchemaUrlCrawlErrorCountsPerTypeOps[Self <: SchemaUrlCrawlErrorCountsPerType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCategory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCategory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("category")(js.undefined)
        ret
    }
    @scala.inline
    def withEntries(value: js.Array[SchemaUrlCrawlErrorCount]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatform(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platform")(js.undefined)
        ret
    }
  }
  
}

