package typingsSlinky.knuddelsUserappsApi

import typingsSlinky.knuddelsUserappsApi.mod._Global_.AppContent
import typingsSlinky.knuddelsUserappsApi.mod._Global_.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAppContent extends js.Object {
  var appContent: AppContent = js.native
  var user: User = js.native
}

object AnonAppContent {
  @scala.inline
  def apply(appContent: AppContent, user: User): AnonAppContent = {
    val __obj = js.Dynamic.literal(appContent = appContent.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAppContent]
  }
  @scala.inline
  implicit class AnonAppContentOps[Self <: AnonAppContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppContent(value: AppContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: User): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

