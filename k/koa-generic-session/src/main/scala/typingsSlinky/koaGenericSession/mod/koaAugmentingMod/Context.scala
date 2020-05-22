package typingsSlinky.koaGenericSession.mod.koaAugmentingMod

import typingsSlinky.koaGenericSession.mod.Session
import typingsSlinky.std.Generator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var session: Session | Null
  var sessionSave: Boolean | Null
  def regenerateSession(): Generator[_, _, _]
}

object Context {
  @scala.inline
  def apply(
    regenerateSession: () => Generator[_, _, _],
    session: Session = null,
    sessionSave: Boolean = null.asInstanceOf[Boolean]
  ): Context = {
    val __obj = js.Dynamic.literal(regenerateSession = js.Any.fromFunction0(regenerateSession), session = session.asInstanceOf[js.Any], sessionSave = sessionSave.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}

