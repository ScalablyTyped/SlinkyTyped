package typingsSlinky.mongodb

import typingsSlinky.mongodb.mod.ClientSession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMaxTimeMSSession extends js.Object {
  var maxTimeMS: js.UndefOr[Double] = js.native
  var session: js.UndefOr[ClientSession] = js.native
}

object AnonMaxTimeMSSession {
  @scala.inline
  def apply(): AnonMaxTimeMSSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonMaxTimeMSSession]
  }
  @scala.inline
  implicit class AnonMaxTimeMSSessionOps[Self <: AnonMaxTimeMSSession] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxTimeMS(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTimeMS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxTimeMS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxTimeMS")(js.undefined)
        ret
    }
    @scala.inline
    def withSession(value: ClientSession): Self = {
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
  }
  
}

