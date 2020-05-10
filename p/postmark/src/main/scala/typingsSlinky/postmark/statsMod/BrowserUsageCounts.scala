package typingsSlinky.postmark.statsMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.postmark.AnonDictkey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowserUsageCounts
  extends /* key */ StringDictionary[js.Any] {
  var Days: js.Array[AnonDictkey] = js.native
}

object BrowserUsageCounts {
  @scala.inline
  def apply(Days: js.Array[AnonDictkey]): BrowserUsageCounts = {
    val __obj = js.Dynamic.literal(Days = Days.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowserUsageCounts]
  }
  @scala.inline
  implicit class BrowserUsageCountsOps[Self <: BrowserUsageCounts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDays(value: js.Array[AnonDictkey]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Days")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

