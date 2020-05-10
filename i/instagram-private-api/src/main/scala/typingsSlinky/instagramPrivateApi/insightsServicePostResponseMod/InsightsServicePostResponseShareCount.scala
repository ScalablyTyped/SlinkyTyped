package typingsSlinky.instagramPrivateApi.insightsServicePostResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsightsServicePostResponseShareCount extends js.Object {
  var post: InsightsServicePostResponsePost = js.native
  var tray: InsightsServicePostResponseTray = js.native
}

object InsightsServicePostResponseShareCount {
  @scala.inline
  def apply(post: InsightsServicePostResponsePost, tray: InsightsServicePostResponseTray): InsightsServicePostResponseShareCount = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any], tray = tray.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightsServicePostResponseShareCount]
  }
  @scala.inline
  implicit class InsightsServicePostResponseShareCountOps[Self <: InsightsServicePostResponseShareCount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPost(value: InsightsServicePostResponsePost): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("post")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTray(value: InsightsServicePostResponseTray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tray")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

