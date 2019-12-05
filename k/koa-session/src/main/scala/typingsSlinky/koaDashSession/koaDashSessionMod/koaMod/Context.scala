package typingsSlinky.koaDashSession.koaDashSessionMod.koaMod

import typingsSlinky.koaDashSession.koaDashSessionMod.Session
import typingsSlinky.koaDashSession.koaDashSessionMod.opts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var session: Session | Null
  val sessionOptions: js.UndefOr[opts] = js.undefined
}

object Context {
  @scala.inline
  def apply(session: Session = null, sessionOptions: opts = null): Context = {
    val __obj = js.Dynamic.literal()
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (sessionOptions != null) __obj.updateDynamic("sessionOptions")(sessionOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}

