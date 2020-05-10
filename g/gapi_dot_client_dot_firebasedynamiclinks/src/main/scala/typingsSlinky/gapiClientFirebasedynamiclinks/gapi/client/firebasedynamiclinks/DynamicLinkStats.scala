package typingsSlinky.gapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DynamicLinkStats extends js.Object {
  /** Dynamic Link event stats. */
  var linkEventStats: js.UndefOr[js.Array[DynamicLinkEventStat]] = js.native
}

object DynamicLinkStats {
  @scala.inline
  def apply(): DynamicLinkStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DynamicLinkStats]
  }
  @scala.inline
  implicit class DynamicLinkStatsOps[Self <: DynamicLinkStats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLinkEventStats(value: js.Array[DynamicLinkEventStat]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkEventStats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkEventStats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkEventStats")(js.undefined)
        ret
    }
  }
  
}

