package typingsSlinky.googleapis.webmastersV3Mod.webmastersV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A time series of the number of URL crawl errors per error category and
  * platform.
  */
@js.native
trait SchemaUrlCrawlErrorsCountsQueryResponse extends js.Object {
  /**
    * The time series of the number of URL crawl errors per error category and
    * platform.
    */
  var countPerTypes: js.UndefOr[js.Array[SchemaUrlCrawlErrorCountsPerType]] = js.native
}

object SchemaUrlCrawlErrorsCountsQueryResponse {
  @scala.inline
  def apply(): SchemaUrlCrawlErrorsCountsQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrlCrawlErrorsCountsQueryResponse]
  }
  @scala.inline
  implicit class SchemaUrlCrawlErrorsCountsQueryResponseOps[Self <: SchemaUrlCrawlErrorsCountsQueryResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCountPerTypes(value: js.Array[SchemaUrlCrawlErrorCountsPerType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countPerTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountPerTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countPerTypes")(js.undefined)
        ret
    }
  }
  
}

