package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import typingsSlinky.jupyterlabServices.AnonCommid
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.comm_msg
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.iopub
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.shell
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `'comm_msg'` message on the `'iopub'` channel.
  *
  * See [Comm msg](https://jupyter-client.readthedocs.io/en/latest/messaging.html#opening-a-comm).
  */
@js.native
trait ICommMsgMsg[T /* <: iopub | shell */] extends IMessage[comm_msg] {
  @JSName("channel")
  var channel_ICommMsgMsg: T = js.native
  @JSName("content")
  var content_ICommMsgMsg: AnonCommid = js.native
}

object ICommMsgMsg {
  @scala.inline
  def apply[T](
    channel: T,
    content: AnonCommid,
    header: IHeader[comm_msg],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): ICommMsgMsg[T] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommMsgMsg[T]]
  }
  @scala.inline
  implicit class ICommMsgMsgOps[Self[t] <: ICommMsgMsg[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withChannel(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: AnonCommid): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

