package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemAnalytics extends Entity {
  var allTime: js.UndefOr[ItemActivityStat] = js.native
  var itemActivityStats: js.UndefOr[js.Array[ItemActivityStat]] = js.native
  var lastSevenDays: js.UndefOr[ItemActivityStat] = js.native
}

object ItemAnalytics {
  @scala.inline
  def apply(): ItemAnalytics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemAnalytics]
  }
  @scala.inline
  implicit class ItemAnalyticsOps[Self <: ItemAnalytics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllTime(value: ItemActivityStat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allTime")(js.undefined)
        ret
    }
    @scala.inline
    def withItemActivityStats(value: js.Array[ItemActivityStat]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemActivityStats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemActivityStats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemActivityStats")(js.undefined)
        ret
    }
    @scala.inline
    def withLastSevenDays(value: ItemActivityStat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSevenDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastSevenDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastSevenDays")(js.undefined)
        ret
    }
  }
  
}

