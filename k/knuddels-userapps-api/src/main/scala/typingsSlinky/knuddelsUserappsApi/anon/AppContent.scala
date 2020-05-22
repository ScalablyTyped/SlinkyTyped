package typingsSlinky.knuddelsUserappsApi.anon

import typingsSlinky.knuddelsUserappsApi.mod.global.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppContent extends js.Object {
  var appContent: typingsSlinky.knuddelsUserappsApi.mod.global.AppContent
  var user: User
}

object AppContent {
  @scala.inline
  def apply(appContent: typingsSlinky.knuddelsUserappsApi.mod.global.AppContent, user: User): AppContent = {
    val __obj = js.Dynamic.literal(appContent = appContent.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppContent]
  }
}

