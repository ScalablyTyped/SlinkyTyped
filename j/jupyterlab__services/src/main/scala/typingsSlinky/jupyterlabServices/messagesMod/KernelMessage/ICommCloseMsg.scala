package typingsSlinky.jupyterlabServices.messagesMod.KernelMessage

import typingsSlinky.jupyterlabServices.anon.Commid
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.comm_close
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.iopub
import typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.shell
import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `'comm_close'` message on the `'iopub'` channel.
  *
  * See [Comm close](https://jupyter-client.readthedocs.io/en/latest/messaging.html#opening-a-comm).
  */
@js.native
trait ICommCloseMsg[T /* <: iopub | shell */]
  extends IMessage[comm_close]
     with Message {
  @JSName("channel")
  var channel_ICommCloseMsg: T = js.native
  @JSName("content")
  var content_ICommCloseMsg: Commid = js.native
}

object ICommCloseMsg {
  @scala.inline
  def apply[T](
    channel: T,
    content: Commid,
    header: IHeader[comm_close],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): ICommCloseMsg[T] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommCloseMsg[T]]
  }
  @scala.inline
  implicit class ICommCloseMsgOps[Self[t] <: ICommCloseMsg[t], T] (val x: Self[T]) extends AnyVal {
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
    def withContent(value: Commid): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

