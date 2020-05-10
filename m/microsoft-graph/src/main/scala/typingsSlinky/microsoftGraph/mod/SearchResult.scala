package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchResult extends js.Object {
  /**
    * A callback URL that can be used to record telemetry information. The application should issue a GET on this URL if the
    * user interacts with this item to improve the quality of results.
    */
  var onClickTelemetryUrl: js.UndefOr[String] = js.native
}

object SearchResult {
  @scala.inline
  def apply(): SearchResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchResult]
  }
  @scala.inline
  implicit class SearchResultOps[Self <: SearchResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnClickTelemetryUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickTelemetryUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnClickTelemetryUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClickTelemetryUrl")(js.undefined)
        ret
    }
  }
  
}

