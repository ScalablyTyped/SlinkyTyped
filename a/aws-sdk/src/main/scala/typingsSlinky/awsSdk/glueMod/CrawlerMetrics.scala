package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrawlerMetrics extends js.Object {
  /**
    * The name of the crawler.
    */
  var CrawlerName: js.UndefOr[NameString] = js.native
  /**
    * The duration of the crawler's most recent run, in seconds.
    */
  var LastRuntimeSeconds: js.UndefOr[NonNegativeDouble] = js.native
  /**
    * The median duration of this crawler's runs, in seconds.
    */
  var MedianRuntimeSeconds: js.UndefOr[NonNegativeDouble] = js.native
  /**
    * True if the crawler is still estimating how long it will take to complete this run.
    */
  var StillEstimating: js.UndefOr[Boolean] = js.native
  /**
    * The number of tables created by this crawler.
    */
  var TablesCreated: js.UndefOr[NonNegativeInteger] = js.native
  /**
    * The number of tables deleted by this crawler.
    */
  var TablesDeleted: js.UndefOr[NonNegativeInteger] = js.native
  /**
    * The number of tables updated by this crawler.
    */
  var TablesUpdated: js.UndefOr[NonNegativeInteger] = js.native
  /**
    * The estimated time left to complete a running crawl.
    */
  var TimeLeftSeconds: js.UndefOr[NonNegativeDouble] = js.native
}

object CrawlerMetrics {
  @scala.inline
  def apply(): CrawlerMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrawlerMetrics]
  }
  @scala.inline
  implicit class CrawlerMetricsOps[Self <: CrawlerMetrics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCrawlerName(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CrawlerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrawlerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CrawlerName")(js.undefined)
        ret
    }
    @scala.inline
    def withLastRuntimeSeconds(value: NonNegativeDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastRuntimeSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastRuntimeSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastRuntimeSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withMedianRuntimeSeconds(value: NonNegativeDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MedianRuntimeSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedianRuntimeSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MedianRuntimeSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withStillEstimating(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StillEstimating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStillEstimating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StillEstimating")(js.undefined)
        ret
    }
    @scala.inline
    def withTablesCreated(value: NonNegativeInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TablesCreated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTablesCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TablesCreated")(js.undefined)
        ret
    }
    @scala.inline
    def withTablesDeleted(value: NonNegativeInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TablesDeleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTablesDeleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TablesDeleted")(js.undefined)
        ret
    }
    @scala.inline
    def withTablesUpdated(value: NonNegativeInteger): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TablesUpdated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTablesUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TablesUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeLeftSeconds(value: NonNegativeDouble): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeLeftSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeLeftSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeLeftSeconds")(js.undefined)
        ret
    }
  }
  
}

