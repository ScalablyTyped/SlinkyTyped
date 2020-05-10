package typingsSlinky.arangodb.Foxx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionStorage extends js.Object {
  var `new`: js.UndefOr[js.Function0[Session]] = js.native
  def forClient(session: Session): String | Null = js.native
  def fromClient(sid: String): Session | Null = js.native
}

object SessionStorage {
  @scala.inline
  def apply(forClient: Session => String | Null, fromClient: String => Session | Null): SessionStorage = {
    val __obj = js.Dynamic.literal(forClient = js.Any.fromFunction1(forClient), fromClient = js.Any.fromFunction1(fromClient))
    __obj.asInstanceOf[SessionStorage]
  }
  @scala.inline
  implicit class SessionStorageOps[Self <: SessionStorage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withForClient(value: Session => String | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forClient")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFromClient(value: String => Session | Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromClient")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withNew(value: () => Session): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutNew: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("new")(js.undefined)
        ret
    }
  }
  
}

