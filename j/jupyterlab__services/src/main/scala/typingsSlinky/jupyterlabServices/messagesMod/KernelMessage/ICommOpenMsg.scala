package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import typingsSlinky.jupyterlabServices.anon.Data
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.comm_open
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.iopub
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.shell
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `'comm_open'` message on the `'iopub'` channel.
  *
  * See [Comm open](https://jupyter-client.readthedocs.io/en/latest/messaging.html#opening-a-comm).
  */
@js.native
trait ICommOpenMsg[T /* <: shell | iopub */]
  extends IMessage[comm_open]
     with Message {
  @JSName("channel")
  var channel_ICommOpenMsg: T = js.native
  @JSName("content")
  var content_ICommOpenMsg: Data = js.native
}

object ICommOpenMsg {
  @scala.inline
  def apply[T](
    channel: T,
    content: Data,
    header: IHeader[comm_open],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): ICommOpenMsg[T] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommOpenMsg[T]]
  }
  @scala.inline
  implicit class ICommOpenMsgOps[Self[t] <: ICommOpenMsg[t], T] (val x: Self[T]) extends AnyVal {
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
    def withContent(value: Data): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

