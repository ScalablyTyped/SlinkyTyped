package typingsSlinky.instagramPrivateApi.postsInsightsFeedResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostsInsightsFeedResponseShareCount extends js.Object {
  var tray: PostsInsightsFeedResponseTray = js.native
}

object PostsInsightsFeedResponseShareCount {
  @scala.inline
  def apply(tray: PostsInsightsFeedResponseTray): PostsInsightsFeedResponseShareCount = {
    val __obj = js.Dynamic.literal(tray = tray.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostsInsightsFeedResponseShareCount]
  }
  @scala.inline
  implicit class PostsInsightsFeedResponseShareCountOps[Self <: PostsInsightsFeedResponseShareCount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTray(value: PostsInsightsFeedResponseTray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tray")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

