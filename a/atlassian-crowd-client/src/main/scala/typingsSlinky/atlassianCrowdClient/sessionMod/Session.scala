package typingsSlinky.atlassianCrowdClient.sessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Session extends js.Object {
  val createdAt: js.Date
  val expiresAt: js.Date
  val token: String
  def toCrowd(): SessionObj
}

object Session {
  @scala.inline
  def apply(createdAt: js.Date, expiresAt: js.Date, toCrowd: () => SessionObj, token: String): Session = {
    val __obj = js.Dynamic.literal(createdAt = createdAt.asInstanceOf[js.Any], expiresAt = expiresAt.asInstanceOf[js.Any], toCrowd = js.Any.fromFunction0(toCrowd), token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Session]
  }
}

