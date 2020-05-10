package typingsSlinky.jupyterlabServices.terminalTerminalMod.TerminalSession

import typingsSlinky.phosphorCoreutils.jsonMod.JSONPrimitive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A message from the terminal session.
  */
@js.native
trait IMessage extends js.Object {
  /**
    * The content of the message.
    */
  val content: js.UndefOr[js.Array[JSONPrimitive]] = js.native
  /**
    * The type of the message.
    */
  val `type`: MessageType = js.native
}

object IMessage {
  @scala.inline
  def apply(`type`: MessageType): IMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessage]
  }
  @scala.inline
  implicit class IMessageOps[Self <: IMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: MessageType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: js.Array[JSONPrimitive]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
  }
  
}

