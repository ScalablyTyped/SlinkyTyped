package typingsSlinky.intercomClient

import typingsSlinky.intercomClient.intercomClientStrings.user
import typingsSlinky.intercomClient.userMod.UserIdentifier
import typingsSlinky.intercomClient.visitorMod.VisitorIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  var identifier: VisitorIdentifier
  var `type`: user
  var user: UserIdentifier
}

object AnonType {
  @scala.inline
  def apply(identifier: VisitorIdentifier, `type`: user, user: UserIdentifier): AnonType = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

