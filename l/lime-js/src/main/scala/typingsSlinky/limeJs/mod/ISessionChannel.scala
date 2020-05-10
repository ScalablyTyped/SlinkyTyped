package typingsSlinky.limeJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISessionChannel extends js.Object {
  def onSession(session: Session): js.Any = js.native
  def sendSession(session: Session): Unit = js.native
}

object ISessionChannel {
  @scala.inline
  def apply(onSession: Session => js.Any, sendSession: Session => Unit): ISessionChannel = {
    val __obj = js.Dynamic.literal(onSession = js.Any.fromFunction1(onSession), sendSession = js.Any.fromFunction1(sendSession))
    __obj.asInstanceOf[ISessionChannel]
  }
  @scala.inline
  implicit class ISessionChannelOps[Self <: ISessionChannel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnSession(value: Session => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSession")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSendSession(value: Session => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sendSession")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

