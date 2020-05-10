package typingsSlinky.expressSocketIoSession.mod.socketIoAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Handshake extends js.Object {
  var session: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Express.Session */ js.Any
  ] = js.native
  var sessionID: js.UndefOr[String] = js.native
}

object Handshake {
  @scala.inline
  def apply(): Handshake = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Handshake]
  }
  @scala.inline
  implicit class HandshakeOps[Self <: Handshake] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSession(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Express.Session */ js.Any
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("session")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionID")(js.undefined)
        ret
    }
  }
  
}

