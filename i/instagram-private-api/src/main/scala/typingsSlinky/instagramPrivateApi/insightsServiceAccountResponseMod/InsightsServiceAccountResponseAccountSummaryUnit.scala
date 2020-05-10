package typingsSlinky.instagramPrivateApi.insightsServiceAccountResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsightsServiceAccountResponseAccountSummaryUnit extends js.Object {
  var posts_count: Double = js.native
}

object InsightsServiceAccountResponseAccountSummaryUnit {
  @scala.inline
  def apply(posts_count: Double): InsightsServiceAccountResponseAccountSummaryUnit = {
    val __obj = js.Dynamic.literal(posts_count = posts_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServiceAccountResponseAccountSummaryUnit]
  }
  @scala.inline
  implicit class InsightsServiceAccountResponseAccountSummaryUnitOps[Self <: InsightsServiceAccountResponseAccountSummaryUnit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPosts_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("posts_count")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

