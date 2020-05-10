package typingsSlinky.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConsoleMessage extends js.Object {
  /** The message arguments. */
  def args(): js.Array[JSHandle[_]] = js.native
  /** The location the message originated from */
  def location(): ConsoleMessageLocation = js.native
  /** The message text. */
  def text(): String = js.native
  def `type`(): ConsoleMessageType = js.native
}

object ConsoleMessage {
  @scala.inline
  def apply(
    args: () => js.Array[JSHandle[_]],
    location: () => ConsoleMessageLocation,
    text: () => String,
    `type`: () => ConsoleMessageType
  ): ConsoleMessage = {
    val __obj = js.Dynamic.literal(args = js.Any.fromFunction0(args), location = js.Any.fromFunction0(location), text = js.Any.fromFunction0(text))
    __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
    __obj.asInstanceOf[ConsoleMessage]
  }
  @scala.inline
  implicit class ConsoleMessageOps[Self <: ConsoleMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: () => js.Array[JSHandle[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLocation(value: () => ConsoleMessageLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withText(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withType(value: () => ConsoleMessageType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

