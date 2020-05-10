package typingsSlinky.instagramPrivateApi.newsRepositoryInboxResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewsRepositoryInboxResponseAdsManager extends js.Object {
  var pending_count: Double = js.native
}

object NewsRepositoryInboxResponseAdsManager {
  @scala.inline
  def apply(pending_count: Double): NewsRepositoryInboxResponseAdsManager = {
    val __obj = js.Dynamic.literal(pending_count = pending_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewsRepositoryInboxResponseAdsManager]
  }
  @scala.inline
  implicit class NewsRepositoryInboxResponseAdsManagerOps[Self <: NewsRepositoryInboxResponseAdsManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPending_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pending_count")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

