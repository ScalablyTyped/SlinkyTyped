package typingsSlinky.inboxsdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGetMessageID extends js.Object {
  def getMessageID(): js.Promise[String] = js.native
  def getThreadID(): js.Promise[String] = js.native
}

object AnonGetMessageID {
  @scala.inline
  def apply(getMessageID: () => js.Promise[String], getThreadID: () => js.Promise[String]): AnonGetMessageID = {
    val __obj = js.Dynamic.literal(getMessageID = js.Any.fromFunction0(getMessageID), getThreadID = js.Any.fromFunction0(getThreadID))
    __obj.asInstanceOf[AnonGetMessageID]
  }
  @scala.inline
  implicit class AnonGetMessageIDOps[Self <: AnonGetMessageID] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetMessageID(value: () => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMessageID")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetThreadID(value: () => js.Promise[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getThreadID")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

