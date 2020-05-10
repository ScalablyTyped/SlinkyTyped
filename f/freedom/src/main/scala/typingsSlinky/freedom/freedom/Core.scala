package typingsSlinky.freedom.freedom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// See |Core_unprivileged| in |core.unprivileged.js|
@js.native
trait Core extends js.Object {
  // Given an ChannelEndpointIdentifier for a channel, create a proxy event
  // interface for it.
  def bindChannel(channelIdentifier: String): js.Promise[Channel] = js.native
  // Create a new channel which which to communicate between modules.
  def createChannel(): js.Promise[ChannelSpecifier] = js.native
  // Returns the list of identifiers describing the dependency path.
  def getId(): js.Promise[js.Array[String]] = js.native
  def getLogger(tag: String): js.Promise[Logger] = js.native
}

object Core {
  @scala.inline
  def apply(
    bindChannel: String => js.Promise[Channel],
    createChannel: () => js.Promise[ChannelSpecifier],
    getId: () => js.Promise[js.Array[String]],
    getLogger: String => js.Promise[Logger]
  ): Core = {
    val __obj = js.Dynamic.literal(bindChannel = js.Any.fromFunction1(bindChannel), createChannel = js.Any.fromFunction0(createChannel), getId = js.Any.fromFunction0(getId), getLogger = js.Any.fromFunction1(getLogger))
    __obj.asInstanceOf[Core]
  }
  @scala.inline
  implicit class CoreOps[Self <: Core] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBindChannel(value: String => js.Promise[Channel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindChannel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateChannel(value: () => js.Promise[ChannelSpecifier]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createChannel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetId(value: () => js.Promise[js.Array[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetLogger(value: String => js.Promise[Logger]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLogger")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

